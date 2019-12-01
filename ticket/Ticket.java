/* Ticket.java
 * Assignment 10 - A Ticket Class
 * Creates a Java class to store event ticket information
 * Kira Abell
 * 12/1/2019
 * ITC 115
 */


public abstract class Ticket {
	
	private int number;
	private double price;
	public static int count;
	
	public Ticket() {
		setTicketNum(0);
		count++;
	}
	
	public Ticket(int number) {
		setTicketNum(number);

	}
	
	public void setTicketNum(int number) {
		this.number = number;

	}
	
	public String toString() {
		return "Number: " + getNumber() + ", " + "Price: $" + getPrice();
	}
		/* Example:
		 * Number: 41379, Price: $50.0
		 */

	// GETTERS & SETTERS
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	




	
	
	
	
		
}
