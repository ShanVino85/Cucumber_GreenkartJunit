package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Graphpage extends BasePRO {
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graph ;
	@FindBy(xpath="//a[@href='/graph/graph-representations/']")
	WebElement graphrepresent;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryedit ;
	 
	 public Graphpage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	public void graph()
	{
		graph.click();
	}
	public void graphrepresent ()
	{
		graphrepresent.click();
	}
	public void tryedit()
	{
		tryedit.click();
	}
}
