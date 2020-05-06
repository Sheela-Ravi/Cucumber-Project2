package Pages.actions;

import Pages.locators.SearchCarNextPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumWebDriver;

public class CarSearchNextPageActions {

    SearchCarNextPage searchCarNextPage = null;

    public CarSearchNextPageActions(){
        this.searchCarNextPage = new SearchCarNextPage();
        PageFactory.initElements(SeleniumWebDriver.getDriver(),searchCarNextPage);

    }

    public void selectCarMake(String carMake){
        Select selectCarMaker = new Select(searchCarNextPage.carMakeDropdown);
        selectCarMaker.selectByVisibleText(carMake);
    }

    public void selectCarModel(String carModel){
        Select selectCarModel = new Select(searchCarNextPage.carModelDropdown);
        selectCarModel.selectByVisibleText(carModel);
    }

    public void selectCarLocation(String carLocation){
        Select selectCarLocation = new Select(searchCarNextPage.carLocationDropdown);
        selectCarLocation.selectByVisibleText(carLocation);
    }
    public void selectCarPrice(String carPrice){
        Select selectCarPrice = new Select(searchCarNextPage.carPriceDropdown);
        selectCarPrice.selectByVisibleText(carPrice);
    }

    public void clickOnSubmit(){
        searchCarNextPage.FindMyNextCarButton.click();
    }



}
