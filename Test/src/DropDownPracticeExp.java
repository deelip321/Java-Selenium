import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPracticeExp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(ele);
		List<WebElement> items = sel.getOptions();
		System.out.println("Total no of itmes " + items.size());// 40
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getText().equals("Music")) {
				System.out.println("Item found");
				break;
			} else if (i == items.size() - 1) {
				System.out.println("Item not found");
			}

		}

	}

}
