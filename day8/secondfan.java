package day8;
import java.util.Scanner;
class fan3{
	int wings;
	String colour;
	String name;
}

public class secondfan {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		fan3 f=new fan3();
		System.out.println("Enter your fan name:");
		f.name=sc.nextLine();
		
		System.out.println("Enter your fan color:");
		f.colour=sc.nextLine();
		System.out.println("Enter your fan wings:");
		f.wings=sc.nextInt();
		System.out.println("Your fan "+f.name+" consiste of "+f.wings+" wings and its colour is "+f.colour+".");
	}

}
