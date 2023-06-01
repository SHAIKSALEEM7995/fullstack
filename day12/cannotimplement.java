package day12;
class thisone{
	int rollno;
	int age;
	static String name="CBIT";
	thisone(int rollno,int age,String name){
		this.rollno=rollno;
		this.age=age;
		
	}
	public void show() {
		System.out.println(rollno+" "+age+ name);
	}
	
	
}

public class cannotimplement {
	public static void main(String args[])
	{
		thisone to=new thisone(23,24,"SRIT");
		thisone t1=new thisone(23,23,"VITS");
		to.show();
		t1.show();
		
		
	}

}
