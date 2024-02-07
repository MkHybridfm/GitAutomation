package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Luxury_LandingPage;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_LandingPage;

public class CNA_MobileWeb_Android_Luxury_LandingPageSteps {
    CNA_MobileWeb_Android_Luxury_LandingPage CNALuxuryWeb_LandingPage = new CNA_MobileWeb_Android_Luxury_LandingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Given("I validate if all the Luxury landing Page components are present in Android Mobile Web")
    public void iValidateIfAllTheLuxuryLandingPageComponentsArePresent() {
        CNALuxuryWeb_LandingPage.validateLuxuryLandingPageComponents();
    }

    @When("I click on People Main Menu link in Android Mobile Web")
    public void iClickOnPeopleMainMenuLink() {
        CNALuxuryWeb_LandingPage.clickPeopleMainmenuLink();
    }

    @And("I validate if People Landing Page is displayed in Android Mobile Web")
    public void iValidateIfPeopleLandingPageIsDisplayed() {
        CNALuxuryWeb_LandingPage.validatePeopleLandingPage();
    }

    @When("I click on Experiences Main Menu link in Android Mobile Web")
    public void iClickOnExperiencesMainMenuLink() {
        CNALuxuryWeb_LandingPage.clickExperiencesMainmenuLink();
    }

    @And("I validate if Experiences Landing Page is displayed in Android Mobile Web")
    public void iValidateIfExperiencesLandingPageIsDisplayed() {
        CNALuxuryWeb_LandingPage.validateExperiencesLandingPage();
    }

    @Then("I validate if infinite scroll or fetching  more news functionality is working in Android Mobile Web")
    public void iValidateIfInfiniteScrollOrFetchingMoreNewsFunctionalityIsWorking() {
        CNALuxuryWeb_LandingPage.articleInfiniteScroll();
    }
}
