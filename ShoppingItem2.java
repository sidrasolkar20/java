package skll_oop_b3_odd;
import java.util.*;
public class ShoppingItem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list = new Vector();
		 int len=args.length;
		 for(int i=0;i<len;i++)
		 {
		 list.addElement(args[i]);
		 }
		 int size=list.size();
		 String str[]= new String[size];
		 list.copyInto(str);
		 for(int i=0;i<size;i++)
	      {
		 System.out.println ("Element of Vector at position"+i+":"+str[i]);
		 }
		 {
			 System.out.println("\nName :Sidra Solkar \nUIN:231P087");	
		 }
	}

}
