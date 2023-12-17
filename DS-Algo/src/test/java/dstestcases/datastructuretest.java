package dstestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Datastructurepage;
import dspageobjectmodel.Homepage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class datastructuretest  extends BasePRO {
	Datastructurepage Dp;
	Homepage hp;
	public datastructuretest()
	{
		super();
	}
	@BeforeMethod
	public void Datastructure()
	{
		Dp=new Datastructurepage();
		 hp= new Homepage();
	}

	 @Test(priority=3,description="Launcing Datastructure page")
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test case Description:Launcing Datastructure page")
	 @Story("Story Nmae:To check Datastructure page")
	 public void tst03_moveToDatastructurepage() 
	 {
		 	  Dp = hp.datastructure();
		  	  //Assert.assertEquals(title, "NumpyNinja");
		}
	
 @Test(priority=4,description="Verifying Datastructure  Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying Datastructure Page")
 @Story("Story Nmae:To Moving in Datastructure page")
 public void tst04_Datastrutureaction() throws InterruptedException
 {
	 LoggerLoad.info("<---------------In Datastructure Page starting-------------->");
	// Dp.datastructurestart();
	 Dp.timecomplex();
	 Dp.dropdown();
	 Dp.droplinkedlist();
	  LoggerLoad.info("<-------------Going to Linkedlist page -------------->");
	 }
}
