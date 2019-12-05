/* EmployeeMain4.java
 * A client to test the Employee class and its subclasses
 * Kira Abell
 * 12/4/2019
 * ITC 115
 */


public class EmployeeMain4 {
	
	public static void main(String[] args) {
		
		Employee[] employees = {new Employee(), new Secretary(), new LegalSecretary(), new Lawyer(), new HarvardLawyer(), new Marketer(), new Janitor()};
		
		System.out.println("Employee Info. at Allied Law Group");
		sp();
		sp();
		
		for (Employee e : employees) {
			System.out.println(e.getClass().getName() + ":");
			line();
			System.out.println("Hours: " + e.getHours() );
			System.out.printf("Salary: $%.2f\n", e.getSalary() );
			System.out.println("Vacation Days: " + e.getVacDays() );
			System.out.println("Vacation Form: " + e.getVacForm() );
			//System.out.println(e);
			
			sp();
			sp();
			
		}
		
		/* same behavior as EmployeeMain3, but the objects are
		 * stored in an array
		 * when methods are called on elements in the array
		 * polymorphic behavior results because the same code
		 * is being used for different types of objects
		 */
	}
	
	public static void sp() {
		System.out.println();
	}
	
	public static void line() {
		System.out.println("---------------");
	}

}
