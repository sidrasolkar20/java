/*AIM:Write a program to display volume of sphere and Hemisphere. Make use of abstract class.
 *NAME:Sidra Solkar
 *UIN:231P087
 *ROLL NO:87
 *DIV:A    
 */
package skll_oop_b3_odd;
import java.util.*;

abstract class Shapeo2 {
	abstract void draw();
}
class Sphere extends Shapeo2 {
	int r;
	Sphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Sphere***");
		System.out.println("Enter radius of sphere:");
		r = sc.nextInt();
	}
	void draw() {
		System.out.println("Volume of sphere = " + (1.33 * 3.142 * r * r * r));
		}
	}
class Hemisphere extends Shapeo2 {
	double r;
	Hemisphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("***Hemisphere***");
		System.out.println("Enter Radius of a Hemisphere:");
		r = sc.nextDouble();
	}
	void draw() {
		System.out.println("Volume of Hemisphere = " + (0.66 * 3.142 * r * r * r));
		}
	}
public class Volume_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sphere s = new Sphere();
		s.draw();
		Hemisphere h = new Hemisphere();
		h.draw();
		System.out.println("\nName :Sidra Solkar \nUIN:231P087");	
	}
}
