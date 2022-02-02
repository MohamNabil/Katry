package PackageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeClass {
	private String url = "https://www.google.com/ncr";
	private WebDriver driver;
	private By Logo = By.xpath("//img[@alt='Google']");
	// private By outputTxt = By.xpath("//div[@id='result-stats']");
	private By txt = By.name("q");

	public HomeClass(WebDriver driver) {
		this.driver = driver;
	}

	public HomeClass Navigate_url() {
		driver.navigate().to(url);
		return this;
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}

	public boolean Logo_exist() {
		return driver.findElement(Logo).isDisplayed();
	}

	public PackageClass.Results textAssert(String txtfiled) {
		driver.findElement(txt).sendKeys(txtfiled + Keys.ENTER);
		return new PackageClass.Results(driver);
	}

}
