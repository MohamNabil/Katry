package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TaskClasses.HomeTask;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestTask {
	WebDriver driver;

	@Test
	public void SignUp() {
		new HomeTask(driver).Navigate();
		new HomeTask(driver).fillForm("Ahmed", "mohamed", "010123456789", "P@ssw0rd");
	}

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//@AfterMethod
	//public void afterMethod() {
	//	driver.quit();
	//}
}
