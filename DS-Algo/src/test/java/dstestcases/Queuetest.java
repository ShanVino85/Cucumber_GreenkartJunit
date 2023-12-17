package dstestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Queuepage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Queuetest extends BasePRO {
Queuepage Qp;
Homepage hp;
	public Queuetest()
	{
	super();
	}
	@BeforeMethod
	public void array()
	{
	 Qp=new Queuepage ();
	 hp= new Homepage();
	 
	}

	 @Test(priority=3,description="Launcing Queue page")
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test case Description:Launcing Queue page")
	 @Story("Story Nmae:To check Queue page")
	 public void tst03_moveToQueuepage() 
	 {
		 	  Qp = hp. queue();
		  	  //Assert.assertEquals(title, "NumpyNinja");
		}
	
@Test(priority=4,description="Verifying Queue Page")
@Severity(SeverityLevel.CRITICAL)
@Description("Test case Description:Verifying Queue Page")
@Story("Story Nmae:To Moving in Queue page")
public void tst04_Arrayaction() throws InterruptedException
{
	 LoggerLoad.info("<---------------In Queue Page starting-------------->");
	 Qp.implementlist();
	 Qp.collections();
	 Qp.implementarray();
	 Qp.queueoperation();
	 Qp.gotoEditor();
	 
 LoggerLoad.info("<-------------Going to Editor page -------------->");
	 }

@Test(priority=5,description="Validate Queue Page")
	public void tst_05_validate_title() {
	
	String title= Qp.validateQpage();
	System.out.println("Page title is " + title);
	
	Assert.assertEquals(title, "Incorrect Queue");
}

}
