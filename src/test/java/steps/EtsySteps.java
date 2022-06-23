package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyHomePage;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;


public class EtsySteps {
    WebDriver driver;
    EtsyHomePage etsyHomePage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        etsyHomePage = new EtsyHomePage();
    }

    @Then("user should see below menu item links")
    public void user_should_see_below_menu_item_links(DataTable dataTable) {
        List<String> expectedText = dataTable.asList();
        for (int i = 0; i < 9; i++) {
            Assert.assertEquals(expectedText.get(i), etsyHomePage.mainNavigationItems.get(i).getText());
        }
    }
}