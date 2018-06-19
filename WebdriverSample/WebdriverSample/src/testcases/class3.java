package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
		//driver.findElement(By.id("country")).sendKeys("India");;
		
		Select sc = (Select)	driver.findElement(By.id("country"));
		
		
		//sc.selectByIndex(1);
		sc.selectByVisibleText("India");
		sc.selectByVisibleText("US");
		//sc.selectByValue(arg0);
		
		
		
	}

}
