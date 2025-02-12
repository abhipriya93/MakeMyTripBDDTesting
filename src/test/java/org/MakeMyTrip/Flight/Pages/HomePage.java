package org.MakeMyTrip.Flight.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    By flightLogo=By.cssSelector("span.chFlights");
    By flightLogoActive=By.cssSelector("span.chFlights.active");
    By oneWayTripActive=By.xpath("//li[@data-cy='oneWayTrip' and @class='selected']");

    public boolean checkFlightLogo()
    {
        return driver.findElement(flightLogo).isDisplayed();
    }
    public boolean checkFlightLogoSelected()
    {
        return driver.findElement(flightLogoActive).isDisplayed();
    }
    public boolean checkOneWayTripSelected()
    {
        return driver.findElement(oneWayTripActive).isDisplayed();
    }
}
