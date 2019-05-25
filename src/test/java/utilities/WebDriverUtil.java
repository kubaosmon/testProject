package utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class WebDriverUtil{

    private final WebDriver webDriver;
    Logger log = Logger.getLogger(WebDriverUtil.class.getName());

    public WebDriverUtil(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected WebDriver getWebDriver() {
        return webDriver;
    }

    public List<WebElement> findElements(By by) {
        return webDriver.findElements(by);
    }

    public WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    public List<WebElement> getWebElements(By by) {
        return findElements(by);
    }

    public WebElement getWebElement(By by) {
        return findElement(by);
    }


    public void clickOnWebElement(WebElement webElement){
        webElement.click();
    }

    public void enterStringInInputBox(WebElement webElement, String inputString) {
        webElement.clear();
        webElement.sendKeys(inputString);
    }


    public void simulateKeyBoardAction(By by, Keys key) {
        getWebElement(by).sendKeys(key);
        waitForInMilliSeconds(2000L);
    }

    public void waitForInMilliSeconds(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            log.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    public void close() {
        webDriver.close();
    }

    public void quit() {
        webDriver.quit();
    }

    public String getWebElementText(WebElement webElement) {
        return webElement.getText()
                .replace("\n","")
                .replace("\t","")
                .trim();
    }


    public void waitForWebElementToAppear(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 5000L);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public Boolean verifyElementIsDisplayed(WebElement element) {
        return element.isDisplayed();
    }


    public void selectItemFromDropdownList(WebElement webElement, String value) {
        waitForWebElementToAppear(webElement);
        if(!value.trim().equals("")){
            Select dropdown = new Select(webElement);
            dropdown.selectByVisibleText(value);
        }
    }


}