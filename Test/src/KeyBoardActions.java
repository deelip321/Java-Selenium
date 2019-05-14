import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Mobiles");
		//refresh
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		

	}

}
