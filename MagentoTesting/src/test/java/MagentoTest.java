

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest 
{
	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		Login l = new Login(driver);
		l.typeEmail("pavansaivallabh143@gmail.com");
		l.typePassword("Lakshmi@77");
		l.clickOnLogin();
		Home h = new Home(driver);
		h.ClickOnLogout();
	}

}
