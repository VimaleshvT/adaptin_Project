package com.pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_iti {
	
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='check_all']")
	private WebElement checkbox;
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancel;
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement Logout;
	
	
	public Booked_iti(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getCancel() {
		return cancel;
	}

	
}
