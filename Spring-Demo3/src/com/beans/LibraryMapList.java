package com.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LibraryMapList {
	private HashMap<String,List<Book>> books;

	public HashMap<String, List<Book>> getBooks() {
		return books;
	}

	public void setBooks(HashMap<String, List<Book>> books) {
		this.books = books;
	}
	
	public void displayBooks() {
		for(Entry<String, List<Book>> entry : books.entrySet()) {
			String entityName = entry.getKey();
			System.out.println("Key : " + entityName);
			List<Book> obj = entry.getValue();
			for(Book b : obj) {
				System.out.println("Value : " + b);
			}
		}
	}
}
