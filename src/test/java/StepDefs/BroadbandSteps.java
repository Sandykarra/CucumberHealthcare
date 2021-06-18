package StepDefs;

import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import Base.BasePage;
import Utils.Utils;
import io.cucumber.java.en.*;

public class BroadbandSteps {

	
	
	@Given("User should be on the home page")
	public void user_should_be_on_the_home_page() throws InterruptedException, IOException {

		 Utils.navigateToUrl();
	        System.out.println("Home Page Title is: " + Utils.getPageTitle());
	        BasePage.homePage.handleCookies();
	}

	@When("User navigate to Broadband Tab")
	public void user_navigate_to_broadband_tab() throws InterruptedException {
		Thread.sleep(2000);

BasePage.broandbandPage.selBroadband();
System.out.println("Broadband Page Title is: " + Utils.getPageTitle());
	}

	@Then("user should be on the {string}")
	public void user_should_be_on_the(String string) {
		String currentUrl =  Utils.getUrl();
        System.out.println("Broadband Page Url is: " + currentUrl);
        String BbandUrl="https://www.sky.com/broadband";
        Assertions.assertEquals(BbandUrl,currentUrl);


	}


	@When("User click on the compare broadband packages")
	public void user_click_on_the_compare_broadband_packages() {

BasePage.broandbandPage.clkCompareBroadbandPack();
	}

	@Then("User can see the {string} message on the page")
	public void user_can_see_the_message_on_the_page(String string) {
	    String message=BasePage.broandbandPage.txtJoinNow();
	    String Actual_message="Join now";
	    Assertions.assertEquals(message,Actual_message);

System.out.println("Tc passed!!!!!!!!!");
	}



}
