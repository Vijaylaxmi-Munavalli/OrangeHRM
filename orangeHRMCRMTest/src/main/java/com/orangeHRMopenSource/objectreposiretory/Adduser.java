package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adduser {
	@FindBy(xpath = "//select[@id='systemUser_userType']")
	private WebElement userrole;
	
	
	@FindBy(xpath ="//input[@id='systemUser_employeeName_empName']")
	private WebElement en ;

	@FindBy(xpath = "//input[@id='systemUser_userName']")
	private WebElement  un;

	@FindBy(xpath = "//select[@id='systemUser_status']")
	private WebElement  st;
	
	@FindBy(xpath="//input[@id='systemUser_password']")
	private WebElement pw ;

	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
	private WebElement cpw ;

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement  sv;
	
	@FindBy(xpath = "//input[@id='btnCancel']")
	private WebElement ca ;
	
public Adduser(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserRole(String ur)
	{
		Select s = new Select(userrole);
		s.selectByIndex(0);
		
		
	}
	public void enterEmployeeName(String ep)
	{
		en.sendKeys(ep);
	}
	public void enterUserName(String um)
	{
		un.sendKeys(um);
	}
	public void enterStaus(String su  )
	{
	Select s=new Select(st);
	s.selectByIndex(1);
	}
	public void enterPassword(String sp)
	{
		pw.sendKeys(sp);
	}
	public void enterConfirmPass(String cp)
	{
		cpw.sendKeys(cp);
	}
	public void clickOnSave()
	{
		sv.click();
	}
	public void clickOnCancel()
	{
		ca.click();
	}
 
}