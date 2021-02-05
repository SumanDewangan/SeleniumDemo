import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // here we are launching the browser
		driver.manage().window().maximize();
     	driver.get("https://accounts.google.com/signin/v2/identifier?continue");
     	WebElement email=driver.findElement(By.id("identifierId"));
     	email.sendKeys("sumandewangan693@gmail.com");
     	driver.findElement(By.id("identifierNext")).click();

	}
}
