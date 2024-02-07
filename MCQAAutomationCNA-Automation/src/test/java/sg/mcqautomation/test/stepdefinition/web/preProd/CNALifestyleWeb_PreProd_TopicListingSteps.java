package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALifestyleWeb_PreProd_TopicListingPage;

public class CNALifestyleWeb_PreProd_TopicListingSteps {
    CNALifestyleWeb_PreProd_TopicListingPage CNALifestyleWeb_TopicListingPage = new CNALifestyleWeb_PreProd_TopicListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I validate if Related Topics section is present in Article Page in PreProd")
    public void iValidateIfRelatedTopicsSectionIsPresentInArticlePage() {
        CNALifestyleWeb_TopicListingPage.validateRelatedTopicsSection();
    }


    @Then("I click on the related Topics sub menu from Living Landing Page in PreProd")
    public void iClickOnTheRelatedTopicsSubMenuFromLivingLandingPage() {
        CNALifestyleWeb_TopicListingPage.clickOnSubMenuInLivingLandingPage();
    }
}
