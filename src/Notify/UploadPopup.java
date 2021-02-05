package Notify;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {
                     
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='file_wraper0']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\upload.exe");

	}

}
