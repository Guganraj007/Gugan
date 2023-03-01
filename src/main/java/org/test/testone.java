package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseCode.BaseCode;

public class testone extends BaseCode {
	public static void main(String[] args) {
		driverLaunch("http://adactinhotelapp.com/");
		WebElement tag = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches')]"));
		System.out.println(tag.getText());
		
	}
}
