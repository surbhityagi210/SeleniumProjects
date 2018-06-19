package Session_1_Questions;

import java.util.Scanner;

public class QuesA10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int days, years, weeks;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter the days: ");
		days = SC.nextInt();
	//to calculate year	
		years = days/365;
	//to calculate week
		days = days%365;
		weeks = days/7;
	//to calculate days	
		days = days%7;
		System.out.println("Days:"+days);
		System.out.println("Years:"+years);
		System.out.println("Weeks:"+weeks);
	}

}
