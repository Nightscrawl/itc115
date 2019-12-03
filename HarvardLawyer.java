/* HarvardLawyer.java
 * Remote Work - Extra Credit
 * Extends the lawyer class for a Harvard lawyer -- fancy!
 * Kira Abell
 * 12/2/2019
 * ITC 115
 */


import java.util.Collections;

public class HarvardLawyer extends Lawyer {
    
	public double getSalary() {
        	return super.getSalary() * 1.2;
    	}
	
	public int getVacDays() {
		return super.getVacDays() + 3;
	}
	
	public String getVacForm() {
		return String.join("", Collections.nCopies(4, super.getVacForm() ) );
    	}
		// generates 4 copies of the given string
    
}
