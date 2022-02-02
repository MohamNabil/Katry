package PackageForShaft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultForShaft {
	private WebDriver driver;

	private static By result_stats = By.id("result-stats");

	public static By Result() {
		return result_stats;
	}

	public ResultForShaft(WebDriver driver) {
		this.driver = driver;
	}
}
