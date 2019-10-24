/* Assn5_Season
 * Assignment 5 - Season
 * Asks the user to input two numbers;
 * 		returns the name of the season for a mo/day range
 * Kira Abell
 * 10/24/2019
 * ITC 115
 */


import java.util.*;

public class Assn5_Season {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program accepts a month and day numeral and returns the season for that date range.");
		space();
		
		System.out.print("What is the month number? ");
		int mo = input.nextInt();
		
		System.out.print("What is the day number? ");
		int day = input.nextInt();
		
		input.close();
		
		space();
		
		season(mo, day);
		
		
		/* Example: 
		 * What is the month number? 12
		 * What is the day number? 25
		 * 
		 * The season is winter.
		 * Merry Christmas!
		 */
		
	}
	
	public static void season(int mo, int day) {
		
		// winter 12/16 - 3/15
		// spring 3/16 - 6/15
		// summer 6/16 - 9/15
		// fall 9/16 - 12/15
		
		//winter
		if (mo == 12 && (day >= 16 && day <= 31)) {
			System.out.println("The season is winter.");
			if (day == 25) {
				System.out.println("Merry Christmas!");
			}
		}
		else if (mo == 1 && (day >= 1 && day <= 31)) {
			System.out.println("The season is winter.");
			if (day == 20) {
				System.out.println("Happy birthday to me!");
			}
		}
		else if (mo == 2 && (day >= 1 && day <= 28)) {
			System.out.println("The season is winter.");
		}
		else if (mo == 3 && (day >= 1 && day <= 15)) {
			System.out.println("The season is winter.");
		}
		//spring
		else if (mo == 3 && (day >= 16 && day <= 31)) {
			System.out.println("The season is spring.");
		}
		else if (mo == 4 && (day >= 1 && day <= 30)) {
			System.out.println("The season is spring.");
		}
		else if (mo == 5 && (day >= 1 && day <= 31)) {
			System.out.println("The season is spring.");
		}
		else if (mo == 6 && (day >= 1 && day <= 15)) {
			System.out.println("The season is spring.");
		}
		//summer
		else if (mo == 6 && (day >= 16 && day <= 30)) {
			System.out.println("The season is summer.");
		}
		else if (mo == 7 && (day >= 1 && day <= 31)) {
			System.out.println("The season is summer.");
			if (day == 4) {
				System.out.println("Happy Independence Day!\nWatch out for sharks.");
			}
		}
		else if (mo == 8 && (day >= 1 && day <= 31)) {
			System.out.println("The season is summer.");
		}
		else if (mo == 9 && (day >= 1 && day <= 15)) {
			System.out.println("The season is summer.");
		}
		//fall
		else if (mo == 9 && (day >= 16 && day <= 30)) {
			System.out.println("The season is fall.");
		}
		else if (mo == 10 && (day >= 1 && day <= 31)) {
			System.out.println("The season is fall.");
			if (day == 31) {
				System.out.println("Happy Halloween!");
			}
		}
		else if (mo == 11 && (day >= 1 && day <= 30)) {
			System.out.println("The season is fall.");
		}
		else if (mo == 12 && (day >= 1 && day <= 15)) {
			System.out.println("The season is fall.");
		}
		else {
			System.out.println("Date out of range.\nPlease enter an appropriate month and day number.");
		}
		
	}
	
	public static void space() {
		System.out.println();
	}

}
