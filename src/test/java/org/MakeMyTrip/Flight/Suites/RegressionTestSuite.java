package org.MakeMyTrip.Flight.Suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/org/MakeMyTrip/Flight/Features",
        glue = "org.MakeMyTrip.Flight.StepDefinitions", monochrome = true)
class RegressionTestSuite extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[] [] scenarios()
    {
        return super.scenarios();
    }
}
