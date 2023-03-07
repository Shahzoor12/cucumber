package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.recommendedItems;
import pages.registerUser;
import pages.registerWhileCheckout;
import pages.removeProduct;
import pages.scrollUp;
import pages.usernameandpass;
import pages.verifyAfterLogin;
import pages.verifyProduct;
import pages.verifySubscription;

public class login {

	public WebDriver driver;
	public usernameandpass log;
	public registerUser user;
	public verifyProduct prod;
	public verifySubscription sub;
	public registerWhileCheckout reg;
	public removeProduct rem;
	public verifyAfterLogin ver;
	public recommendedItems rec;
	public scrollUp scr;

	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {

		System.setProperty("webdriver.chrome.driver","C:/Users/SHAGAFOO/git/repository/com.cucumber/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		log=new usernameandpass(driver);
		user=new registerUser(driver);
		prod=new verifyProduct(driver);
		sub=new verifySubscription(driver);
		reg=new registerWhileCheckout(driver);
		rem=new removeProduct(driver);
		ver=new verifyAfterLogin(driver);
		rec=new recommendedItems(driver);
		scr=new scrollUp(driver);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}


	@And("Navigate to url")
	public void navigate_to_url() {
		driver.navigate().to("https://automationexercise.com/");
	}


	@And("verify home page is visible")
	public void verify_home_page_is_visible() {
		String title=driver.getTitle();
		String expectedTitle="Automation Exercise";
		assertEquals(title,expectedTitle);
	}


	@And("Click on Login button")
	public void click_on_login_button() {
		log.loginButton();
	}


	@And("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		String loginTitle=log.verifyLogin();
		String expectedTitle="Login to your account";
		assertEquals(loginTitle,expectedTitle);
	}


	@When("Correct email and password is eneterd")
	public void correct_email_and_password_is_eneterd() {
		log.correctEmail();
		log.correctPassword();	
	}


	@And("Login button is clicked")
	public void login_button_is_clicked() {
		log.logingIn();
	}


	@And("verify Loggedin as username is visible")
	public void verify_loggedin_as_username_is_visible() {
		log.loginIsDisplayed();	
	}


	@Then("Click delete account button")
	public void click_delete_account_button() {
		log.clickDeleteButton();
	}


	@And("Verify account deleted")
	public void verify_account_deleted() {
		String accountDeleted=log.accountDeleted();
		String expectedText="ACCOUNT DELETED!";
		assertEquals(accountDeleted,expectedText);
	}

	                                           //TC005//

	@When("Singup button is clicked")
	public void singup_button_is_clicked() {

		user.signupButton();
	}

	@And("Verify New User Signup is visible")
	public void verify_new_user_signup_is_visible() {
		WebElement signupTitle=driver.findElement(By.xpath("//div[@class='signup-form']/h2"));
		String expectedTitle="New User Signup!";

		assertEquals(signupTitle.getText(),expectedTitle);
	}

	@And("Enter name and already registered email")
	public void enter_name_and_already_registered_email() {

		user.registeredName();
		user.registeredEmail();
	}

	@Then("Click Signup button")
	public void click_signup_button() {
		user.clickOnSignup();
	}

	@Then("Verify error message is visible")
	public void verify_error_message_is_visible() {
		String errorMessage=user.errorMessage();
		String expectedMessage="Email Address already exist!";

		assertEquals(errorMessage,expectedMessage);
	}
	
	//TC008//
	
	@When("Products button is clicked")
	public void products_button_is_clicked() {
	   
		prod.productButtonClicked();
	}

	@And("Verify user is navigated to All Products page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() {
	    
		String actualText=prod.verifyPageLoded();
		String expectedText="ALL PRODUCTS";
		
		assertEquals(expectedText, actualText);
	}

	@And("The products list is visible")
	public void the_products_list_is_visible() {

		prod.productList();
	}

	@Then("Click on View Product of first product")
	public void click_on_view_product_of_first_product() {
		
		prod.firstProd();
		
	}

	@And("User landed to product detail page")
	public void user_landed_to_product_detail_page() {
	    String webUrl=driver.getCurrentUrl();
	    String expectedUrl="https://automationexercise.com/product_details/1";
	    
	    assertEquals(expectedUrl,webUrl);
	}

	@And("Verify the detail is visible")
	public void verify_the_detail_is_visible() {
	    
		prod.dressType();
		prod.dressCategory();
		prod.dressCost();
	}
	
	
	//TC011//
	
	@When("Cart button is clicked")
	public void cart_button_is_clicked() {
	    sub.viewCart();
	}
		
	@And("Scroll down to footer")
	public void scroll_down_to_footer() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	@And("Verify text SUBSCRIPTION")
	public void verify_text_subscription() {
	    String actualText=sub.verifyingText();
	    String expectedText="SUBSCRIPTION";
	    
	    assertEquals(expectedText,actualText);
	}

	@Then("Email is entered and arrow button is clicked")
	public void email_is_entered_and_arrow_button_is_clicked() {
	   sub.enterEmail();
	   sub.nextArrow();
	}

	@And("Verify the message")
	public void verify_the_message() {
	    System.out.println("Hola");
	}

	//TC014//
	
	@And("Add product to cart")
	public void add_product_to_cart() {
		reg.addProductToCart();
		
	}
	
	@And("Click cart button")
	public void  click_cart_button() {
		reg.clickCartButton();
		
	}
	@And ("Verify that cart page is visible")
	public void verify_that_cart_page_is_visible() {
		reg.verifycartPage();
		
	}
	@And ("Click on checkout")
	public void click_on_checkout() {
		reg.clickOnCheckout();
		
	}
	@And("Click on register button")
	public void click_on_register_button() {
		reg.clickRegister();
		
	}
	@And("Fill all details")
	public void fill_all_details() {
		reg.details();
		
		
	}

	@And("Verify account created")
	public void verify_account_created() {
		reg.verifyAccountCreated();
		
	}
	@And("Verify Logged in as username at top")
	public void verify_Logged_in_as_username_at_top() {
		reg.verifyUserName();
		
	}
//	@When("Cart button is clicked")
//	public void cart_button_is_clicked() {
//		
//	}

	@When("Click Proceed to checkout button")
	public void click_proceed_to_checkout_button() {
	    reg.proceedToCheckout();
	}
	@When("Review your order")
	public void review_your_order() {
	    System.out.println("Order reviewed");
	}
	@When("Enter description in comment area and click place order")
	public void enter_description_in_comment_area_and_click_place_order() {
	   reg.descriptionAndOrder();
	}
	@Then("Enter payment details")
	public void enter_payment_details() {
	    reg.paymentDetails();
	}
	@And("click pay and confirm order")
	public void click_pay_and_confirm_order() {
	    reg.clickPayAndConfirm();
	}
	@And("Verify success message")
	public void verify_success_message() {
	    String actualMsg=reg.succeddMessage();
	    String expectedMsg="ORDER PLACED!";
	    
	    assertEquals(expectedMsg,actualMsg);
	}
	@And("Click Delete Account btn")
	public void click_delete_account_btn() {
	    reg.clickDeleteAcc();
	}
	@And("Verify Account is deleted")
	public void verify_account_is_deleted() {
		
		String actualMsg=reg.accountIsDeleted();
	    String expectedMsg="ACCOUNT DELETED!";
	    
	    assertEquals(expectedMsg,actualMsg);
	    
	}
	
	//TC017//
	
	@When("Product is added to cart")
	public void product_is_added_to_cart() {
		rem.productIsAddedToCart();
		
	}
	@And("Cart page is verified")
	public void cart_page_is_verified() {
	    rem.cartPageVerified();
	}
	@Then("Click the X button")
	public void click_the_x_button() {
	    rem.productRemoved();
	}
	@And("Verify the product has been removed")
	public void verify_the_product_has_been_removed() {
	    rem.verifyProductRemoved();
	    driver.quit();
	}
	
	//TC020//
	
	@And("Enter product name in search input and click search button")
	public void enter_product_name_in_search_input_and_click_search_button() {
	    ver.enterNameAndSearch();
	}
	@And("Verify searched product is visible")
	public void verify_searched_product_is_visible() {
	   ver.verifyProductVisible();
	}
	@And("Verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() {
	    ver.verifyAllProduct();
	}
	@And("Add those products to cart")
	public void add_those_products_to_cart() {
	    ver.addThoseProdToCart();
	}
	@Then("Click cart button and verify that products are visible in cart")
	public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
	    ver.clickCartIcon();
	    
	}
	@And("Click Login button and submit login details")
	public void click_login_button_and_submit_login_details() {
	   ver.login();
	}
	@And("Again go to Cart page")
	public void again_go_to_cart_page() {
	    ver.cart();
	}
	@And("Verify that those products are visible in cart after login as well")
	public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
	    ver.verifyCart();
	}
	
	//TC022//
	
	@And("Scroll to bottom of page")
	public void scroll_to_bottom_of_page() {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	@And("Verify Recommended items are visible")
	public void verify_recommended_items_are_visible() {
	    rec.verifyRecommendedItems();
	}
	@Then("CLick on Add to cart on Recommended products")
	public void c_lick_on_add_to_cart_on_recommended_products() {
	    rec.addToCart();
	}
	@And("CLick on view cart")
	public void c_lick_on_view_cart() {
	   rec.clickViewCart();
	}
	@And("Verify product is visible in cart")
	public void verify_product_is_visible_in_cart() {
	    rec.prodVisibileInCart();
	}

	//TC022//
	
	@Then("Click on arrow to move upwards")
	public void click_on_arrow_to_move_upwards() {
	    scr.clickOnArrow();
	}
	@And("Verify that page is scrolled up")
	public void verify_that_page_is_scrolled_up() {
	    scr.verifyScrolledUp();
	}


	
	
	
}



