package assignment3;

import java.util.Scanner;

class Book {
	private String bookName;
	private int ISBMNumber;
	private String authorName;
	private String publisherName;
	public Book() {
		super();
	}
	public Book(String bookName, int iSBMNumber, String authorName, String publisherName) {
		super();
		this.bookName = bookName;
		this.ISBMNumber = iSBMNumber;
		this.authorName = authorName;
		this.publisherName = publisherName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getISBMNumber() {
		return ISBMNumber;
	}
	public void setISBMNumber(int iSBMNumber) {
		this.ISBMNumber = iSBMNumber;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public String getBookInfo() {
		return "Book [BookName : " + bookName + ", ISBM Number : " + ISBMNumber + ", Author Name : " + authorName
				+ ", Publisher Name : " + publisherName + "]";
	}

	
	
	

}

public class BookTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of books : ");
		int n = scan.nextInt();
		Book[] book = new Book[n];
		for(int i=0 ; i<book.length ; i++) {
			
			book[i] = new Book();
			System.out.print("Enter Book Name : ");
			book[i].setBookName(scan.next());
			
			System.out.print("Enter Author Name : ");
			book[i].setAuthorName(scan.next());
			
			System.out.print("Enter ISBM Number : ");
			book[i].setISBMNumber(scan.nextInt());
			
			System.out.print("Enter Publisher Name : ");
			book[i].setPublisherName(scan.next());
		}
		for(int i=0 ; i<book.length ; i++) {
			
			System.out.println(book[i].getBookInfo() + "\n");
		}
	}

}
