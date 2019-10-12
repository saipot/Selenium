package com.selenium.project.com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmailLogin {
	
	WebDriver driver;
	@Test
	public void Gmail_Login() {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		System.out.println("working");
		driver=new ChromeDriver();
		driver.get("https:\\www.google.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.getTitle();
	}
	

}














