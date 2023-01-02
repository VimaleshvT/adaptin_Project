package com.pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookin_Confimation {
	
	public static WebDriver driver;
	@FindBy(xpath="//a[.='Booked Itinerary']")
	private WebElement iti;
	public Bookin_Confimation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this); 
	}
	public WebElement getIti() {
		return iti;
	}
	

}
