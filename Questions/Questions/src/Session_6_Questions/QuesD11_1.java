package Session_6_Questions;

public class QuesD11_1 {

	public int j=0, temp;
	public void rearrangearray(int a[], int n)
	{
		for(int i=0; i<n; i++)
		{
			if(a[i]<0)
			{
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
	}
	public void printarray(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
