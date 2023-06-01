package day16;

public class same extends Thread 
{
 public static void main(String args[])
 {
	 same ss=new same();
	 ss.start();
	 
}
 public void run()
 {
	 System.out.println("This is the same class");
 }

}
