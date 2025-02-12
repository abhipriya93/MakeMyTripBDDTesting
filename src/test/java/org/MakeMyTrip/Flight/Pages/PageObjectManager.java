package org.MakeMyTrip.Flight.Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public LandingPageLogin landingPage;
    public HomePage homePage;
    public  WebDriver driver;
    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }

    public LandingPageLogin getLandingPage()
    {
        landingPage=new LandingPageLogin(driver);
        return landingPage;
    }

    public HomePage getHomePage()
    {
        homePage=new HomePage(driver);
        return homePage;
    }



}
