/* Janitor.java
 * Assignment 11 - Ch 9, Ex 2, Janitor
 * Extends the employee class for a janitor
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class Janitor extends Employee {
	
	public int getHours() {
		return super.getHours() * 2;
	}
	
	public double getSalary() {
		return super.getSalary() - 10000.00;
	}
	
	public int getVacDays() {
		return super.getVacDays()/2;
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}

}
