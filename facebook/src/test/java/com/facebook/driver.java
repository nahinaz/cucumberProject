package com.facebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class driver {
	
	public static WebDriver driver; 
	
	
	@Before
	public static void setDriver(){
		
		if(driver == null){
			
			System.setProperty("webdriver.chrome.driver", "/Users/nahinaz/Desktop/chromedriver 6");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		base.driver = driver;
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	@After
	public void takeScreenshot(Scenario scenario){
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		
	}
	
}
