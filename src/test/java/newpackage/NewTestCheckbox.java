package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTestCheckbox {
	@Test
	public void Checkbox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		element1.click();
		Assert.assertTrue(element1.isSelected());
		Assert.assertTrue(element2.isSelected());
		driver.quit();
		
	}
}
