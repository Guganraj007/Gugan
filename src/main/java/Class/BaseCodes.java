package Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCodes {
	public static WebDriver driver;
	
	
	
	public static void driverLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void quitdriver() {
		driver.quit();
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void currentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void closedriver() {
		driver.close();
	}
	
	public static WebElement findelementbyid(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public WebElement classname(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}
	
	public static WebElement findelementbyname(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public static WebElement tagname(String tagname) {
		WebElement element = driver.findElement(By.tagName(tagname));
		return element;
	}
	
	public static void sendkeys(WebElement element, String key) {
		element.sendKeys(key);
	}
	
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static String gettagname(WebElement element) {
		String tagname = element.getTagName();
		return tagname;
	}
	
	public static String getattributevalue(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	
	public WebElement xpathValue(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}
	
	public static void implicitlywait(long time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public WebElement SendKeys(String sendkey, String WebelementRef) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id(WebelementRef));
		js.executeScript(sendkey, element);
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
}
