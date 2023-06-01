package day13;
import java.util.ArrayList;
public class array {
	public static void main(String args[])
	{
		ArrayList array=new ArrayList();
		array.add(12);
		array.add(12.4);
		array.add("saleem");
		System.out.println(array);
		System.out.println(array.contains("saleem"));
		array.add(3,"malik");
		System.out.println(array);
		array.set(0, "bhanu");
		
		array.add(1,"moulali");
		array.remove("saleem");
		System.out.println(array.indexOf(12.4));
		System.out.println(array);
		array.add(5);
		System.out.println(array);
		array.add(4);
		System.out.println(array);
		array.remove(4);
		System.out.println(array);
		
		System.out.println(array.get(0));
	  array.set(0,"sai" );
	  System.out.println(array);
	  
		
	}
}
