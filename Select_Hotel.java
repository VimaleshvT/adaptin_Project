package com.pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radio;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	public Select_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCont() {
		return cont;
	}

}
