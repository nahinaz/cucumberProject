package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.base;

public class signup extends base{
	
	public signup(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="u_0_f")
	public WebElement firstName;
}
