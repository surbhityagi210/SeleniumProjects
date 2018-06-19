package oopsexm;

import java.util.Scanner;

public class startup {

	public static void main(String[] args) 
	{
		int sid;
		employee emparr[]=new employee[10];
		employee e = new employee();
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);

		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Enter employee id:");
			e.empid = SC.nextInt(); 
			System.out.println("Enter employee name:");
			e.empname = SC.next();
			System.out.println("Enter employee salary:");
			e.sal = SC.nextInt();
			emparr[i] = new employee();
			emparr[i].emp(e.empid, e.empname, e.sal);
		}
		System.out.println("Enter employee id to search record:");
		sid = SC.nextInt();
		for(int j = 0;j<5;j++)
		{
			if(emparr[j].empid == sid)
			emparr[j].display();
			
		}
		

	}

}
