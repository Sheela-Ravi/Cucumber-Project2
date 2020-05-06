package steps;

import Pages.actions.CarGuideHomePageActions;
import Pages.actions.CarSearchNextPageActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumWebDriver;

import java.util.List;

public class SearchCarSteps {

    CarGuideHomePageActions carGuideHomePageActions = new CarGuideHomePageActions();
    CarSearchNextPageActions carSearchNextPageActions = new CarSearchNextPageActions();

    @Given("^we are on the home page\"([^\"]*)\"$")
    public void weAreOnTheHomePage(String websiteURL) throws Throwable {
        SeleniumWebDriver.openPage(websiteURL);

    }

    @When("^I move to Buy\\+Sell Menu$")
    public void iMoveToBuySellMenu(List<String> list) {
        String menu =list.get(1);
        System.out.println("Menu selected is:"+menu);
        carGuideHomePageActions.moveToBuySell();

    }



    @And("^click on \"([^\"]*)\" link$")
    public void clickOnLink(String searchCars) throws Throwable {
        carGuideHomePageActions.clickOnSearchCars();
    }

    @And("^Select car make as \"([^\"]*)\" from Any Make dropdown$")
    public void selectCarMakeAsFromAnyMakeDropdown(String carMake) throws Throwable {
        carSearchNextPageActions.selectCarMake(carMake);

    }

    @And("^Select car model as \"([^\"]*)\" from Any Model dropdown$")
    public void selectCarModelAsFromAnyModelDropdown(String carModel) throws Throwable {
        carSearchNextPageActions.selectCarModel(carModel);
    }

    @And("^Select car location as \"([^\"]*)\" from Any Location dropdown$")
    public void selectCarMakeAsFromAnyLocationDropdown(String carLocation) {
        carSearchNextPageActions.selectCarLocation(carLocation);

    }

    @And("^Select car price as \"([^\"]*)\" from Any Price \\(max\\) dropdown$")
    public void selectCarPriceAsFromAnyPriceMaxDropdown(String carPrice) throws Throwable {
        carSearchNextPageActions.selectCarPrice(carPrice);
    }

    @And("^click on Find My Next Car button$")
    public void clickOnFindMyNextCarButton() {
        carSearchNextPageActions.clickOnSubmit();
    }

    @Then("^I see list of searched cars$")
    public void iSeeListOfSearchedCars() {

    }

    @And("^the page title is \"([^\"]*)\"$")
    public void thePageTitleIs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
