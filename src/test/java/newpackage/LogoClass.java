package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PackageClass.HomeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoClass {
	WebDriver driver;

	@Test
	public void navigateToChromeAndAssertLogo() {
		Assert.assertTrue(new HomeClass(driver).Navigate_url().Logo_exist());
	}

	@Test
	public void navigateToAssertTitle() {
		var currentTitle = new HomeClass(driver).Navigate_url().getCurrentTitle();
		Assert.assertEquals(currentTitle, "Google");
	}

	@Test
	public void navigateToChromeAndAssertText() {
		var assertTxt = new HomeClass(driver).Navigate_url().textAssert("testng").inputTxt();
		Assert.assertNotEquals(assertTxt, "");

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

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
