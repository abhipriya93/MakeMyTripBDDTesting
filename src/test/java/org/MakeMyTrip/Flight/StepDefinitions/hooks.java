package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.MakeMyTrip.Flight.Utils.DependencyResolver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class hooks {
    DependencyResolver globalRes;
    WebDriver driver;
    public hooks(DependencyResolver globalRes)
    {
        this.globalRes=globalRes;
        driver=this.globalRes.getDriver();
    }

    @AfterStep
    public void screenshotTaker(Scenario scenario)
    {
        TakesScreenshot taksScreen=(TakesScreenshot) driver;
        byte[] screenshot= taksScreen.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",screenshot.toString());
    }
    @After
    public void closer()
    {
        driver.quit();
    }
}
