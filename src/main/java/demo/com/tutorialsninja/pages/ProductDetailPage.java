package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "(//h1)[2]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement dateButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYear;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement> allDates;

    @CacheLookup
    @FindBy(name = "quantity")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement btnAddCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement productAddMsg;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingCart;


    public String getPageTitle() {
        return getTextFromElement(pageTitle);
    }

    public void selectDeliveryDate(String year, String month, String date) {
        //  selectDateFromDatePicker(year, month, date, dateButton, monthAndYear, nextButton, allDates);
    }

    public void enterQuantity(String qty) {
        sendTextToElementWithClearText(quantity, qty);
    }

    public void clickOnAddToCartButton() {

        mouseHoverToElementAndClick(btnAddCart);
    }

    public String getProductAddToCartSuccessMessage() {
        return getTextFromElement(productAddMsg);
    }

    public void clickOnShoppingCartLink() {
        mouseHoverToElementAndClick(shoppingCart);
    }

}

