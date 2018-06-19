package WebMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.gmail.com/";
		driver.get(URL);
		/*String Title = driver.getTitle();
		System.out.println("Open page title is:" + Title);
		int length = Title.length();
		System.out.println("Title length is:" + length);

		driver.findElement(By.xpath(".//*[@class='gb_Q gb_R']/a")).click();
		WebElement btn = driver.findElement(By.linkText("Sign In"));
		btn.click();*/
		WebElement UName = driver.findElement(By.xpath("//input[@id='identifierId']"));
		UName.sendKeys("arun.kumardataworld@gmail.com");
		Thread.sleep(1500);
		UName.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
		Thread.sleep(1500);
		Password.sendKeys("dw@123456");
		Thread.sleep(1500);
		Password.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement Compose = driver.findElement(By.xpath(".//*[@class='T-I J-J5-Ji T-I-KE L3']"));
		Compose.click();
		Thread.sleep(8000);
		WebElement SBtn = driver.findElement(By.xpath("//span[@class='gb_db gbii']"));
		Thread.sleep(1500);
		SBtn.click();
		Thread.sleep(1500);
		WebElement SignoutBtn = driver.findElement(By.xpath("//*[@id = 'gb_71']"));
		SignoutBtn.click();
		Thread.sleep(1500);
		driver.close();
		
		
		
		
	
		//gb_jb gb_9c gb_Mg gb_R gb_g
		
	}

}
