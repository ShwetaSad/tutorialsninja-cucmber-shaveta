package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class LaptopAndNotebookPage extends Utility {
   private static final Logger log = LogManager.getLogger(LaptopAndNotebookPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement LaptopAndNotBook;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()=\"Show AllLaptops & Notebooks\"]")
    WebElement ShowalllaptopsandNotebooks;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> listOfProductPrice;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> listOfProductAfterFilter;

    @CacheLookup
    @FindBy(xpath = "//select[@id=\"input-sort\"]")
    WebElement productSorting;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement clickOnCheckOurButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement verifyTextCheckOut;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement verifyTextNewCustomer;


    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement clickOnGuestCheckoutRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement clickOnContinueTab;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement Field1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement Field2;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement Field3;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement Field4;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement Field5;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement Field6;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement Field7;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement clickOnContinueButton;


    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentOnOrder;


    @CacheLookup
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement clickOnShoppingCard;


    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkTheTermsConditionsOfCheckBox;


    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement ClickOnContinueButton;

    public void clickOnCheckOutButton() {

        clickOnElement(clickOnCheckOurButton);

    }

    public String verifyCheckOutText() {
        return getTextFromElement(verifyTextCheckOut);

    }

    public String verifyTextNewCustomers() {
        return getTextFromElement(verifyTextNewCustomer);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(clickOnGuestCheckoutRadioButton);
    }

    public void clickOnContinueTab() {
        clickOnElement(clickOnContinueTab);
    }

    public void fillTheFieldName(String name) {
        sendTextToElement(Field1, name);

    }

    public void fillTheFieldLastName(String lastname) {
        sendTextToElement(Field2, lastname);

    }

    public void fillTheFieldEmail(String email) {
        sendTextToElement(Field3, email);


    }

    public void fillTheFieldTelePhone(String Phonenumber) {
        sendTextToElement(Field4, Phonenumber);
    }

    public void fillTheFieldAddress(String address) {
        sendTextToElement(Field5, address);
    }

    public void fillTheCity(String city) {
        sendTextToElement(Field6, city);
    }

    public void fillThePostCode(String code) {
        sendTextToElement(Field7, code);
    }

    public void clickOnContinueButton2() {
        clickOnElement(clickOnContinueButton);
    }

    public void addComments() {
        sendTextToElement(addCommentOnOrder, "This is comment for test case");
        clickOnElement(clickOnShoppingCard);
    }

    public void CheckTheTermsConditionsOfCheckBox() {
        clickOnElement(checkTheTermsConditionsOfCheckBox);
    }

    public void ClickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }


    public String getTitleOfLaptopAndNotBookPage() {

        return getTextFromElement(LaptopAndNotBook);
    }

    public List<WebElement> getListsOfProductPrice() {
        return listOfProductPrice;
    }

    public List<WebElement> getListsOfProductPriceAfterFilter() {
                return listOfProductAfterFilter;
    }
    public void ShowallLaptopsandNotebooks(){
        clickOnElement(ShowalllaptopsandNotebooks);
    }

    public void selectSortByZToA(String option) {
        selectByVisibleTextFromDropDown(productSorting, option);
    }

    public void clickOnYourSelectedProduct(String productName) {
        clickOnElement(By.linkText(productName));
    }

}

