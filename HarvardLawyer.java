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
    
}
