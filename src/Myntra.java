import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
    public static void main(String[] args) 
    {
	      System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.myntra.com/");
	      List<WebElement> menus=driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	    	 for(WebElement menuName:menus)
	    	 {
	    		System.out.println(menuName.getText());
	    	 }
	      
	}
}
