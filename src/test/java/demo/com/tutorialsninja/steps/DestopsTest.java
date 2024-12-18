package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections4.set.PredicatedNavigableSet;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class DestopsTest {

    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I Mouse hover on Desktops Tab.and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().clickOnDesktop();
    }

    @And("I Click on Show All Desktops")
    public void iClickOnShowAllDesktop() {
        new DesktopPAge().clickOnShowAllLaptops();
    }

    @And("Select Sort By position Name: Z to A")
    public void selectSortByPositionNameZToA() {
        new LaptopAndNotebookPage().selectSortByZToA("Name (Z - A)");
    }

    @Then("The Product will be arranged in Descending order.")
    public void theProductWillBeArrangedInDescendingOrder() {

    }

    @When("I Mouse hover on Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new DesktopPAge().clickOnCurrancy();

    }

    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new DesktopPAge().mouseHoverOnPoundCurrancy();
    }

    @And("I Mouse hover on Desktops Tab.")
    public void iMouseHoverOnDesktopsTab() {
        new HomePage().clickOnDesktop();
    }

    @And("I Select Sort By position Name: A to Z")
    public void iSelectSortByPositionNameAToZ() {
        new LaptopAndNotebookPage().selectSortByZToA("Name (A - Z)");
    }


    @And("I enter Qty using Select class.")
    public void iEnterQtyUsingSelectClass() {
        new ProductDetailPage().enterQuantity("1");
    }

    @And("I Click on “Add to Cart” button")
    public void iClickOnAddToCartButton() {
        new ProductDetailPage().clickOnAddToCartButton();
    }

    @And("I see the Message Success: You have added “<product>\" to your shopping cart!")
    public void iSeeTheMessageSuccessYouHaveAddedProductToYourShoppingCart(String Product) throws Throwable {

    }

    @And("I Click on link shopping cart displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new ProductDetailPage().clickOnShoppingCartLink();
    }

    @Then("I Verify the shopping CartText")
    public void iVerifyTheShoppingCartText() {
        // Assert.assertEquals(new ShoppingCartPage().getShoppingCartPageTitle(), "Shopping Cart");
    }

    @And("I Verify the Product name {string}")
    public void iVerifyTheProductName(String productName) {
        Assert.assertTrue(new ShoppingCartPage().getProductName().equalsIgnoreCase(productName),
                "Product name not matched");
    }

    @And("I Verify the Model {string}")
    public void iVerifyTheModel(String model) {
        Assert.assertTrue(new ShoppingCartPage().getProductModel().equalsIgnoreCase(model),
                "Model not matched");

    }

    @And("I Verify the Todal {string}")
    public void iVerifyTheTodal(String Total) {
        Assert.assertEquals(new ShoppingCartPage().getProductTotalPrise(), Total,
                "Total not matched");

    }


    @And("I select the product {string}")
    public void iSelectTheProduct(String product) {
        new DesktopPAge().SelectProduct(product);
    }

    @And("I enter Qty one using Select class.")
    public void iEnterQtyOneUsingSelectClass() {
        new ProductDetailPage().enterQuantity("1");
    }
}