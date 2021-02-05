

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//span[contains(.,'iphone')]/parent::div"));
		for(WebElement s:ele)
		{
			System.out.println(s.getText());
		}
		ele.get(1).click();
		
	}
}
