package Session_3_Questions;

import java.util.Scanner;

public class QuesC1 {

	public static void main(String[] args) 
	{
		//String s = "this is java program		\nthis is.";
		String s;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter your String:");
		s = SC.nextLine();
		
		
		System.out.println("My String is:"+s);
		
		int l = s.length();
		int space_count = 0;
		int tabs_count = 0;
		int newline_count = 0;
		/*space_count = s.length()-s.replace(" ", "").length();
		tabs_count = s.length()-s.replace("\t", "").length();
		newline_count = s.length()-s.replace("\n", "").length();*/
		//String ss[] = s.contains("\n");
		
		
		for(int i = 0; i<l;i++)
		{
			int c = s.charAt(i);
			if(c==' ')
			{
				space_count++;
			}
			else if(c=='\t')
			{
				tabs_count++;
			}
			else if(c=='\n')
			{
				newline_count++;
			}
			
		}
		
		System.out.println("Length of the entered string is:" +l);
		System.out.println("Space count in the entered string is:" +space_count);
		System.out.println("Tabs count in the entered string is:" +tabs_count);
		System.out.println("Newline Character count in the entered string is:" +newline_count);

	}

}
