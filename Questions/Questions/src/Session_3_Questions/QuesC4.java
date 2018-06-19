package Session_3_Questions;

import java.util.Scanner;

public class QuesC4 {

	public static void main(String[] args) 
	{
		String s;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		
		System.out.println("Entered String is:" +s);
		
		String ss[]=s.split(" ");
		int c;
		int count=0;
		for(int i=0;i<ss.length;i++)
		{
			c=ss[i].charAt(0);
			if(c>=65 && c<=90)
			{
				count++;
				System.out.print("String in which first letter of each word is capitalized: "+ss[i]+"\n");
				
			}
		}
		System.out.println("Count of word is:"+count);

	}

}
