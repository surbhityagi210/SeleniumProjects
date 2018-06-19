package Session_1_Questions;

import java.util.Scanner;

public class QuesB11 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int salary;
		double tax;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter monthly salary:");
		salary = SC.nextInt();
		
		if(salary<=0)
		{
			System.out.println("Salary can't be less than zero");
		}
		else if(salary<7500)
		{
			tax = (salary*0.2);
			System.out.println("Tax for entered monthly salary is: "+tax);
		}
		else if(salary>=7500 && salary<=8999)
		{
			tax = (salary*(0.3));
			System.out.println("Tax for entered monthly salary is: "+tax);
		}
		else if(salary>=9000)
		{
			tax =  (salary*(0.4));
			System.out.println("Tax for entered monthly salary is: "+tax);
		}
	}

}
