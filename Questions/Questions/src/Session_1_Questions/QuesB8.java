package Session_1_Questions;

import java.util.Scanner;

public class QuesB8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int salary;
		int HRA;
		int DA;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter Salary:");
		salary = SC.nextInt();
		
		if(salary>=5000 && salary<=10000)
		{
			HRA = (salary/100)*10;
			DA = (salary/100)*5;
			System.out.println("HRA is:"+HRA);
			System.out.println("DA is:"+DA);
		}
		else if(salary>=10001 && salary<=15000)
		{
			HRA = (salary/100)*15;
			DA = (salary/100)*8;
			System.out.println("HRA is:"+HRA);
			System.out.println("DA is:"+DA);
		}
		else if(salary<5000)
		{
			System.out.println("Salary is less than 5000.");
		}
		else if(salary>15000)
		{
			System.out.println("Salary is greater than 15000.");
		}
		
	}

}
