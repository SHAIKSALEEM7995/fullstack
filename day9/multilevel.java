//multilevel inheritence......
package day9;
import java.util.Scanner;
  //class-A
  class D{
	  private int age;
	  private String name;
	  public void display()
	  {
		  System.out.println("This is the class-D enter your age:");
		  Scanner sc=new Scanner(System.in);
		  int age=sc.nextInt();
		  System.out.println("Class-A age"+age);
	  }
  }
  //class-B
   class V extends D{
	   private int marks;
	   public void display2() {
		   System.out.println("This is the class-V enter your marks:");
		   Scanner sc=new Scanner(System.in);
		   int marks=sc.nextInt();
		   System.out.println("Class-B marks"+marks);
	   }
   }
   //class-C
   class C extends V{
	   private String name2;
	   public void display3()
	   {
		   System.out.println("This is the class-C enter your name:");
		   Scanner sc=new Scanner(System.in);
		   String name2=sc.nextLine();
		   System.out.println("Class-C name"+name2);
	   }
   }

public class multilevel {
	public static void main(String args[])
	{
		D d=new D();
		V v=new V();
		C c=new C();
		d.display();
		v.display2();
		c.display3();
		
	}

}
