package org.MakeMyTrip.Flight.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities{

    public WebDriver driver;
    WebDriverWait wait;
    public Utilities(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement waitForElementDisplayed(By path, int duration)
    {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        }
        catch (StaleElementReferenceException e)
        {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        }
    }

}
