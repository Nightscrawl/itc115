/* Assn5_printGPA2
 * Assignment 5 - Print GPA
 * Asks the user to input a count, a name, and several test scores;
 * 		returns the GPA for the range of scores
 * Kira Abell
 * 10/24/2019
 * ITC 115
 */


import java.util.*;

public class Assn5_printGPA2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This will calculate a student's GPA when given a number of scores.");
		space();
		
		System.out.print("Number of scores? ");
		int count = input.nextInt();
		
		space();
		
		input.useDelimiter(" "); // uses a space instead of enter
		
		System.out.println("After last value, hit <space> then <enter>.");
		System.out.print("Enter student's name and scores: ");
		String name = input.next();
		
		double sum = (int)printGPA(count, input);		
		double gpa = sum/count;
		
		System.out.println(name+"'s GPA is " + gpa);
		
		
		// !! delete comment slash to see the math in console !!
		//space();
		//System.out.println("Sum is " + sum);
		//System.out.println(sum + " divided by " + count + " is " + gpa);
		
		/* Example:
		 * This will calculate a student's GPA when given a number of scores.
		 * 
		 * Number of scores? 5
		 * 
		 * After last value, hit <space> then <enter>.
		 * Enter student's name and scores: Kira 1 2 3 4 5 
		 * 
		 * Kira's GPA is 3.0
		 */
			
	}
	
	public static int printGPA(int count, Scanner input) {
		
		int score;
		int sum = 0;
		
		for (int i=1; i<=count; i++) {
			//System.out.print("\tScore " + i + " : ");
			score = input.nextInt();
			sum = sum + score;
		}
		return sum;
		
	}
	
	public static void space() {
		System.out.println();
	}

}
