/* Lawyer.java
 * Extends the employee class for a lawyer
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class Lawyer extends Employee {
	
	public int getVacDays() {
		return 15;
	}
	
	public String getVacForm() {
		return "pink";
	}
	
	public void sue() {
		System.out.println("I'll see you in court!");
	}

}
