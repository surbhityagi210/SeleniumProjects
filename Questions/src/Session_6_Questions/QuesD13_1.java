package Session_6_Questions;


public class QuesD13_1 
{
	public int arr[];
	public int n;
	int r=0;
	int q=0;
	public int total = 0;
	public void getarr(int a)
	{
		n =a;
	}
	public void display()
	{
		System.out.println(n);
	}
	public void getpalindromes(int number[])
	{
		for(int i=0;i<number.length;i++)
		{
			int random = number[i];
			while(random>0)
			{
				r = random%10;
				random = random/10;
				q = q*10+r;
			}
			if(number[i] == q)
			{
				System.out.println(q);
				total = total+q;
			}
			q=0;
			
		}
		
		System.out.println("Sum of palindrome numbers is:" + total);
		
	}
	
}
