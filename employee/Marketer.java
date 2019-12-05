/* Marketer.java
 * Assignment 11 - Ch 9, Ex 1, Harvard Lawyer
 * Extends the employee class for a marketer
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class Marketer extends Employee {
	
	public double getSalary() {
		return super.getSalary() + 10000.00;
	}
		// 'super' used to access the base method in the superclass (in this case, Employee)
	
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}

}
