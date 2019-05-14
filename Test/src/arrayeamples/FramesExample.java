package arrayeamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");

		// switch the focus to the frame

		WebElement frm=driver.findElement(By.className("result"));
		driver.switchTo().frame(frm);

		WebElement clickMe = driver.findElement(By.xpath(".//*[@value='Click me']"));
		clickMe.click();
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
