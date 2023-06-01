package day16;
/*class saleem extends Thread{
	public void run() {
		System.out.println("THis is the saleem thread");
	}
}*/

public class threada extends Thread{
	public static void main(String args[])
	{
		/*saleem my=new saleem();
		System.out.println("This is the main thread");
		my.start();*/
		threada threads=new threada();
		threads.start();
		
	
	}
	public void run() {
		System.out.println("this is the main outside");
	}

}
