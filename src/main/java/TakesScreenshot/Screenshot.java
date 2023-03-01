package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gugan\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\gugan\\eclipse-workspace\\org.selenium\\Output\\Amazon.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement firstphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		File first = firstphone.getScreenshotAs(OutputType.FILE);
		File firstproduct = new File("C:\\\\Users\\\\gugan\\\\eclipse-workspace\\\\org.selenium\\\\Output\\\\first.png");
		FileUtils.copyFile(first, firstproduct);
}
}
