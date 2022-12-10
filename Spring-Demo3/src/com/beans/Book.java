package com.beans;

import java.util.Objects;

public class Book {
	String bookISBN;
	String bookName;
	int bookPrice;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookISBN, String bookName, int bookPrice) {
		super();
		this.bookISBN = bookISBN;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookISBN=" + bookISBN + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	@Override
	public int hashCode() {
		return this.bookName.length()/2;
	}
	@Override
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		return this.bookISBN.equals(b.bookISBN);
	}
	
}
