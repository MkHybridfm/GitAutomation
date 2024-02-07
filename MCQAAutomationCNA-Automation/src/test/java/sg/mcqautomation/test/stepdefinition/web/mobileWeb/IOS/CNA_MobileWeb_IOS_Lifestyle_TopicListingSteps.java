package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Lifestyle_TopicListingPage;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_Lifestyle_TopicListingPage;

public class CNA_MobileWeb_IOS_Lifestyle_TopicListingSteps {
    CNA_MobileWeb_IOS_Lifestyle_TopicListingPage CNALifestyleWeb_TopicListingPage = new CNA_MobileWeb_IOS_Lifestyle_TopicListingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I validate if Related Topics section is present in Article Page in IOS Mobile Web")
    public void iValidateIfRelatedTopicsSectionIsPresentInArticlePage() {
        CNALifestyleWeb_TopicListingPage.validateRelatedTopicsSection();
    }


    @Then("I click on the related Topics sub menu from Living Landing Page in IOS Mobile Web")
    public void iClickOnTheRelatedTopicsSubMenuFromLivingLandingPage() {
        CNALifestyleWeb_TopicListingPage.clickOnSubMenuInLivingLandingPage();
    }

    @And("I click on menu icon in IOS Mobile Web")
    public void iClickOnMenuIconInIOSMobileWeb() {
        CNALifestyleWeb_TopicListingPage.clickMenuIcon();
    }

    @Then("I click on a submenu from the menu in IOS Mobile Web")
    public void iClickOnASubmenuFromTheMenuInIOSMobileWeb() {
        CNALifestyleWeb_TopicListingPage.clickSubMenu();
    }
}
