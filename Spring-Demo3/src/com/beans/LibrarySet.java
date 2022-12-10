package com.beans;

import java.util.HashSet;

public class LibrarySet {
	private HashSet<Book> books;

	
	public void displayBooks() {
		for(Book b : books) {
			System.out.println(b);
		}
	}


	public HashSet<Book> getBooks() {
		return books;
	}


	public void setBooks(HashSet<Book> books) {
		this.books = books;
	}
}
