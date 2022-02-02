package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Country {
	@Test
	public void CountryCompany() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// String text1 =
		// driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[1]")).getText();
		By table=By.id("customers");
		WebElement tab= driver.findElement(table);
		List<WebElement> rows = tab.findElements(By.tagName("tr"));
		System.out.println(rows.get(3).getText());
		List<WebElement> Cols = tab.findElements(By.tagName("td"));
		//cell
		System.out.println(Cols.size());
		
				
		//for (WebElement row : rows) {
			//List<WebElement> cols = row.findElements(By.tagName("td"));
			//for (WebElement col : cols) {

			//}
		//}
	}
}
