package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCarPage {

//    @FindBy(how=How.LINK_TEXT,using = "buy + sell")
//    public WebElement buySell;

    @FindBy(how=How.XPATH,using = "//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/a")
    public WebElement buySell;

    @FindBy(how = How.LINK_TEXT,using = "reviews")
    public WebElement reviews;

    @FindBy(how=How.LINK_TEXT,using = "news")
    public WebElement news;

//    @FindBy(how=How.LINK_TEXT,using = "Search Cars")
//    public WebElement SearchCars;

    @FindBy(how=How.XPATH,using = "//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[1]/a")
    public WebElement searchCars;

    @FindBy(how=How.LINK_TEXT,using = "Used")
    public WebElement Used;


}
