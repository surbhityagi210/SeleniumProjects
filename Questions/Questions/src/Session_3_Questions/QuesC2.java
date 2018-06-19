package Session_3_Questions;

import java.util.Scanner;

public class QuesC2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String s;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		
		System.out.println("Entered string is:" +s);
		
		//String ss[] = s.split(" ");
		int l = s.length();
		for(int i=0;i<l;i++)
		{
			int c = s.charAt(0);
			if(c>=65 && c<=90)
			{
				System.out.print(s.substring(i,i+1).toLowerCase());
			}
			else if(c>=91 && c<=122)
			{
				System.out.print(s.substring(i,i+1).toUpperCase());
			}
		}
	}

}
