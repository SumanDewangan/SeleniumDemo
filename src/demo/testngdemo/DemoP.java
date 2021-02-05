package demo.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoP 
{
    @Test(dataProvider="demo",dataProviderClass=DemoReadDataP.class)
    public void Tc_01(String user,String pass)
    {
    	Reporter.log(user+" "+pass, true);
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver(); // here we are launching the browser
     	driver.manage().window().maximize();
     	driver.get("https://demo.actitime.com/login.do");
     	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(user);
     	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(pass,Keys.ENTER);
     	WebDriverWait ww= new WebDriverWait(driver, 10);
     	ww.until(ExpectedConditions.titleContains("Enter"));
    }
    
}
