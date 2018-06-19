package constructorEx;

public class caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp o = new emp();
		
		o.input();
		o.show();
	
		emp o1 = new emp("us");

		emp oo = new emp(o);
		
		
	}

}
