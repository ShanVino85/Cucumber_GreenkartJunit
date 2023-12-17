package dstestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Signinpage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
//import listenerpkg.Allurelistener;

//@Listeners(io.qameta.allure.testng.AllureTestNg.class)
//@Listeners({listenerpkg.Allurelistener.class})
public class Arraytest extends BasePRO{
	
	Arraypage ap;
	Homepage hp;
	public  Arraytest()
	{
		super();
	}
	
	@BeforeMethod
	public void array()
	{
	 ap=new Arraypage ();
	 hp= new Homepage();
	 
	}
	
	 @Test(priority=3,description="Launcing Array page")
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test case Description:Launcing Array page")
	 @Story("Story Nmae:To check Array page")
	 public void tst03_moveToArraypage() 
	 {
		 	  ap = hp.arr();
		  	  //Assert.assertEquals(title, "NumpyNinja");
		}
	
 @Test(priority=4,description="Verifying Array Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying Array Page")
 @Story("Story Nmae:To Moving in Array page")
 public void tst04_Arrayaction() throws InterruptedException
 {
	 LoggerLoad.info("<---------------In Array Page starting-------------->");
	 ap.python();
	 
	 String pagetitle =ap.getPageTitle();
	 System.out.println(pagetitle);
	// Assert.assertEquals(pagetitle, "Arrays");
	 
	 ap.arrlist();
	 ap.basicoper();
	 ap.appli();
		 Thread.sleep(2000);
	 ap.gotoEditor();
	 LoggerLoad.info("<-------------Going to Editor page -------------->");
	 }
}
