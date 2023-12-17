package dstestcases;

import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Getstartedpage;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Signinpage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listenerpkg.Allurelistener;

@Listeners({Allurelistener.class})
public class Signintest extends BasePRO {
	
	Signinpage sp;
	Homepage hp;
	Arraypage ap;
	
	
	public Signintest()
	{
		super();
		
	}
	@BeforeMethod
	public void start()
	{
		//intialization();
		 sp=new Signinpage();
	}
 @Test(priority=2,description="Verifying sigin Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying sigin Page")
 @Story("Story Nmae:To check sigin page")
 public void tst02_signin() throws InterruptedException
 {
	 
	    String title = sp.validatesigninpage();
	 
		System.out.println("the sign page title is: " + title);
		Assert.assertEquals(title, "Login");
		
	//LoggerLoad.startTestCase("Verifying sigin Page");
		
	 LoggerLoad.info("<----------In Signin Page----------->");
	 //System.out.println("in signin page" + prop.getProperty("username"));
     hp  = sp.signin(prop.getProperty("username"),prop.getProperty("password") );
     
     
	 Thread.sleep(2000);
	 LoggerLoad.info("<-------------Sign in Successfully--------------> ");
	 }

 


}
