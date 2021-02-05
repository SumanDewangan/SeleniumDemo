package Notify;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RollsRoyce 
{
    public static void main(String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // here we are launching the browser
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/");	
		driver.findElement(By.tagName("epaas-consent-drawer-shell"));
		driver.findElement(By.xpath("")).click();
	}
}
