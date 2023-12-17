package listenerpkg;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

import dsbaseclass.BasePRO;
import dstestcases.BaseTest;



public class Allurelistener implements ITestListener{
	
	
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	

	@Attachment(value = "Page screenshot", type = "image/png")
	private byte[] saveScreenshot(WebDriver driver) {
	     byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	     return screenshot; }
	
// Text attachments for Allure
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	} 
	// Text attachments for Allure
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

/*	// HTML attachments for Allure
	@Attachment(value = "{0}", type = "text/html")
	public static String attachHtml(String html) {
		return html;
	}

	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in on Start method " + iTestContext.getName());
	//	Object testClass1 = iTestContext.getName();
		iTestContext.setAttribute("WebDriver", BasePRO.getDriver());
	}*/

	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in on Finish method " + iTestContext.getName());
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am in on TestStart method " + getTestMethodName(iTestResult) + " start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in on TestSuccess method " + getTestMethodName(iTestResult) + " succeed");
	}

	
    @Override
    public void onTestFailure(ITestResult iTestResult) {
     //   Log.info(getTestMethodName(iTestResult) + " test is failed.");

        //Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver driver = ((BasePRO) testClass).getDriver();

        //Allure ScreenShotRobot and SaveTestLog
        if (driver != null) {
            System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
            saveScreenshot(driver);
        }
        else {
        	 System.out.println("Drivers is Null");
        }
    }
	
	
  @Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}
