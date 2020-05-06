package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCarNextPage {

    @FindBy(how= How.XPATH,using = "//*[@id=\"makes\"]")
    public WebElement carMakeDropdown;

    @FindBy(how= How.XPATH,using = "//*[@id=\"models\"]")
    public WebElement carModelDropdown;

    @FindBy(how= How.XPATH,using = "//*[@id=\"locations\"]")
    public WebElement carLocationDropdown;

    @FindBy(how= How.XPATH,using = "//*[@id=\"priceTo\"]")
    public WebElement carPriceDropdown;

    @FindBy(how=How.XPATH,using ="//*[@id=\"search-submit\"]")
    public WebElement FindMyNextCarButton;

}