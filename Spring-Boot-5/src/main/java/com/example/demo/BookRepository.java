package com.example.demo;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
	
	Book findByIsbn(String isbn);
	
	@Query(name = "Book.findTitleQuery")
	Book findByTitle(String title);
	
	
}
