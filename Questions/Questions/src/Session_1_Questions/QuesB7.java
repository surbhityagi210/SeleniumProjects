package Session_1_Questions;

import java.util.Scanner;

public class QuesB7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String name;
		int age;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the name of person:");
		name = SC.nextLine();
		
		System.out.println("Enter the age of person:");
		age = SC.nextInt();
		System.out.println("The Person name is:"+name);
		if(age<=18)
			System.out.println("Person is Child");
		else
			System.out.println("Person is Teenager");
	}

}
