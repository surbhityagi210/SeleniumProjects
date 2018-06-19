package Session_3_Questions;

import java.util.Scanner;

public class QuesC8 {

	public static void main(String[] args)
	{
		String s;
		String c;
		int in = 0;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		System.out.println("Enter string to search:");
		c = SC.nextLine();
		
		System.out.println("Entered String is:" +s);
		
		if(s.contains(c)==true)
		{
			in=s.indexOf(c);
			System.out.println("Position of entered string is:"+" "+in);
		}
		else
		{
			System.out.println("Searched string is not found in the given string:" + "0");
		}
		
	}

}
