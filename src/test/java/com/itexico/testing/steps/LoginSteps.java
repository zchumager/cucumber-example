package com.itexico.testing.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.itexico.testing.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	private String userDir;
	private String driverPath;
	private WebDriver driver;
	private LoginPage loginPage;
	
	public LoginSteps() {
		
		this.userDir = System.getProperty("user.dir");
		this.driverPath = this.userDir + "/src/test/resources/com/itexico/testing/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", this.driverPath);
		
		
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.loginPage = new LoginPage(this.driver);
	}
	
	@Given("^I open login form$")
	public void openLoginForm() {
		this.driver.get("http://testing-ground.scraping.pro/login");
	}
	
	@When("^I write a valid user name (.*)$")
	public void fillUsername(String username) {
		this.loginPage.clearUserName();
		this.loginPage.setUserName(username);
	}
	
	@And("^I write a valid user password ([^\"]*)")
	public void fillPassword(String password) {
		this.loginPage.clearPassword();
		this.loginPage.setPassword(password);
	}
	
	@And("^I click submit button$")
	public void clickSubmitButon() {
		this.loginPage.clickSubmit();
	}
	
	@Then("^Welcome message is displayed$")
	public void testWelcomeMessage() {
		Assert.assertEquals(this.driver.getCurrentUrl(), "http://testing-ground.scraping.pro/login?mode=welcome");
		
		this.driver.quit();
	}	
}
