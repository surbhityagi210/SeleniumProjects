package WebMethod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolQA {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.com/automation-practice-form/";
		driver.get(URL);

		String title = driver.getTitle();
		System.out.println("Title is:" + title);
		WebElement PlinkTest = driver.findElement(By.partialLinkText("Partial Link"));
		PlinkTest.click();

		WebElement Linktext = driver.findElement(By.linkText("Link Test"));
		Linktext.click();

		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Firstnametxt = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		Firstnametxt.clear();
		Firstnametxt.sendKeys("Surbhi");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Lastnametxt = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		Lastnametxt.clear();
		Lastnametxt.sendKeys("Tyagi");

		//radio button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement radiobtng = driver.findElement(By.id("sex-0"));
		radiobtng.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement radiobtnexp = driver.findElement(By.id("exp-5"));
		radiobtnexp.click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("12/May/2018");

		//checkbox
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement chkbox = driver.findElement(By.id("profession-1"));
		chkbox.click();
		
		//Upload Button
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement UploadBtn = driver.findElement(By.id("photo"));
		UploadBtn.sendKeys("C:\\Users\\tyagi.s\\Downloads\\dw.png");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement ToolChkbx = driver.findElement(By.id("tool-2"));
		ToolChkbx.click();
		
		//dropdown
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement drpdwn = driver.findElement(By.id("continents"));
		Select dSelect = new Select(drpdwn);
		dSelect.selectByVisibleText("Europe");
		
		//multi-select dropdown
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement multiselect = driver.findElement(By.id("selenium_commands"));
		Select mSelect = new Select(multiselect);
		mSelect.selectByVisibleText("WebElement Commands");
		mSelect.selectByVisibleText("Browser Commands");
		mSelect.deselectByVisibleText("Browser Commands");
		List<WebElement> mcount=mSelect.getOptions();
		System.out.println(mcount.size());
		for(int i=0;i<mcount.size();i++)
		{
			String value = mcount.get(i).getText();
			System.out.println(value);
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		System.out.println(driver.getCurrentUrl());
		
		//handling alert
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String alertURL = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(alertURL);
		WebElement SimpleAlertbtn = driver.findElement(By.xpath("//*[@id='content']/p[4]/button"));
		SimpleAlertbtn.click();
		Alert simplealert = driver.switchTo().alert();
		Thread.sleep(1500);
		String Alerttext = simplealert.getText();
		System.out.println("Simple Alert text is:"+Alerttext);
		simplealert.accept();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ConfirmAlertbtn = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", ConfirmAlertbtn);
		//ConfirmAlertbtn.click();
		Alert ConfirmAlert = driver.switchTo().alert();
		Thread.sleep(1500);
		String ConfirmAlertText = ConfirmAlert.getText();
		System.out.println("Confirm Alert text is:"+ConfirmAlertText);
		ConfirmAlert.accept();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement PromptAlertbtn = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", PromptAlertbtn);
		//PromptAlertbtn.click();
		Alert PromptAlert = driver.switchTo().alert();
		Thread.sleep(1500);
		String PromptAlertText = PromptAlert.getText();
		System.out.println("Prompt Alert text is:"+PromptAlertText);
		PromptAlert.accept();
		
		String WaitURL = "http://toolsqa.com/automation-practice-switch-windows/";
		driver.get(WaitURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement TimeBtn = driver.findElement(By.id("timingAlert"));
		TimeBtn.click();
		
		WebDriverWait await = new WebDriverWait(driver, 10);
		Alert timealert = await.until(ExpectedConditions.alertIsPresent());
		System.out.println(timealert.getText());
		timealert.accept();
		System.out.println("Alert accepted");
		
		String SwitchURL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(SwitchURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		WebElement NewWindowBtn = driver.findElement(By.xpath("//*[@id='button1']"));
		NewWindowBtn.click();
		driver.switchTo().window(handle);
		System.out.println(driver.getTitle());
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.size());
		for(String win:wins)
		{
			driver.switchTo().window(win);
			Thread.sleep(1500);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String titles = driver.getTitle();
			System.out.println(titles);
			driver.close();
			System.out.println("Window closed");
		}
		
		
	}

}
