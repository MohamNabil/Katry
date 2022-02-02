package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void OpenBrowser() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String currenttitle = driver.getTitle();
		Assert.assertEquals(currenttitle,"Google");
		driver.quit();

	}
}
