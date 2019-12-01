/* Ticket_Test.java
 * Assignment 10 - A Ticket Class
 * Creates a Java client to test the ticket class
 * Kira Abell
 * 12/1/2019
 * ITC 115
 */


import java.util.*;

public class Ticket_Test {
	
	public static void main(String[] args) {		
		
		int count = Ticket.count;
		
		Random r = new Random();  // generates a random number for the ticket (for fun)
		
		Ticket t1 = new WalkupTicket(r.nextInt(100000));  // regular tickets are a flat rate
		System.out.println("Walkup Ticket:");
		System.out.println(t1);
		
		sp();
		
		Ticket t2 = new AdvanceTicket(r.nextInt(100000), 11);  // advance and st. advance accept a daysOut parameter, which sets the price
		System.out.println("Advance Ticket:");
		System.out.println(t2);
		
		sp();
		
		Ticket t3 = new StudentAdvanceTicket(r.nextInt(100000), 8);
		System.out.println("Student Advance Ticket:");
		System.out.println(t3);
		
		sp();
		
		Ticket t4 = new StudentAdvanceTicket(r.nextInt(100000), 15);
		System.out.println("Student Advance Ticket:");
		System.out.println(t4);
		
		sp();
		
		count = Ticket.count;
		System.out.printf("We have sold %d tickets.", count);
		
		
		/* Example:
		 * Advance Ticket:
		 * Number: 31566, Price: $30.0 
		 */

		
	}
	
	public static void sp() {
		System.out.println();
	}

}
