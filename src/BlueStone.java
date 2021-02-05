import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone 
{
    public static void main(String[] args) throws InterruptedException 
    {
	     System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
         driver.get("https://www.bluestone.com/");
         
         WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
         search.sendKeys("diamond ring",Keys.ENTER);
         
	     driver.findElement(By.xpath("//a[@id=\'pid_28402\']/parent::div")).click();
	     
	     Set<String> winshandle=driver.getWindowHandles();
	     for(String win : winshandle)
	     {
	    	 driver.switchTo().window(win);
	     }
	     driver.findElement(By.xpath("//input[@id=\"buy-now\"]")).click();
         WebElement text=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
	     System.out.println(text.getText());
	}
}
