package day16;
class saleem implements Runnable{
	public void run() {
		System.out.println("This is the implement class");
	}
	
	
}
public class second {
	public static void main(String args[])
	{
		saleem s=new saleem();
		s.run();
	}

}
