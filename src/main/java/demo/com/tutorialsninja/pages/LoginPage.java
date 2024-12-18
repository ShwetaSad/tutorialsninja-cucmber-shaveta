package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import jdk.jshell.execution.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement loginPageTile;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement btnLogin;

    public String getLoginPageTitle() {
        return getTextFromElement(loginPageTile);
    }

    public void enterEmail(String mail) {
        sendTextToElement(email, mail);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void clickOnLogInButton() {
        clickOnElement(btnLogin);
    }

}
