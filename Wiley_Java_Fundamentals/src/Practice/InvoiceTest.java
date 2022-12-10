package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Invoice implements Serializable{
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	
	public Invoice() {
		super();
	}
	
	public Invoice(String number, String description, int quantity, double price) {
		
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(this.quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(this.price < 0)
			this.price = 0;
		else
			this.price = price;
	}
	
	public double getInvoice() {
		double invoice = this.quantity*this.price;
		return invoice;
	}

	@Override
	public String toString() {
		return "Invoice [number=" + number + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + ", getInvoice()=" + getInvoice() + "]";
	}

	
	
	
}

public class InvoiceTest {

	public static void main(String[] args) {
		//Invoice invoice = new Invoice("12FB9","ABC",7,1500);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of invoices :");
		int n = scan.nextInt();
		Invoice[] invoice = new Invoice[n];
		for(int i=0 ; i<n ; i++) {
			invoice[i] = new Invoice();
			System.out.print("Enter the part number : ");
			invoice[i].setNumber(scan.next());
			System.out.print("Enter the description : ");
			invoice[i].setDescription(scan.next());
			System.out.print("Enter the quantity : ");
			invoice[i].setQuantity(scan.nextInt());
			System.out.print("Enter the price : ");
			invoice[i].setPrice(scan.nextDouble());
		}
		System.out.println("--------------------------");
		for(int i=0 ; i<n ; i++) {
		System.out.println("Part Number : " + invoice[i].getNumber());
		System.out.println("Part Description : " + invoice[i].getDescription());
		System.out.println("Quantity of Item : " + invoice[i].getQuantity());
		System.out.println("Price of Item : " + invoice[i].getPrice());
		System.out.println("Invoice : " + invoice[i].getInvoice());
		System.out.println();
		}
		
		
		
		
		
	}
	public void serialize(Invoice[] invoice) throws IOException {
		//Serialize
		
		FileOutputStream outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\invoiceData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		for(int i=0 ; i<5 ; i++) { 
			out.writeObject(invoice);
		}
		out.flush();
		out.close();
		outStream.close();
		System.out.println("Invoice object serialized successfully.");
	}
	public void deserialize() throws ClassNotFoundException, IOException {
		//Deserialize
		
		FileInputStream inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\Wiley-OOPS Notes\\serialize\\invoiceData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		for(int i=0 ; i<5 ; i++) { 
			Invoice invoice = (Invoice) in.readObject();
			System.out.println(invoice);
		}
		in.close();
		inStream.close();
	}

}
