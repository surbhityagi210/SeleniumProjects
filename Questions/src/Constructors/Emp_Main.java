package Constructors;

import java.util.Scanner;

public class Emp_Main {

	public static void main(String[] args) 
	{
		//code to enter record of single employee//
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter Employee Code:");
		int code = SC.nextInt();
	
		@SuppressWarnings("resource")
		Scanner SC2 = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		char EName[] = SC2.nextLine().toCharArray();
		
		System.out.println("Enter Basic Salary:");
		float BS = SC.nextFloat();
		
		//Emp emp1 = new Emp(code,EName, BS); --Use it for Constructor with parameter--
		Emp emp1 = new Emp();//default constructor
		emp1.input(code,EName, BS);
		emp1.calc();
		emp1.display();
		System.out.println();
		
		//code to enter record of number of employees//
		String e[]=new String[5];
		int ec[]=new int[5];
		float BSa[]=new float[5];
		int co;
		//float Bs;
		@SuppressWarnings("resource")
		Scanner SC1 = new Scanner(System.in);
		
		for(int i=0;i<e.length;i++)
		{
			
			System.out.println("Enter Employee Code of employee"+" "+(i+1));
			 ec[i]=SC1.nextInt();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Name of employee"+" "+(i+1));
			char En[] = sc.nextLine().toCharArray();
			e[i]=String.valueOf(En);
			System.out.println("Enter Basic Salary of employee"+" "+(i+1));
			 BSa[i]=SC1.nextFloat();
			 
		}
		
		for(int k=0;k<e.length;k++)
		{
			//Emp e2 = new Emp(ec[k],e[k].toCharArray(),BSa[k]);   --Use it for Constructor with parameter--
			Emp e2 = new Emp();
			e2.input(ec[k],e[k].toCharArray(),BSa[k]);
			e2.calc();
			e2.display();
		}
		
		

}

}
