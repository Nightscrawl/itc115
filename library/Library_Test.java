/* Library_Test.java
 * A class test for the Library
 * Kira Abell, Jessica Sites
 * 12/9/2019
 * ITC 115
 */


public class Library_Test {
	
	public static void main(String[] args) {
		
		Library book1 = new Book(12345, "Gone with the Wind");
		Library magazine1 = new Magazine(11223344, "Playboy");
		Library DVD1 = new DVD(567, "Bride of Chucky");
		Library CD1 = new CD(9876, "Beethoven, Symphony No. 5");
		
		
		System.out.println(book1);
		System.out.println();
		
		System.out.println(magazine1);
		System.out.println();
		
		System.out.println(DVD1);
		System.out.println();
		
		System.out.println(CD1);
		
		
	}

}
