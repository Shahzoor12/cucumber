package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recommendedItems {
	
	WebDriver d;
	public recommendedItems(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	
	@FindBy(xpath="(//h2[@class=\"title text-center\"])[2]")
	@CacheLookup
	WebElement recommended;
	
	@FindBy(xpath="//div[@id=\"recommended-item-carousel\"]//a[@class=\"btn btn-default add-to-cart\"]")
	@CacheLookup
	WebElement addToCartrecProd;
	
	@FindBy(xpath="(//a[@href=\"/view_cart\"])[2]")
	@CacheLookup
	WebElement cartIcon;
	
	@FindBy(xpath="//table[@class=\"table table-condensed\"]//tbody")
	@CacheLookup
	WebElement verify;
	
	public void verifyRecommendedItems() {
		recommended.isDisplayed();
	}
	public void addToCart() {
		addToCartrecProd.click();
	}
	public void clickViewCart() {
		cartIcon.click();
	}
	public void prodVisibileInCart() {
		verify.isDisplayed();
	}
	

}
