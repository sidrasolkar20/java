package skll_oop_b3_odd;
import java.util.*;
public class Compare {

		int num1, num2;
		public Compare(int n, int m) {
		num1 = n;
		num2 = m;
		}
		public void getmax(){
		if ( num1 > num2 ) {
		System.out.println("Maximum value of two numbers is " + num1);
		}
		else {
		System.out.println("Maximum value of two numbers is " + num2);
		}
		}

		public static void main(String args[]) {
			Compare obj = new Compare(15, 55);
			Compare obj1 = new Compare(200, 345);
		obj.getmax();
		obj1.getmax();
		
		 System.out.println("\nName :Sidra Solkar \nUIN:231P087");	
	}
}