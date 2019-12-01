/* WalkupTicket.java
 * Assignment 10 - A Ticket Class
 * Creates a Java class to store walkup ticket information
 * Kira Abell
 * 12/1/2019
 * ITC 115
 */


public class WalkupTicket extends Ticket {
	
	public WalkupTicket(int number) {
		setTicketNum(number);
	}
	
	public double getPrice() {
		return 50.00;
	}
	
	
}
