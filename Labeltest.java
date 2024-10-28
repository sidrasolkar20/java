/*AIM:WAP to display pattern using label
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class Labeltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of row/column");
		 n=sc.nextInt();
		 stop: {
		 nextRow:
		 for (i=1;i<=7;i++)
	      {
		 if (i==6)
		 break stop;
		 System.out.println("");
		 for(j=1;j<=10;j++)
		 {
		 if(j>i)
		 continue nextRow;
		 System.out.print("*");
		 }
		 }	
		 }
		 System.out.println("\nNAME:SIDRA SOLKAR \nUIN:231P087");
	}
}

