package org.MakeMyTrip.Flight.Suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/org/MakeMyTrip/Flight/Features",
        glue = "org.MakeMyTrip.Flight.StepDefinitions", monochrome = true)
class RegressionTestSuite extends AbstractTestNGCucumberTests {
}
