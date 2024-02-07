package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_LandingPage;

public class CNALuxuryWeb_PreProd_LandingPageSteps {
    CNALuxuryWeb_PreProd_LandingPage CNALuxuryWeb_LandingPage = new CNALuxuryWeb_PreProd_LandingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I validate if all the Luxury landing Page components are present in PreProd")
    public void iValidateIfAllTheLuxuryLandingPageComponentsArePresent() {
        CNALuxuryWeb_LandingPage.validateLuxuryLandingPageComponents();
    }

    @When("I click on People Main Menu link in PreProd")
    public void iClickOnPeopleMainMenuLink() {
        CNALuxuryWeb_LandingPage.clickPeopleMainmenuLink();
    }

    @And("I validate if People Landing Page is displayed in PreProd")
    public void iValidateIfPeopleLandingPageIsDisplayed() {
        CNALuxuryWeb_LandingPage.validatePeopleLandingPage();
    }

    @When("I click on Experiences Main Menu link in PreProd")
    public void iClickOnExperiencesMainMenuLink() {
        CNALuxuryWeb_LandingPage.clickExperiencesMainmenuLink();
    }

    @And("I validate if Experiences Landing Page is displayed in PreProd")
    public void iValidateIfExperiencesLandingPageIsDisplayed() {
        CNALuxuryWeb_LandingPage.validateExperiencesLandingPage();
    }

    @Then("I validate if infinite scroll or fetching  more news functionality is working in PreProd")
    public void iValidateIfInfiniteScrollOrFetchingMoreNewsFunctionalityIsWorking() {
        CNALuxuryWeb_LandingPage.articleInfiniteScroll();
    }
}
