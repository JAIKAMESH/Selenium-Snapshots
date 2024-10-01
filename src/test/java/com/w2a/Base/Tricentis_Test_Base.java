package com.w2a.Base;

import java.io.*;
import java.time.Duration;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.w2a.utilites.ExcelReader;


public class Tricentis_Test_Base {
	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public File file;public File file1;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	//public static ExcelReader excel;

@BeforeSuite
public void setup() throws Exception {
	if(driver==null) {
		// Read Config Properties Files
		file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");		Properties Config = new Properties();
		Config.load(new FileInputStream(file));
		log.debug("Config File Loader ! ! !");
		
		// Read OR Properties Files
		file1 = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		OR.load(new FileInputStream(file1));
		log.debug("OR File Loader ! ! !");
		
		//Initalize the Browser
		if (Config.getProperty("browser").equals("chrome"))
			driver = new ChromeDriver();
		else if (Config.getProperty("browser").equals("edge"))
			driver = new EdgeDriver();
		else if (Config.getProperty("browser").equals("firebox"))
			driver = new FirefoxDriver();
		log.debug("Browser Lanch");
		
		//Initalize the excel file
	//excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\LoginData.xlsx");
		
	   //Start session
		driver.manage().window().maximize();
		driver.get(Config.getProperty("URL"));
		log.debug("Navigate to : "+Config.getProperty("URL"));
	    driver.manage().timeouts()
	      .implicitlyWait(Duration.ofSeconds(Integer.parseInt(Config.getProperty("implicityWait"))));	
       Thread.sleep(5000);	
	}
}

@AfterSuite
public void teardown() {
	if(driver!=null) driver.quit();
	log.debug("Successfully Completed");;
}
}

