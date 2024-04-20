package com.example.admin;

import com.example.admin.repositories.MangerRepository;
import com.example.admin.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}




	@Bean
	CommandLineRunner star(AccountService accountService){
		return args -> {
			accountService.addNewRole("USER");
			accountService.addNewUser("user1","12345","user1@gmail.com","12345");
			accountService.addNewUser("user2","126","user2@gmail.com","126");
			accountService.addNewUser("admin","123","admin@gmail.com","123");
			accountService.addNewUser("user5","123456789","user5@gmail.com","123456789");
			accountService.addRoleToUser("user5","USER");
			accountService.addRoleToUser("user1","USER");
			accountService.addRoleToUser("user2","USER");
			accountService.addRoleToUser("admin","ADMIN");
		};

	}


}
