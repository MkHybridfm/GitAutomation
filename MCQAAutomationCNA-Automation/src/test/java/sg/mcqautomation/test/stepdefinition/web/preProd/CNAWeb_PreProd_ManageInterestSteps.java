package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_ManageInterestPage;

public class CNAWeb_PreProd_ManageInterestSteps {

        CNAWeb_PreProd_ManageInterestPage CNAWeb_ManageInterestPage = new CNAWeb_PreProd_ManageInterestPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I validate manage Interest button in My Feed Page in PreProd")
    public void iValidateManageInterestButtonInMyFeedPage() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateManageInterestButton());
    }

    @And("I click on Manage Interest Button in PreProd")
    public void iClickOnManageInterestButton() {
        CNAWeb_ManageInterestPage.clickOnManageInterestButton();
    }

    @Then("I validate Manage Interest Page header text {string} in PreProd")
    public void iValidateManageInterestPageHeaderText(String header) {
        Assert.assertTrue(CNAWeb_ManageInterestPage.verifyManageInterestPageHeader().contains(header));
    }

    @And("I validate Suggested For you section in Manage Interest Page in PreProd")
    public void iValidateSuggestedForYouSectionInManageInterestPage() {
        Assert.assertTrue( CNAWeb_ManageInterestPage.validateSuggestedTopicsSection());
    }

    @Then("I click on back button in Mage Interest Page in PreProd")
    public void iClickOnBackButtonInMageInterestPage() {
        CNAWeb_ManageInterestPage.clickOnBackButton();
    }

    @And("I validate if user is navigated back to My Feed Page in PreProd")
    public void iValidateIfUserIsNavigatedBackToMyFeedPage() {
        CNAWeb_ManageInterestPage.validateMyFeedPage();
    }

    @Then("I validate if Manage Feed page header is displayed in PreProd")
    public void iValidateIfManageFeedPageHeaderIsDisplayedInPreProd() {
       Assert.assertTrue(CNAWeb_ManageInterestPage.validateManageFeedPage());
    }

    @Then("I validate if My Topics and Add Topics tabs are displayed in PreProd")
    public void iValidateIfMyTopicsAndAddTopicsTabsAreDisplayedInPreProd() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateMyTopicsAndAddTopicsTabs());
    }

    @Then("I validate if Topics List is displayed in Manage feed list in PreProd")
    public void iValidateIfTopicsListIsDisplayedInManageFeedListInPreProd() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateTopicsList());
    }

    @And("I validate if Cancel and Save Preferences button is displayed in Manage Feed page in PreProd")
    public void iValidateIfCancelAndSavePreferencesButtonIsDisplayedInManageFeedPageInPreProd() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateCancelAndSavePreferencesButton());
    }

    @Then("I click on Add Topics List Tab in PreProd")
    public void iClickOnAddTopicsListTabInPreProd() {
        CNAWeb_ManageInterestPage.clickAddTopicsTab();
    }

    @And("I Select a topics from Trending Topics at Add Topics Page in PreProd")
    public void iSelectATopicsFromTrendingTopicsAtAddTopicsPageInPreProd() {
        CNAWeb_ManageInterestPage.clickOnATrendingTopic();
    }

    @Then("I click on Save Preferences button at Add Topics Page in PreProd")
    public void iClickOnSavePreferencesButtonAtAddTopicsPageInPreProd() {
        CNAWeb_ManageInterestPage.clickSavePreferencesButton();
    }

    @And("I validate if user is navigated to My Feed Page in PreProd")
    public void iValidateIfUserIsNavigatedToMyFeedPageInPreProd() {
        CNAWeb_ManageInterestPage.validateMyFeedPageMyTopics();
    }
}
