package day9;
import java.util.Scanner;
   //class-A
   class A{
	    private int age;
	    private String name;
	    
     }
   //class-B
   class B extends A{
	    private int marks;
	    public void display()
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int age=sc.nextInt();
	    	sc.nextLine();
	    	String name=sc.nextLine();
	    	
	    	int marks=sc.nextInt();
	    	
	    	System.out.println(age);
	    	
	    	System.out.println(marks);
	    	System.out.println(name);
	    }
	    
   }


public class inheretence {
	 public static void main(String args[])
	 {
		 
		A a=new A();
		B b=new B();
		b.display();
		
		 
	 }

}
