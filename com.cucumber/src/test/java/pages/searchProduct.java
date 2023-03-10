package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchProduct {
	
	
	WebDriver d;
	public searchProduct(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	@FindBy(id="search_product")
	@CacheLookup
	WebElement input;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//h2[@class=\"title text-center\"]")
	@CacheLookup
	WebElement verifyprod;
	
	@FindBy(xpath="//div[@class=\"product-image-wrapper\"]")
	@CacheLookup
	WebElement allprod;
	
	@FindBy(xpath="(//a[@class=\"btn btn-default add-to-cart\"])[1]")
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath="//button[@data-dismiss='modal']")
	@CacheLookup
	WebElement continueshopping;
	
	@FindBy(xpath="(//a[@href=\"/view_cart\"])[1]")
	@CacheLookup
	WebElement cartIcon;
	
	@FindBy(xpath="//button[@class=\"disabled\"]")
	@CacheLookup
	WebElement verifyprodVisible;
	
	@FindBy(xpath="//a[@href=\"/login\"]")
	@CacheLookup
	WebElement log;
	
	@FindBy(xpath="(//a[@href='/view_cart'])[1]")
	@CacheLookup
	WebElement logCart;
	
	@FindBy(xpath="//button[@class=\"disabled\"]")
	@CacheLookup
	WebElement logVerify;
	
	public void enterNameAndSearch() {
		input.sendKeys("frozen tops for kids");
		search.click();
	}
	public void verifyProductVisible() {
		verifyprod.isDisplayed();
	}
	public void verifyAllProduct() {
		allprod.isDisplayed();
	}
	public void addThoseProdToCart() {
		addToCart.click();
		continueshopping.click();
	}
	public void clickCartIcon() {
		cartIcon.click();
		verifyprodVisible.isDisplayed();
	}
	public void login() {
		log.click();
		d.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("sg@gmail.com");
		d.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("123");
		d.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
	} 
	public void cart() {
		logCart.click();
	}
	public void verifyCart() {
		logVerify.isDisplayed();
	}
	

}
