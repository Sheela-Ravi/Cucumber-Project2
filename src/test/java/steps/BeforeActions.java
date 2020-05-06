package steps;

import cucumber.api.java.Before;

import utils.SeleniumWebDriver;

public class BeforeActions  {

    @Before
    public static void setUp() {
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        System.out.println("Before");
        SeleniumWebDriver.setUpDriver();
    }
}

