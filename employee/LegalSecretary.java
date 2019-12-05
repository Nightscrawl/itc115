/* LegalSecretary.java
 * Extends the Secretary class for a legal secretary
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class LegalSecretary extends Secretary {
	
	public double getSalary() {
		//return 45000.00;
		
		// OR
		return super.getSalary() + 5000;  //5000 more than general employees
		
	}
	
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}

}
