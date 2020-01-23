package com.springboot.udemy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.udemy.jdbc.PersonService;

@SpringBootApplication
public class UdemyApplication implements CommandLineRunner {
	@Autowired
	PersonService personService ;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Records -> {} ", personService.getRecords());
		logger.info("Records with id 1 -> {} ", personService.findById(1));
		logger.info("Records with id 1 -> {} ", personService.deleteById(1));
	}

}
