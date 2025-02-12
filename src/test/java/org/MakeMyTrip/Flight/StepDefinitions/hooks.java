package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.MakeMyTrip.Flight.Utils.DependencyResolver;
import org.openqa.selenium.WebDriver;

public class hooks {
    DependencyResolver globalRes;
    WebDriver driver;
    public hooks(DependencyResolver globalRes)
    {
        this.globalRes=globalRes;
        driver=this.globalRes.getDriver();
    }
    @After
    public void closer()
    {
        driver.quit();
    }
}
