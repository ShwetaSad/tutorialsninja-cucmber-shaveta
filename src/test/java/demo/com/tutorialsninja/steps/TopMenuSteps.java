package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.DesktopPAge;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LaptopAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I Mouse hover on “Desktops” Tab and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().clickOnDesktop();
    }

    @And("I select Show all Desktops")
    public void iSelectShowAllDesktops() {
        new DesktopPAge().clickOnShowAllLaptops();

    }

    @Then("I can see the text Desktops")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopPAge().getDesktopPageTitle(),"Desktops");
    }




    @And("I select Show all Laptops and Notebooks")
    public void iSelectShowAllLaptopsAndNotebooks() {
            new LaptopAndNotebookPage().ShowallLaptopsandNotebooks();
    }

    @Then("I should see the Text Laptops And Notebooks")
    public void iShouldSeeTheTextLaptopsAndNotebooks() {
        new LaptopAndNotebookPage().getTitleOfLaptopAndNotBookPage();
    }

    @When("I mouse hover on LaptopsAndNotebooks Tab and Click")
    public void iMouseHoverOnLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooks();
    }


    @And("I select Show all Components")
    public void iSelectShowAllComponents() {
   //new LaptopAndNotebookPage().clickOnYourSelectedProduct("Show AllComponents");
   new HomePage().selectMenu("Show AllComponents");
    }

    @Then("I should see the Page Tilte Components")
    public void iShouldSeeThePageTilteComponents() {
        new HomePage().getComponentsTitle();

    }


    @When("I mouse hover on Components Tab and click")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().clickOnComponents();
    }
}
