package com.pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	
	public static WebDriver driver;
	@FindBy(xpath="//select[@id='location']")
	private WebElement Location ;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement Hotels;
    @FindBy(xpath="//select[@id='room_type']")
	private WebElement Roomtypes;
    @FindBy(xpath="//select[@id='room_nos']")
    private WebElement no_Ofroom;
    @FindBy(xpath ="//input[@id='datepick_in']")
    private WebElement checkindate;
    @FindBy(xpath="//input[@id='datepick_out']")
    private WebElement checkoutdate;
    @FindBy(xpath="//select[@id='adult_room']")
    private WebElement adultroom;
    @FindBy(xpath="//select[@id='child_room']")
    private WebElement childroom;
    @FindBy(xpath="//input[@id='Submit']")
    private WebElement submit;
	public Search_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomtypes() {
		return Roomtypes;
	}
	public WebElement getNo_Ofroom() {
		return no_Ofroom;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
}
