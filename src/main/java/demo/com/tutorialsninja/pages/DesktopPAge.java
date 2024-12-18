package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopPAge extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPAge.class.getName());


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()=\"Show AllDesktops\"]")
    WebElement ShowallLaptops;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopTitle;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currancyDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProduct;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProductAfterFilter;

    @CacheLookup
    @FindBy(xpath = "//div[@class='caption']")
    WebElement DesktopProducts;

    public List<WebElement> getListsOfProduct() {
        return listOfProduct ;
    }

    public List<WebElement> getListsOfProductAfterFilter() {

        return listOfProductAfterFilter ;
    }

    public void SelectProduct(String Productname){
        clickOnElement(By.linkText(Productname));
    }


    public String getDesktopPageTitle() {
        return getTextFromElement(desktopTitle);
    }
    public void clickOnShowAllLaptops() {
        clickOnElement(ShowallLaptops);

    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = webElementList(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = webElementList(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnDesktop() {
        clickOnElement(desktopLink);

    }

    public void mouseHoverOnLaptopsAndNotebooks() {
        clickOnElement(laptopsAndNotebooksLink);

    }

    public void clickOnComponents() {
        clickOnElement(componentLink);

    }

    public void clickOnCurrancy() {
        clickOnElement(currancyDropDown);

    }

    public void mouseHoverOnPoundCurrancy() {
        mouseHoverToElementAndClick(poundLink);
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccountLink);
    }

}


