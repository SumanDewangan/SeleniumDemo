import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder1 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // here we are launching the browser
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
		Thread.sleep(2000);
		String loc1=driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]")).getText();
		System.out.println(loc1);
		String loc2=driver.findElement(By.xpath("//h3[contains(.,'Bandra, Mumbai')]")).getText();
		System.out.println(loc2);
		String loc3=driver.findElement(By.xpath("//h3[contains(.,'Kirti Nagar, New Delhi')]")).getText();
		System.out.println(loc3);
		String loc4=driver.findElement(By.xpath("//h3[contains(.,'Domlur, Bangalore')]")).getText();
		System.out.println(loc4);
		String loc5=driver.findElement(By.xpath("//h3[contains(.,'JP Nagar, Bangalore')]")).getText();
		System.out.println(loc5);
		String loc6=driver.findElement(By.xpath("//h3[contains(.,'Sahakara Nagar, Bangalore')]")).getText();
		System.out.println(loc6);
		String loc7=driver.findElement(By.xpath("//h3[contains(.,'Mall Of India, Noida')]")).getText();
		System.out.println(loc7);
		String loc8=driver.findElement(By.xpath("//h3[contains(.,'Nungambakkam, Chennai')]")).getText();
		System.out.println(loc8);
		String loc9=driver.findElement(By.xpath("//h3[contains(.,'Creaticity, Pune')]")).getText();
		System.out.println(loc9);
		String loc10=driver.findElement(By.xpath("//h3[contains(.,'Kondapur, Hyderabad')]")).getText();
		System.out.println(loc10);
	}
}





