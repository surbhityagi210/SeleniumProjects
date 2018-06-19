package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startup {

	public static void main(String[] arg)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
				
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		List<WebElement> els = 	driver.findElements(By.tagName("a"));
	
		
		System.out.println("count of hyperlink is : "+els.size());
		
		for(WebElement el : els)
		{
			//System.out.println(el.getText());
			String txt = el.getText();
			if(txt.contains("Feedback"))
			{
				el.click();
			}
		}
		
		//driver.quit();
		
	}
}
