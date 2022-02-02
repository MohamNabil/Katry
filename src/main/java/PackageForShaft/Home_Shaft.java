package PackageForShaft;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class Home_Shaft {
	// variables
	private WebDriver driver;
	private String url = System.getProperty("GoogleURL");

	private static By imgLogo = By.xpath("//img[@alt='Google']");

	public static By Image() {
		return imgLogo;
	}

	private static By search_textbox = By.name("q");

	public static By textBox() {
		return search_textbox;
	}

	// const
	public Home_Shaft(WebDriver driver) {
		this.driver = driver;
	}

	public Home_Shaft navigateto() {
		BrowserActions.navigateToURL(driver, url);
		return this;
	}

	public ResultForShaft searchfortxt(String query) {
		new ElementActions(driver).type(textBox(), query).keyPress(textBox(), Keys.ENTER);
		return new ResultForShaft(driver);
	}
}
