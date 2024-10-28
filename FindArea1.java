/*Aim:WAP to Find area of circle using constructor overloading
 *NAME:Sidra Solkar
 *UIN:231P087
 *ROLL NO:87
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class FindArea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r1;
		 int r2;
		
		 Scanner sc=new Scanner(System.in);
		
		 AreaOf a1=new AreaOf();
		
		 System.out.println("Enter Radius 01:");
		 r1=sc.nextDouble();
	     AreaOf b1=new AreaOf(r1);
		
		 System.out.println("Enter Radius 02:");
		 r2=sc.nextInt();
		 AreaOf c1=new AreaOf(r2);
		
	     System.out.println(" Area of Circle-------Radius=0:");
		 a1.display();
		 System.out.println(" Area of Circle-------Radius=:"+r1);
		 b1.display();
		 System.out.println(" Area of Circle-------Radius=:"+r2);
		 c1.display();
		 System.out.println("********");
		 System.out.println("\nName :Sidra Solkar \nUIN:231P087");
		 }	
		 }

		 class AreaOf
		 {
		 double r;
		 AreaOf()
		 {
		 r=0;
		 }
		 AreaOf(double radius)
		 {
		 r=radius;
		 }
		 AreaOf(int radius)
		 {
		 r=radius;
		 }
		 void display()
		 {
		 System.out.println(" Area of Circle:"+(3.14*r*r)); 
	}
}