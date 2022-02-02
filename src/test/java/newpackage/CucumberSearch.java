package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberSearch {
  @Test
  public void Cucumber() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("https://www.google.com/ncr");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("q")).sendKeys("Cucumber IO"+Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a")).click();
	  
	  
  }
}
