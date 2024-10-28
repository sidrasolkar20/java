/*AIM:WAP to check string is palindrome or not using string buffer object.
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *ROLL NO:43
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str, rev;
		
		// StringBuffer object
		StringBuffer str1 = new StringBuffer();
		
		// Scanner object
		Scanner sc= new Scanner(System.in);
		System.out.print ("Enter a String :");
		str=sc.nextLine();  //read String
		
		str1.append(str);  //StringBuffer class method
		str1.reverse();  //StringBuffer class method
		rev=str1.toString();  //StringBuffer class method
		if(str.equalsIgnoreCase(rev))  //String class method
			System.out.println ("\nPalindrome");
		else
		 System.out.println (" \n Not a Palindrome");
		 System.out.println("\nName:Sidra Solkar");
		 System.out.println("UIN:231P087");
	}
	
}

