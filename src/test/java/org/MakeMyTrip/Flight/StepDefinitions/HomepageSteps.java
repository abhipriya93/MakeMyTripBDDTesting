package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.en.Then;
import org.MakeMyTrip.Flight.Pages.HomePage;
import org.MakeMyTrip.Flight.Utils.DependencyResolver;
import org.testng.Assert;

public class HomepageSteps {
    DependencyResolver globalRes;
    HomePage homePage;

    public HomepageSteps(DependencyResolver globalRes)
    {
        this.globalRes=globalRes;
        homePage=globalRes.pageObjectManager.getHomePage();
    }

    @Then("flight and oneway trip should be selected by default")
    public void flightIconShouldGetDisplayed() {
        Assert.assertTrue(homePage.checkFlightLogoSelected());
        Assert.assertTrue(homePage.checkOneWayTripSelected());
    }

}
