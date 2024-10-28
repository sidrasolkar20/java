/*Aim:Write a program to calculate volume of sphere using multilevel inheritance.
*NAME:Sidra Solkar
*UIN:231P087
*ROLL NO:87
*DIV:A
*/
package skll_oop_b3_odd;
import java.util.*;

class Radius{
	float radius;
	
	public Radius(float r) {
		radius = r;
	}
	
	void display() {
		System.out.println(radius);
	}

}

class AreaOfCircle extends Radius{
	
	public AreaOfCircle(float r) {
		super(r);
	}
	
	void findArea() {
		float area = (float) (3.14 * radius * radius);
		System.out.println("Area of cirlce: "+area);
	}
}

class VolumeOfSphere extends Radius{
	
	public VolumeOfSphere(float r) {
		super(r);
		}
	
	void findVolume (){
		float volume = (float) ((4 / 3) * 3.14 * (radius * radius * radius));
		System.out.println("volume of sphere: "+volume);
	}
}

public class VolumOfSphereOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		float in = sc.nextFloat();
		VolumeOfSphere volumeOfSphere = new VolumeOfSphere(in);
		volumeOfSphere.findVolume();
		System.out.println("\nName : Sidra Solkar\nUIN:231P087");
	
	}

}