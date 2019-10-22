package com.nsh.spring.springrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/book")
	public List<Book> getAllBooks(){
		List<Book>bb = new ArrayList<>();
		bb.add(new Book(1l,"NAsee","GGG"));
		return bb;
	}
}
