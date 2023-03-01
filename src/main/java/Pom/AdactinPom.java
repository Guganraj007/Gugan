package Pom;

import java.awt.AWTException;

public class AdactinPom extends BaseCode {
	public static void main(String[] args) throws AWTException {
		driverLaunch("https://adactinhotelapp.com");
		maximizeMethod();
		implicitwait(30);
		PomOne login = new PomOne();
		login.loginPageData();
		login.booking();
		login.confirmpage();
		login.finalpage();
		login.orderid();
		
	}
}
