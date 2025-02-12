package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.MakeMyTrip.Flight.Pages.HomePage;
import org.MakeMyTrip.Flight.Pages.LandingPageLogin;
import org.MakeMyTrip.Flight.Utils.DependencyResolver;
import org.testng.Assert;


public class  LandingPage {

    DependencyResolver globalRes;
    LandingPageLogin landingPageLogin;
    HomePage homePage;

    public LandingPage(DependencyResolver globalRes)
    {
     this.globalRes=globalRes;
     landingPageLogin= globalRes.pageObjectManager.getLandingPage();
     homePage=globalRes.pageObjectManager.getHomePage();
    }

    @Given("user is at landing page {string}")
    public void user_navigates_to(String title) {
        Assert.assertEquals(landingPageLogin.getTitle(),title);
    }
    @When("^the landing page ad is displayed$")
    public void the_landing_page_ad_is_displayed() {
        System.out.println("step 2");
        landingPageLogin.closeLogin();
    }

    @Then("flight icon should get displayed")
    public void flightIconShouldGetDisplayed() {
        Assert.assertTrue(homePage.checkFlightLogo());
    }
}
