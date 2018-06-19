package oopsexm;

import java.util.Scanner;

public class employee 
{
	public int empid;
	public String empname;
	public int sal;
	
	Scanner SC = new Scanner(System.in);
	public void emp(int id, String n, int s)
	{
		empid = id;
		empname = n;
		sal = s;
	
	}
	public void display()
	{
		System.out.println("Employee Id:" + empid);;
		System.out.println("Employee Name:" + empname);
		System.out.println("Employee Salary:" + sal);
	}

}
