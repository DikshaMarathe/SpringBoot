package com.springboot.udemy;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1, "JAVA 0.1", "Ram"), new Book(2, "Spring", "Sham"));
	}
	@GetMapping("/")
	public List<Book> getBooks(){
		return Arrays.asList(new Book(1, "JAVA", "Ram"));
	}
}
