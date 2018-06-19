package excelFatch;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class testNGAttributes {

	final static Logger logger = Logger.getLogger(testNGAttributes.class);
	
	@Test(groups="a")
  public void e() {
	  
		logger.info("======================================");
		
		logger.info("function e is start");
		
	  System.out.println("e");
  
	  try
	  {
		  
		  int n,d,o;
		  n =33;
		  d =0;
		  o = n/d;
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  	logger.error("code is failed.."+e);
	  }
		  logger.info("function  (e) is executed");
		  
	}
  /*
  @Test(enabled=false)
  public void c() {

	  System.out.println("c");
  }
  */
  
  @Test( priority=1,groups="b", dependsOnMethods={"e"})
  public void b() {

	  System.out.println("b");
	  
	  System.out.println("b");
	  
  }
  /*
  @Test(priority=1)
  public void d() {

	  System.out.println("d");
  }
  
  @Test(priority=2)
  public void a() {

	  System.out.println("a");
  }*/
}
