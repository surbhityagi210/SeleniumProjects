package operation;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UIOperation {
	
	WebDriver driver = new FirefoxDriver();

	public void perform(Properties prop, String uname, String pass) {
		String txt = "Tech Vision ERP v 1.2";
		String URL = "http://erp.techvisionit.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement logotxt = driver.findElement(By.xpath(prop.getProperty("logoText")));
		String ntxt = logotxt.getText();
		Assert.assertEquals(txt, ntxt);
		System.out.println(ntxt);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement un = driver.findElement(By.id(prop.getProperty("username")));
		un.clear();
		un.sendKeys(uname);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement pwd = driver.findElement(By.id(prop.getProperty("password")));
		pwd.clear();
		pwd.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement loginbtn = driver.findElement(By.id(prop.getProperty("submit")));
		loginbtn.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		if (url.equals("URL")) {
			System.out.println("Fail");

		} else {
			if (url.equals("http://erp.techvisionit.com/Dashboard.aspx")) {
				System.out.println("Pass");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement menu = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]"));
				menu.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement logout = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]/div/p[5]/a"));
				logout.click();
				// Assert.assertTrue(logout.isDisplayed());
				WebElement text = driver.findElement(By.xpath("/html/body/form/div[3]"));
				System.out.println(text.getText());
			}
		}
	}

}
