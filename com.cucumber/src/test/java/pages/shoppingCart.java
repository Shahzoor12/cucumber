package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingCart {
	
	WebDriver d;
	public shoppingCart(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	
	@FindBy(xpath="//a[@data-product-id='1']")
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath="//button[@data-dismiss='modal']")
	@CacheLookup
	WebElement continueshopping;
	
	@FindBy(xpath="//li[@class='active']")
	@CacheLookup
	WebElement verifyCart;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	@CacheLookup
	WebElement remove;
	
	@FindBy(xpath="//p[@class='text-center']/b")
	@CacheLookup
	WebElement verifyRemoved;
	
	public void productIsAddedToCart() {
		addToCart.click();
		continueshopping.click();
	}
	public void cartPageVerified() {
		verifyCart.isDisplayed();
	}
	public void productRemoved() {
		remove.click();
	}
	public void verifyProductRemoved() {
		verifyRemoved.isDisplayed();
	}
	

}
