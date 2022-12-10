package assignment3;

class Date {
	private int month;
	private int day;
	private int year;
	public Date() {
		super();
	}
	public Date(int month, int day, int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	public void display() {
		System.out.println("Date Entered : " + this.day + "/" + this.month + "/" + this.year);
	}
	
}

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		date.setDay(11);
		date.setMonth(11);
		date.setYear(2022);
		date.display();
	}

}
