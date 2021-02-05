
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone1 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.bluestone.com/");
    	WebElement ele=driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
    	Actions a=new Actions(driver);
    	a.moveToElement(ele).perform();
    	driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
        driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
        
        Set<String> winsHandle=driver.getWindowHandles();
        for(String win:winsHandle)
        {
        	driver.switchTo().window(win);
        }
    	driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
    	driver.findElement(By.xpath("//li[@data-key='02']/span[@class='size']")).click();
    	driver.findElement(By.xpath("//input[@id='buy-now']")).click();
    	String title=driver.findElement(By.xpath("//a[contains(.,'The Udith Kada For Him')]")).getText();
    	System.out.println(title);
    }
}
