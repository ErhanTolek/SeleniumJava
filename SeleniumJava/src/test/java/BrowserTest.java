import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class BrowserTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googlesearch();

	}

	public static void googlesearch() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Kron/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}

}
