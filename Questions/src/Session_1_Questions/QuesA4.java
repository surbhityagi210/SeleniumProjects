package Session_1_Questions;

import java.util.Scanner;

public class QuesA4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int num;
		int cube;
		
		@SuppressWarnings("resource")
		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter number:");
		num = SC.nextInt();
		/*First way*/
		//cube = num*num*num;
		/*Second way*/
		cube = (int)Math.pow(num, 3);
		
		System.out.println("The cube of"+" "+num+" "+"is:"+cube);
	}

}
