package WebMethod;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelInteraction {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		try {

			FileInputStream FS = new FileInputStream("D:\\Testing\\Selenium\\login_excel.xls");
			HSSFWorkbook book = new HSSFWorkbook(FS);

			HSSFSheet sheet = book.getSheet("Sheet1");

			int sc, rc, cc;
			sc = book.getNumberOfSheets();
			rc = sheet.getPhysicalNumberOfRows();
			cc = sheet.getRow(0).getPhysicalNumberOfCells();

			System.out.println("Sheet count in excel is:" + sc);
			System.out.println("Row count in excel is:" + rc);
			System.out.println("Column count is:" + cc);

			String tid[] = new String[rc];
			String Uname[] = new String[rc];
			String Pwd[] = new String[rc];

			for (int i = 0; i < rc; i++) {
				HSSFRow row = sheet.getRow(i);

				HSSFCell cell = row.getCell(0);
				tid[i] = cell.getStringCellValue();

				cell = row.getCell(1);
				Uname[i] = cell.getStringCellValue();

				cell = row.getCell(2);
				Pwd[i] = cell.getStringCellValue();

				System.out.println(tid[i] + "\t" + Uname[i] + "\t" + Pwd[i]);
			}
			
			/*String URL = "http://erp.techvisionit.com/";
			driver.get(URL);*/
			for (int i = 1; i < tid.length; i++) {
				String URL = "http://erp.techvisionit.com/";
				driver.get(URL);
				WebElement txtU = driver.findElement(By.id("txtUserName"));
				txtU.clear();
				txtU.sendKeys(Uname[i]);
				WebElement txtP = driver.findElement(By.id("txtPassword"));
				txtP.clear();
				txtP.sendKeys(Pwd[i]);
				WebElement LBtn = driver.findElement(By.id("btnSubmit"));
				LBtn.click();

				String url = driver.getCurrentUrl();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				if (url.equals(URL)) {
					System.out.println("Fail");
					continue;
				} else {
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					/*WebElement text = driver.findElement(By.id("ctl00_cpbody_lblnewenquirytoday"));
					String Avalue = text.getText();
					//System.out.println(Avalue);
					String Evalue = "6";*/

					if (url.equals("http://erp.techvisionit.com/Dashboard.aspx")) {
						System.out.println("Pass");
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						WebElement menu = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]"));
						menu.click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						WebElement logout = driver.findElement(By.xpath("//*[@id='aspnetForm']/div[3]/div/ul[2]/li[3]/div/p[5]/a"));
						logout.click();
						WebElement text = driver.findElement(By.xpath("/html/body/form/div[3]"));
						System.out.println(text.getText());
					}
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					continue;
					
				}
			}
	
		} catch (Exception e) {
			driver.close();
		}

	}
}