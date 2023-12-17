package dstestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Graphpage;
import dspageobjectmodel.Homepage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Graphtest extends BasePRO  {
	Graphpage Gp;
	Homepage hp;
	public Graphtest ()
	{
		super();
	}
	
	@BeforeMethod
	public void array()
	{
	 Gp=new Graphpage ();
	 hp= new Homepage();
	 
	}
	 @Test(priority=5,description="Verifying Graph Page")
	 @Severity(SeverityLevel.CRITICAL)
	 @Description("Test case Description:Verifying Graph Page")
	 @Story("Story Nmae:To Moving in Graph page")
	 public void tst04_Graphaction() throws InterruptedException
	 {
		 LoggerLoad.info("<---------------In Graph Page starting-------------->");
		  Gp.graph();
		  Gp.graphrepresent();
		  Gp.tryedit();
		// String pagetitle =Gp.getPageTitle();
		// System.out.println(pagetitle);
		// Assert.assertEquals(pagetitle, "Arrays");
		 
	 LoggerLoad.info("<-------------Going to Editor page -------------->");
		 }
}
