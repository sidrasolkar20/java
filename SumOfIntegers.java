/* Aim : Write a Java program and compute the sum of an integer's digits.
 * Name :Sidra Sameer Solkar
 * UIN : 231P087
 * Div : A.
 */
package skll_oop_b3_odd;
import java.util.*;
public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0, num, rem;
		
		System.out.println("Enter a group of number:");
		num = sc.nextInt();
		
		while(num>0) {
			rem = num%10;
			sum = sum +rem;
			num = num/10;
	}
	
		System.out.println("Sum of the digits is :"+sum);
	
		System.out.println("Name :Sidra Sameer Solkar");
		System.out.println("UIN : 231P087");

	}
}

