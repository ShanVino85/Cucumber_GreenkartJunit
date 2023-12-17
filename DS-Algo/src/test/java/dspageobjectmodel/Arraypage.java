package dspageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Arraypage extends BasePRO {
	//@FindBy(xpath="//a[@href='array']")
	//WebElement arrayclick;
	@FindBy(xpath="//a[@href='arrays-in-python']")
	WebElement arraypython;
	@FindBy(xpath="//a[@href='/array/arrays-using-list/']")
	WebElement arrayusinglist;
	@FindBy(xpath="//a[@href='/array/basic-operations-in-lists/']")
	WebElement basicoperation;
	@FindBy(xpath="//a[@href='/array/applications-of-array/']")
	WebElement application;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[5]")
	WebElement droptree;
	@FindBy(xpath="//a[@href=\'/tryEditor\']")
	WebElement tryedit;
	
	
	/*@FindBy(xpath="//a[@href='/tryEditor']")
    WebElement tryeditor;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
    WebElement textarea;
	@FindBy(xpath="//button[@type='button']")
	WebElement runbutn;*/
	public Arraypage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void python()
		{
		 arraypython .click();
		}
	 public void arrlist()
		{
		 arrayusinglist.click();
		}
	 public void basicoper()
		{
		 basicoperation.click();
		}
	 public void appli()
		{
			application.click();
			}
	 
	 public Tryeditor gotoEditor()
		{
			tryedit.click();
			return new Tryeditor();
			}
/*	 public void drop()
		{
		 dropdown.click();
			}
	 public Treepage tree()
		{
		 droptree.click();
		 return new Treepage();
	}*/
	 
    public String getPageTitle()
		{
			return driver.getTitle();
			
		} 
}
