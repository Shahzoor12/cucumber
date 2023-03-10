package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brands {
	WebDriver d;
	public brands(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	
	
	@FindBy(xpath="//i[@class=\"fa fa-angle-up\"]")
	@CacheLookup
	WebElement scrollUp;
	
	@FindBy(xpath="//div[@class=\"col-sm-6\"]/h2")
	@CacheLookup
	WebElement verifyScrolledUp;
	
	public void clickOnArrow() {
		scrollUp.click();
	}

	public void verifyScrolledUp() {
		verifyScrolledUp.isDisplayed();
	}
}
