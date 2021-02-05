import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 
{
    public static void main(String[] args) throws InterruptedException 
    {
	     System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	     Thread.sleep(2000);
	     List<WebElement> menu=driver.findElements(By.xpath("//div[@class=\"_1kidPb\"]/span"));
	     Actions a=new Actions(driver);
    	 for(WebElement menuName:menu)                     
    	 {
    		String m=menuName.getText();
    		System.err.println(m);
    		a.moveToElement(menuName).build().perform();
    		Thread.sleep(2000);
    		List<WebElement> subMenu=driver.findElements(By.xpath("//span[contains(.,'"+m+"')]/parent::div/descendant::div[@class='_1fwVde']/a"));
    		for(WebElement subMenuName:subMenu)
    			
    		{
    			System.out.println(subMenuName.getText());
    		}
    		Thread.sleep(5000);
    	 }
	     
	}
}
