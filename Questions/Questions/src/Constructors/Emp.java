package Constructors;

public class Emp {
	private int ecode;
	private char ename[];
	private float basicsalary;
	private float HRA;
	private float DA;
	private float TA;
	private float GrossSalary;
	private float IT;
	private float PF;
	private float NetSalary;
	
	/*Emp(int ec, char EN[], float bs) ---Constructor with parameters--
	{
		ecode = ec;
		ename = EN;
		basicsalary = bs;
	}*/
	Emp()
	{
		
	}
	void input(int code, char name[], float bs)
	{
		ecode = code;
		ename =name;
		basicsalary = bs;
	}
	void calc()
	{
		HRA = (float) (0.4*basicsalary);
		DA = (float) (0.2*basicsalary);
		TA = (float) (0.1*basicsalary);
		GrossSalary = basicsalary+HRA+DA+TA;
		IT = (float) (0.2*GrossSalary);
		PF = (float) (0.1*GrossSalary);
		NetSalary = GrossSalary - (IT+PF);
		
	}
	void display()
	{
		System.out.println("Employee Code:"+ecode);
		System.out.println("Employee Name:"+String.valueOf(ename));
		System.out.println("Employee Salary Structure:");
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Gross Salary:"+GrossSalary);
		System.out.println("IT:"+IT);
		System.out.println("PF:"+PF);
		System.out.println("Net Salary:"+NetSalary);
		System.out.println();
		
	}

}
