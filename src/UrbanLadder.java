
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // here we are launching the browser
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//WebElement search=driver.findElement(By.xpath("//input[@class='typeahead tt-input']"));
		//search.sendKeys("sofa",Keys.ENTER);
		//driver.findElement(By.xpath("//img[@title='Weston Half Leather Sofa (Camel Italian Leather)']")).click();
		WebElement sale=driver.findElement(By.xpath("//ul[contains(@class,'featuredLinksBar__contact-links')]"));
		System.out.println(sale.getText());
	}
}
