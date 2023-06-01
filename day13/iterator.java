package day13;
import java.util.Iterator;
import java.util.LinkedList;

public class iterator {
	public static void main(String args[])
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		Iterator it=ll.iterator();
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
	}

}
