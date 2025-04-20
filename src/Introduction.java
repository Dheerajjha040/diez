
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Introduction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://test.salesforce.com");
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(title);

		System.out.println(currentUrl);
		driver.close();

	}

}
