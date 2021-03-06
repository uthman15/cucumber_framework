package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utils.Driver;

import java.math.BigInteger;

public class GoogleSteps {

    WebDriver driver;
    GoogleSearchPage googleSearchPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        googleSearchPage = new GoogleSearchPage();
    }


    //We will be writing our actual script steps here
    @When("user searches for {string} on Google")
    public void user_searches_for_on_google(String key) {
        //driver.findElement(By.name("q")).sendKeys(key + Keys.ENTER);
        googleSearchPage.searchInputBox.sendKeys(key + Keys.ENTER);
    }


    @Then("user should see results are more than {long}")
    public void userShouldSeeResultsAreMoreThan(long result) {
        Assert.assertTrue(Long.parseLong(googleSearchPage.resultBar.getText().replaceAll("[^0-9]", "")) > 0);

    }
}