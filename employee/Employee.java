/* Employee.java
 * A base class for employees
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class Employee {
	
	public int getHours() {
		return 40;
	}
	
	public double getSalary() {
		return 40000.00;
		
		// after a raise
		//return 50000.00;
		
			/* a single change in code will trickle down to
			 * all of the subclasses via use of keyword 'super' in subclass
			 */
	}
	
	public int getVacDays() {
		return 10;
	}
	
	public String getVacForm() {
		return "yellow";
	}

}
