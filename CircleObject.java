/*Aim:Write an object oriented program in java that uses Euclid’s algorithm to display Greatest
	  common divisor of two integer
*Name:SIDRA SOLKAR
*UIN:231P087
*DIV:A
*/
package skll_oop_b3_odd;
import java.util.*;
public class CircleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r;
		float area;
		double pi=3.142;
		
		CIRCLE obj3 = new CIRCLE();
		
		obj3.acceptRadius();
		
		obj3.calculateArea();
		
		obj3.diplay();
		
		
		 System.out.println("\nNAME:SIDRA SOLKAR");
			System.out.println("UIN:231P087");

	}

}

class CIRCLE{
	
	float r;
	float area;
	double pi=3.142;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	void acceptRadius()
	{
		System.out.println("Enter a radius : ");
		r=sc.nextFloat();
	}
	
	double calculateArea()
	{
		return pi*r*r;
		
		
	}
	
	
	void diplay()
	{
		System.out.println("The entered radius is : "+r);
		System.out.println("The value of the calculated area of the circle is : "+calculateArea());
	}
  }
