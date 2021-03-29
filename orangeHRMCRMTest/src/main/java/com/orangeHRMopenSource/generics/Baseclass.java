package com.orangeHRMopenSource.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectreposiretory.Login;
import com.orangeHRMopenSource.objectreposiretory.Logout;

public class Baseclass {
	static
	{
		 System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	}
       
      public static WebDriver driver;
      public FileLib f=new FileLib();
     public WebDriverCommonLib w=new WebDriverCommonLib();
      @BeforeTest
      public void openBrowser() {
    	  driver =new ChromeDriver();
    	  driver.manage().window().maximize();
    	  w.waitForElementInGui(driver);
    	  
      }
      @AfterTest
      public void closeBrowser() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  driver.close();
      }
      @BeforeMethod
      public void login() 
      {
      try 
		{
			  String un=f.getPropertyValue("UN");
			  Thread.sleep(2000);
			  String pw=f.getPropertyValue("PWD");
			  Thread.sleep(2000);
			  driver.get(f.getPropertyValue("URL"));
			  Login lg=new Login(driver);
			  lg.enterUserName(un);
			  Thread.sleep(2000);
			  lg.enterPasswordName(pw);
			  Thread.sleep(2000);
			  lg.clickOnLogin();
			  Thread.sleep(2000);
			  }
	 catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	 }
      }
      @AfterMethod
      public void logout() throws InterruptedException
      {
    	Logout lo=new Logout(driver);
    	Thread.sleep(2000);
    	lo.welCome();
    	Thread.sleep(2000);
    	lo.clickOnLogout(driver);
    	
      }
}
