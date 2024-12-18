package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()=\"Returning Customer\"]")
    WebElement returningcust;

    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-menu-right\"]//a[normalize-space()=\"Login\"]")
    WebElement Login;

    public void ClickonLogin(){
        clickOnElement(Login);
    }

    public String getTextReturningCustomer() {
        return getTextFromElement(returningcust);
    }
}

