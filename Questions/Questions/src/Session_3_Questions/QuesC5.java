package Session_3_Questions;

import java.util.Scanner;

public class QuesC5 {

	public static void main(String[] args) 
	{
		String s;
		int vowels=0;
		int consonants = 0;
		int digits = 0;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		s = SC.nextLine();
		
		System.out.println("Entered String is:" +s);	
		
		for(int i=0;i<s.length();++i)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				++vowels;
			}
			else if(ch>='a' && ch<='z')
			{
			++consonants;	
			}
			else if(ch>='0' && ch<='9')
			{
				++digits;
			}
		}
		System.out.println("Vowels are:"+vowels);
		System.out.println("Consonants are:"+consonants);
		System.out.println("Digits are:"+digits);

	}

}