package day7;

public class string {
	public static void main(String args[])
	{
		String str="CBIT";
		System.out.println(str);
		String str1="CBIT";
		System.out.println(str1);
		if(str==str1)
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str.equals(str1))
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}

}
