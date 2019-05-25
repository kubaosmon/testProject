package step_definitions;

import cucumber.api.java.en.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.PageObject;
import utilities.Driver;
import utilities.WebDriverUtil;

public class StepDefinitionsUI {

    WebDriver driver = Driver.getDriver();
    PageObject pageObject = new PageObject(driver);
    WebDriverUtil webDriverUtil = new WebDriverUtil(driver);
    Logger log = Logger.getLogger(StepDefinitionsUI.class.getName());

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        driver.get(url);
        log.info("[INFO]: Going to "+url);
        driver.manage().window().maximize();

    }


//    Input text into a textbox.	Click button
    @When("user searches {string} in search box")
    public void user_searches_in_search_box(String item) {
        pageObject.homePage().searchItem(item, pageObject.homePage().searchField);
        log.info("[INFO]: Searching for "+item+" in amazon main search field");
    }


//    Select item from pulldown menu
    @Then("user sorts results by {string}")
    public void user_sorts_results_by(String filter) {

        webDriverUtil.waitForWebElementToAppear(pageObject.searchResultsPage().filterDropDownButton);
        pageObject.searchResultsPage().filterDropDownButton.click();
        log.info("[INFO]: filtering search results by: "+filter);
        for(int i = 0; i < pageObject.searchResultsPage().filterDropDown.size(); i++){
            if(pageObject.searchResultsPage().filterDropDown.get(i).getText().equalsIgnoreCase(filter)){
                pageObject.searchResultsPage().filterDropDown.get(i).click();
            }
        }

    }


//    Click page link
    @Then("user selects top result")
    public void user_selects_top_result() {
        webDriverUtil.waitForWebElementToAppear(pageObject.searchResultsPage().infobar);
        log.info("[INFO]: selecting top result: "+pageObject.homePage().resultsList.get(0).getText());
        pageObject.homePage().resultsList.get(0).click();
        webDriverUtil.waitForInMilliSeconds(2000);

    }


    @Then("user verifies image is displayed")
    public void user_verifies_image_is_displayed() {
        webDriverUtil.waitForWebElementToAppear(pageObject.searchResultsPage().itemsImage);
        Assert.assertTrue("No image displayed",webDriverUtil.verifyElementIsDisplayed(pageObject.searchResultsPage().itemsImage));


    }


//    Select value from a table
    @Then("user go to {string}")
    public void user_go_to(String AmazonTableOption) {
        webDriverUtil.waitForWebElementToAppear(pageObject.searchResultsPage().getAmazonTableOption(AmazonTableOption));
        pageObject.searchResultsPage().getAmazonTableOption(AmazonTableOption).click();
        log.info("[INFO]: going to "+AmazonTableOption);

    }

}
