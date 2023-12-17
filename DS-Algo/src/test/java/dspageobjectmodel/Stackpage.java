package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Stackpage extends BasePRO{
	@FindBy(xpath="//a[@ href='operations-in-stack']")
	WebElement operationstack;
	@FindBy(xpath="//a[@ href='/stack/implementation/']")
	WebElement implementstack ;
	@FindBy(xpath="//a[@href='/stack/stack-applications/']")
	WebElement stackapplication;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[6]")
	WebElement dropgraph;
	public  Stackpage()
	{
	PageFactory.initElements(driver,this);
	}
	
	public void  operationstack()
	{
		operationstack.click();
	}
	public void implementstack ()
	{
		implementstack.click();
	}
	public void stackapplication ()
	{
		stackapplication.click();
	}
	public void dropdown  ()
	{
		dropdown.click();
	}
	public void dropgraph ()
	{
		dropgraph.click();
	}
	
}

