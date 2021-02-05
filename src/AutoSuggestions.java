import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); // here we are launching the browser
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("java");
	   Thread.sleep(2000);
	   List<WebElement> ele=driver.findElements(By.xpath("//span[contains(.,'java')]/parent::div"));
	   for(WebElement elements:ele)
	   {
		   System.out.println(elements.getText());
	   }
	   ele.get(2).click();
   }
}
