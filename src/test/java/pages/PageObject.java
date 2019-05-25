package pages;

import org.openqa.selenium.WebDriver;

public class PageObject {
    private final WebDriver webDriver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(webDriver);
        }
        return homePage;
    }

    public SearchResultsPage searchResultsPage() {
        if (searchResultsPage == null) {
            searchResultsPage = new SearchResultsPage(webDriver);
        }
        return searchResultsPage;
    }




}
