package Constructors;

import java.util.Scanner;

public class taxpayer_main {

	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter Employee name");
		char eName[]  = SC.nextLine().toCharArray();
		
		System.out.println("Enter PAN Number:");
		int p1 = SC.nextInt();
		
		System.out.println("Enter Income of Employee:");
		float i1 = SC.nextFloat();

		taxpayer tp = new taxpayer(p1, eName,i1);
		tp.input(p1, eName, i1);
		tp.calctax();
		tp.display();

	}

}
