package steps;


import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.googleHomePage;

import java.util.concurrent.TimeUnit;

public class googleSearching extends googleBase {


    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {

      launchBrowser();
      // creating my first PR and merging it

    }

    @When("i enter the {string} in the search bar")
    public void i_enter_the_in_the_search_bar(String product_name) {

        googleHomePage gp = new googleHomePage(driver );
         gp.enterProductName(product_name);

    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
        googleHomePage gp = new googleHomePage(driver );
        gp.clickingOnSearchButton();


    }

    @Then("i can see the search result successfully.")
    public void i_can_see_the_search_result_successfully() {
        googleHomePage gp = new googleHomePage(driver );

        Assert.assertTrue(gp.isAllTabDisplayed());

        closeCurrent();

        closeAll();

    }



}
