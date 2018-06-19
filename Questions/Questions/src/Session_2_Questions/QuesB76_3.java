package Session_2_Questions;

public class QuesB76_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i=1; i<=40; i=i+3)
		{
			if(i%2==0)
				System.out.print("-"+i+" ");
			else
				System.out.print(i+" ");
		}
		System.out.println(" ");
		int j=1;
		while(j<=40)
		{
			if(j%2==0)
				System.out.print("-"+j+" ");
			else
				System.out.print(j+" ");
			j=j+3;
		}
	}

}
