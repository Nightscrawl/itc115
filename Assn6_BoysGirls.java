/* Assn6_BoysGirls
 * Assignment 6 - BoysGirls
 * Reads a file, counts the number of boys, the number of girls,
 * 		and computes the difference in their ages
 * Kira Abell
 * 11/7/2019
 * ITC 115
 */


import java.util.*;
import java.io.*;

public class Assn6_BoysGirls {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("boysgirls.txt"));
		
		boyGirl(input, 0, 0, 0, 0);		// initializes all values to 0
		
		
		
		/* Testing:
		 * With the given file, the result is
		 * 		There are 5 boys and 5 girls.
		 * 		There is a difference of 4 years between the boys and girls.
		 * 
		 * With additional names/ages
		 * 		Jane 5
		 *		John 10
		 *		Jenniffer 4
		 *
		 * The result is
		 * 		There are 5 boys and 5 girls.
		 *		There is a difference of 4 years between the boys and girls.
		 */
		
	}
	
	public static void boyGirl(Scanner input, int countG, int sumG, int countB, int sumB) {
		
		int line = 0;	
		while (input.hasNextLine()) {
			String kid = input.next();			
			int ages = input.nextInt();
			line++;
			
			if (line%2 == 0) {
				countG++;
				sumG = sumG + ages;
				//System.out.println(kid);	-- uncomment to see all the girls
			}
			else {
				countB++;
				sumB = sumB + ages;
				//System.out.println(kid);	-- uncomment to see all the boys
			}
			
		}
		//System.out.println(line);		-- uncomment to see total lines
		//System.out.println(countG);		-- uncomment to see boy count
		//System.out.println(sumG);		-- uncomment to see boys' age sum
		//System.out.println(countB);		-- uncomment to see girl count
		//System.out.println(sumB);		-- uncomment to see girls' age sum
		
		
		System.out.printf("There are %d boys and %d girls.", countB, countG);
		space();
		System.out.printf("There is a difference of %d years between the boys and girls.", Math.abs(sumB-sumG));
		
	}
	
	public static void space() {
		System.out.println();
	}

}
