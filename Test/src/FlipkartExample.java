import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=Laptops&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		List<WebElement> laptopName = driver.findElements(By.className("_3wU53n"));

		for (WebElement laptop : laptopName) {
			System.out.println(laptop.getText());
		}

	}

}
