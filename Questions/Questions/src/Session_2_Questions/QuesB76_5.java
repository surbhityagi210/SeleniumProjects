package Session_2_Questions;

public class QuesB76_5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++)
		{
			System.out.print("(");
			for(int j =1; j<=i; j++)
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
			if(i<5)
				System.out.print(")+");
			else
				System.out.print(")");
				
		}
	}

}
