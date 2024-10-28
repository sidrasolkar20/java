package skll_oop_b3_odd;


import java.util.*;
public class Main_Class {
public static void main(String[] args) {
 // TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
 
 Results a = new Results();
 
 System.out.print("Enter Roll Number: ");
 int rollNumber = scanner.nextInt();
 a.getNumber(rollNumber);
 
 System.out.print("Enter Marks for Part 1: ");
 float part1 = scanner.nextFloat();
 
 System.out.print("Enter Marks for Part 2: ");
 float part2 = scanner.nextFloat();
 
 a.getMarks(part1, part2);
 a.putMarks();
 a.putwt();
 a.display();
 
 scanner.close();
 
 System.out.println("\nName:Sidra Solkar\nUIN:231P087\nROLL NO:43");
 }
}
class Student {
 private int rollNumber;
 void getNumber(int n) {
 rollNumber = n;
 }
 void printNumber() {
 System.out.println("Roll No is " + rollNumber);
 }
}
class Test extends Student {
 private float part1, part2;
 void getMarks(float a, float b) {
 part1 = a;
 part2 = b;
 }
 void putMarks() {
 System.out.println("Marks Part 1: " + part1);
 System.out.println("Marks Part 2: " + part2);
 }
}
interface Sports {
 float sportwt = 6.0F;
 void putwt();
}
class Results extends Test implements Sports {
 private float total;
 public void putwt() {
 System.out.println("Sports Marks: " + sportwt);
 }
 void display() {
 total = part1 + part2 + sportwt; // You may need to adjust access to part1 and part2
 System.out.println("Total marks of Roll No " + rollNumber + " is " + total);
 }
}