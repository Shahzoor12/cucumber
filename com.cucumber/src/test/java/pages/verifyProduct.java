package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyProduct {
	
	WebDriver d;
	public verifyProduct(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	@FindBy(xpath="//a[@href='/products']")
	@CacheLookup
	WebElement productButton;
	
	@FindBy(xpath="//h2[@class='title text-center']")
	@CacheLookup
	WebElement verify;
	
	@FindBy(xpath="//div[@class='features_items']")
	@CacheLookup
	WebElement prodList;
	
	@FindBy(xpath="//a[@href='/product_details/1']")
	@CacheLookup
	WebElement viewProd;
	
	@FindBy(xpath="//div[@class='product-information']//h2")
	@CacheLookup
	WebElement dress;
	
	@FindBy(xpath="//div[@class='product-information']//p")
	@CacheLookup
	WebElement category;
	
	@FindBy(xpath="//span[text()='Rs. 500']")
	@CacheLookup
	WebElement cost;
	
	public void productButtonClicked() {
		productButton.click();
	}
	
	public String verifyPageLoded() {
		return verify.getText();
	}
	public void productList() {
		prodList.isDisplayed();
	}
	public void firstProd() {
		viewProd.click();
	}
	
	public void dressType() {
		dress.isDisplayed();
	}
	
	public void dressCategory() {
		category.isDisplayed();
	}
	public void dressCost() {
		cost.isDisplayed();
	}

}
