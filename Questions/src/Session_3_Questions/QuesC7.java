package Session_3_Questions;

import java.util.Scanner;

public class QuesC7 {

	public static void main(String[] args) 
	{
		String s;
		char c;
		int ci=0;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		System.out.println("Enter character to search:");
		c = SC.next().charAt(0);
		
		System.out.println("Entered String is:" +s);
		for(int i = 0;i<s.length();i++)
		{
			
			if(s.charAt(i)==c)
			{
				++ci;
				
			}
			
		}
		System.out.println(c +" "+"found in the entered string");
		System.out.println("No of Occurences of character "+c+" "+"is"+" "+ci);
	}

}
