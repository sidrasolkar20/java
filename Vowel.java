/*AIM:WAP to count vowels of a given string.
 *NAME:Sidra Solkar
 *UIN:231P087
 *ROLL NO:87
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 String str = new String();
		
		 int len,count=0;
		
		 System.out.println("Enter String: ");
		 str = sc.nextLine();
		 len = str.length();
		 for(int i=0;i<=len-1;i++)			 
			 if(str.charAt(i)=='a'||			 
			 str.charAt(i)=='e'||
			 str.charAt(i)=='i'||
			 str.charAt(i)=='o'||
			 str.charAt(i)=='u'
			  )
	     count++;
		 System.out.println("Frequency of vowel in string is "+count);
		 sc.close();
		 System.out.println("\nName :Sidra Solkar \nUIN:231P087");
	}
}
