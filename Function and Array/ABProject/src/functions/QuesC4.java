package functions;

public class QuesC4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s = "This is the Java program.";
		String ss[] = s.split(" ");
		int count=0;
		for(int i=0;i<ss.length;i++)
		{
			int c=ss[i].charAt(0);
			if(c>=65 && c<=90)
			{
				count++;
				System.out.println(ss[i]);
			}
		}
		System.out.println(count);
	}

}
