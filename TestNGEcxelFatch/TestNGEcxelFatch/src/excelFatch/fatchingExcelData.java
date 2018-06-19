package excelFatch;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

 
public class fatchingExcelData {
	
	WebDriver dr = new FirefoxDriver();
	
  @Test(dataProvider = "testdata")
  public void DemoProject(String username, String Password) throws InterruptedException {
	  
	  dr.get("https://www.facebook.com/");
	  dr.findElement(By.id("email")).sendKeys("arvyforu1567@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("Iamsingh_1");
		dr.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
  }
  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
