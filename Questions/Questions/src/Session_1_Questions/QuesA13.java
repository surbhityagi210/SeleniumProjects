package Session_1_Questions;

import java.util.Scanner;

public class QuesA13 {

	public static void main(String[] args)
	{
		int number, divisor;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter number:");
		number = SC.nextInt();
		
		System.out.println("Enter divisor:");
		divisor = SC.nextInt();
		
		int d = number/divisor;
		int r = number - (d*divisor);
		
		System.out.println("quotient is:" + d);
		System.out.println("remainder is:" + r);

	}

}
