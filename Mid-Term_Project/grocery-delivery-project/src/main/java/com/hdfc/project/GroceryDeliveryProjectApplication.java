package com.hdfc.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;



@SpringBootApplication( )
public class GroceryDeliveryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryDeliveryProjectApplication.class, args);
	}
	
	

	
	


}
