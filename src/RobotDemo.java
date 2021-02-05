import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo 
{
    public static void main(String[] args) throws InterruptedException, AWTException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
      	WebDriver driver=new ChromeDriver(); 
      	driver.manage().window().maximize();
      	driver.get("https://www.google.com/");
      	Thread.sleep(2000);		
      	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("java",Keys.ENTER);
      	Actions a=new Actions(driver);
      	Thread.sleep(4000);
      	WebElement ele=driver.findElement(By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span[contains(.,'Java')]"));
      	
      	a.doubleClick(ele).perform();
      	Robot r=new Robot();
      	r.keyPress(KeyEvent.VK_CONTROL);
      	r.keyPress(KeyEvent.VK_C);
      	r.keyRelease(KeyEvent.VK_C);
      	r.keyRelease(KeyEvent.VK_CONTROL);
      	
      	Thread.sleep(2000);
      	
      	r.keyPress(KeyEvent.VK_CONTROL);
      	r.keyPress(KeyEvent.VK_T);
      	r.keyRelease(KeyEvent.VK_T);
      	r.keyRelease(KeyEvent.VK_CONTROL);
      	
      	Thread.sleep(2000);
      	
      	r.keyPress(KeyEvent.VK_CONTROL);
      	r.keyPress(KeyEvent.VK_V);
      	r.keyRelease(KeyEvent.VK_V);
      	r.keyRelease(KeyEvent.VK_CONTROL);
      	
      	Thread.sleep(2000);
      	
      	r.keyPress(KeyEvent.VK_ENTER);
      	r.keyRelease(KeyEvent.VK_ENTER);
      	
	}
}
