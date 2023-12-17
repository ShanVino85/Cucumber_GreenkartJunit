package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;



public class Getstartedpage extends BasePRO {
	
		
	@FindBy(xpath="//*[text()='Get Started']")
	WebElement Getstart;
  //Initialization the page object
 
	public Getstartedpage()
	{
	PageFactory.initElements(driver,this);
	
	}
	//Actions:
	
	/*public String validategetstartpage()
	{
	return driver.getTitle();
		
	} */
		
	public Signinpage getstart ()
	{
		//logger.warn("signed in", null);
	Getstart.click();

	return new Signinpage();
	
	}
 
}
