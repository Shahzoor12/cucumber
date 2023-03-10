package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class featuresItems {
	
	WebDriver d;
	public featuresItems(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	
	@FindBy(xpath="//a[@href=\"/view_cart\"]")
	@CacheLookup
	WebElement cart;
	
	@FindBy(xpath="//div[@class='single-widget']/h2")
	@CacheLookup
	WebElement verify;
	
	@FindBy(id="susbscribe_email")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//button[@id='subscribe']")
	@CacheLookup
	WebElement next;
	
	@FindBy(xpath="//p[@class=\"text-center\"]/b")
	@CacheLookup
	WebElement verified;
	
	public void viewCart() {
		cart.click();
	}
	
	public String verifyingText() {
		return verify.getText();
	}
	public void enterEmail() {
		email.sendKeys("shahzoor18@gmail.com");
	}

	public void nextArrow() {
		next.click();
	}
	public void verifyEmial() {
		verified.isDisplayed();
	}
}
