package WebMethod;



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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FF_DragDrop {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String URL = "http://192.168.1.91/FoodFinder";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement BtnLogin = driver.findElement(By.xpath("//*[@id='ctl01']/header/div[1]/div[5]/a"));
		BtnLogin.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement txtUname = driver.findElement(By.xpath("//*[@id='txtUserName']"));
		txtUname.clear();
		txtUname.sendKeys("raj.tyagidw@gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement txtPwd = driver.findElement(By.xpath("//*[@id='ucLogin1_txtPassword']"));
		txtPwd.clear();
		txtPwd.sendKeys("Newworld@1");
		WebElement login = driver.findElement(By.xpath("//*[@id='ucLogin1_btnLogin']"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='Form1']/header/div[1]/div[3]/ul/li[1]/a")).click();
		
		//Menu and Submenu click//
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement setup=driver.findElement(By.xpath("//a[contains(text(), 'Set Up')]"));
		Actions act = new Actions(driver);
		act.moveToElement(setup).perform();
		driver.findElement(By.linkText("Set Up")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement submenu = driver.findElement(By.xpath("//*[@id='B12']/a"));
		Thread.sleep(1500);
		act.moveToElement(submenu).perform();
		driver.findElement(By.linkText("Food Item")).click();
		
		
		//drag and drop
		Thread.sleep(1500);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement AddNewBtn = driver.findElement(By.xpath("//*[@id='btnAddMore']"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1500);
		AddNewBtn.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement FoodGroup = driver.findElement(By.xpath("//*[@id='ddlFoodGroup']"));
		Select FGSelect = new Select(FoodGroup);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FGSelect.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement descriptiontxt = driver.findElement(By.xpath("//*[@id='txtDescription']"));
		descriptiontxt.clear();
		descriptiontxt.sendKeys("Test Food Item");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement referencedrpdwn = driver.findElement(By.xpath("//*[@id='ddlReferenceNo']"));
		Select refSelect = new Select(referencedrpdwn);
		refSelect.selectByIndex(18);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement SearchBtn = driver.findElement(By.xpath("//*[@id='btnSearch']"));
		SearchBtn.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement From = driver.findElement(By.xpath("//*[@id='collapseResult']/div/div/div/ul/li[7]/div"));
		Thread.sleep(1500);
		WebElement To = driver.findElement(By.xpath("/html/body/form/header/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[6]/div/div/div[1]/div[2]/div[2]"));
		
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.dragAndDrop(From, To).build().perform();
		
	}

}
