package day11;

class encap{
	private int age=20;
	private int marks;
	public int getage()
	{
		return age;
	}
	public void age2() {
		System.out.println(age);
	}
	public int  setage(int newage)
	{
		age=newage;
		return age;
	}
}


public class encapsulate {
	public static void main(String args[])
	{
		
		encap ob=new encap();
		ob.age2();
		System.out.println(ob.getage());
		System.out.println(ob.setage(18));
		
		
	}

}
