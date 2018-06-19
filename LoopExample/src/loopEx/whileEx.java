package loopEx;

public class whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//init 
		int i=1;
		
		while(i<5) //condition 
		{
			System.out.println(i);
			i++;// i=i+1
		}
		
		//reverse 
		i=5;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		
		//print table 
		i=2;
		while(i<21)
		{
			System.out.println(i);
			//i=i+2;
			i+=2;
			
		}
	}

}
