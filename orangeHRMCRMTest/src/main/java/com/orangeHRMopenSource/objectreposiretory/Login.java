package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="txtUsername")
	private WebElement unTB;
	
	@FindBy(id="txtPassword")
	private WebElement pwTB;
	
	@FindBy(id="btnLogin")
	private WebElement lgTB;
	
	public Login(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void enterUserName(String un) throws InterruptedException
	{
		unTB.sendKeys(un);
		 Thread.sleep(2000);
	}
	public void enterPasswordName(String pw) throws InterruptedException
	{
		pwTB.sendKeys(pw);
		 Thread.sleep(2000);
	}
	public void clickOnLogin() throws InterruptedException
	{
		lgTB.click();
		 Thread.sleep(2000);
	}

}
