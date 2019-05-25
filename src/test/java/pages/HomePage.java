package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtil;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    WebDriverUtil webDriverUtil;


    public HomePage(WebDriver webDriver) {
        this.driver=webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#twotabsearchtextbox")
    public WebElement searchField;


    @FindBy(xpath="//div[@id='nav-search']//input[@type='submit']")
    public WebElement searchFieldButton;


    @FindBy(xpath="//span[@data-component-type='s-search-results']/div/div//a[@class='a-link-normal a-text-normal']")
    public List<WebElement> resultsList;


    public void searchItem(String item, WebElement searchField){
        webDriverUtil.enterStringInInputBox(searchField,item);
        webDriverUtil.clickOnWebElement(searchFieldButton);
    }




}
