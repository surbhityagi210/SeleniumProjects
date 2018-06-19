package WebMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.naukri.com/";
		driver.get(URL);
		/*
		 * try { Thread.sleep(2000); WebDriverWait wait = new WebDriverWait(driver, 60);
		 * WebElement alert =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("geoLocPopUp")));
		 * driver.switchTo().alert(); driver.switchTo().alert().dismiss();
		 * 
		 * } catch(Exception e) {
		 * 
		 * }
		 */

		Set<String> win = driver.getWindowHandles();
		int size = win.size();
		System.out.println(size);
		for (String wins : win) {
			driver.switchTo().window(wins);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.contains("Jobs")) {
				
					WebElement login = driver.findElement(By.id("login_Layer"));
					login.click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
					email.clear();
					email.sendKeys("surbhi.tyagi210@gmail.com");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					WebElement pwd = driver.findElement(By.id("pLogin"));
					pwd.clear();
					pwd.sendKeys("happylife");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					WebElement lgnbtn = driver.findElement(By.xpath("//div[@class='row']/button"));
					lgnbtn.click();

					/*
					 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); WebElement
					 * SkipBtn =
					 * driver.findElement(By.xpath("/html/body/div[2]/div/form[1]/input[4]"));
					 * SkipBtn.click();
					 */
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					WebElement UpdateBtn = driver.findElement(By.linkText("UPDATE PROFILE"));
							//(By.xpath("//div[@class='mb10']/a"));
					UpdateBtn.click();
					System.out.println(driver.getTitle());
					//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Thread.sleep(1500);
					WebElement Mynaukri = driver.findElement(By.xpath("//div[@class='mtxt']"));
					Actions action = new Actions(driver);
					action.moveToElement(Mynaukri).build().perform();
					WebElement LogoutBtn = driver.findElement(By.cssSelector("a[@title='Logout']"));
					LogoutBtn.click();
				}

			if (title.contains("Amazon")) {
				driver.close();
				continue;
			}
			if (title.contains("Hanu")) {
				driver.close();
				continue;
			}
			if (title.contains("Sykes")) {
				driver.close();
				continue;
			}
		}

		// Thread.sleep(4000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.switchTo().alert().accept()

	}

}
