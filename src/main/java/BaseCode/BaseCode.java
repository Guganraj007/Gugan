package BaseCode;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCode {
	public static WebDriver driver;
	static Actions act;
	static Robot rb;
	
	
	
	public static void driverLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
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
	
	public WebElement findelementbyclassname(String className) {
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
	
	//JavaScript methods
	public WebElement sendkeys(String sendkey, String WebelementRef) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id(WebelementRef));
		js.executeScript(sendkey, element);
		return element;
	}
	
	public WebElement click(String clickscript, String scriptvalue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.id(scriptvalue));
		js.executeScript(clickscript, element);
		return element;
	}
	
	public WebElement getParticularValueScript(String arguments, String getText) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(getText));
		return element;
	}
	
	public WebElement scrollDown(String downpageSyntax, String textxpath) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(textxpath));
		js.executeScript(downpageSyntax, element);
		return element;
	}
	
	public WebElement scrollup(String uppagesyntax,String textxpath) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(textxpath));
		js.executeScript(uppagesyntax, element);
		return element;
	}
	
	public void switchwindow(String nameorHandles) {
		driver.switchTo().window(nameorHandles);
	}
	
	public String getparentwindowId(String windowhandle) {
		String windowHandle2 = driver.getWindowHandle();
		return windowHandle2;
	}
	
	public Set<String> getParentWindows(){
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	//Action class
	
	public void movetoelement(WebElement text) {
		act.moveToElement(text).perform();
	}
	
	public void doubleclick() {
		act.doubleClick();
	}
	
	public void rightclick() {
		act.contextClick();
	}
	
	public WebElement draganddrop(String source,String destiny) {
		WebElement element = driver.findElement(By.xpath(source));
		element.click();
		WebElement element2 = driver.findElement(By.xpath(destiny));
		act.dragAndDrop(element, element2).perform();
		return element;
	}
	
	public void keypressandrelease(WebElement element) {
		act.moveToElement(element).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
	}
	
	public void keypress(WebElement element) {
		act.keyDown(element,Keys.CONTROL).click().perform();
	}
	
	public void keyrelease(WebElement element) {
		act.keyUp(element,Keys.CONTROL).perform();
	}
	
	public void keyPress() {
		act.keyDown(Keys.CONTROL).click().perform();
	}
	
	public void keyrelease() {
		act.keyUp(Keys.CONTROL).perform();
	}
	
	//Robot class
	public void keypress(int num) {
		rb.keyPress(num);		
	}
	
	public void keyrelease(int num) {
		rb.keyRelease(num);
	}
	
	//Navigation method
	
	
	
	
	
	
	
	
	
	
	
	
	
}
