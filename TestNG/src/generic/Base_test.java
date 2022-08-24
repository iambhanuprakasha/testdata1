package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test {
	WebDriver driver;
@BeforeMethod
public void open_App()
{
	System.setProperty("", "");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("");
}

@AfterMethod
public void close_App()
{
driver.quit();	
}
}