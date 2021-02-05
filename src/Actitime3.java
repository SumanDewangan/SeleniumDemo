import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime3 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	   driver.findElement(By.xpath("//div[contains(.,'Login ')]/parent::a[@id='loginButton']")).click();
	   WebDriverWait ww=new  WebDriverWait(driver,10);
  	   //ww.until(ExpectedConditions.titleContains("Enter"));
	   WebElement logOut=driver.findElement(By.xpath("//a[@id='logoutLink']"));
	   ww.until(ExpectedConditions.elementToBeClickable(logOut));
	   logOut.click();
   }
}
