package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchUsedCarPage {

    @FindBy(how= How.XPATH,using = "//*[@id=\"makes\"]")
    public WebElement usedCarMakeDropdown;

}
