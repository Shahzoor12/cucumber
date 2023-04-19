package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userSignup {
	
	WebDriver d;
	public userSignup(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	@FindBy(xpath="//a[@href='/login']")
	@CacheLookup
	WebElement signup;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@data-qa='signup-name']")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	@CacheLookup
	WebElement signupButton;
	
	@FindBy(xpath="//p[@style='color: red;']")
	@CacheLookup
	WebElement verification;
	
	public void signupButton()  {
		signup.click();
	}
	
	public void registeredEmail() {
		email.sendKeys("shahzoor18@gmail.com");
	}
	
	public void registeredName() {
		name.sendKeys("Shahazoor");
	}
	
	public void clickOnSignup() {
		signupButton.click();
	}
	
	public String errorMessage() {
		return verification.getText();
	}
	
	
}
