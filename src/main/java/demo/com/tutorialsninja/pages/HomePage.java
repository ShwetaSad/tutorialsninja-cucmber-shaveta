package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import io.cucumber.java.ja.且つ;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

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
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement components;

    @FindBy(xpath = "//h2[normalize-space()=\"Components\"]")
    WebElement ComponentsPAgeTitle;

    public String getComponentsTitle() {
        return getTextFromElement(ComponentsPAgeTitle);
    }


    public String getPageTitleOfComponents() {
        return getTextFromElement(components);
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

