package org.MakeMyTrip.Flight.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LandingPage {
    public WebDriver driver;

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
       System.out.println("Step1");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
    }
    @When("^the landing page ad is displayed$")
    public void the_landing_page_ad_is_displayed() {
        System.out.println("step 2");
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

    }

    @Then("flight icon should get displayed")
    public void flightIconShouldGetDisplayed() {
        Assert.assertTrue(driver.findElement(By.cssSelector("span.chFlights")).isDisplayed());
    }
}
