package com.pom.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Login_Adactin {
	
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath="//input[@id='login']")
	private WebElement Login;
	public Login_Adactin(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return Login;
	}
	
	

}
