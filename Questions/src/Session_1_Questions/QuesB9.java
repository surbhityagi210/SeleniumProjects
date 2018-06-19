package Session_1_Questions;

import java.util.Scanner;

public class QuesB9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int hindi, eng, maths, science, art;
		double total_score, gained_score;
		float percentage;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner (System.in);
		
		System.out.println("Enter marks of Hindi, English, Maths, Science and Art:");
		hindi = SC.nextInt();
		eng = SC.nextInt();
		maths = SC.nextInt();
		science = SC.nextInt();
		art = SC.nextInt();
		
		System.out.println("Enter Total score:");
		total_score = SC.nextDouble();
		
		gained_score = (hindi+eng+maths+science+art);
		percentage = (float) ((gained_score/total_score)*100);
		
		System.out.println("Percentage is:" +percentage);
		
		if((int)percentage>=60)
		{
			System.out.println("Division is : First");
		}
		else if((int)percentage>=50 && percentage<=59)
		{
			System.out.println("Division is : Second");
		}
		else if((int)percentage>=40 && percentage<=49)
		{
			System.out.println("Division is : Third");
		}
		else if((int)percentage<40)
		{
			System.out.println("Fail");
		}
	}

}
