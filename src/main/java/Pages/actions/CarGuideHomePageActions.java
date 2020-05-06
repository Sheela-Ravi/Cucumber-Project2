package Pages.actions;

import Pages.locators.SearchCarNextPage;
import Pages.locators.SearchCarPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumWebDriver;

public class CarGuideHomePageActions {
    SearchCarPage searchCarPage = null;

    public CarGuideHomePageActions() {
        this.searchCarPage = new SearchCarPage();
        PageFactory.initElements(SeleniumWebDriver.getDriver(), searchCarPage);
    }

    public void moveToBuySell()  {
        Actions action = new Actions(SeleniumWebDriver.getDriver());
        action.moveToElement(searchCarPage.buySell).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnSearchCars() {
        searchCarPage.searchCars.click();
    }

    public void clickOnUsed() {
        searchCarPage.Used.click();
    }

    public void clickOnNews() {
        searchCarPage.news.click();
    }

    public void clickOnReviews() {
        searchCarPage.reviews.click();
    }

}
