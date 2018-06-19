package functions;

public class funEx {

	public static void main(String[] args) {

		String s="this is JAVA program";		
		System.out.println(s);
		
		int l = s.length();
		System.out.println(l);
		
		String ns;
		ns = s.toUpperCase();
		System.out.println(ns);
		
		ns = s.toLowerCase();
		System.out.println(ns);
		
		ns = s.replace("i", "xy");
		System.out.println(ns);
		
		
		ns = s.substring(2, 10);		
		System.out.println(ns);
		
		int ps = s.indexOf("h");
		System.out.println(ps);
		
		
		char c= s.charAt(6);
		System.out.println(c);
		
		
		
		////conditional 
		if(s.equals("this"))
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
		
		///
		if(s.equalsIgnoreCase("this"))
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
		
		///
		if(s.contains("this"))
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
		//
		if(s.startsWith("this"))
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
						
		
		

	}

}
