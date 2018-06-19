package oops;

public class startup {

	public static void main(String[] args) {

		//new : is keyword to allocate the memory of emp class 
		emp o1 = new emp(); //o is object , emp() : invoke to constructor  
		emp o2 = new emp(); //o is object , emp() : invoke to constructor
		emp o3 = new emp(); //o is object , emp() : invoke to constructor
		
		o1.newEmp(1,"raman");	 //call/invoke to function
		o2.newEmp(11,"jatin");	 //call/invoke to function
		o3.newEmp(3,"rahul");	 //call/invoke to function
		
		o3.showEmp(); //call/invoke to function
		o1.showEmp(); //call/invoke to function
		o2.showEmp(); //call/invoke to function
		
		
		
		

	}

}

