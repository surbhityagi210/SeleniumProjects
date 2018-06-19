package excelFatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDependencyUsingFaceBook {
  
	WebDriver dr = new FirefoxDriver();
  @Test(priority=1)
  public void OpenBrowser() {

	  try {
		  
		 // WebDriver dr = new FirefoxDriver();
		  
		  dr.manage().window().maximize();
		  dr.manage().deleteAllCookies();
		  dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  dr.get("https://www.facebook.com/");
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }
  


@Test(priority=2, dependsOnMethods= {"OpenBrowser"})
  public void login() {
	
	dr.findElement(By.id("email")).sendKeys("arvyforu1567@yahoo.com");
	dr.findElement(By.id("pass")).sendKeys("Iamsingh_1");
	dr.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	
	  
  }
}
