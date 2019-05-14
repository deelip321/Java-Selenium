import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://abcd:4343@v3.vitechinc.com/index.html");
		
//		WebElement ele1=driver.findElement(By.id("gh-ac"));
//		WebElement ele2=driver.findElement(By.id("gf-norton"));
//		
//		Actions act=new Actions(driver);
//		act.dragAndDrop(ele1, ele2).perform();
		
		
	}

}
