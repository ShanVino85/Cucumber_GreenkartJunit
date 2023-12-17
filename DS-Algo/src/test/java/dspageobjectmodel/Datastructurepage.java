package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Datastructurepage  extends BasePRO {
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement datastructurestart;
	@FindBy(xpath="//a[@href='time-complexity']")
	WebElement timecomplex ;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[2]")
	WebElement droplinkedlist;
	public Datastructurepage ()
	{
	 PageFactory.initElements(driver,this);
	}
	 public void datastructurestart()
		{
		 datastructurestart .click();
		}
	 public void  timecomplex ()
		{
		 timecomplex .click();
		}
	 public void  dropdown ()
		{
		 dropdown .click();
		}
	 public Linkedlistpage droplinkedlist ()
		{
		 droplinkedlist.click();
		 return new Linkedlistpage ();
		}
	
}
