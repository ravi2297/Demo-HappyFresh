package stepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.Home;

public class StepDef {

	public static WebDriver driver;
	public Home home;
	
	@Given("user open browser")
	public void user_open_browser() {
		home=new Home(driver);
	    home.LaunchBrowser();
	}

	@When("user open url as {string}")
	public void user_open_url_as(String url) {
	    home.openUrl(url);
	}
	
	@When("user add snacks product from categories")
	public void user_add_snacks_product_from_categories() {
	    home.addSnackProduct();
	}

	@When("user add product from best deals")
	public void user_add_product_from_best_deals() {
	    home.addProductBestDeals();
	}

	@Then("user search for a {string} and add it")
	public void user_search_for_a_product_and_add_it(String product) {
	   home.searchProduct(product);
	}

	@Then("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
	    home.clickAddtoCart();
	}

	@Then("user click on checkout")
	public void user_click_on_checkout() {
	    home.clickonCheckout();
	}

	@Then("user click on register here")
	public void user_click_on_register_here() {
	    home.clickonRegister();
	}

	@Then("user enter registration details")
	public void user_enter_registration_details() {
	   home.enterRegistrationDetails();
	}

	@Then("user click on register")
	public void user_click_on_register() {
	    home.clickonSubmitDetails();
	}

}
