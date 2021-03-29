package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	Actions act;
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement ad;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void adminElement(WebDriver driver)
	 {
		 act= new Actions(driver);
		 act.moveToElement(ad).perform();
	 }
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement um;
	public void unElement(WebDriver driver)
	{
		act=new Actions(driver);
		act.moveToElement(um).perform();
		}
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	private WebElement un;
	public void userElement(WebDriver driver)
	{
		act=new Actions(driver);
		act.moveToElement(un).click().perform();
	}
}
