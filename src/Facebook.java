import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignment.Dummy;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver(); // here we are launching the browser
     	driver.get("https://www.facebook.com/");
     	Thread.sleep(2000);
     	WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
     	email.sendKeys("xyz@gmail.com");
     	WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
     	password.sendKeys("suman123");
     	/*
     	WebElement email=driver.findElement(By.id("email"));
     	email.sendKeys("xyz@gmail.com");
     	WebElement password=driver.findElement(By.id("pass"));
     	password.sendKeys("suman123");
     	WebElement login=driver.findElement(By.name("login"));
     	login.click();
     	*/
     	driver.findElement(By.linkText("Forgotten password?")).click();
     	System.out.println(driver.getTitle());
	}
}
