package org.MakeMyTrip.Flight.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageLogin {
    public WebDriver driver;

    public LandingPageLogin(WebDriver driver)
    {
        this.driver=driver;
    }

    By close=By.xpath("//span[@data-cy='closeModal']");
    By mobileNumber=By.xpath("//input[@data-cy='userName']");

    public void closeLogin()
    {
        driver.findElement(close).click();
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public boolean enterMobile(String data)
    {
        if(driver.findElement(mobileNumber).isDisplayed())
        {
            driver.findElement(mobileNumber).sendKeys(data);
            return true;
        }
        else return false;
    }

}
