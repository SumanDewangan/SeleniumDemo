package Notify;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT 
{
    public static void main(String[] args) throws Exception 
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); // here we are launching the browser
    	driver.manage().window().maximize();
    	driver.get("https://demo.actitime.com/login.do");


    	FileInputStream fis=new FileInputStream("D:\\MySE.xlsx");//path of excel file
    	Workbook wb=WorkbookFactory.create(fis);//loading the excel file
    	Sheet sh=wb.getSheet("Sheet1");//loaded sheet also
    	int rowcount=sh.getPhysicalNumberOfRows();//how many row
    	Row FirstRow=sh.getRow(0);
    	for(int row=1;row<rowcount;row++)
    	{
    		for(int col=0;col<FirstRow.getLastCellNum();col++)
    		{
    			Cell cl=sh.getRow(row).getCell(col);
    			System.out.print(cl.toString()+" ");
    			if(row==1 && col==0)
    				driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(cl.toString());
    			if(row==1 && col==1)
    				driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(cl.toString());

    			WebElement value=driver.findElement(By.xpath("//input[@name='username']"));
    	     	value.clear();
    	     	WebElement value1=driver.findElement(By.xpath("//input[@name='pwd']"));
    	     	value.clear();
    	     	
    			if(row==2 && col==0)
    				driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(cl.toString());
    			if(row==2 && col==1)
    				driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(cl.toString());

    		}
    		System.out.println();

    	}
    }
}
