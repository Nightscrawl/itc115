/* Assn8_Ex4_IsSorted
 * Assignment 8 - IsSorted
 * Accepts array of doubles from usr input, returns true/false according to
 * 		whether the numbers are sorted in ascending order
 * Kira Abell
 * 11/17/2019
 * ITC 115
 */


import java.util.*;

public class Assn8_Ex4_IsSorted {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//double[] list1 = {16.1, 12.3, 22.2, 14.4};
		//double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};		
		//double[] test = list2;		
		//printArray(test);		
		//boolean result = isSorted(test);
		//System.out.println(result);
			// original testing
		
		
		boolean result = isSorted(getArray(input));
		System.out.println(result);
		
		
		/* test1
		 * How many numbers would you like to enter? 4
		 * Please enter 4 real numbers. 16.1 12.3 22.2 14.4
		 * false
		 */
		
		/* test2
		 * How many numbers would you like to enter? 6
		 * Please enter 6 real numbers. 1.5 4.3 7.0 19.5 25.1 46.2
		 * true
		 */		
		
	}
	
	public static double[] getArray(Scanner input) {
		System.out.println("Welcome. This program will determine whether a series of real numbers is sorted in ascending order.");
		System.out.println("true = numbers are sorted");
		System.out.println("false = numbers are not sorted");
		
		sp();
		
		System.out.print("How many numbers would you like to enter? ");
		int amount = input.nextInt();
		
		sp();
		
		System.out.printf("Please enter %d real numbers. ", amount);
		double[] list = new double[amount];
		for (int i=0; i<list.length; i++) {
			list[i] = input.nextDouble();
		}
		//printArray(list);  // uncomment to see usr input array
		return list;		
	}
	
	public static boolean isSorted(double[] ar) {
		int count = 0;
		double prev = ar[0];
		for (int i=1; i<ar.length; i++) {
			double next = ar[i];
			if (prev < next) {
				count++;
				prev = next;
			}			
		}
		
		//System.out.println(ar.length-1);
		//System.out.println(count);
			/* uncomment both to see tests
			 * if these are equal, the test in the loop
			 * was past for each increment, so the list is sorted
			 */
		
		if (count == ar.length-1) {
			/* using length-1 because we're counting
			 * the number of comparisons, or jumps/spaces between elements
			 */
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void printArray(double[] ar) {
		System.out.println(Arrays.toString(ar));
	}
	
	public static void sp() {
		System.out.println();
	}

}
