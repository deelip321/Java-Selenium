package arrayeamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSExample {
	
	public static void main(String[] args) throws Exception {
		
		
		double d=10.45;
		int i=(int)d;
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Laptops");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Admin\\Desktop\\chromescreen.png"));

		
		
		
		
		
		
		
		
	}

}
