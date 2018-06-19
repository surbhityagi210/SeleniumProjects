package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://erp.techvisionit.com/");
		
	WebElement login = 	driver.findElement(By.id("txtUserName"));
	
	//driver.findElement(By.id("txtUserName")).sendKeys("abcdjhfdk");
	login.clear();
	login.sendKeys("monika");
	
	WebElement pwd = 	driver.findElement(By.id("txtPassword"));
	pwd.clear();
	pwd.sendKeys("monika@765");
	
	
	WebElement btn = 	driver.findElement(By.id("btnSubmit"));
	btn.click();
	
	
	String src = driver.getPageSource();
	System.out.println(src);
		
	
	driver.findElement(By.id("aa")).getAttribute("class");
	driver.findElement(By.id("aa")).getAttribute("innerHTML");
	driver.findElement(By.id("aa")).getAttribute("outerHTML");
	
	
	
	
	if(driver.findElement(By.id("abcd")).isDisplayed())
	{
		
	}
	}

}
