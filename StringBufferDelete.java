/*Aim : Write a program for delete method of StringBuffer class.
* Name : Sidra Solkar
* UIN : 231P087
* Div : A.
*/
package skll_oop_b3_odd;
import java.util.*;
public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringBuffer str = new StringBuffer("Sidra Sameer Solkar");
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter a string: "+str );

		 StringBuffer s= str.delete(7, 14);
		
		 System.out.println("Enter a string: "+s );

		 System.out.println("\nName:Sidra Solkar");
		 System.out.println("UIN:231P087");
	}

}

