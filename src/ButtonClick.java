import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/CG-DTE/Documents/ButtonClick.html");
  }
}
