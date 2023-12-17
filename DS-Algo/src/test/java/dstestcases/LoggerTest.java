package dstestcases;

import org.testng.annotations.Test;
import dsutilities.LoggerLoad;

public class LoggerTest {
	
	@Test
	public void tst01_TestingLog() throws InterruptedException
	   {
		 
		// if want to display info message
		 LoggerLoad.info("<-----------Testing Info--------------->");
		 
		// if want to display warn message
		 LoggerLoad.warn("<-----------Testing warn--------------->");
		 
		 // if want to display error message
		 LoggerLoad.error("<-----------Testing error--------------->");
	   }
}																								
