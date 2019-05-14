package arrayeamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		// find all links
		int count = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement link = links.get(i);
			if (!link.getText().equals("")) {
				count = count + 1;
				System.out.println(link.getText());
			}
		}
		System.out.println("Total no of links with text are "+count);
	}
}
