package com.orangeHRMopenSource.objectreposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addbutton {
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement add;
	public Addbutton(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
public void clickAdd(WebDriver driver)
{
		
    add.click();
}
}
