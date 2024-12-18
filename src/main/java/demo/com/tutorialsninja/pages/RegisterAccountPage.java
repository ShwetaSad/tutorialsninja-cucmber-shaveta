package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement Register;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    List<WebElement> subScribe;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicy;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement btnContinue;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement confirmationMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueConfirmation;;

    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-menu-right\"]//a[normalize-space()=\"Logout\"]")
    WebElement logout;

    public void clickonLogout(){
        clickOnElement(logout);
    }


    public void clickOnregister(){
        clickOnElement(Register);
    }


    public String getRegisterAccountTitle() {
        return getTextFromElement(pageTitle);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lNmae) {
        sendTextToElement(lastName, lNmae);
    }

    public void enterEmail(String mail) {
        sendTextToElement(email, mail);
    }

    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumber, number);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void enterConfirmPassword(String cPass) {
        sendTextToElement(confirmPassword, cPass);
    }

    public void selectSubscribe(String option) {
        selectByContainsTextFromListOfElements(subScribe, option);
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton() {
        clickOnElement(btnContinue);
    }

    public String getAccountRegistrationConformationMessage() {
        return getTextFromElement(confirmationMessage);
    }

    public void clickOnContinueWithConfirmation() {
        clickOnElement(continueConfirmation);
    }

}

