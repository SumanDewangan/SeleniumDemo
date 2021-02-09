import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver(); // here we are launching the browser
     	driver.get("https://www.google.com/");
	driver.manage().windows().maximize();
     	Thread.sleep(2000);
     	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
     	search.sendKeys("java",Keys.ENTER);
     	//WebElement search=driver.findElement(By.name("q"));
     	//search.sendKeys("java",Keys.ENTER);
     	//WebElement gsearch =driver.findElement(By.name("btnK"));
     	//gsearch.click();
	}
}
