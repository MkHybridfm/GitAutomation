package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALifestyleWeb_TopicListingPage;

public class CNALifestyleWeb_TopicListingSteps {
    CNALifestyleWeb_TopicListingPage CNALifestyleWeb_TopicListingPage = new CNALifestyleWeb_TopicListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I validate if Related Topics section is present in Article Page")
    public void iValidateIfRelatedTopicsSectionIsPresentInArticlePage() {
        CNALifestyleWeb_TopicListingPage.validateRelatedTopicsSection();
    }


    @Then("I click on the related Topics sub menu from Living Landing Page")
    public void iClickOnTheRelatedTopicsSubMenuFromLivingLandingPage() {
        CNALifestyleWeb_TopicListingPage.clickOnSubMenuInLivingLandingPage();
    }
}
