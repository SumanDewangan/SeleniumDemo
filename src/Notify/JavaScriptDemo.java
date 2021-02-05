package Notify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptDemo 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver(); 
     	driver.manage().window().maximize();
     	driver.get("https://demo.actitime.com/login.do");
     	Thread.sleep(2000);
     	
     	WebDriverWait ww= new WebDriverWait(driver,10);
     	ww.until(new ExpectedCondition<Boolean>() {
     		@Override
     		public Boolean apply(WebDriver driver) {
     			JavascriptExecutor js=(JavascriptExecutor) driver;
     			System.out.println(js.executeScript("return document.readyState").toString());
     			boolean pgl=js.executeScript("return document.readyState").toString().equals("complete");
     			return pgl;
     		}
     		
		});
     	
     	
     	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
     	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
     	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();            //new
     	Thread.sleep(4000);
     	driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")).click();
	    driver.findElement(By.xpath("//div[@class='searchItemList']/descendant::div[contains(.,'- New Customer -')]")).click();
	    driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("s");
	    driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("xyz");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[@class='components_button_label']")).click();
	    Thread.sleep(4000);
	    String err=driver.findElement(By.xpath("//div[@class='basicLightboxFooter']/descendant::span[@class='errormsg']")).getText();
        System.out.println(err);
    }
}
