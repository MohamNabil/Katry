package ForusingShaft;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import PackageForShaft.Home_Shaft;
import PackageForShaft.ResultForShaft;
import io.qameta.allure.Description;

public class UsingShaft {
	WebDriver driver;
	private JSONFileManager testData=new JSONFileManager("src/test/resources/testDataFiles/data.json");

	@Description("Given go to google , then i will assert Logo")
	@Test(description = "assert Logo")
	public void asserLogo() {
		new Home_Shaft(driver).navigateto();
		Validations.assertThat().element(driver, Home_Shaft.Image()).matchesReferenceImage().perform();
	}

	
	
	@Description("Given go to google , then i will search for text and assert it contain data")
	@Test(description = "assert text isn't empty")
	public void searchText() {
		new Home_Shaft(driver).navigateto().searchfortxt(testData.getTestData("test1"));

		Validations.assertThat().element(driver, ResultForShaft.Result()).text().doesNotEqual(" ")
				.withCustomReportMessage("contain data").perform();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = DriverFactory.getDriver();
	}

	@AfterMethod
	public void afterMethod() {
		BrowserActions.closeCurrentWindow(driver);
	}
}
