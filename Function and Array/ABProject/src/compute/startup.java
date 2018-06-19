package compute;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class startup {

	
	public static void main(String[] args) throws IOException {
	
		/*
		FileWriter fw = new FileWriter("pat.../india.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("dshjgs js");
		bw.close();
		fw.close();
		*/
		Scanner sc=new Scanner(System.in);
		
		
		int a,b,c;
		
		a =333;
		System.out.println("enter dat :");
		b =sc.nextInt();
		
		c = a*b;
		
		System.out.println("out :"+c);
			
		
		if(a>b)
		{

			System.out.println("a is greater");
				
		}
		else
		{

			System.out.println("b is greater");
				
		}

	}

}
