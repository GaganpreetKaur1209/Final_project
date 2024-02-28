package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;


public class BaseClass {
	
public	static WebDriver driver;
static Logger logger;
public static Properties p;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		
		
		//loading properties file
		FileReader file = new FileReader(".//src/test/resources/config.properties");//class
		p=new Properties();//creating obj of Properties
		p.load(file);//load properties file
	
		
		
		
		//check on which envt want to run grid or local from config properties file
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//decide os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WINDOWS);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching OS...");
			}
			//decide browser
			switch(br.toLowerCase())
			{
			case "chrome" :
				capabilities.setBrowserName("chrome");
				break;
			case "edge":
				capabilities.setBrowserName("edge");
				break;
			default :
				System.out.println("No matching browser..");
				return;
			}
			driver = new RemoteWebDriver(new URL("http://10.90.197.100:4444"),capabilities);//node/grid URL is fixed

		}
		
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			//switch(getProperties().getProperty("browser").toLowerCase){
			
			//1.launch based on condition-locally
			switch(br.toLowerCase())
			{
			case "chrome":
				driver = new ChromeDriver();break;
			case "edge":
				driver = new EdgeDriver();break;
			default:
				System.out.println("not matching browser");
				return;

			}
		}
		//2.for grid now add remote envt

			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("appURL"));
			driver.manage().window().maximize();
}
	
	//To quit the page
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	//captures screenshot
	public String captureScreen(String name) {
		 
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + name + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	 }
	
	public static Logger getlogger() {
		logger=LogManager.getLogger();//Log4j
		return logger;
	}
}	


