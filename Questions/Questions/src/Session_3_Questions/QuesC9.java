package Session_3_Questions;

import java.util.Scanner;

public class QuesC9 {

	public static void main(String[] args)

	{
		String s;
		String c;
		boolean found;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		System.out.println("Enter string to search:");
		c = SC.nextLine();
		
		System.out.println("Entered String is:" +s);
		
		if(found = s.contains(c))
		{
			System.out.println(c+" "+"is found in the entered string:"+found);
		}
		else
		{
			System.out.println(c+" "+"is not found in the entered string.");
		}

	}

}
