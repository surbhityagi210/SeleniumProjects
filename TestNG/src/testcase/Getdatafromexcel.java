package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Getdatafromexcel {
	getdata dd = new getdata();
  @Test(dataProvider = "dp")
  public void f(String TC, String UN, String Pwd) {
	  System.out.print(TC+"\t");
	  System.out.print(UN+"\t");
	  System.out.print(Pwd+"\t");
	  System.out.println();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws Exception {
    
    Object data[][]=getdata.getexceldata("D:\\Testing\\Selenium\\login_excel.xls", "Sheet1");
    return data;
    };

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
