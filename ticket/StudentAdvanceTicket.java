/* StudentAdvanceTicket.java
 * Assignment 10 - A Ticket Class
 * Creates a Java class to store student advance ticket information
 * Kira Abell
 * 12/1/2019
 * ITC 115
 */


public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int number, int daysOut) {
		super(number, daysOut);
		getPrice(daysOut);
	}
	
	public double getPrice(int daysOut) {
		if (daysOut >= 10) {
			setPrice(super.getPrice(daysOut)/2);
		}
		else if (daysOut < 10) {
			setPrice(super.getPrice(daysOut)/2);
		}
		return getPrice();		
	}
	/* Sets ticket price based on the number of days
	 * from the event
	 * half off regular advanced tickets
	 */
	
	public String toString() {
		return super.toString() + " (ID Required)";
	}
		/* Example:
		 * Number: 73537, Price: $15.0 (ID Required)
		 */

}
