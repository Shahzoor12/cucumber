package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerWhileCheckout {
	
	WebDriver d;
	public registerWhileCheckout(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);

}
	
	@FindBy(xpath="//a[@data-product-id='1']")
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath="(//a[@href=\"/view_cart\"])[1]")
	@CacheLookup
	WebElement cart;
	
	@FindBy(xpath="//button[@data-dismiss='modal']")
	@CacheLookup
	WebElement continueshopping;
	
	@FindBy(xpath="//li[@class='active']")
	@CacheLookup
	WebElement verifyCart;
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	@CacheLookup
	WebElement checkout;
	
	@FindBy(xpath="(//a[@href='/login'])[2]")
	@CacheLookup
	WebElement regiter;
	
	@FindBy(xpath="//h2[@class=\"title text-center\"]")
	@CacheLookup
	WebElement verifyAccCreated;
	
	@FindBy(xpath="//i[@class=\"fa fa-user\"]")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//a[@class=\"btn btn-default check_out\"]")
	@CacheLookup
	WebElement checkoutbtn;
	
	@FindBy(xpath="//textarea[@class=\"form-control\"]")
	@CacheLookup
	WebElement description;
	
	@FindBy(xpath="//a[@class=\"btn btn-default check_out\"]")
	@CacheLookup
	WebElement placeorder;
	
	@FindBy(xpath="//button[@data-qa=\"pay-button\"]")
	@CacheLookup
	WebElement payAndConfirm;
	
	@FindBy(xpath="//h2[@data-qa=\"order-placed\"]")
	@CacheLookup
	WebElement success;
	
	@FindBy(xpath="//a[@href=\"/delete_account\"]")
	@CacheLookup
	WebElement deleteAcc;
	
	@FindBy(xpath="//h2[@class=\"title text-center\"]")
	@CacheLookup
	WebElement verifydeleted;
	
	
	public void addProductToCart() {
		addToCart.click();
		continueshopping.click();
	}
	public void clickCartButton() {
		cart.click();
	}
	public void verifycartPage() {
		verifyCart.isDisplayed();
	}
	public void clickOnCheckout() {
		checkout.click();
	}
	public void clickRegister() {
		regiter.click();
	}
	public void details() {
		d.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("shahazoor");
		d.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("gafoor@gmail.com");
		d.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		d.findElement(By.xpath("//input[@data-qa=\"password\"]")).sendKeys("123");
		d.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("shahazoor");
		d.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("Gafoor");
		d.findElement(By.xpath("//input[@data-qa=\"address\"]")).sendKeys("Bangalore");
		d.findElement(By.xpath("//input[@data-qa=\"state\"]")).sendKeys("Karnataka");
		d.findElement(By.xpath("//input[@data-qa=\"city\"]")).sendKeys("Bangalore");
		d.findElement(By.xpath("//input[@data-qa=\"zipcode\"]")).sendKeys("560027");
		d.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]")).sendKeys("1234567");
		d.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
		d.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
	}
	public void verifyAccountCreated() {
		verifyAccCreated.click();
	}

	public void verifyUserName() {
		username.isDisplayed();
	}
	
	public void proceedToCheckout() {
		checkoutbtn.click();
	}
	public void descriptionAndOrder() {
		description.sendKeys("Order succesfully palced");
		placeorder.click();
	}
	public void paymentDetails() {
		d.findElement(By.xpath("//input[@data-qa=\"name-on-card\"]")).sendKeys("Shahazoor");
		d.findElement(By.xpath("//input[@data-qa=\"card-number\"]")).sendKeys("12345678");
		d.findElement(By.xpath("//input[@data-qa=\"cvc\"]")).sendKeys("123");
		d.findElement(By.xpath("//input[@data-qa=\"expiry-month\"]")).sendKeys("07");
		d.findElement(By.xpath("//input[@data-qa=\"expiry-year\"]")).sendKeys("2025");
		
	}
	public void clickPayAndConfirm() {
		payAndConfirm.click();
	}
	
	public String succeddMessage() {
		return success.getText();
	}
	
	public void clickDeleteAcc() {
		deleteAcc.click();
	}
	public String accountIsDeleted() {
		return verifydeleted.getText();
	}
	
}
