package demo.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoParent 
{
	WebDriver driver;
	
	@BeforeMethod
	public void beforeM() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	driver=new ChromeDriver(); // here we are launching the browser
     	driver.manage().window().maximize();
     	driver.get("https://www.google.com/");
     	Thread.sleep(2000);
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
}
