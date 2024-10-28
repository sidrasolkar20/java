package skll_oop_b3_odd;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int choice;
		
		System.out.println("Enter your choice");
		
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		switch (choice) 
		{
		case 1 : System.out.println("january");
		break;
		
		case 2: System.out.print("February");
		break;
		
		case 3 : System.out.print("March");
		break;
		
		case 4 : System.out.print("April");
		break;
		
		case 5 : System.out.print("May");
        break;
        
		case 6 : System.out.print("June");
		break;
		
		case 7: System.out.println("july");
		break;
		
        case 8 : System.out.print("August");
		break;
		
        case 9 : System.out.print("September");
		break;
		
        case 10 : System.out.print("october");
        break;
        
        case 11 : System.out.print("november");
        break;
        
        case 12 : System.out.print("december");

        default: System.out.println("wrong choice");
		}
		System.out.println("\nNAME:SIDRA SOLKAR");
		System.out.println("UIN:231P087");
	}

}
