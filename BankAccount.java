/* BankAccount.java
 * Remote Work - Extra Credit
 * Adds a new method to the Bank Account class to return
 * 		whether the account has enough money to cover deposit fees
 * 		after the balance is calculated
 * Kira Abell
 * 12/2/2019
 * ITC 115
 */


import java.util.Arrays;

// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.

public class BankAccount {

    private double balance;
    private int transactions;
    
	public double getBalance() {
		return balance;
	}
    
	public int getTransactionCount() {
		return transactions;
	}
		/* while this method is not in the Practice-it code,
		 * it IS present in the full class code, linked on Practice-it
		 */
	
    
    
    // NEW METHOD -- PRACTICE IT
	public boolean transactionFee(double fee) {

        double[] feeList = new double[getTransactionCount()];
        double prev = 0.0;
		double fee2 = 0.0;
	    for (int i=1; i<=getTransactionCount(); i++) {
	        fee2 = fee * i;
	        fee2 = prev + fee2;
            feeList[i-1] = fee2;
	    }
        double feeSum = Arrays.stream(feeList).sum();
        	/* uses a loop to get the compounding fees.
        	 * uses the transaction count to build an array
        	 * in order to store all of the compounding fees.
        	 * adds the fees within the array together for the final fee total
        	 */
        
		if (getBalance() - feeSum > 0.00) {
			return true;
		}
		else {
			return false;
        }
			/* if the account balance - the fee total is
			 * greater than 0.00, then there IS enough money
			 * to cover the fees and returns true 
			 */
		
		
		/* unfortunately, this does not work correctly within Practice-it
		 * I have no idea why
		 * this solution *does* work within Eclipse for the various
		 * examples that I wrote by calling from the main.
		 * I'm not sure what Practice-it wants here...
		 */
		
    }
    
    
}
