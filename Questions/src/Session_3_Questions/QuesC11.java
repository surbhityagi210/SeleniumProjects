package Session_3_Questions;

import java.util.Scanner;

public class QuesC11 {

	public static void main(String[] args) 
	{
		String s;
		char c;
		int occurance =0;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		System.out.println("Enter a character to count occurance:");
		c = SC.next().charAt(0);
		
		System.out.println("Entered String is:" +s);

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == c)
			{
				occurance++;
			}
		}
		System.out.println("Occurance of"+" " +c+" " +"is:" +occurance);
	}

}
