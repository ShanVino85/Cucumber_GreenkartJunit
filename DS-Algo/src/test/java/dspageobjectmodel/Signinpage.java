package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Signinpage	 extends BasePRO {
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement Signin ;
	 
	 @FindBy(xpath="//*[@name='username']")
	 WebElement username ;
	 
	 @FindBy(xpath="//input[@name='password']")
	 WebElement password ;
	 
	 @FindBy(xpath="//input[@value='Login']")
	 WebElement Login ;
	 public Signinpage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	 public void gotosignin() throws InterruptedException
	 {
		 
		 Signin.click();
		 Thread.sleep(1000);
	 }
	 
	 
	public String validatesigninpage()
		{
		return driver.getTitle();
			
		} 
	 
	 public Homepage signin (String un,String pw)
		{
		username.sendKeys(un);	
		password.sendKeys(pw);
		Login.click();
		return new Homepage();
			
		}
	 
	 

}
