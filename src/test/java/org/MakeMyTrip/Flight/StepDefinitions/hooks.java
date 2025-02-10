package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @After
    public void closer()
    {
        System.out.println("Closing browser");
    }
}
