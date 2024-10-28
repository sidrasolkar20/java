/*Aim : Create a simple Java application that implements a stack data structure
        using an array.
 *NAME:Sidra Solkar
 *UIN:231P087
 *ROLL NO:87
 *DIV:A
 */
package skll_oop_b3_odd;
import java.util.*;
public class StackUsingArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
    	System.out.println("Top of stack : "+s.peek());
    	s.push(70);
    	s.push(60);
    	s.push(50);
    	System.out.println("Top of stack : "+s.peek());
    	System.out.println(s.pop() + " Popped from stack");
    	System.out.println("Top of stack : "+s.peek());
    	s.push(40);
    	s.push(30);
    	s.push(20);
    	s.push(10);
    	s.display();
    	System.out.println("\nName :Sidra Solkar \nUIN:231P087");	
	}

}
class Stack {

    int MAX = 5; 
    int top=-1;
    int a[] = new int[MAX]; 

    boolean isEmpty()
    {
    return (top < 0);
    }

    boolean push(int x)
    {
    if (top >= (MAX - 1))
    {
    System.out.println("Stack Overflow");
    return false;
    }
    
    else {

    	a[++top] = x;
    	System.out.println(x + " pushed into stack");
    	return true;

    	}
    }
    
    int pop()
    {
    if (isEmpty()==true) 
    {
    System.out.println("Stack Underflow");
    return 0;
    }
    else 
    {
    int x = a[top--];
    return x;
    }

    }
    int peek()
    {
    if (isEmpty()==true) 
    {
    System.out.println("Stack Underflow");
    return 0;
    }
    
    else
    {
    int x = a[top];
    return x;
    }

    }
   void display() {
    	if (isEmpty()==true) {
    		System.out.println("Stack Underflow");
    	}else
    	{
    		int i;
    		System.out.println("Stack elements are:");

    		for(i=top;i>=0;i--) {
        		System.out.println(a[i]);
    		}
    	}
    }
}