package example;

public class employee {

	//data member or global variable 
 private	int eid;
 private	String name;
 private int sal;
	
	//function or methods 
	public void newEmp(int id, String n, int s)
	{
		eid = id;
		name = n;
		sal =s;
	}
	
	public void disp()
	{
		System.out.println("emp id : "+eid);
		System.out.println("emp name : "+name);
		System.out.println("emp sal : "+sal);
		
	}
}
