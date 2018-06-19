package Session_1_Questions;

import java.util.Scanner;

public class QuesA15 {

	public static void main(String[] args) 
	{
		int number1;
		int number2;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter number:");
		number1 = SC.nextInt();
		
		System.out.println("Enter other number:");
		number2 = SC.nextInt();
		
		if(number1>=number2 || number2<=number1)
		{
			System.out.println("Greatest number is:" +number1);
		}
		else 
		{
			System.out.println("Greatest number is:" +number2);
		}

		
	}

}
