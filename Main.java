/*
* Name :Sidra Solkar
 * UIN : 231P087
 * Div : A.
 */
package skll_oop_b3_odd;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Scanner sc = new Scanner(System.in);

				String name;

				int age;

				System.out.println("Start the program : ");

				Student s = new Student("Shifa Shaikh", 19);

				System.out.println("Student Name: " + s.getName());

				System.out.println("Student Age: " + s.getAge());

				System.out.println("\nName :Solkar Sidra ");

				System.out.println("UIN : 231P087");

			}


		}

		class Student {

			private String name;

			private int age;

			public Student(String name, int age) {

				this.name = name;

				this.age = age;

			}

			public String getName() {

				return name;

			}

			public int getAge() {

				return age;

			}
	}


