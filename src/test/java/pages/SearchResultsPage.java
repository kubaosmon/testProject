package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtil;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    WebDriverUtil webDriverUtil;


    public SearchResultsPage(WebDriver webDriver) {
        this.driver=webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);
        PageFactory.initElements(driver, this);
    }


    public WebElement getAmazonTableOption(String amazonOption){
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
        return driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']//a[contains(text(), \"" + amazonOption + "\")]"));
    }

    @FindBy(xpath="//ul[@role='listbox']/li")
    public List<WebElement> filterDropDown;

    @FindBy(xpath="//span[@id='a-autoid-0-announce']")
    public WebElement filterDropDownButton;

    @FindBy(css="#imageBlock")
    public WebElement itemsImage;

    @FindBy(css="span[data-component-type=s-result-info-bar]")
    public WebElement infobar;



    @FindBy(xpath="//table[@id='productDetails_detailBullets_sections1']//a[contains(text(),'View shipping rates and policies')]")
    public WebElement viewShippingRates;

    @FindBy(xpath="//table[@id='productDetails_detailBullets_sections1']//a[@id='acrCustomerWriteReviewLink']")
    public WebElement firstToReview;

}
