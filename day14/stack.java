package day14;
import java.util.Stack;

public class stack {
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		System.out.println(st.empty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		st.push(50);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		
	}

}
