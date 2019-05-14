package arrayeamples;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriExample {

	public void closeWindow(WebDriver driver, String titleToclose) {
		Set<String> ids = driver.getWindowHandles();// brings all the ids given by selenium

		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.contains(titleToclose)) {
				driver.close();
				break;
			}
		}
	}

	public void focusWindow(WebDriver driver, String titleToclose) {
		Set<String> ids = driver.getWindowHandles();// brings all the ids given by selenium

		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.contains(titleToclose)) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		NaukriExample obj = new NaukriExample();
		obj.closeWindow(driver, "ABCD");
		

	}

}
