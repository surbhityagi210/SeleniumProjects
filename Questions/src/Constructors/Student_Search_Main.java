package Constructors;

import java.util.Scanner;

public class Student_Search_Main {

	public static void main(String[] args) {
		int number_of_Student;
		int RN = 0;
		String SName[] = new String[20];
		String SAdd[] = new String[30];
		String SCity[] = new String[30];
		String SCountry[] = new String[30];
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter Number of Student:");
		number_of_Student = SC.nextInt();
		
		for(int i=0;i<number_of_Student;i++)
		{
			System.out.println("Enter Student Roll No:");
			RN=SC.nextInt();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Name:");
			 char SN[] = sc.nextLine().toCharArray();
			 SName[i]=String.valueOf(SN);
			
			 Scanner sc3=new Scanner(System.in);
			System.out.println("Enter Student Address:");
			 char SA[] = sc3.nextLine().toCharArray();
			 SAdd[i]=String.valueOf(SA);
			
			 Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Student City:");
			 char SCi[] = sc1.nextLine().toCharArray();
			 SCity[i]=String.valueOf(SCi);
			
			 Scanner sc2=new Scanner(System.in);
			System.out.println("Enter Student Country:");
			 char SCo[] = sc2.nextLine().toCharArray();
			 SCountry[i]=String.valueOf(SCo);
			
			
			
		}
		for(int j=0;j<number_of_Student;j++)
		{
			Student_Search ss=new Student_Search();
			ss.input(RN,SName[j].toCharArray(),SAdd[j].toCharArray(),SCity[j].toCharArray(),SCountry[j].toCharArray());
			ss.Dispdata();
		}
		

	}

}
