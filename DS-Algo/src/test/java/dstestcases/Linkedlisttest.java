package dstestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Linkedlistpage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Linkedlisttest extends BasePRO {
	Linkedlistpage Lp;
	Homepage hp;
	
	public Linkedlisttest ()
	{
		super();
	}
	@BeforeMethod
	public void linkedlist()
	{
		Lp=new Linkedlistpage();
		hp=new Homepage();
	}
	/* @Test(priority=3,description="Launcing Linkedlist page")
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test case Description:Launcing Linkedlist  page")
	 @Story("Story Nmae:To check Linkedlist page")
	 public void tst05_moveToLinkedlistpage() 
	 {
		 	  Lp = hp.linkedlist();
		  	  //Assert.assertEquals(title, "NumpyNinja");
		}*/
	
 @Test(priority=3,description="Verifying Linkedlist Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying Linkedlist Page")
 @Story("Story Nmae:To Moving in Linkedlist page")
 public void tst06_Linkedlistaction() throws InterruptedException
 {
	 LoggerLoad.info("<---------------In Linkedlist Page starting-------------->");
	Lp.introduction();
	Lp.createlinked();
	Lp.typelinked();
	Lp.implementlinked();
	Lp.traversal();
	Lp.insertlinkedlist();
	Lp.deletelinkedlist();
	Lp.dropdown();
	Lp.dropstack();
	 LoggerLoad.info("<-------------Going to stack page -------------->");
	 }
}
