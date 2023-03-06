package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usernameandpass {

	WebDriver d;
	public usernameandpass(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

	}

	@FindBy(xpath="//a[@href='/login']") 
	@CacheLookup
	WebElement login;

	@FindBy(xpath="//input[@data-qa='login-email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath="//input[@data-qa='login-password']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath="//button[@data-qa='login-button']")
	@CacheLookup
	WebElement log;

	@FindBy(xpath="//div[@class='login-form']/h2")
	@CacheLookup
	WebElement accountVisible;

	@FindBy(xpath="//button[@data-qa='login-button']")
	@CacheLookup
	WebElement loginButton;

	@FindBy(xpath="//a[@href='/delete_account']")
	@CacheLookup
	WebElement deleteButton;

	@FindBy(xpath="//h2[@class='title text-center']/b")
	@CacheLookup
	WebElement verifyDeleted;

	public void loginButton() {
		login.click();
	}

	public void correctEmail() {
		email.sendKeys("SG@gmail.com");

	}

	public void correctPassword() {
		password.sendKeys("123");

	}
	public void logingIn() {
		log.click();
	}
	public String verifyLogin() {
		return accountVisible.getText();
	}

	public void loginButtonClicked() {
		loginButton.click();
	}
	public void clickDeleteButton() {
		deleteButton.click();
	}
	public String accountDeleted() {
		return verifyDeleted.getText();
	}

}
