package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LaptopAndNotebookPage;
import demo.com.tutorialsninja.pages.ProductDetailPage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @Given("I am onHomepage")
    public void iAmOnHomepage() {

    }

    @When("I Mouse hover on Laptops & Notebooks Tab.and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooks();
    }

    @And("I Click on Show All Laptops & Notebooks")
    public void iClickOnShowAllLaptopsNotebooks() {
        new LaptopAndNotebookPage().ShowallLaptopsandNotebooks();
    }

    @And("I Select Sort By Price \\(High > Low)")
    public void iSelectSortByPriceHighLow() {
        new LaptopAndNotebookPage().selectSortByZToA("Price (High > Low)");
    }

    @Then("I can see the Product price will arrange in High to Low order")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder() {
    }

    @And("Select Product MacBook")
    public void selectProductMacBook() {
        new LaptopAndNotebookPage().clickOnYourSelectedProduct("MacBook");
    }

    @And("Verify the text MacBook")
    public void verifyTheTextMacBook() {
        Assert.assertEquals(new ProductDetailPage().getPageTitle(), "MacBook");
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new ProductDetailPage().clickOnAddToCartButton();
    }

    @And("I Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertTrue(new ProductDetailPage().getProductAddToCartSuccessMessage().contains("Success: You have added MacBook to your shopping cart!"),
                "Product not added to cart");
    }

    @And("I Click on link shopping cart display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductDetailPage().clickOnShoppingCartLink();
    }

    @And("I Verify the text Shopping Cart")
    public void iVerifyTheTextShoppingCart() {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartPageTitle().contains("Shopping Cart"));
    }

    @And("I Verify the Product name MacBook")
    public void iVerifyTheProductNameMacBook() {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), "MacBook",
                "Product name not matched");
    }

    @And("I Change Quantity to {int}")
    public void iChangeQuantityTo(int qty) {
        new ShoppingCartPage().changeQuantity("2");

    }

    @And("I Click on Update Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateButton();
    }

    @And("I Verify the Total ")
    public void iVerifyTheTotal£() {
        Assert.assertEquals(new ShoppingCartPage().getProductTotalPrise(), "£737.45",
                "Total not matched");
    }

    @And("Click on Checkout button")
    public void clickOnCheckoutButton() {
        new LaptopAndNotebookPage().clickOnCheckOutButton();
    }

    @And("I Verify the text Checkout")
    public void iVerifyTheTextCheckout() {
        //  Assert.assertEquals(new LaptopAndNotebookPage().verifyCheckOutText(), "Checkout");
    }

    @And("I Click on Guest Checkout radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        // new LaptopAndNotebookPage().clickOnGuestCheckoutRadioButton();
    }

    @And("I Click on Continue tab")
    public void iClickOnContinueTab() {
        // new LaptopAndNotebookPage().clickOnContinueTab();
    }

    @And("I Fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        //  new LaptopAndNotebookPage().fillTheFieldName("shaveta");
        // new LaptopAndNotebookPage().fillTheFieldLastName("sethi");
        // new LaptopAndNotebookPage().fillTheFieldEmail("sadhwans@gmail.com");
        // new LaptopAndNotebookPage().fillTheFieldAddress("1,LythamClose");
        //new LaptopAndNotebookPage().fillThePostCode("400101");
        // new LaptopAndNotebookPage().fillTheCity("Reading");
        //  new LaptopAndNotebookPage().fillTheFieldTelePhone("07913663573");


    }

    @And("I Click on Continue Button")
    public void iClickOnContinueButton() {
        //   new LaptopAndNotebookPage().clickOnContinueButton2();
    }

    @And("I Add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        // new LaptopAndNotebookPage().addComments();
    }

    @And("I Check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        //  new LaptopAndNotebookPage().CheckTheTermsConditionsOfCheckBox();
    }


    @Then("I Verify the message Warning: Payment method required!")
    public void iVerifyTheMessageWarningPaymentMethodRequired() {
    }


    @And("I Verify the Total {string}")
    public void iVerifyTheTotal(String arg0) {
    }

    @And("I Click on ContinueNext button")
    public void iClickOnContinueNextButton() {
        // new LaptopAndNotebookPage().ClickOnContinueButton();
    }
}
