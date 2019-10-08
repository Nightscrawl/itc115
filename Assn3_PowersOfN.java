// Assn3_PowersOfN
// Assignment 3 - Powers of N
// Uses a method to show show sequential values for a given base and exponent
// Kira Abell
// ITC 115


public class Assn3_PowersOfN {
	
	public static void main(String[] args) {
		
		printPowersOfN(2, 3);
			// prints each value, first number is base, second is exponent
			// 2^0 = 1, 2^1 = 2, 2^2 = 4, 2^3 = 8
		
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
		printPowersOfN(-2, 8);
		
	}
	
	public static void printPowersOfN(int base, int exp) {		// uses the values in the method call and plugs them in the loop
		for(int i=0; i<=exp; i++) {		// starts at 0; iterates until the exp value is reached; increments by 1 each step
			System.out.print((int)Math.pow(base, i) + " ");		// uses a loop to iterate and print sequential results using the values from the method call 
		}
		space();		
	}
	
	public static void space() {
		System.out.println();
	}

}
