package day2;
import java.util.Scanner;

public class elseif {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("not eligible for vote");
		}
		else if(age<=18)
		{
			System.out.println("you are eligible for vote");
		}
		else {
			System.out.println("not eligible for vote");
		}
	}

}
