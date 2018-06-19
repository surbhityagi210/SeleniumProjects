package ArrayInput;

public class ArrayEx {

	public static void main(String[] args)
	{
		int n[] = new int[3];
		
		n[0] =22;
		n[1] =22;
		n[2] =2333;
		
		for(int d: n)
		
			System.out.println(d);
		
		//or 
		int dd[] ={22,3,2};
		for(int d:dd)
			System.out.println(d);

		
		//// two dimenssion array 
		String emp[][]=new String[2][3]; //2 row , 3 col
		emp[0][0] ="11";
		emp[0][1] ="nitin";
		emp[0][2] ="23";
		
		
		emp[1][0] ="12";
		emp[1][1] ="jatin";
		emp[1][2] ="24";
		
		
		/*
		 * 00 01 02
		 * 10 11 12
		 */
		
	/*	
		for(String row[] : emp)
		{
			for(String c: row)
			{
				System.out.print(c+"\t");
			}
		
			System.out.println();
			
		}	
		*/
		for(int i=0; i<emp.length;i++)
		{
			for(int j=0; j<emp[i].length;j++)
			{
				System.out.print(emp[i][j]);
			}
			System.out.println();
		}
		
		///
		int d1[][] ={{1,2,3},{3,4,54},{444,5443,3}}; //3*3
		/*1 2 3
		 * 3 4 54
		 * 444 5443 
		 * 
		 */
		

	}

}
