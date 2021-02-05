package Notify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://demoqa.com/alerts");		
	   driver.findElement(By.id("confirmButton")).click();
	   Alert a=driver.switchTo().alert();
	   System.out.println(a.getText());
	   a.dismiss();

   }
}
