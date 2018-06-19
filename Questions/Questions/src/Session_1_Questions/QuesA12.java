package Session_1_Questions;

import java.util.Scanner;

public class QuesA12 {

	public static void main(String[] args)
	{
		int number;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		number = SC.nextInt();
		
		char c = (char) number;
		System.out.println(c);

	}

}
