package com.beans;

import java.util.Map;

public class LibraryMap {
	private Map<String,Book> books;

	public Map<String, Book> getBooks() {
		return books;
	}

	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}
	public void displayBooks() {
		for(Map.Entry<String,Book> entry : books.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "\n" + "Value : " + entry.getValue());
		}
	}
}
