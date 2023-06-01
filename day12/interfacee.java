package day12;

interface myname{
	public void showme();
	public void fearof();
}
class animal implements myname{
	public void showme() {
		System.out.println("This is the me");
	}
	public void fearof()
	{
		System.out.println("Dont fear of java");
	}
}

public class interfacee {
	public static void main(String args[])
	{
		animal an=new animal();
		an.showme();
		an.fearof();
	}

}
