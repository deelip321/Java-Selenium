package arrayeamples;

import java.util.List;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(dropDown);
		// sel.selectByIndex(4);
		// sel.selectByVisibleText("Crafts");
		// sel.selectByValue("625");
		List<WebElement> items = sel.getOptions();
		System.out.println(items.size());
		for (int i = 0; i < items.size(); i++) {
			if(items.get(i).getText().equals(""))
			{
				
			}
		}
		// WebElement defaultElement = sel.getFirstSelectedOption();
		// String text = defaultElement.getText();
		// if (text.equals("All Categories")) {
		// System.out.println("Default value matched");
		// } else {
		// System.out.println("Default value not matched");
		// }
	}
}
