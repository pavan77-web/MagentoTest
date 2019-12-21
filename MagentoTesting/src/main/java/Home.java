

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver;

	public Home(WebDriver driver) 
	{
		this.driver = driver;
	}
	By logout =By.xpath("//a[text()='Log Out']");
	public void ClickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
