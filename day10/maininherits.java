package day10;
import java.util.Scanner;

      class F 
      {
	        int age; 
	        public void display(int age)
	        {
		       System.out.println("THis is F-class "+age);
	        }
	   }
      
          
      class I extends F
      {
	        String name;
            public void display1(int age)
	        {
		       System.out.println("This is I-class "+age);
	        }
      }
 
    public class maininherits extends I 
    {
	    public static void main(String args[])
	     {
		      Scanner sc=new Scanner(System.in);
		      
		      //creating the object..
		      maininherits main=new maininherits();
		      //taking values.... 
		      
		      main.age=sc.nextInt();
		      sc.nextLine();
		      
		      main.name=sc.nextLine();
		     
		      System.out.println(main.age);
		      System.out.println(main.name);
		      
		      main.display(main.age);
		      main.display1(main.age);
		     
		      sc.close();
	}

}
