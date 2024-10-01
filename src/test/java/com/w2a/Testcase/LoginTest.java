package com.w2a.Testcase;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.w2a.Base.Tricentis_Test_Base;



public class LoginTest  extends Tricentis_Test_Base{	
	@Test(enabled = true)
	public void LoginTricentisApp() throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("submitBtn"))).click();
		Thread.sleep(5000);
		System.out.println("Login Successfully");
		log.debug("Login Successfully");
	}
}
