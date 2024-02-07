package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_ManageInterestPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_ManageInterestPage;

public class CNA_MobileWeb_Android_ManageInterestSteps {

    CNA_MobileWeb_Android_ManageInterestPage CNAWeb_ManageInterestPage = new CNA_MobileWeb_Android_ManageInterestPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Given("I validate manage Interest button in My Feed Page in Android Mobile Web")
    public void iValidateManageInterestButtonInMyFeedPage() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateManageInterestButton());
    }

    @And("I click on Manage Interest Button in Android Mobile Web")
    public void iClickOnManageInterestButton() {
        CNAWeb_ManageInterestPage.clickOnManageInterestButton();
    }

    @Then("I validate Manage Interest Page header text {string} in Android Mobile Web")
    public void iValidateManageInterestPageHeaderText(String header) {
        Assert.assertTrue(CNAWeb_ManageInterestPage.verifyManageInterestPageHeader().contains(header));
    }

    @And("I validate Suggested For you section in Manage Interest Page in Android Mobile Web")
    public void iValidateSuggestedForYouSectionInManageInterestPage() {
        Assert.assertTrue( CNAWeb_ManageInterestPage.validateSuggestedTopicsSection());
    }

    @Then("I click on back button in Mage Interest Page in Android Mobile Web")
    public void iClickOnBackButtonInMageInterestPage() {
        CNAWeb_ManageInterestPage.clickOnBackButton();
    }

    @And("I validate if user is navigated back to My Feed Page in Android Mobile Web")
    public void iValidateIfUserIsNavigatedBackToMyFeedPage() {
        CNAWeb_ManageInterestPage.validateMyFeedPage();
    }

    @Then("I validate if Manage Feed page header is displayed in Android Mobile Web")
    public void iValidateIfManageFeedPageHeaderIsDisplayed() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateManageFeedPage());
    }

    @Then("I validate if My Topics and Add Topics tabs are displayed in Android Mobile Web")
    public void iValidateIfMyTopicsAndAddTopicsTabsAreDisplayed() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateMyTopicsAndAddTopicsTabs());
    }

    @Then("I validate if Topics List is displayed in Manage feed list in Android Mobile Web")
    public void iValidateIfTopicsListIsDisplayedInManageFeedList() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateTopicsList());
    }

    @And("I validate if Cancel and Save Preferences button is displayed in Manage Feed page in Android Mobile Web")
    public void iValidateIfCancelAndSavePreferencesButtonIsDisplayedInManageFeedPage() {
        Assert.assertTrue(CNAWeb_ManageInterestPage.validateCancelAndSavePreferencesButton());
    }

    @Then("I click on Add Topics List Tab in Android Mobile Web")
    public void iClickOnAddTopicsListTab() {
        CNAWeb_ManageInterestPage.clickAddTopicsTab();
    }

    @And("I Select a topics from Trending Topics at Add Topics Page in Android Mobile Web")
    public void iSelectATopicsFromTrendingTopicsAtAddTopicsPage() {
        CNAWeb_ManageInterestPage.clickOnATrendingTopic();
    }

    @Then("I click on Save Preferences button at Add Topics Page in Android Mobile Web")
    public void iClickOnSavePreferencesButtonAtAddTopicsPage() {
        CNAWeb_ManageInterestPage.clickSavePreferencesButton();
    }

    @And("I validate if user is navigated to My Feed Page in Android Mobile Web")
    public void iValidateIfUserIsNavigatedToMyFeedPage() {
        CNAWeb_ManageInterestPage.validateMyFeedPageMyTopics();
    }
}
