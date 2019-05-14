import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageValidation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com");

		String actualResult = driver.getTitle();

		String expectedResult = "Google";

		boolean result = actualResult.equals(expectedResult);

		if (result) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
