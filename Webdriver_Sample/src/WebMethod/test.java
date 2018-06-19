package WebMethod;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 6;
		int columns = 4;

		int[][] array = new int[rows][columns];

		/*for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		        array[i][j] = 0;*/

		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(array[i][j]);
		    }
		    System.out.println();
		}
	}

}
