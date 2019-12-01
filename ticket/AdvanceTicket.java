/* AdvanceTicket.java
 * Assignment 10 - A Ticket Class
 * Creates a Java class to store advance ticket information
 * Kira Abell
 * 12/1/2019
 * ITC 115
 */


public class AdvanceTicket extends Ticket {
	
	private int daysOut;
	
	public AdvanceTicket(int number, int daysOut) {
		setTicketNum(number);
		getPrice(daysOut);
	}
	
	public double getPrice(int daysOut) {
		if (daysOut >= 10) {
			setPrice(30.00);
		}
		else if (daysOut < 10) {
			setPrice(40.00);
		}
		return getPrice();		
	}
		/* Sets ticket price based on the number of days
		 * from the event
		 */
	
}
