package Constructors;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student S = new Student();
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter Student Roll no:");
		S.rollno = SC.nextInt();
		
		System.out.println("Enter Student Name:");
		S.name = SC.next();
		
		System.out.println("Enter Student marks of Subject 1:");
		S.s1 = SC.nextInt();
		
		System.out.println("Enter Student marks of Subject 2:");
		S.s2 = SC.nextInt();
		
		System.out.println("Enter Student marks of Subject 3:");
		S.s3 = SC.nextInt();
		
		System.out.println("Enter Student marks of Subject 4:");
		S.s4 = SC.nextInt();
		
		System.out.println("Enter Student marks of Subject 5:");
		S.s5 = SC.nextInt();
		
		S.input(S.rollno, S.name, S.s1, S.s2, S.s3, S.s4, S.s5);
		S.calculation(S.total, S.avg);
		S.display();
		

	}

}
