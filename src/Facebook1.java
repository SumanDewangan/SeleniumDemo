import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 
{
     public static void main(String[] args) throws InterruptedException 
     {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
      	WebDriver driver=new ChromeDriver(); // here we are launching the browser
      	driver.get("https://www.facebook.com/");
      	Thread.sleep(2000);
      	WebElement createNewAcc=driver.findElement(By.xpath("//a[contains(.,'Create New Account')]"));
      	if(createNewAcc.isEnabled())
      		createNewAcc.click();
      	Thread.sleep(2000);
      	WebElement female=driver.findElement(By.xpath("//label[contains(.,'Female')]"));
      	if(female.isDisplayed())
      		female.click();
      	Thread.sleep(2000);
      	System.out.println(female.isSelected());
	 }
}
