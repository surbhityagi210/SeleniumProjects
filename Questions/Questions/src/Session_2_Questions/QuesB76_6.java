package Session_2_Questions;

public class QuesB76_6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			System.out.print("(");
			for(int j =1; j<=i; j++)
			{
				int k=j*2;
				if(i==j)
				{
					System.out.print(k);
				}
				else 
				{
					System.out.print(k+"+");
				}
			}
			if(i<5)
				System.out.print(")+");
			else
				System.out.print(")");
				
		}
	}

}
