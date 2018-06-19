package Constructors;

public class Student_Search {
	private int rollno;
	private char name[];
	private char address[];
	private char city[];
	private char country[];

	Student_Search() {

	}
	void input(int r, char n[], char a[],char c[],char cntry[]) {
		rollno=r;
		name =n;
		address=a;
		city=c;
		country=cntry;
	}
	int Retroll()
	{
		return rollno;
	}
	void Dispdata()
	{
		System.out.println("Student Roll No:"+rollno);
		System.out.println("Student Name:"+String.valueOf(name));
		System.out.println("Student Address:"+String.valueOf(address));
		System.out.println("City:"+String.valueOf(city));
		System.out.println("Country:"+String.valueOf(country));
	}
	

}
