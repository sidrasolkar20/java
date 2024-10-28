/*Aim:WAP to Find area of circle using method overloading
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class FindAreaOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1;
		 int r2;
		
		 Scanner sc=new Scanner(System.in);
		
		 AreaofMethodOverload a=new AreaofMethodOverload();
		 a.areaCircle();
		
		 System.out.println("Enter Radius 01:");
		 r1=sc.nextDouble();
		 AreaofMethodOverload b=new AreaofMethodOverload();
		 b.areaCircle(r1);
		
		 System.out.println("Enter Radius 02:");
		 r2=sc.nextInt();
		 AreaofMethodOverload c=new AreaofMethodOverload();
		 c.areaCircle(r2);
		
		 System.out.println(" Area of Circle-------Radius=5:");
		 a.display();
		 System.out.println(" Area of Circle-------Radius=:"+r1);
		 b.display();
		 System.out.println(" Area of Circle-------Radius=:"+r2);
		 c.display();
		
		
		 System.out.println(" \nName:Sidra Solkar");
		 System.out.println("UIN:231P087");
		 System.out.println("Roll no:43");
		 System.out.println("Div:A");
		 }
		 }
		 class AreaofMethodOverload
		 {
		 double r;
		
		
		 void areaCircle()
		 {
		 r=5;
		
		 }
		 void areaCircle(double radius)
		 {
		 r=radius;
		 }
		 void areaCircle(int radius)
		 {
		 r=radius;
		 }
		 void display()
		 {
			  System.out.println(" Area of Circle:"+(3.14*r*r));
			 
	}

}
