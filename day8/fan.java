package day8;
import java.util.Scanner;
class fan2{
	int wings;
	String str;
	String colour;
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your fan name:");
		str=sc.nextLine();
		System.out.println("Enter your fan colour:");
	    
	    colour=sc.nextLine();
	   
	    System.out.println("Enter no. of wings:");
	    wings=sc.nextInt();
	    System.out.println("Your fan "+str+" consists of "+wings+" wings and its colour is "+colour+".");
		
	}
	
}

public class fan {
   public static void main(String args[])
   {
	   fan2 f=new fan2();
	   f.display();
	   
	   
   }
}
