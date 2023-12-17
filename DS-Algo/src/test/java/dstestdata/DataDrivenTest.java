	package dstestdata;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsbaseclass.BasePRO;
import dsutilities.LoggerLoad;
public class DataDrivenTest  extends BasePRO
{
		WebDriver driver;	

@Test(dataProvider="testdata")
public void demoClass(String username, String password) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:/Users/shanj/eclipse-workspace/DS-Algo/src/test/resources/driver/chromedriver.exe");
driver=new ChromeDriver();
driver.get( " https://dsportalapp.herokuapp.com");
driver.findElement(By.xpath("//*[text()='Get Started']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();	
LoggerLoad.info("-----signin done----");

//driver.findElement(By.xpath("//*[@id='id_username']")).sendKeys("VIRAM.ATSELENIUM@GMAIL.COM");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vino@1985");
//driver.findElement(By.xpath("//input[@value='Login']")).click();

driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.xpath("//input[@value='Login']")).click();
Thread.sleep(5000);
//Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
System.out.println("Signinpage tested successfully");
}
@AfterMethod
void ProgramTermination() {
driver.quit();
} 
@DataProvider(name="testdata")
public Object[][] testDataExample(){

	ReadExcelFile config = new ReadExcelFile(prop.getProperty("loginsheet"));

	//ReadExcelFile config = new ReadExcelFile("C:\\Users\\shanj\\eclipse-workspace\\DS-Algo\\Excel\\LoginDetails.xlsx");

	int rows = config.getRowCount(0);
Object[][]signin_credentials = new Object[rows][2];

for(int i=0;i<rows;i++)
{
signin_credentials[i][0] = config.getData(0, i, 0);
signin_credentials[i][1] = config.getData(0, i, 1);
}
return signin_credentials;
}
}