package day9;

public class constructor {
    private String name;
    private int age;
    private int id;
     public constructor(String studentname,int studentage,int studentid)
     {
    	 name=studentname;
    	 age=studentage;
    	 id=studentid;
    	 
    	
     }
     void display()
     {
    	 System.out.println(name+age+id);
     }
    
     
     
     
     
     public static void main(String args[])
     {
    	 constructor con=new constructor("Saleem",21,22);
    
    	 //System.out.println("Name:"+con.name);
    	 //System.out.println("Age:"+con.age);
    	 //System.out.println("Id:"+con.id);
    	 con.display();
     }

}
