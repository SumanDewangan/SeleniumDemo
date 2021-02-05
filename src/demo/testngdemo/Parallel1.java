package demo.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 
{
     @Test
     public void TC1() throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	 driver.get("https://www.facebook.com/");
    	 Thread.sleep(2000);
    	 driver.close();
     }
     
     @Test
     public void TC2() throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	 driver.get("https://www.gmail.com/");
    	 Thread.sleep(2000);
    	 driver.close();
     }
}
