// Assn2_Fib
// Assignment 2 - Fibonacci
// Kira Abell
// ITC 115


public class Assn2_Fib {
	
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7  8  9  10 11 12
		// 1 1 2 3 5 8 13 21 34 55 89 144
		
		System.out.println("These are the first 12 numbers of the Fibonacci sequence.");
		space();
		
		int goal = 12;	// change value to get desired sequence number
						// e.g. 15 = 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
		int start = 0;
		int next = 1;
		int sum;
		
		for (int i=1; i<=goal; i++) {	// initializes at 1, iterates until 'goal' is true, increments by 1 step
			sum = start + next;
			start = next;
			next = sum;
				/* Fib. sequence is the sum of the previous two numbers, start + next
				 * new value is stored in its own variable (sum)
				 * the start variable is changed to the next in sequence
				 * the next variable is changed to the computed sum
				 * the values iterate through the loop 
				 */
			System.out.print(start + " ");			
		}
		
	}
	
	public static void space() {
		System.out.println();
	}

}