package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	SDummy("https://www.google.com/");
    	
	}
    
    public static void SDummy(String name) throws InterruptedException
    {
    	WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	driver.manage().window().maximize();
    	driver.get(name);
    	Thread.sleep(2000);
    	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
    	search.sendKeys("java",Keys.ENTER);	
    }
    
}
