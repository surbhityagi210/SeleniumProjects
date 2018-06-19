package Session_7_Questions;

public class string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		 String test = "this is java program dsfsfsfsfsf";
		 String s = "this is java program sdfsdfsfsfsfsfsfsf";
		 
		 if(test.equals(s))
		 {
			 System.out.println("String match");
		 }
		 else
		 {
			 System.out.println("String not match");
		 }
		if(test.compareTo(s)==0)
		{
			System.out.println("String compared");
		}
		if(test.equalsIgnoreCase(s))
		{
			System.out.println(test);
		}
		String nstr = test.toUpperCase();
		System.out.println(nstr);
		if(test.compareTo(s)>0)
		{
			System.out.println(test);
		}
		if(test.compareTo(s)<0)
		{
			System.out.println(s);
		}
		System.out.println(test.compareTo(s));
		System.out.println(test.charAt(3));
		System.out.println(test.concat("test 12345555"));
		System.out.println(test.contains("this"));
		System.out.println(test.startsWith("t"));
		System.out.println(test.endsWith("sf"));
		String sf1 = String.format("Test is %s", test);
		String sf2 = String.format("Test is %f", 32.365);
		String sf3 = String.format("Test is %32.12f", 32.365);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		byte[] arr = test.getBytes();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		char ch[] = new char[30];
		test.getChars(8, 13, ch, 0);
		System.out.println(ch);
		
		int index1 = test.indexOf("java");
		int index2 = test.indexOf('s');
		int index3 = test.indexOf("program", 0);
		int index4 = test.indexOf('i', 0);
		System.out.println("index of java: "+index1);
		System.out.println("index of character s: "+index2);
		System.out.println("index of string: "+index3);
		System.out.println("index of character t: "+index4);
		System.out.println(String.join("-", "this", "is","Java"));
		
		System.out.println(test.lastIndexOf("this is"));
		System.out.println(test.lastIndexOf("a", 6));
		System.out.println(test.replace("a", "e"));
		System.out.println(test.replaceAll("a", "e"));
		System.out.println(test.replaceAll("\\s", ""));
		
		String testsplit[] = test.split("\\s");
		for(String i:testsplit)
		{
			System.out.println(i);
		}
		StringBuffer sb = new StringBuffer("This is java");
		System.out.println(sb.reverse());
		
		
	}

}
