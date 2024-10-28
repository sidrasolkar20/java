/*Aim:Write an object oriented program in java that uses Euclid’s algorithm to display Greatest
	common divisor of two integer
 *Name:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class GCDCalculator {

		 int calculateGCD(int a, int b) {
		        
		        if (b > a) {
		            int temp = a;
		            a = b;
		            b = temp;
		        }
		        
		        while (b != 0) {
		            int remainder = a % b;
		            a = b;
		            b = remainder;
		        }
		        
		        return a;     }

		    
		    public static void main(String[] args) {
		    
		        Scanner scanner = new Scanner(System.in);
		        
		        GCDCalculator gcdCalculator = new GCDCalculator();
		        
		        System.out.print("Enter the first integer: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter the second integer: ");
		        int num2 = scanner.nextInt();
		        
		        // Calculate GCD
		        int gcd = gcdCalculator.calculateGCD(num1, num2);
		        
		      
		        System.out.println("The Greatest Common Divisor of " + num1 + " and " + num2 + " is: " + gcd);
		        
		        System.out.println("\nNAME:SIDRA SOLKAR");
				System.out.println("UIN:231P087");
		       
	}
 }






