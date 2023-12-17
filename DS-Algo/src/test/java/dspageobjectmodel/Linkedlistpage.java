package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Linkedlistpage extends BasePRO {
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement linkedliststart;
	@FindBy(xpath="//a[@href='introduction']")
	WebElement introduction;
	@FindBy(xpath="//a [@href='/linked-list/creating-linked-list/']")
	WebElement createlinked ;
	@FindBy(xpath="//a[@ href='/linked-list/types-of-linked-list/']")
	WebElement typelinked ;
	@FindBy(xpath="//a[@ href='/linked-list/implement-linked-list-in-python/']")
	WebElement implementlinked ;
	@FindBy(xpath="//a [@href='/linked-list/traversal/']")
	WebElement traversal ;
	@FindBy(xpath="//a[text()='Insertion']")
	WebElement insertlinkedlist ;
	@FindBy(xpath="//a[text()='Deletion']")
	WebElement deletelinkedlist ;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[3]")
	WebElement dropstack;
	 
	public Linkedlistpage()
	{
	 PageFactory.initElements(driver,this);
	}
	public void linkedliststart ()
	{
		linkedliststart .click();
	}
	public void introduction ()
	{
		introduction.click();
	}public void createlinked()
	{
		createlinked .click();
		}
	public void typelinked ()
	{
		typelinked.click();
	}
	public void implementlinked()
	{
		implementlinked.click();
	}
	public void  traversal ()
	{
		 traversal.click();
	}
	public void  insertlinkedlist()
	{
		 insertlinkedlist.click();
	}
	public void deletelinkedlist ()
	{
		deletelinkedlist.click();
	}
	public void dropdown ()
	{
		dropdown.click();
	}
	public void dropstack ()
	{
		dropstack.click();
	}
	
}
