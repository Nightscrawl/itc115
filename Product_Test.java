/* Product_Test.java
 * Assignment 9 - A Product Class, Client Test
 * A test client for the Product class
 * Kira Abell
 * 11/24/2019
 * ITC 115
 */

public class Product_Test {
	
	public static void main(String[] args) {
		
		//System.out.println("Product placeholder with no data.");
		//Product gizmo0 = new Product();		
		//System.out.println(gizmo0);
		
		/* Above prints:
		 * Product placeholder with no data.
		 * Product description: N/A
		 * Code: 0
		 * Price: $0.00
		 */
		
		//sp();
		
		
		System.out.println("A new product.");
		Product gizmo1 = new Product("The BEST Gizmo!", 00001, 999.99);
		System.out.println(gizmo1);
		
		sp();
		
		System.out.println("A newish product.");
		Product gizmo2 = new Product("An okay Gizmo", 12345, 99.99);
		System.out.println(gizmo2);
		
		sp();
		
		System.out.println("A really old product.");
		Product gizmo3 = new Product("An out of date Gizmo", 54321, 9.99);
		System.out.println(gizmo3);		
		
		sp();
		
		int count = Product.pCount;
		if (count > 1) {
			System.out.printf("There are %d products.\n", count);
		}
		else if (count < 1) {
			System.out.println("There are no products.");
		}
		else {
			System.out.println("There is 1 product.");
		}
		
		sp();
		sp();
		
		// an example of changing via set method
		System.out.println("The BEST Gizmo! has gone on sale!");
		gizmo1.setpPrice(888.88);
		System.out.println(gizmo1);
		
		sp();
		
		System.out.println("The older product is seeing a surge in popularity!");
		gizmo3.setpDescription("An out of date Gizmo\nGet 'em while they last!\nHit those nostalgia buttons!");
		gizmo3.setpPrice(29.99);
		System.out.println(gizmo3);

		
		//System.out.println(gizmo1.getpPrice());
		//System.out.println(gizmo1.getPriceFormatted());
		
		
		
	}
	
	
	public static void sp() {
		System.out.println();
	}

}
