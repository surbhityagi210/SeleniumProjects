package excelExportAndFileIO;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadLoginExcelFile {

	public static int sc, rc, cc;
	public static String un[][] = null;
	public static HSSFWorkbook book = null;
	public static HSSFSheet sheet = null;

	public static Object[][] getexceldata(String FilePath, String SheetName) throws Exception {

		try {
			FileInputStream fs1 = new FileInputStream("C:\\Users\\tyagi.s\\eclipse-workspace\\TestNGDataDriven\\login_excel.xls");
			book = new HSSFWorkbook(fs1);
			sheet = book.getSheet("Sheet1");

			sc = book.getNumberOfSheets();
			rc = sheet.getPhysicalNumberOfRows();
			cc = sheet.getRow(0).getPhysicalNumberOfCells();

			un = new String[rc-1][cc];

			for (int i = 1; i < rc; i++) {
				for (int j = 0; j < cc; j++) {
					HSSFRow row = sheet.getRow(i);

					HSSFCell cell = row.getCell(j);
					un[i-1][j] = cell.getStringCellValue();
				}
			}
			for (int i = 1; i < rc; i++) {
				for (int j = 0; j < cc; j++) {
					System.out.print(un[i-1][j] + "\t");

				}
				System.out.println();
			}
		} catch (Exception e) {

		}
		return un;
}
}