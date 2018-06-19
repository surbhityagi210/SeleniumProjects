package test1;

public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12;
		
		//if condition 
		if(n<11)
		{
			System.out.println("n is less than 11");
		}
		
		//if else 
		if(n<11)
		{
			System.out.println("n is less");
		}
		else
		{
			System.out.println("n is gt 10");
		}
		
		
		
		//if else if 
		int hs,es,cs,total,avg;
		
		hs =66;
		es =44;
		cs =33;
		
		
		//logic 
		total = hs+cs+es;
		avg = total/3;
	
		if(avg>80)
		{
			System.out.println("grade out");
			System.out.println("A");
			System.out.println("dddd ");
		}
		else if(avg>70)
			System.out.println("B");
		else if(avg>60)
			System.out.println("C");
		else
			System.out.println("D");
		
		//nested if 
		int a,b,c;
		a =4;
		b =44;
		c =555;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(b);
			}
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		///or 
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		
		
		
		//switch case 
		int ch=1;
		
		switch (ch) {
		case 1:
			System.out.println("one ");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("no match");
			break;
		}
		
		
	}

}
