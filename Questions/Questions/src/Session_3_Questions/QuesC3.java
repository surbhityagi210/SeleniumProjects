package Session_3_Questions;

import java.util.Scanner;

public class QuesC3 {

	public static void main(String[] args)
	{
		String s;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		
		System.out.println("String is:"+s);
		
		int l = s.length();
		int space = l - s.replace(" ","").length();
		int characters = l - space;
		int wordcount = 1;
		for(int i = 0;i<l-1;i++)
		{
			int c = s.charAt(i);
			if(c==' ' && c+1!=' ')
			{
			wordcount++;
			}
			
		}
		System.out.println("Total characters in the entered string are:"+characters);
		System.out.println("Total words in the entered string are:"+wordcount);
		
	}

}
