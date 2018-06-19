package Session_6_Questions;

public class QuesD14_1
{
	public int num = 0;
	boolean Prime = true;
	int sum = 0;
	public void primenum(int[] parr)
	{
		for (int j = 0; j < parr.length; j++) {
			for (int k = 2; k < j; k++) {
				if (num % k == 0) {
					Prime = false;
				}
			}
			if (Prime) {
				System.out.println(parr[j]);
				sum = sum + parr[j];
			}
		}
	}
}

