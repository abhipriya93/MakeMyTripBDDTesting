package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.*;
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

    @AfterStep
    public void takeScreenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", scenario.getName()+" Failed");
        }

    }
    @After(order = 2)
    public void closer()
    {
        driver.quit();
    }
}
