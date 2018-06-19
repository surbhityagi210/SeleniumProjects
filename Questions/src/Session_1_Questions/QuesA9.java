package Session_1_Questions;

import java.util.Scanner;

public class QuesA9 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int principle, rate, time, SP, TA;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Principle:");
		principle = SC.nextInt();
		
		System.out.println("Enter Rate:");
		rate = SC.nextInt();
		
		System.out.println("Enter Time:");
		time = SC.nextInt();
		
		SP = (principle*rate*time)/100;
		TA = principle+SP;
		System.out.println("Principle is:"+principle);
		System.out.println("Rate of intrest is:"+rate);
		System.out.println("Time is:" +time);
		System.out.println("Simple intrest is:" +SP);
		System.out.println("Total Amount is:" +TA);
		
	}

}
