/*AIM:WAP in java to display number between 1 to 5
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class testcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		   n=sc.nextInt();
       // for loop
	   for ( i=1; i<=10;++i) {
		   // if the value of i is 5 the loop terminate
		   if (i==5) {
			   continue;
		   }
	   System.out.println(i);
	}
	   System.out.println("\nNAME:SIDRA SOLKAR \nUIN:231P087");   
  }
}
