/* JavaMidterm_Cards.java
 * ITC115 - Java Midterm
 * Kira Abell, Jessica Sites
 * 10/28/2019
 * 
 * Accepts a short playing card rank and suit and returns a longhand name.
 * 
 * Examples:
 * After last value, hit <space> then <enter>.
 * Enter a card: k h 
 * King of Hearts
 * 
 * After last value, hit <space> then <enter>.
 * Enter a card: 9 S 
 * Nine of Spades
 */


import java.util.*;

public class JavaMidterm_Cards {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		input.useDelimiter(" "); // uses a space instead of enter
		
		cards(input); // passes the Scanner to the method
		
		input.close();
		
	}
	
	public static void cards(Scanner input) {
		
		System.out.println("After last value, hit <space> then <enter>.");
		System.out.print("Enter a card: ");		
		String rank = input.next();
		
			// RANK
		if (rank.equals("2")) {
			rank = "Two";			
		}
		if (rank.equals("3")) {
			rank = "Three";			
		}
		if (rank.equals("4")) {
			rank = "Four";			
		}
		if (rank.equals("5")) {
			rank = "Five";			
		}
		if (rank.equals("6")) {
			rank = "Six";			
		}
		if (rank.equals("7")) {
			rank = "Seven";			
		}
		if (rank.equals("8")) {
			rank = "Eight";			
		}
		if (rank.equals("9")) {
			rank = "Nine";			
		}
		if (rank.equals("10")) {
			rank = "Ten";			
		}
		if (rank.equalsIgnoreCase("J")) {
			rank = "Jack";			
		}
		if (rank.equalsIgnoreCase("K")) {
			rank = "King";			
		}
		if (rank.equalsIgnoreCase("Q")) {
			rank = "Queen";			
		}
		if (rank.equalsIgnoreCase("A")) {
			rank = "Ace";			
		}

		
		//System.out.println(rank);
		
		
			// SUIT
		String suit = input.next();
		
		if (suit.equalsIgnoreCase("S")) {
			suit = "Spades";
		}
		if (suit.equalsIgnoreCase("D")) {
			suit = "Diamonds";
		}
		if (suit.equalsIgnoreCase("C")) {
			suit = "Clubs";
		}
		if (suit.equalsIgnoreCase("H")) {
			suit = "Hearts";
		}
		
		//System.out.println(suit);
		
		System.out.println(rank + " of " + suit);
		
	}
	
	public static void space() {
		System.out.println();
	}

}
