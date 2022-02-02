package TaskClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTask {
	private WebDriver driver;
	private String url="https://www.facebook.com/r.php?next=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fdevelopment%2Fregister&amp%3Blocale=en_GB&amp%3Bdisplay=page";
	private By Fname=By.name("firstname");
	private By Lname=By.name("lastname");
	private By Mobile=By.name("reg_email__");
	private By Pass=By.xpath("//input[@type='password']");
	private By Female=By.xpath("//input[@type='radio'][1]");
	
	public HomeTask(WebDriver driver) {
		this.driver = driver;
	}
	public HomeTask Navigate()
	{
		driver.navigate().to(url);
		return this;
	}
	
	public HomeTask fillForm(String firstName ,String lastName,String mobileNum, String password)
	{
		driver.findElement(Fname).sendKeys(firstName);
		driver.findElement(Lname).sendKeys(lastName);
		driver.findElement(Mobile).sendKeys(mobileNum);
		driver.findElement(Pass).sendKeys(password);
		driver.findElement(Female).click();
		
		return this;
	}
	
}
