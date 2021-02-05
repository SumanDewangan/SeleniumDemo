package Notify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");		
		driver.findElement(By.name("btnLogin")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}

}
