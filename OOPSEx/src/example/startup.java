package example;

public class startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee emp1 = new employee(); //create object
		employee emp2 = new employee(); //create object
		
		emp1.newEmp(11,"nitin", 2233); //invoke/call to function
		emp2.newEmp(12,"raman", 22233); //invoke/call to function
		
		emp2.disp();//invoke/call to function
		emp1.disp();//invoke/call to function
		
		employee o[] = new employee[10];
		//o[0] , o[1]
		for(int i=0; i<10; i++)
		{
			o[i] = new employee();
			o[i].newEmp(11, "dd", 22);
		}
		 
		for(int i=0; i<10; i++)
		{			
			o[i].disp();
		}
		 
	}

}
