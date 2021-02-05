package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestonePrice 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe")	;
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.bluestone.com/");
	    Thread.sleep(2000); 	
	    
	    driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]")).sendKeys("rings",Keys.ENTER);
	    Actions a=new Actions(driver);
	    WebElement rings=driver.findElement(By.xpath("//span[contains(.,'Price')]/parent::span[@class=\"title style-fill i-right\"]"));
	    a.moveToElement(rings).build().perform();
	    
	    List<WebElement> ele=driver.findElements(By.xpath(""));
		for(WebElement s:ele)
		{
			System.out.println(s.getText());
		}
		ele.get(1).click();
    }
}
