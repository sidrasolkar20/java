/*AIM:WAP TO CALCULATE AREA OF CIRCLE,TRIANGLE,RECTANGLE USING CONSTRUCTOR OVERLOAD.
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *ROLL NO:43
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class ConstructorArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		 int length, breath;
		 double height, base;
		 int radius;
		
		 System.out.println("Start the program : ");
		
		
		 System.out.println("Enter length : ");
		 length = sc.nextInt();
		 System.out.println("Enter breath : ");
		 breath = sc.nextInt();
		
		 ConsOf a1=new ConsOf(length, breath );
		
		
		 System.out.println("Enter height: ");
		 height = sc.nextDouble();
		 System.out.println("Enter base : ");
		 base = sc.nextDouble();
		
		 ConsOf b1=new ConsOf (height, base );
		
		
		 System.out.println("Enter radius : ");
		 radius = sc.nextInt();
		
		 ConsOf c1=new ConsOf (radius );
		
		 a1.display();
		 b1.display();
		 c1.display();
		
		
		 System.out.println("\nName:Sidra Solkar");
		 System.out.println("UIN:231P087");
		 
		  }
		  }
		
		
		  class ConsOf
		  {
		 
		  double result1;
		  double result2;
		  double result3;
		 
		  // method for rectangle
		  ConsOf(int length , int breath)
		  {
		  result1 = (length * breath);
		  }
		 
		  // method for triangle
		  ConsOf( double height, double base)
		  {
		  result2 = (height * base)/2;
		 
		  }
		 
		  // method for circle
		  ConsOf( int radius)
		  {
		  result3 = 3.14*radius*radius;
		 
		  }
		 
		  void display()
		  {
		  System.out.println("The area of the rectangle is :"+result1);
		  System.out.println("The area of the triangle is :"+result2);
		  System.out.println("The area of the circle is : "+result3);
	}

}
