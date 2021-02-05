import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortThePrice 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("c# book",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_5THWM1']/div[contains(.,'Price -- Low to High')]")).click();
	    Thread.sleep(4000);
	    
	    List<WebElement> ele=driver.findElements(By.xpath("//div[@class='E2-pcE _1q8tSL']/descendant::div[contains(.,'4.6')]"));
	    for(WebElement elements : ele)
	    {
	       System.out.println(elements.getText());
	       elements.click();
	        
	    }
	    
	}
}
