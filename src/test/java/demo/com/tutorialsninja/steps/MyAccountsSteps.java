package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LoginPage;
import demo.com.tutorialsninja.pages.MyAccountPage;
import demo.com.tutorialsninja.pages.RegisterAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;

public class MyAccountsSteps {
    @Given("I am on Tutorial HomePage")
    public void iAmOnTutorialHomePage() {

    }

    @When("I Click on My Account Link.")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccount();

    }

    @And("I Call the method “selectMyAccountOptions” method and pass the parameter Register")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {
        //   new HomePage().selectMenu("Register");
        new RegisterAccountPage().clickOnregister();
    }

    @Then("I can see the Register account text")
    public void iCanSeeTheRegisterAccountText() {
        Assert.assertEquals(new RegisterAccountPage().getRegisterAccountTitle(), "Register Account");
    }

    @And("I click on Login")
    public void iClickOnLogin() {
        new MyAccountPage().ClickonLogin();
    }

    @Then("I can see the Returning Customer text")
    public void iCanSeeTheReturningCustomerText() {
        Assert.assertEquals(new MyAccountPage().getTextReturningCustomer(), "Returning Customer");
    }

    @And("I enter First Name")
    public void iEnterFirstName() {
        new RegisterAccountPage().enterFirstName("shaveta");
    }

    @And("I enter Last Name")
    public void iEnterLastName() {
        new RegisterAccountPage().enterLastName("sethi");
    }

    @And("I enter Email")
    public void iEnterEmail() {
        new RegisterAccountPage().enterEmail("sadhwans@gmail.com");
    }

    @And("I enter Telephpne number")
    public void iEnterTelephpneNumber() {
        new RegisterAccountPage().enterPhoneNumber("075374735475");
    }

    @And("I enter Password")
    public void iEnterPassword() {
        new RegisterAccountPage().enterPassword("Sadhwani");
    }

    @And("I enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterAccountPage().enterConfirmPassword("Sadhwani");
    }

    @And("I Select Subscribe Yes radio button")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterAccountPage().selectSubscribe("yes");
    }

    @And("I Click on Privacy Policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterAccountPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new RegisterAccountPage().clickOnContinueButton();
    }

    @And("I Verify the message Your Account Has Been Created!")
    public void iVerifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new RegisterAccountPage().getAccountRegistrationConformationMessage(),
                "Your Account Has Been Created!", "Your Account Not Created!");
    }


    @And("I click on Logout")
    public void iClickOnLogout() {
        new RegisterAccountPage().clickonLogout();
    }

    @And("I Verify the text Account Logout")
    public void iVerifyTheTextAccountLogout() {

    }

    @Then("I Click on next button")
    public void iClickOnNextButton() {
    }

    @And("I enter Email address")
    public void iEnterEmailAddress() {
        new LoginPage().enterEmail("sadhwans@gmail.com");
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogInButton();
    }

    @And("I verify the text My Account")
    public void iVerifyTheTextMyAccount() {

    }
}
