/*Assignment1-Q1
 *AIM:Write a Java program and compute the sum of an integer's digits.
 *NAME:Sidra Solkar
 *UIN:231P087
 *ROLL NO:87
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		while (n > 0) {
		digit = n % 10;
		sum = sum + digit;
		n = n / 10;
		}
		System.out.println("Sum of the Digits:" + sum);
		System.out.println("\nName :Sidra Solkar \nUIN:231P087");
	}
}