package day12;

interface A{
	public void malik();
}
interface B{
	public void saleem();
}
interface C{
	public void moulali();
}
class demo implements A,B,C{
	public void malik() {
		System.out.println("THis is malik");
	}
	public void saleem() {
		System.out.println("THis is best");
	}
	public void moulali() {
		System.out.println("This is moulali");
	}
}
public class multipleinterface {
	public static void main(String args[])
	{
		demo d=new demo();
		d.malik();
		d.saleem();
		d.moulali();
	}

}
