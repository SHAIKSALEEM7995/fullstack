package day11;

class parent{
	parent()
	{
		System.out.println("THis is the 0the parameter for parent class");
	}
	parent(int x) 
	{
		System.out.println("THis is the 1 parameter in parent class "+x);
	}
}

class child extends parent
{
	
	 child() {
		
		System.out.println("THis is the 0 the parameter in child class");
	}
 child(int x,int y)
	{
	 super(0);
		System.out.println("This is the 2 the parameter in child class "+x+" "+y);
		
	}
	
}
class grandchild extends child
{
	
	 grandchild()
	{
		System.out.println("This is the 0 the parameter in grandchild class");
	}
	 grandchild(int x,int y,int z)
	{
		super(2,3);
		System.out.println("THis is the 3 the parameter in grand child class "+x+" "+y+" "+z);
	}
	
}

public class conchaining {
	public static void main(String args[])
	{
		grandchild gc=new grandchild(10,20,30);
		
	}

}
