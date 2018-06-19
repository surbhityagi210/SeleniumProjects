package loopEx;

public class nextedLoop {

	public static void main(String[] args) {
		
		/*
		 * 123
		 * 123
		 * 123
		 * 123
		 */
		for(int r=1; r<5;r++)
		{
			//r=1, c = 1 2 3 
			//r=2, c = 1 2 3 
			for(int c=1; c<4;c++)
			{
				System.out.print(c+"\t");
			}
			System.out.print("\n");
		}
	}

}
