package dstestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Treepage;
import dspageobjectmodel.Tryeditor;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Tryeditortest extends BasePRO {
	
	Tryeditor te;
	
	public  Tryeditortest()
	{
		super();
	}
	
	@BeforeMethod
	public void Tree()
	{
	 te =new Tryeditor ();
	}

	 @Test (priority=6,description="Verifying Text editor Page")
	 @Severity(SeverityLevel.BLOCKER)
	 @Description("Test case Description:Verifying Text editor Page")
	 @Story("Story Nmae:To check Text editor page")
	 public void tst06_te_input() throws InterruptedException 
	 {
		    LoggerLoad.info("<-------------In Assessment Page----------->");
		 	 te.editorinput(prop.getProperty("input"));
		 	 Thread.sleep(1000);
		 	LoggerLoad.info("<-------------click the Button----------->");
		 	 te.runbun();
		 	 }
	 @AfterMethod
	 
	 public void closebrowser()
	 {
		 LoggerLoad.info("<-------------close the button----------->"); 	
		 te.cls_browser();
		 }
	
	
}
