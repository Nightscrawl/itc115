/* Assn4_Repl
 * Assignment 4 - Repl
 * Asks the user to input a number and a phrase;
 * 		repeats the phrase according to input number of times
 * Kira Abell
 * 10/16/2019
 * ITC 115
 */


import java.util.*;

public class Assn4_Repl {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a whole number, any whole number!");
		int num = input.nextInt();
		
		if (num <= 0) {
			System.out.println("");
				// prints an empty String
				// for testing purposes, add a character to 'see' the result
		}
		else {
			input.nextLine();
				// required to force Java to read the next line asked
				// https://stackoverflow.com/questions/7877529/java-string-scanner-input-does-not-wait-for-info-moves-directly-to-next-stateme
			
			System.out.println("Pick a phrase, any phrase!");
			String phrase = input.nextLine();
			
			repl(num, phrase);
				/* calls the method, using the input number and word/phrase
				 * (3, hello) returns "hellohellohello"
				 * (5, i like cheese) returns "i like cheesei like cheesei like cheesei like cheesei like cheese"
				 */
		}
		
		input.close();
		
	}
	
	public static void repl(int num, String phrase) {
		for (int rep=1; rep<=num; rep++) {
			System.out.print(phrase);
		}
		space();
	}
	
	public static void space() {
		System.out.println();
	}

}
