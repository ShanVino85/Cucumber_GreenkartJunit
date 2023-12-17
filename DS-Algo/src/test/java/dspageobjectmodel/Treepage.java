package dspageobjectmodel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Treepage extends BasePRO 
{
	// @FindBy(xpath="//a[@href='tree']")WebElement tree;
	 @FindBy(xpath="//a[@href='overview-of-trees']")WebElement overviewtree;
	 @FindBy(xpath="//a[text()='Terminologies']")WebElement Terminal;
	 @FindBy(xpath="//a[text()='Types of Trees']")WebElement Typetree;
	 @FindBy(xpath="//a[text()='Tree Traversals']")WebElement Treetraverse;
	 @FindBy(xpath="//a[text()='Traversals-Illustration']")WebElement Treeillus ;
	 @FindBy(xpath="//a[text()='Binary Trees']")WebElement Binarytree ;
	 @FindBy(xpath="//a[text()='Types of Binary Trees']")WebElement Typebinary ;
	 @FindBy(xpath="//a[text()='Implementation in Python']")WebElement ImplePython;
	 @FindBy(xpath="//a[@href='/tryEditor']")WebElement tryedit;
	 @FindBy(xpath="//div[@class='input']/textarea")WebElement Answer ;
	 @FindBy(xpath="//button[@type='button']")WebElement runbutn;
	 public Treepage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void overview()
		{
		 overviewtree.click();
		}
	 public void terminal()
		{
		 Terminal.click();
		}
	 public void Typetree()
		{
		 Typetree.click();
		}
	 public void Treetra()
		{
		 Treetraverse.click();
		}
	 public void Treeills()
		{
		 Treeillus.click();
		}
	 public void Binarytree()
		{
		 Binarytree.click();
		}
	 public void Typebinary()
		{
		 Typebinary.click();
		}
	 public void Imple()
		{
		 ImplePython.click();
		}
	 public Tryeditor tryedit()
		{
		tryedit.click();
		return new Tryeditor();
		} 

}   







