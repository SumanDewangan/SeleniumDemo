package org.qsp.testPom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.UL;

public class TestUL 
{
     public static void main(String[] args) throws InterruptedException 
     {
    	 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://www.urbanladder.com/");

    	 UL u1=new UL(driver);
    	 u1.CloseClick();
    	 u1.LivingMouseOver(driver);
    	 u1.FabricSofaSetClick();
    	 u1.view1stProduct();

    	 Set<String> winsHandle=driver.getWindowHandles();
    	 for(String win:winsHandle)
    	 {
    		 driver.switchTo().window(win);
    	 }

    	 u1.orderYourSet();
     }
}
