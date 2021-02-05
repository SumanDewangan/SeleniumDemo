package demo.testngdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{
    @BeforeSuite
    public void bs() {
    	System.out.println("Before Suite");
    }
    
    @BeforeTest
    public void bT() {
    	System.out.println("Before Test");
    }
    
    @BeforeClass
    public void beforeC() 
    {
    	System.out.println("before class");
    }
    
    @BeforeMethod
    public void beforeM()
    {
    	System.out.println("before Method");
    }
    
    @Test
    public void tc_1()
    {
    	System.out.println("hiii...from tc_1");
    }
    
    @Test
    public void tc_2()
    {
    	System.out.println("hiiii...from tc_2");
    }
    
    @AfterMethod
    public void afterM()
    {
    	System.out.println("After Method");
    }
    
    @AfterClass
    public void afterC()
    {
    	System.out.println("After Class");
    }
    
    @AfterTest
    public void aT()
    {
    	System.out.println("After Test");
    }
    
    @AfterSuite
    public void aS()
    {
    	System.out.println("After Suite");
    }
}
