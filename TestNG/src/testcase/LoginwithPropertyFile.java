package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginwithPropertyFile {
	WebDriver driver = new FirefoxDriver();
	Properties prop = null;
	getdata dd = new getdata();
	String m = "Pass";
	String f = "Fail";

	@Test(dataProvider = "dp")
	public void f(String uname, String pass) {
		String txt = "Tech Vision ERP v 1.2";
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement logotxt = driver.findElement(By.xpath(prop.getProperty("logoText")));
		String ntxt = logotxt.getText();
		Assert.assertEquals(txt, ntxt);
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
		
		if (url.equals(prop.getProperty("URL"))) {
			System.out.println("Fail");
			
		}
		else
		{
			if (url.equals("http://erp.techvisionit.com/Dashboard.aspx")) {
				System.out.println("Pass");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement menu = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]"));
				menu.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement logout = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]/div/p[5]/a"));
				logout.click();
				//Assert.assertTrue(logout.isDisplayed());
				WebElement text = driver.findElement(By.xpath("/html/body/form/div[3]"));
				System.out.println(text.getText());
			}
		}
	}

	@Test
	public void f1() {
		String url = driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (url.equals(prop.getProperty("URL"))) {
			System.out.println("Pass");
		}

	}

	@Test
	public void f2() {
		System.out.println("Function f2");
	}

	@Test
	public void f3() {
		System.out.println("Function f3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		try {
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\tyagi.s\\eclipse-workspace\\TestNG\\Object.properties");
			prop = new Properties();
			prop.load(fs); 
			//driver.get(prop.getProperty("URL"));
			 

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@DataProvider
	public Object[][] dp() throws Exception {
		Object data[][] = getdata.getexceldata("D:\\Testing\\Selenium\\login.xls", "Sheet1");
		return data;
	}

}
