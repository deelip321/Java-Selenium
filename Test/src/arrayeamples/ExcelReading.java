package arrayeamples;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {

	public void srch(WebDriver driver, String srchValue) {
		WebElement ebaysrchBox = driver.findElement(By.id("gh-ac"));

		ebaysrchBox.sendKeys(srchValue);

		WebElement ebaysrchBtn = driver.findElement(By.id("gh-btn"));
		ebaysrchBtn.click();
		driver.quit();
	}

	public static void main(String[] args) throws Exception {

		// read data from excel

		XSSFWorkbook wb = new XSSFWorkbook("");

		// deprecated

		XSSFSheet sh = wb.getSheet("Data");

		int rowCount = sh.getPhysicalNumberOfRows();
		for (int i = 1; i < rowCount; i++) {
			int colCount = sh.getRow(i).getPhysicalNumberOfCells();

			for (int j = 0; j < colCount; j++) {

				String srchValue = sh.getRow(i).getCell(j).getStringCellValue();

				WebDriver driver = new ChromeDriver();
				driver.get("https://ebay.com");

				ExcelReading obj = new ExcelReading();
				obj.srch(driver, srchValue);
			}
		}

	}

}
