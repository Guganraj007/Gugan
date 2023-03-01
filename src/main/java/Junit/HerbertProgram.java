package Junit;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseCode.BaseCode;

public class HerbertProgram extends BaseCode {
//	@BeforeClass
//	public static void launchMethod() throws AWTException {
//		driverLaunch("https://adactinhotelapp.com/");
//
//	}

	@Before
	public void beforeLogin() throws IOException, AWTException {
		driverLaunch("https://adactinhotelapp.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Herbert\\Desktop\\HerbertSamson\\MavenOne\\Output\\Screenshot\\Before.png");
		FileUtils.copyFile(source, dest);

	}

	@Test
	public void testOne() {
		WebElement username = driver.findElement(By.id("username"));
		sendkeys(username, "Herbert8489");
		WebElement password = driver.findElement(By.id("password"));
		sendkeys(password, "Sam8489752875");
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();

	}
	@Test
	public void testTwo() {
		WebElement username = driver.findElement(By.id("username"));
		sendkeys(username, "Herbert8489");
		WebElement password = driver.findElement(By.id("password"));
		sendkeys(password, "Sam8489752875");
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();

	}
	@Test
	public void testThree() {
		WebElement username = driver.findElement(By.id("username"));
		sendkeys(username, "Herbert8489");
		WebElement password = driver.findElement(By.id("password"));
		sendkeys(password, "Sam8489752875");
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();

	}

	@After
	public void afterLogin() {
		System.out.println("Screenshot");
		quitdriver();
	}

//	@AfterClass
//	public static void quitMethod() {
//		quitDriver();
//
//	}

}
