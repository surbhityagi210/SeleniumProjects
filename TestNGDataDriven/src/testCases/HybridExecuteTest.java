package testCases;

import org.testng.annotations.Test;

import excelExportAndFileIO.ReadLoginExcelFile;
import operation.ReadObject;
import operation.UIOperation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HybridExecuteTest {
	final static Logger logger = Logger.getLogger(HybridExecuteTest.class);
	ReadObject object = new ReadObject();
	Properties allObjects=null;
	UIOperation operation = new UIOperation();
	WebDriver d=null;
	
  @Test(dataProvider = "dp")
  public void login(String uname, String pass) {
	  logger.info("======================================");
		logger.info("function login is start");
     allObjects  =  object.getObjectRepository();
     operation.perform(allObjects, uname, pass);
     logger.info("function login is executed");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	 
  }


  @DataProvider
  public Object[][] dp() throws Exception {
   Object data[][]=ReadLoginExcelFile.getexceldata("C:\\Users\\tyagi.s\\eclipse-workspace\\TestNGDataDriven\\login_excel.xls", "Sheet1");
   return data;
  }
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
