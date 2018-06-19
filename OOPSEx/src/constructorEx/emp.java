package constructorEx;

public class emp {

	int eid;
	String name;
	emp()
	{
		name="guest";
		
		System.out.println("object has be initialzed..");		
	}
	
	emp(String country)
	{
		if(country.equals("india"))
		{
			name="guest user";
			System.out.println("Guest User");	
		}
		else if(country.equals("us"))
		{
			name="new user";
			System.out.println("New User");	
		}
		
				
	}
	
	emp(emp ob)
	{
		System.out.println(ob.name);
		
	}
	public void input()
	{
		eid =100;
		name ="nitin";
	}
	public void show()
	{
		System.out.println("emp id = "+eid);
		System.out.println("emp name = "+name);		
	}
}
