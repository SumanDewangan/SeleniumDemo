package demo.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
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
	
	@Test
	public void tc_1() throws InterruptedException  {
	
     	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
     	search.sendKeys("java",Keys.ENTER);
		System.out.println("Hiiiii");
		
	}

	@Test
	public void tc_2() throws InterruptedException
	{
     	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
     	search.sendKeys("testng",Keys.ENTER);
     	System.out.println("Hiiiii");
		
	}
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
}
