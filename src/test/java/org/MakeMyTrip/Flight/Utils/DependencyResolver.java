package org.MakeMyTrip.Flight.Utils;

import org.MakeMyTrip.Flight.Pages.PageObjectManager;

public class DependencyResolver extends WebDriverManagement{

    public PageObjectManager pageObjectManager;
    public DependencyResolver()
    {
        pageObjectManager=new PageObjectManager(WebDriverInitialise(init_prop()));
    }
}
