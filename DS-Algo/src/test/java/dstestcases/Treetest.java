package dstestcases;

import org.apache.commons.math3.optim.AbstractOptimizationProblem;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dspageobjectmodel.Arraypage;
import dspageobjectmodel.Homepage;
import dspageobjectmodel.Treepage;
import dsutilities.LoggerLoad;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Treetest extends BasePRO{
	Treepage tp;
	Homepage hp;
	public  Treetest()
	{
		super();
	}
	
	@BeforeMethod
	public void Tree()
	{
	 tp=new Treepage ();
	 hp=new Homepage();
	}

	 @Test(priority=3,description="Launcing Tree page")
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test case Description:Launcing Tree Page")
	 @Story("Story Nmae:To check Tree page")
	 public void tst03_moveToTreepage() 
	 {
		 	  tp = hp.Tree();
		  	  //Assert.assertEquals(title, "NumpyNinja");

		 
		 }
	
 @Test(priority=4,description="Verifying Tree Page")
 @Severity(SeverityLevel.CRITICAL)
 @Description("Test case Description:Verifying Tree Page")
 @Story("Story Nmae:To Moving in tree page")
 public void tst04_Treeaction() throws InterruptedException
 {
	 LoggerLoad.info("<---------------In Treepage starting-------------->");
	 tp.overview();
	 tp.terminal();
	 tp.Typetree();
	 tp.Treetra();
	 tp.Treeills();
	 tp.Binarytree();
	 tp.Typebinary();
	 tp.Imple();
	 LoggerLoad.info("<-------------Going to Editor page -------------->");
	 tp.tryedit();
	// tp.Answer();
	// tp.Ansprint(prop.getProperty("input") );
	// Thread.sleep(2000);
	// tp.runbun();
	 
}
}
