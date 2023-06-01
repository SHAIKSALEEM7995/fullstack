package day15;
import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;
public class map {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "saleem");
		m.put(2,"Malik");
		System.out.println(m);
		
		for(Map.Entry m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
	}

	private static Entry[] entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
