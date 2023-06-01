package day8;
import java.util.Scanner;
class creatingclass {
	int age;
	String name;
	public void study()
	{
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your age:");
	  age=sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter your name:");
	  name=sc.nextLine();
	  System.out.println("Hi "+name+" Your age is "+age);
	}

}
