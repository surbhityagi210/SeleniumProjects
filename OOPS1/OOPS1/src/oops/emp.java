package oops;

//class
public class emp {

	//data member or member variable 
	int eid;
	String name;
	
	//function / method 
	//void newEmp()
	void newEmp(int i, String n)	
	{
		eid =i;
		name = n;
	}
	
	void showEmp()
	{
		System.out.println("Employee id : "+eid);
		System.out.println("Employee Name : "+name);
	}
	
	
}
