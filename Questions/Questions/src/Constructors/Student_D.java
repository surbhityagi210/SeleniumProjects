package Constructors;

public class Student_D {

	private int rollno;
	private char name[];
	private float marks[];
	private float Total = 0;
	private float Average;
	private String Grade;

	Student_D() {

	}

	void input(int r, char n[], float m[]) {
		rollno = r;
		name = n;
		marks = m;
	}

	void Calcgrade(float Marks[],int ln) {
		for (int i = 0; i < 5; i++) {
			float a = Marks[i+(ln*5)];
			Total = Total + a;
			Average = (Total /5);
		}
		if (Average >= 75) {
			Grade = "A";
		} else if (60 <= Average && Average <= 74) {
			Grade = "B";
		} else if (40 <= Average && Average <= 59) {
			Grade = "C";
		} else if(Average<40) {
			Grade = "Fail";
		}
	}

	void Dispdata(int lm) {
		System.out.println("Student Roll No:" + rollno);
		System.out.println("Student Name:" + String.valueOf(name));
		System.out.println("Student Marks:");
		for (int j = 0; j < 5; j++) {
			System.out.println(marks[j+(lm*5)]);
		}
		System.out.println("Student Total Marks are:" + Total);
		System.out.println("Student Average Marks are:" + Average);
		System.out.println("Grade is" +" "+Grade);

	}
}
