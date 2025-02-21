package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.MakeMyTrip.Flight.Pages.HomePage;
import org.MakeMyTrip.Flight.Pages.LandingPageLogin;
import org.MakeMyTrip.Flight.Utils.DependencyResolver;
import org.testng.Assert;


public class LandingPageSteps {

    DependencyResolver globalRes;
    LandingPageLogin landingPageLogin;
    HomePage homePage;

    public LandingPageSteps(DependencyResolver globalRes)
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
        Assert.assertTrue(landingPageLogin.adDisplayed());
    }

    @When("^the landing page ad is closed$")
    public void the_landing_page_ad_is_closed() {
        landingPageLogin.closeLogin();
    }

    @Then("flight icon should get displayed")
    public void flightIconShouldGetDisplayed() {
        Assert.assertTrue(homePage.checkFlightLogo());
    }

    @Then("mobile number fields are displayed {string}")
    public void mobile_number_fields_are_displayed(String data) {
        Assert.assertTrue(landingPageLogin.mobileNumberDisplayed());
        Assert.assertEquals(landingPageLogin.mobileNumberPlaceHolderDisplayed(),data);
    }

    @Then("personal account login is {string}")
    public void personal_account_login_selected(String data) {
        Assert.assertEquals(landingPageLogin.personalLoginSelection(),data);
    }

    @Then("mybiz account login is {string}")
    public void myBiz_account_login_selected(String data) {
        Assert.assertTrue(landingPageLogin.myBizAccountSelection());
    }

    @Then("google login is displayed")
    public void google_login_selected() {
        Assert.assertTrue(landingPageLogin.googleLogin());
    }
}

