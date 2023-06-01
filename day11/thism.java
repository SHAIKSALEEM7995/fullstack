package day11;
class dellhp{
	dellhp()
	{
		System.out.println("This is the dell class 0");
	}
	dellhp(int x)
	{
		this();
		
		System.out.println("This is the dell class 1");
	}
	dellhp(int x,int y)
	{
		this(1);
		System.out.println("This is the dell class 2");
	}
}
public class thism {
	public static void main(String args[])
	{
		dellhp d=new dellhp(1,2);	}

}
