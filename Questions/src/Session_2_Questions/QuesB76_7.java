package Session_2_Questions;

public class QuesB76_7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i+=2)
		{
			System.out.print("(");
			for(int j=1; j<=i; j+=2)
			{
				if(i==j) 
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(j+"+");
					
				}
			}
			if(i<9)
				System.out.print(")+");
			else
				System.out.print(")");
				
		}
	}

}
