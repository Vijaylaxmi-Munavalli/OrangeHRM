package com.orangeHRMopenSource.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.generics.Baseclass;
import com.orangeHRMopenSource.objectreposiretory.Addbutton;
import com.orangeHRMopenSource.objectreposiretory.Adduser;
import com.orangeHRMopenSource.objectreposiretory.Homepage;

@Listeners(com.orangeHRMopenSource.generics.ListenerImplementation.class)
public class Admin extends Baseclass{
	@Test
	public void user() throws InterruptedException
	{
		Assert.fail();
		Homepage hp=new Homepage(driver);
		hp.adminElement(driver);
		hp.unElement(driver);
		hp.userElement(driver);
		
		Addbutton ab=new Addbutton(driver);
		ab.clickAdd(driver);
		
		Adduser au =new Adduser(driver);
		au.enterUserRole("ur");
		au.enterEmployeeName("ep");
		au.enterUserName("um");
		au.enterStaus("su");
		au.enterPassword("sp");
		au.enterConfirmPass("cp");
		Thread.sleep(4000);
		
		au.clickOnSave();
		
		
	}
	
}
