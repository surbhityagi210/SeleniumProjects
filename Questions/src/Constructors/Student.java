package Constructors;

public class Student {

	int rollno;
	String name;
	int s1,s2,s3,s4,s5;
	int total=0;
	int avg;
	
	void input(int r, String n, int sub1, int sub2,int sub3,int sub4, int sub5)
	{
		rollno=r;
		name =n;
		s1=sub1;
		s2=sub2;
		s3=sub3;
		s4=sub4;
		s5=sub5;
	}
	void calculation(int t, int a)
	{
		total = (s1+s2+s3+s4+s5);
		avg = total/5;
	}
	void display()
	{
		System.out.println("Student Roll No:" + rollno);
		System.out.println("Student Name:" + name);
		System.out.println("Student marks are:"+ s1+" "+s2+" "+s3+" "+s4+" "+s5);
		System.out.println("Total marks:"+total);
		System.out.println("Average:"+avg);
	}
}
