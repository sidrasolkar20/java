/*Aim : Write a program for replace method of StringBuffer class.
 * Name Sidra Solkar
 * UIN : 231P087
 * Div : A.
*/
package skll_oop_b3_odd;
import java.util.*;
public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringBuffer str = new StringBuffer("Sidra Solkar");
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter a string: "+str );

		 StringBuffer s= str.replace(5, 6, "Sameer");
		
		 System.out.println("New string is: "+s );

		 System.out.println("\nName:Sidra Solkar");
		 System.out.println("UIN:231P087");
	}
}
