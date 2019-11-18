/* Assn8_Ex11_IsUnique
 * Assignment 8 - IsUnique
 * Accepts array of ints from usr unput, returns true/false according to
 * 		whether all values are unique
 * Kira Abell
 * 11/17/2019
 * ITC 115
 */


import java.util.*;

public class Assn8_Ex11_IsUnique {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		//int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
		//int[] list2 = {4, 3, 7, 9, 12, -47, 3, 74};
		//boolean result = isUnique(list1);
			// original testing
		

		boolean result = isUnique(getArray(input));
		System.out.println(result);
		
		
		/* test1
		 * How many numbers would you like to enter? 9
		 * Please enter 9 numbers. 3 8 12 2 9 17 43 -8 46
		 * true
		 */
		
		/* test2
		 * How many numbers would you like to enter? 8
		 * Please enter 8 numbers. 4 3 7 9 12 -47 3 74
		 * false
		 */
		
	}
	
	public static int[] getArray(Scanner input) {
		System.out.println("Welcome. This program will determine whether a series of whole numbers is unique.");
		System.out.println("true = numbers are unique");
		System.out.println("false = numbers are not unique");
		
		sp();
		
		System.out.print("How many numbers would you like to enter? ");
		int amount = input.nextInt();
		
		sp();
		
		System.out.printf("Please enter %d whole numbers. ", amount);
		int[] list = new int[amount];
		for (int i=0; i<list.length; i++) {
			list[i] = input.nextInt();
		}
		//printArray(list);  // uncomment to see usr input array
		return list;		
	}
	
	public static boolean isUnique(int[] ar) {
		int count = 0;
		for (int i=0; i<ar.length-1; i++) {
			for (int j=i; j<ar.length-1; j++) {
				if (ar[i] == ar[j+1]) {
					//System.out.print(ar[i] + " ");
					//System.out.println(ar[j+1]);
						// uncomment to see each number comparison
					count++;					
				}
			}
		}
		//System.out.println(count);  // uncomment to see the count
		
		if (count > 0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void printArray(int[] ar) {
		System.out.println(Arrays.toString(ar));
	}
	
	public static void sp() {
		System.out.println();
	}

}
