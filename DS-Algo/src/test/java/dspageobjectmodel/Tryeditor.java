package dspageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dsbaseclass.BasePRO;

public class Tryeditor  extends BasePRO {
	
	
	 @FindBy(xpath="//div[@class='input']//textarea[@autocorrect='off']")WebElement editor ;
	 @FindBy(xpath="//button[@type='button']")WebElement runbutn;

	//	@FindBy(how=How.XPATH,using="//div[@class='input']//textarea[@autocorrect='off']")
	//	public static WebElement editor;
		
	//	@FindBy(how=How.XPATH,using="//button[text()='Run']")
	//	public static WebElement runbutn;	
	 

	 public Tryeditor() 
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void editorinput(String nu)
	 {
		 editor.sendKeys(nu);
	 }
	   public void runbun()
	 {
				runbutn.click();
	 }
	 
	   public void cls_browser()
	   {
		       driver.quit();
	   }
}