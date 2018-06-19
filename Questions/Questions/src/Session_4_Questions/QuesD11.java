package Session_4_Questions;

public class QuesD11 {

	public static void main(String[] args)
	{
		int A[] = {3, -5, 1, 3, 7, 0, -15, 3, -7, -8};
		int j=0;
		int temp;
		
		for(int i = 0; i<10;i++)
		{
			if(A[i]<0)
			{
				temp = A[i];
				A[i]=A[j];
				A[j]=temp;
				j++;
			}
			
		}
		for(int k=0;k<10;k++)
		{
			System.out.print(A[k]+" ");
		}

	}

}
