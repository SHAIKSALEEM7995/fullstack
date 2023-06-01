package day9;

public class overloading {
	private String name;
	private int age;
	private float marks;
	
	public overloading(String myname, int myage)
	{
		name=myname;
		age=myage;
	}
	public overloading(String myname,float mymarks)
	{
		name=myname;
		marks=mymarks;
	}
	public static void main(String args[])
	{
		overloading o2=new overloading("saleem",21);
		System.out.println(o2.name);
		overloading o1=new overloading("malik",25.0f);
		System.out.println(o1.name);
		
	}

}
