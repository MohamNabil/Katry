package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestUpload {
	@Test
	public void FileUpload() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		String img_Name = "test.jpeg";
		// String img_path="\\src\\main\\resources\\Images\\test.jpeg";
		String img_path = System.getProperty("user.dir") + "/images/" + img_Name;
		driver.findElement(By.id("file-upload")).sendKeys(img_path);
		driver.findElement(By.id("file-submit")).click();
		String upladed_img = driver.findElement(By.id("uploaded-files")).getText();
		Assert.assertEquals(img_Name, upladed_img);
		driver.quit();
	}
}
