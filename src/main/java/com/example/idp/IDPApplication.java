package com.example.idp;

import com.example.idp.entity.Customer;
import com.example.idp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@SpringBootApplication
@EnableTransactionManagement
public class IDPApplication implements CommandLineRunner {
	private final CustomerService customerService;

	@Autowired
	public IDPApplication(CustomerService customerService) {
		this.customerService = customerService;
	}

	public static void main(String[] args) {
		SpringApplication.run(IDPApplication.class, args);
	}

	@Override
	public void run(String... args) {
		List<Customer> customers = customerService.getAllCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
