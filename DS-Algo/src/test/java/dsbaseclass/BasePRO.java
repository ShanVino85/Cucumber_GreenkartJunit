package dsbaseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsutilities.LoggerLoad;
import dsutilities.Testutlil;

public class BasePRO{
	public static WebDriver driver;
	public static Properties prop;
			
	public BasePRO() 
	{
		
		//Read my Property;
		
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\shanj\\eclipse-workspace\\DS-Algo\\src\\test\\java\\dsconfig\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		
		}
		}
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void intialization() 
	{
	String browserName= prop.getProperty("browser");
	if( browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shanj\\eclipse-workspace\\DS-Algo\\src\\test\\resources\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
	}
	else if( browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:/Users/shanj/eclipse-workspace/DS-Algo/src/test/resources/driver/geckodriver.exe");
         driver =new FirefoxDriver();
		
	}
	else if( browserName.equals("Edge browser")) {
		System.setProperty("webdriver.edge.driver", "C:Usersshanj\\eclipse-workspace\\DS-Algo\\src\\test\\resources\\driver\\msedgedriver.exe");
         driver =new  EdgeDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	LoggerLoad.info("<---------------Starting the Browser-------------->");
	driver.get(prop.getProperty("url"));
	
	
		
	}}
