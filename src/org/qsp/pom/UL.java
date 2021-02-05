package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UL 
{
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	private WebElement ele;

	@FindBy(xpath="//li[@class='topnav_item livingunit']")
	private WebElement living;

	@FindBy(xpath="//span[contains(.,'Fabric Sofa Sets')]")
	private WebElement sofa;

	@FindBy(xpath="//li[1]/descendant::div[@class='Grey selected variations']/descendant::button[contains(.,'View Product')]")
	private WebElement view;

	@FindBy(xpath="//a[contains(.,'Order Your Set')]")
	private WebElement order;

	public UL(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void CloseClick()
	{
		ele.click();
	}
	public void LivingMouseOver(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(living).perform();
	}
	public void FabricSofaSetClick()
	{
		sofa.click();
	}

	public void view1stProduct()
	{
		view.click();
	}

	public void orderYourSet()
	{
		order.click();
	}
}
