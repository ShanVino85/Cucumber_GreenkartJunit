package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Queuepage extends BasePRO {
	 
	
	@FindBy(xpath="//a[@href='queue']")
			WebElement queuestart;
	@FindBy(xpath="//a[@href='implementation-lists']")
	WebElement implementation ;
	@FindBy(xpath="//a[@href='/queue/implementation-collections/']")
	WebElement collections ;
	@FindBy(xpath="//a[@href='/queue/Implementation-array/']")
	WebElement implementarray ;
	@FindBy(xpath="//a[@href='/queue/QueueOp/']")
	WebElement queueoperation;
	@FindBy(xpath="//a[@href=\'/tryEditor\']")
	WebElement tryedit;
	public Queuepage ()
	 {
		 PageFactory.initElements(driver,this);
	 }
	  public void queuestart()
	  {
		  queuestart.click();
	  }
	  public void implementlist()
	  {
		  implementation.click();
	  }
	  public void collections ()
	  {
		  collections.click();
	  }
	  public void implementarray  ()
	  {
		  implementarray .click();
	  }
	  public void queueoperation()
	  {
		  queueoperation .click();
	  }
	  public Tryeditor gotoEditor()
		{
			tryedit.click();
			return new Tryeditor();
			}
	  
	  public String validateQpage()
	  {
		  
		  
		return  driver.getTitle();
		  
		  
	  }
}
