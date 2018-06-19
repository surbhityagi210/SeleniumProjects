package Session_1_Questions;

import java.util.Scanner;

public class QuesA3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num;
		int square;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter number:");
		num = SC.nextInt();
		/*First way*/
		//square = (num*num);
		/*Second way*/
		square = (int) Math.pow(num, 2);
		System.out.println("The square of"+" "+num +" "+"is:"+square);
		
	}

}
