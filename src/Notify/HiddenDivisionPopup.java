package Notify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("https://demo.actitime.com/login.do");
    	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
     	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
     	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     	driver.findElement(By.xpath("//div[@class='menuTable']/div[4]/descendant::div[@class='menu_icon']")).click();
     	driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
     	String s=driver.findElement(By.xpath("//span[contains(.,'© 2021 actiTIME Inc. All rights reserved.')]")).getText();
     	System.out.println(s);
   }
}
