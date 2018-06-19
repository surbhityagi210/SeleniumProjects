package WebMethod;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class BseIndia {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test() {
		System.out.println("Perform action");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.bseindia.com/";
		driver.get(URL);
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
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(value[i][j]);
					System.out.print("\t\t\t");
				}
				System.out.println();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement btn = driver.findElement(By.xpath("//*[@id='wrap']/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/a"));
			btn.click();
		}
		

	}
	
