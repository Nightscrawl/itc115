/* Library.java
 * A class to catalogue items in a library
 * Kira Abell, Jessica Sites
 * 12/9/2019
 * ITC 115
 * 
 * Unfortunately, we just didn't have enough time...
 * 
 */


import java.util.*;
import java.text.*; 

public abstract class Library {
	
	private int itemNo;
	private String title;
	
	private String reserved;
	
	
	private int daysLate;	
	private String year;
	private String month;
	private String day;
	
	private int dueDate;
	
	public Library(int itemNo, String title) {
		this.itemNo = itemNo;
		this.title = title;
	}
	
	public String date(String month, String day, String year) {
		SimpleDateFormat formatter = new SimpleDateFormat(month + day + year);  
		Date date = new Date();  
		return formatter.format(date);  
	}
	
	public String toString() {
		return "Item Number: " + itemNo + "\n" + "Title: " + title;
	}
	
	
	
	
	
	public String getReserved() {
		if (reserved.equals("yes") ) {
			return "yes";
		}
		else {
			return "no";
		}
	}
	
	
	

	
	public String checkedIn(String checked) {
		if (checked.equals("yes")) {
			return "yes";
		}
		else {
			return "no";
		}
		
	}
	
	public double finesAccrued(int daysLate) {
		double sum = 0.0;
		for (int i=1; i<daysLate; i++) {
			sum = sum + 0.50;
		}
		return sum;		
	}
	

	
	
	/* GETTERS & SETTERS */

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
	
	
	

}
