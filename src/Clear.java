import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	Thread.sleep(2000);
    	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
    	search.sendKeys("java",Keys.ENTER);	

    	WebElement value=driver.findElement(By.xpath("//input[@title='Search']"));
    	System.out.println(value.getAttribute("value"));
    	value.clear();
    	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("testNG",Keys.ENTER);
    }
}
