package org.MakeMyTrip.Flight.Pages;

import org.MakeMyTrip.Flight.Utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageLogin {
    public WebDriver driver;
    Utilities util;
    public LandingPageLogin(WebDriver driver)
    {
        this.driver=driver;
        util=new Utilities(driver);
    }

    By close=By.xpath("//span[@data-cy='closeModal']");
    By mobileNumber=By.xpath("//input[@data-cy='userName']");
    By ad=By.xpath("//div[@class='sliderItemContent']");
    By personalLogin=By.xpath("//li[@data-cy='personalLogin']");
    By myBizAccount=By.xpath("//li[@data-cy='myBiz']");
    By googleIframe=By.xpath("//iframe[@title='Sign in with Google Button']");
    By googleLogin=By.xpath("//*[name()='svg']");

    public void closeLogin()
    {
        driver.findElement(close).click();
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public boolean adDisplayed()
    {
        return util.waitForElementDisplayed(ad,10).isDisplayed();
    }

    public boolean mobileNumberDisplayed()
    {
        return driver.findElement(mobileNumber).isDisplayed();
    }

    public String mobileNumberPlaceHolderDisplayed()
    {
      return driver.findElement(mobileNumber).getDomAttribute("placeholder");
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

    public String personalLoginSelection()
    {
        if(driver.findElement(personalLogin).isDisplayed())
        {
            return driver.findElement(personalLogin).getDomAttribute("class");
        }
        else return "fail";
    }

    public boolean myBizAccountSelection()
    {
        if(driver.findElement(myBizAccount).isDisplayed())
        {
            String temp= driver.findElement(myBizAccount).getDomAttribute("class");
            if(temp.contains("active"))
            {
                return false;
            }
            else return true;
        }
        else return false;
    }

    public boolean googleLogin()
    {
        driver.switchTo().frame(driver.findElement(googleIframe));
        boolean temp=driver.findElement(googleLogin).isDisplayed();
        driver.switchTo().parentFrame();
        return temp;
    }



}
