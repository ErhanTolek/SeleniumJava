package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kron/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		GoogleSearchPageObjects gog = new GoogleSearchPageObjects(driver);
		
		gog.setTextInSerachBox("automation");
		Thread.sleep(3000);
		
		gog.clickSearchButton();
		driver.close();
	}

}
