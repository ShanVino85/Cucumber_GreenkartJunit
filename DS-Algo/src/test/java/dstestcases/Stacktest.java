package dstestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Stackpage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Stacktest extends BasePRO  {
	Stackpage Sp;
	Homepage hp;
	public Stacktest()
	{
		super();
	}
	@BeforeMethod
	public void stack()
	{
	 Sp=new Stackpage ();
	 hp= new Homepage();
	 
	}
	
	 
 @Test(priority=4,description="Verifying Stack Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying Stack Page")
 @Story("Story Nmae:To Moving in Stack page")
 public void tst04_Stackaction() throws InterruptedException
 {
	 LoggerLoad.info("<---------------In Stack Page starting-------------->");
	 Sp.operationstack();
	 Sp.implementstack();
	 Sp.stackapplication();
	 Sp.dropdown();
	 Sp.dropgraph();
	 
	 LoggerLoad.info("<-------------Going to Graph page -------------->");
	 }

}
