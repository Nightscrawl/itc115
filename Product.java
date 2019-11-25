/* Product.java
 * Assignment 9 - A Product Class
 * Creates a Java class to store data about products
 * Kira Abell
 * 11/24/2019
 * ITC 115
 */

import java.text.NumberFormat;

public class Product {
	
	private String pDescription;
	private int pStock;
	private int pCode;	
	private double pPrice;  // in dollars
	public static int pCount;
	
	// creates a product with the given parameters
	public Product(String pDescription, int pStock, int pCode, double pPrice) {
		this.pDescription = pDescription;
		this.pStock = pStock;
		this.pCode = pCode;
		this.pPrice = pPrice;
		
		pCount++;		
	}
	
	// creates a product placeholder with no data
	public Product() {
		this("N/A", 0, 0, 0.00);
	}
		
	public String toString() {
		return "Product description: " + pDescription + "\n" + "Number in stock: " + pStock + "\n" + "Code: " + pCode + "\n" + "Price: " + getPriceFormatted();
	}	
		/* Example:
		 * Product description: The BEST Gizmo!
		 * Number in stock: 55
		 * Code: 1
		 * Price: $999.99
		 */
	

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	
	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public double getpPrice() {
		return pPrice;		
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.pPrice);
		return formattedPrice;
	}
		/* Example:
		 * formatted - $99.99
		 * NOT formatted - 99.99
		 */
	
	

}
