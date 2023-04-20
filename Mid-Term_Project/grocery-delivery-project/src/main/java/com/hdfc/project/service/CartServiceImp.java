package com.hdfc.project.service;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hdfc.project.dto.CartDTO;
import com.hdfc.project.dto.CartItemDTO;
import com.hdfc.project.entity.Cart;
import com.hdfc.project.entity.CartItem;
import com.hdfc.project.entity.Customer;
import com.hdfc.project.entity.ItemRequest;
import com.hdfc.project.entity.Product;
import com.hdfc.project.exception.CartIsEmpty;
import com.hdfc.project.exception.CustomerNotFound;
import com.hdfc.project.exception.ItemNotFound;
import com.hdfc.project.exception.OpenApiResourceNotFoundException;
import com.hdfc.project.exception.ProductNotFound;
import com.hdfc.project.repository.CartItemRepo;
import com.hdfc.project.repository.CartRepo;
import com.hdfc.project.repository.CustomerRepo;
import com.hdfc.project.repository.ProductRepo;


@Service

public class CartServiceImp implements ICartService {


	@Autowired
	private CustomerRepo custRepo;
	@Autowired
	private ProductRepo proRepo;
	
	@Autowired
	private CartRepo cartRepo;
	@Autowired
	private CartItemRepo itemRepo;
	
	
	@Autowired
	private ICustomerService custService;
	
	@Autowired
	private IProductService proService;
	
	
	
	
		public CartDTO addItem(ItemRequest item, String email) throws CustomerNotFound, ProductNotFound, OpenApiResourceNotFoundException {
		    long productId = item.getProductId();
		    int productQuantity = item.getQuantity();
		    Customer customer = this.custRepo.findByCustomerEmail(email);

		    if (customer == null) {
		        throw new CustomerNotFound();
		    }

		   Product product = this.proRepo.findById(productId).orElse(null);

		    if (product == null) {
		        throw new ProductNotFound();
		    }

		    if (!product.isStock()) {
		        throw new OpenApiResourceNotFoundException("Product Out of Stock");
		    }

		    Cart cart = customer.getCart();
		    if (cart == null) {
		        cart = new Cart();
		        cart.setCustomer(customer);
		        customer.setCart(cart);
		    }

		    Set<CartItem> items = cart.getItems();
		    boolean itemFound = false;
		    for (CartItem cartItem : items) {
		        if (cartItem.getProduct().getProductId() == product.getProductId()) {
		            cartItem.setQuantity(productQuantity);
		            cartItem.setTotalPrice(product.getProductPrice() * productQuantity);
		            itemFound = true;
		            break;
		        }
		    }
		    if (!itemFound) {
		        CartItem cartItem = new CartItem();
		        cartItem.setProduct(product);
		        cartItem.setQuantity(productQuantity);
		        cartItem.setTotalPrice(product.getProductPrice() * productQuantity);
		        cartItem.setCart(cart);
		        items.add(cartItem);
		    }

		    Set<CartItem> i=cart.getItems();
		    double billAmount=0.0;
		    for(CartItem j:i) {
		    
		    	 billAmount+=j.getTotalPrice();
		    }
		    cart.setBillAmount(billAmount);
		    Cart savedCart = this.cartRepo.save(cart);
		   
		    return toDTO(savedCart);
		}

		public CartDTO removeItem(long productId, String email) throws ProductNotFound, ItemNotFound {
		    
			double billAmountSub=0.0;
			Customer customer = custRepo.findByCustomerEmail(email);
		    
		    

		    Product product = proRepo.findById(productId).orElse(null);
		    if (product == null) {
		        throw new ProductNotFound();
		    }

		    Cart cart = customer.getCart();
		    

		    Set<CartItem> cartItems = cart.getItems();
		    boolean itemRemoved = false;
		    for (CartItem item : cartItems) {
		        if (item.getProduct().getProductId() == productId) {
		        	billAmountSub=item.getTotalPrice();
		            cartItems.remove(item);
		            itemRemoved=true;
		            itemRepo.deleteById(item.getCartItemId());
		            break;
		        }
		    }
		    if(!itemRemoved) {
		    	throw new ItemNotFound();
		    }
		   
		   customer.getCart().setBillAmount(customer.getCart().getBillAmount()-billAmountSub);
		   custRepo.save(customer);
		   return toDTO(cart);
		    
		   
		}
		
		public CartDTO viewCart(String email) throws CustomerNotFound, CartIsEmpty {
			
			Customer customer=custRepo.findByCustomerEmail(email);
			if(customer==null)
			{
				throw new CustomerNotFound();
			}
			
			Cart cart=customer.getCart();
			if(cart==null || cart.getItems().isEmpty()) {
				throw new CartIsEmpty();
			}
			
			return toDTO(cart);
			
		}

		public CartDTO toDTO(Cart cart) {
		    CartDTO cartDTO = new CartDTO();
		    cartDTO.setCartId(cart.getCartId());
		    cartDTO.setBillAmount(cart.getBillAmount());
		    Set<CartItemDTO> cartItemDTOs = new HashSet<>();
		    cartDTO.setCustomer(custService.toDTO(cart.getCustomer()));
		    cartDTO.setItems(cartItemDTOs);
		    
		    return cartDTO;
		}

	
	
	
	

}
