package Junit;

import java.awt.AWTException;  
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseCode.BaseCode;



public class JunitOne extends BaseCode {
	
//	@BeforeClass
//	public static void launchDriver() throws AWTException {
//		driverLaunch("https://adactinhotelapp.com/");
//		maximize();
//		implicitWait();
//	}
	
	@Before
	public void BeforeScreenshot() throws IOException {
		driverLaunch("https://www.amazon.in/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File image = new File("C:\\Users\\gugan\\eclipse-workspace\\MavenProject\\Output\\Before.png");
		FileUtils.copyFile(source, image);
	}
	
	@Test
	public void Login() {
		WebElement username = driver.findElement(By.id("username"));
		sendkeys(username, "Herbert8489");
		WebElement password = driver.findElement(By.id("password"));
		sendkeys(password,"Sam8489752875");
		WebElement Login = driver.findElement(By.id("login"));
		click(Login);
	}
	
	@After
	public void AfterScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File image = new File("C:\\Users\\gugan\\eclipse-workspace\\MavenProject\\Output\\After.png");
		FileUtils.copyFile(source, image);
		quitdriver();
	}
	
//	@AfterClass
//	public static void QuitDriver() {
//		quitdriver();
//	}
}
