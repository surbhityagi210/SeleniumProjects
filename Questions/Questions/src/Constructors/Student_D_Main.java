package Constructors;

import java.util.Scanner;

public class Student_D_Main {

	public static void main(String[] args) {

		float M[] = new float[5];
		
		Student_D s = new Student_D();
		Scanner SC = new Scanner(System.in);

		// code to input and display one student record//
		System.out.println("Enter Student Roll No:");
		int r1 = SC.nextInt();

		Scanner SC1 = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		char ename[] = SC1.nextLine().toCharArray();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter marks of Subject" + " " + (i+ 1) + ":");
			M[i] = SC.nextFloat();
		}
		s.input(r1, ename, M);
		s.Calcgrade(M,0);
		s.Dispdata(0);

		// code to input and display more than one student records//
		Scanner sc = new Scanner(System.in);
		int number_of_Student;
		System.out.println("How many student records you want?");
		number_of_Student = sc.nextInt();
		int rN[] = new int[number_of_Student];
		String sN[] = new String[number_of_Student];
		float Ma[] = new float[5];

		
		Ma=new float[5*number_of_Student];
		for (int j = 0; j < number_of_Student; j++) {
			System.out.println("Enter Roll No of Student"+" "+(j+1)+":");
			rN[j] = sc.nextInt();

			Scanner SC2 = new Scanner(System.in);
			System.out.println("Enter Name of Student"+" "+(j+1)+":");
			char SName[] = SC2.nextLine().toCharArray();
			sN[j] = String.valueOf(SName);

			for (int k = 0; k < 5; k++) {
				System.out.println("Enter marks of Subject" + " " + (k + 1) + ":");
				Ma[k+(j*5)] = sc.nextFloat();
			}
		}
		for(int l=0;l<number_of_Student;l++)
		{
			Student_D so=new Student_D();
			so.input(rN[l], sN[l].toCharArray(), Ma);
			so.Calcgrade(Ma,l);
			so.Dispdata(l);
		}
	}

}
