package excelFatch;

import org.testng.annotations.*;

public class NewTest {
  @Test
  public void f() {
	  
	 System.out.println("inside f1");
  }
  
  @Test
  public void f2() {
	
	  System.out.println("inside f2");
  }
  
  @BeforeTest
  public void BeforeAnyTest() {
	  
	  System.out.println("BeforeAnyTest");
  }
  
  @AfterTest
  public void AfterAllTests() {
	  
	  System.out.println("AfterAllTests");
	  
  }
  
  @BeforeMethod
  public void BeforeEveryMethod() {
	  
	  System.out.println("BeforeEveryMethod");
	  
  }

  @AfterMethod
  public void AfterEveryMethod() {
	  
	  System.out.println("AfterEveryMethod");
	  
  }
  
  @BeforeClass
  public void BeforeClass() {
	  
	  System.out.println("BeforeClass");
	  
  }

  @AfterClass
  public void AfterClass() {
	  
	  System.out.println("After class");
	  
  }
  
}
