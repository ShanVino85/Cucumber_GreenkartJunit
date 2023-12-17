package dstestcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Getstartedpage;
import dspageobjectmodel.Signinpage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Getdtartedtest extends BasePRO {
	Getstartedpage gs;
	Signinpage sp;
	
	public Getdtartedtest()
	{
		super();
		
	}
	@BeforeMethod
	public void start()
	{
		intialization();
		 gs=new Getstartedpage();
		 sp= new Signinpage();
		
	}
 @Test(priority=0,description="Launcing get started page")
 @Severity(SeverityLevel.NORMAL)
 @Description("Test case Description:Launcing get started page")
 @Story("Story Nmae:To check get started page")
 public void tst01_getstart() throws InterruptedException
   {
	 
		 
	
	 LoggerLoad.info("<-----------In Getstartpage--------------->");
	sp= gs.getstart();
	LoggerLoad.info("<-----------------ended Getstartpage------------->");
	 Thread.sleep(1000);
	 sp.gotosignin();	 
	 LoggerLoad.info("<-----------------started signin page------------->");
	 }
  }



