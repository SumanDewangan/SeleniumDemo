import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickNext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // here we are launching the browser
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("java",Keys.ENTER);
        
        List<WebElement> elements=driver.findElements(By.xpath("//tr[@jsname='TeSSVd']/td"));
       Actions a=new Actions(driver);
        for(WebElement ele:elements)
        {
        	driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
        	a.moveToElement(ele);
        	 WebElement page=driver.findElement(By.xpath("//a[@aria-label='Page 13']"));
        	if(page.isEnabled())
        		break;
        }
	}
}
// WebElement page=driver.findElement(By.xpath("//a[@aria-label='Page 13']"));