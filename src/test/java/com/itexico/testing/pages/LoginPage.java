package com.itexico.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	private By usernameTxt;
	private By passwordTxt;
	private By loginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		this.usernameTxt =By.id("usr");
		this.passwordTxt = By.id("pwd");
		this.loginBtn = By.xpath("//input[@type='submit' and @value='Login']");
	}
	
	public void clearUserName() {
		this.driver.findElement(this.usernameTxt).clear();
	}
	
	public void setUserName(String username) {
		this.driver.findElement(this.usernameTxt).sendKeys(username);
	}
	
	public void clearPassword() {
		this.driver.findElement(this.passwordTxt).clear();
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.passwordTxt).sendKeys(password);
	}
	
	public void clickSubmit() {
		this.driver.findElement(this.loginBtn).click();
	}
}
