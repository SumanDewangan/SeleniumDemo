package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Coin50gm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000); 

		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a=new Actions(driver);

		for(WebElement menuName:menus)
		{
			if(menuName.getText().equals("COINS"))
			{
				WebElement coins=driver.findElement(By.xpath("//nav/ul[1]/li[8]"));
				Thread.sleep(2000); 
				a.moveToElement(coins).perform();
				driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']")).click();
				WebElement gCoin=driver.findElement(By.xpath("//h1[contains(.,'50 gram 24 KT Gold Coin')]"));
				if(gCoin.isDisplayed())
				{
					System.out.println(gCoin.getText());
				}
				break;
			}
		}
	}
}	
