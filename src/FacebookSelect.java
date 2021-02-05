import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
      	WebDriver driver=new ChromeDriver(); 
      	driver.manage().window().maximize();
      	driver.get("https://en-gb.facebook.com/");
      	Thread.sleep(2000);	
      	
      	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
      	Thread.sleep(2000);	
      	WebElement day=driver.findElement(By.id("day"));
      	Select s=new Select(day);
      	s.selectByValue("19");
      	WebElement month=driver.findElement(By.id("month"));
      	Select a=new Select(month);
      	a.selectByValue("3");
      	
      	WebElement year=driver.findElement(By.id("year"));
      	Select b=new Select(year);
      	b.selectByValue("1997");
	}
}
