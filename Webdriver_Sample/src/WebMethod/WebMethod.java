package WebMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);
		String Title = driver.getTitle();
		System.out.println("Open page title is:"+Title);
		int length = Title.length();
		System.out.println("Title length is:"+length);
		String correctURL = driver.getCurrentUrl();
		if(correctURL.equals(URL))
		{
			System.out.println("Open URL is correct");
		}
		else
		{
			System.out.println("Opened URL is incorrect.");
			System.out.println("Actual URL:"+correctURL);
			System.out.println("Expected URL:"+URL);
		}
		
		String pageSource = driver.getPageSource();
		int pslength = pageSource.length();
		System.out.println("Page source is:"+pageSource);
		System.out.println("Length of page source is:"+pslength);
		
		driver.findElement(By.xpath(".//*[@class='gb_Q gb_R']/a")).click();
		//driver.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in")).click();
		WebElement btn = driver.findElement(By.linkText("Sign In"));
		btn.click();
		WebElement UName = driver.findElement(By.xpath("//input[@id='identifierId']"));
		UName.sendKeys("arun.kumardataworld@gmail.com");
		WebElement FNextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
		FNextbtn.click();
		WebElement Password = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		Password.sendKeys("dw123456");
		WebElement SNextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
		SNextbtn.click();
		
		//driver.navigate().to("http://wotozo.com/contact_us");
		/*String newTitle = driver.getTitle();
		System.out.println("Current URL Title is:"+newTitle);*/
		
		/*driver.navigate().back();
		Thread.sleep(5);
		driver.navigate().forward();*/
		
		Thread.sleep(5);
		driver.close();

	}

}
