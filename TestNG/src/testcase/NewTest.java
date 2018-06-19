package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = 0, groups = { "a" })
	public void Browser() {
		System.out.println("Brower Open");
	}

	@Test(priority = 1, groups = { "b" })
	public void screenshot() throws IOException {
		File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrshot, new File("D:\\Testing\\Selenium\\Bstock.jpg"));
		System.out.println("Screenshot done");
	}

	@Test(priority = 2, groups = { "a", "b" }, enabled = true)
	public void Print() throws IOException {
		String value[][] = new String[6][4];
		for (int i = 0; i < 4; i++) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement theader = driver
					.findElement(By.xpath("//*[@id='neweq1']/div[1]/table/tbody/tr[1]/td[" + (i + 1) + "]/strong"));
			value[0][i] = theader.getText();
		}
		for (int j = 1; j <= 5; j++) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement Col1 = driver.findElement(By.xpath("//*[@id='Ind" + j + "']/a"));
			value[j][0] = Col1.getText();
			WebElement Col2 = driver.findElement(By.xpath("//*[@id='IndCurr" + j + "']"));
			value[j][1] = Col2.getText();
			WebElement Col3 = driver.findElement(By.xpath("//*[@id='IndPt" + j + "']"));
			value[j][2] = Col3.getText();
			WebElement Col4 = driver.findElement(By.xpath("//*[@id='IndPer" + j + "']"));
			value[j][3] = Col4.getText();
		}
		FileWriter fwrite = new FileWriter("D:\\Testing\\Selenium\\BSE.txt");
		BufferedWriter bf = new BufferedWriter(fwrite);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(value[i][j]);
				System.out.print("\t\t\t");
				bf.write(value[i][j]);
			}
			System.out.println();
			bf.newLine();
		}
		bf.close();

	}

	@Test(priority = 3, groups = { "a", "c" })
	public void AboutBSE() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement AboutBE = driver.findElement(By.xpath("//*[@id='abt']"));
		/*
		 * Actions act = new Actions(driver); act.moveToElement(AboutBE).perform();
		 * driver.findElement(By.linkText("About BSE")).click();
		 */
		AboutBE.click();
		System.out.println("About BSE Clicked");

	}

	@Test(priority = 4, groups = { "a", "c" })
	public void MarketsSubmenu() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement submenu = driver
				.findElement(By.xpath("//*[@id='dropdown']/table/tbody/tr[2]/td[1]/ul[1]/li[1]/a/b"));
		/*
		 * Actions acts = new Actions(driver); acts.moveToElement(submenu).perform();
		 */

		Thread.sleep(1500);
		submenu.click();
		System.out.println("Introduction clicked");

	}

	@Test(priority = 5, enabled = false)
	public void DragandDrop() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1500);
		WebElement From = driver.findElement(By.xpath("//*[@id='gettabs']/ul/li[2]/a"));
		Thread.sleep(1500);
		WebElement To = driver.findElement(By.xpath("//*[@id='suggestBoxEQ']"));
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		builder.dragAndDrop(From, To).build().perform();
		System.out.println("Drag and Drop done");
	}
	@Test(priority = 4, groups = { "a", "c" })
	public void filewrite() throws IOException
	{
		FileWriter fw = null;
		BufferedWriter bw = null;
		try
		{
		String filew = "D:\\Testing\\Selenium\\test.txt";
		String Content = driver.findElement(By.xpath("//*[@id='wrap']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div")).getText();
		 fw = new FileWriter(filew);
		 bw = new BufferedWriter(fw);
		bw.write(Content);
		System.out.println("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		bw.close();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		String pagetitle = driver.getTitle();
		System.out.println("Page title is:" +pagetitle);
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		String URL = "https://www.bseindia.com/";
		driver.get(URL);

	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}
