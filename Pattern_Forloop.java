/*AIM:WAP to display pattern using for loop
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class Pattern_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable declaration
		   int i,j,n;
			
		   Scanner sc=new Scanner(System.in);
			
		   //Input from user
		   System.out.println("Enter number of row/column");
		   n=sc.nextInt();
		   
		   //logic
		   
		   // for loop for row
		   for (i=1;i<=n;i++)
		   {
			   for(j=1;j<=i;j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
			   }
		   System.out.println("\nNAME:SIDRA SOLKAR \nUIN:231P087"); 
		   }

	}


