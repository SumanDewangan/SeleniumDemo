import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver(); // here we are launching the browser
     	driver.manage().window().maximize();
     	driver.get("https://demo.actitime.com/login.do");
     	WebElement admin=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
     	System.out.println(admin.getText());
     	WebElement manager=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
     	System.out.println(manager.getText());
     	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(admin.getText());
     	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(manager.getText());
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     	/*
     	Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Inc.")).click();
        Set<String> wins= driver.getWindowHandles();
        for(String win:wins)
        {
        	driver.switchTo().window(win);
        }
        System.out.println(driver.getTitle());
        */
	}
}
