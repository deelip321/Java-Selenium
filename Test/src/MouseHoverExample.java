import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement myebaylink = driver.findElement(By.linkText("My eBay"));

		Actions act = new Actions(driver);
		act.moveToElement(myebaylink).perform();

		Thread.sleep(2000);
		WebElement messageslink = driver.findElement(By.xpath(".//*[@role='navigation']/li[9]"));
		
		act.click(messageslink).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
