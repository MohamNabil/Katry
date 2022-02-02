package PackageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results {

	private WebDriver driver;
	By outPut_txt = By.id("result-stats");

	public Results(WebDriver driver) {
		this.driver = driver;
	}

	public String inputTxt() {
		return driver.findElement(outPut_txt).getText();
	}

}
