package day11;

abstract class car{
	/*private int age;
	private String name;
	private float rating;
	
	
	car(int age,String name){
		 age=this.age;
		 name=this.name;
	 }
	 
	
	car(int age,float rating){
		 age=this.age;
		 rating=this.rating;
	 }
	
	*/
	//this is the abstract method
	abstract void  display();
	public void display1()
	{
		System.out.println("THis is the first car");
	}
}
abstract class wagon extends car{
	
	}
class swift extends wagon{
	private int age;
	private String name;
	private float rating;
	
	//first constructor object wg
 public	swift(int age,String name){
		 age=this.age;
		 name=this.name;
	 }
	public void display2()
	{
		System.out.println(age+name);
	}
	 
	//second constructor object wg1
	public swift(int myage,float rating){
		 age=myage;
		 rating=this.rating;
	 }
	public void display3()
	{
		System.out.println(age+rating);
	}
	
	//abstract methods with different parameters
	public void display()
	{
		System.out.println("This is the swift class");
	}
	public void display(int a)
	{
		System.out.println("This is the swift class "+a);
	}
	
}
public class abstrac {
	public static void main(String args[])
	{
		swift wg=new swift(20,"saleem");
		swift wg1=new swift(20,20.3f);
		wg.display();
		wg.display(20);
		wg.display1();
		wg.display2();
		wg1.display3();
	
	}

}
