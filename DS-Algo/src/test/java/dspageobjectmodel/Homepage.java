package dspageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Homepage extends BasePRO {

	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement datastructure;
	
	@FindBy(xpath="//a[@href='array']")
	WebElement array;
	
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement linkedlist;
	
	@FindBy(xpath="//a[@href='stack']")
	WebElement stack;
	
	@FindBy(xpath="//a[@href='queue']")
	WebElement queue;
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement tree;
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graph;
	
	public Homepage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateHomepage()
		{
		return driver.getTitle();
			
		} 
	 public Arraypage arr()
	{
		 array.click();
	
	return new Arraypage();
		
	}
	
	 public Treepage Tree()
	{
		 tree.click();
	
	return new Treepage();
		
	}
	 public Queuepage queue()
		{
		 queue .click();
		return new Queuepage();
			
		}
	 public  Linkedlistpage  linkedlist ()
		{
		 linkedlist.click();
		return new  Linkedlistpage();
		}
		 public Datastructurepage datastructure()
			{
			 datastructure.click();
			return new Datastructurepage();
			
		}
	 
}
