package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestFirfox {
	@Test
	public void firefox() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("TestNG" + Keys.ENTER);
		driver.quit();
	}
}
