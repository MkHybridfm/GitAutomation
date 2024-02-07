package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_MyFeedPage;

public class CNA_Android_Tab_MyFeedPageSteps {

    CNA_Android_Tab_MyFeedPage cnaMyFeedPage = new CNA_Android_Tab_MyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();
    public int intListCount=0;
    public String strTopicName="";



    @And("I validate if My Feed menu option is displayed in Android App in Tab")
    public void iValidateIfMyFeedMenuOptionIsDisplayedInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateMyFeedOption());
    }

    @When("I click on My Feed menu option in Android App in Tab")
    public void iClickOnMyFeedMenuOptionInAndroidApp() {
        cnaMyFeedPage.clickOnMyFeedSection();
    }

    @Then("I validate if My feed page is displayed in Android App in Tab")
    public void iValidateIfMyFeedPageIsDisplayedInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateMyFeedPageHeader());
    }

    @Then("I validate {string} info in My Feed Screen in Android App in Tab")
    public void iValidateInfoInMyFeedScreenInAndroidApp(String msg) throws InterruptedException {
        Assert.assertTrue(cnaMyFeedPage.validateSetUpMsgText().equalsIgnoreCase(msg));
    }

    @And("I validate if Manage Feed button is displayed in My feed page in Android App in Tab")
    public void iValidateIfManageFeedButtonIsDisplayedInMyFeedPageInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateManageInterestButtons());
    }

    @Then("I validate if search and settings Icon is displayed in My feed page in Android App in Tab")
    public void iValidateIfSearchAndSettingsIconIsDisplayedInMyFeedPageInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchAndSettingsOptions());
    }

    @And("I validate Filter option in My My feed page in Android App in Tab")
    public void iValidateFilterOptionInMyMyFeedPageInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateFilterOption());
    }

    @Then("I validate if My feeds article list is displayed in Android App in Tab")
    public void iValidateIfMyFeedsArticleListIsDisplayedInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateFollowingArticlesList());
    }

    @When("I Click on three dots in Feed in My Feed Screen in Android App in Tab")
    public void iClickOnThreeDotsInFeedInMyFeedScreenInAndroidApp() {
        cnaMyFeedPage.clickOnThreeDots();
    }

    @Then("I validate the bookmark options in Android App in Tab")
    public void iValidateTheBookmarkOptionsInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateBookmarkOption());
    }

    @Then("I validate the share options in Android App in Tab")
    public void iValidateTheShareOptionsInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateShareOption());
        cnaMyFeedPage.clickHeader();
    }

    @When("I Click on Manage Feed Button My Feed Screen in Android App in Tab")
    public void iClickOnManageFeedButtonMyFeedScreenInAndroidApp() {
        cnaMyFeedPage.clickOnManageInterestButton();
    }

    @Then("I Verify {string} Screen in Android App in Tab")
    public void iVerifyScreenInAndroidApp(String msg){
        Assert.assertTrue(cnaMyFeedPage.validateManageFeedPage().equalsIgnoreCase(msg));
    }

    @Then("I Verify {string} Tab in Manage Feed Screen in Android App in Tab")
    public void iVerifyTabInManageFeedScreenInAndroidApp(String tab) {
        Assert.assertTrue(cnaMyFeedPage.validateMyTopicsTab(tab));
    }

    @When("I Click {string} Tab in Manage Feed Screen in Android App in Tab")
    public void iClickTabInManageFeedScreenInAndroidApp(String tab) {
        cnaMyFeedPage.clickMyFeedTab(tab);
    }

    @And("I validate My Topics List in Manage Feed section in Android App in Tab")
    public void iValidateMyTopicsListInManageFeedSectionInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedList());
        intListCount=cnaMyFeedPage.getMyTopicFeedList();
        strTopicName=cnaMyFeedPage.getMyTopicFeedListName();
    }

    @Then("I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in Android App in Tab")
    public void iVerifyNewTopicIsAddedUnderMyTopicsTabInManageFeedScreenInAndroidApp() {
        int intListCountUpdated=cnaMyFeedPage.getMyTopicFeedList();
        Assert.assertTrue(intListCountUpdated >intListCount);
    }

    @Then("I Verify New Topic is Displayed in My Feed Screen in Android App in Tab")
    public void iVerifyNewTopicIsDisplayedInMyFeedScreenInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedListName(strTopicName));
    }

    @Then("I validate My Feed topic Lists and Options in Android App in Tab")
    public void iValidateMyFeedTopicListsAndOptions() {
        Assert.assertTrue(cnaMyFeedPage.validateSavePreferencesPageListingsAndOptions());
    }

    @Then("I scroll to My feed section under Top Stories in Android App in Tab")
    public void iScrollToMyFeedSectionUnderTopStoriesInAndroidApp() {
        cnaMyFeedPage.scrollToTopicsSectionHomePage();
    }

    @And("I validate if Topics Title and Add Topics context is displayed for My Feed in Home page in Android App in Tab")
    public void iValidateIfTopicsTitleAndAddTopicsContextIsDisplayedForMyFeedInHomePageInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateTopicsTitleAddTopicsText());
    }

    @Then("I validate if List of Topics is displayed with 5 trending topics in Android App in Tab")
    public void iValidateIfListOfTopicsIsDisplayedWithTrendingTopicsInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateFeedListInHomePage());
    }

    @And("I validate if Create my Feed and View More Topics button is displayed in Android App in Tab")
    public void iValidateIfCreateMyFeedAndViewMoreTopicsButtonIsDisplayedInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateCreateMyFeedAndViewMoreTopicsButton());
    }

    @Then("I select Topics from the List in Android App in Tab")
    public void iSelectTopicsFromTheListInAndroidApp() throws InterruptedException {
        cnaMyFeedPage.selectTopics();
    }

    @And("I click on Create My feed Button in Android App in Tab")
    public void iClickOnCreateMyFeedButton() {
        cnaMyFeedPage.clickOnCreateMyFeed();
    }

    @And("I click on View more Topics Button in Android App in Tab")
    public void iClickOnViewMoreTopicsButton() {
        cnaMyFeedPage.clickOnViewMoreTopicsButton();
    }

    @Then("I click on Login option from Settings menu in Android App in Tab")
    public void iClickOnLoginOptionFromSettingsMenu() {
        cnaMyFeedPage.clickOnLoginButtonFromSettings();
    }

    @Then("I scroll to From My feed section under Top Stories in Android App in Tab")
    public void iScrollToFromMyFeedSectionUnderTopStoriesInAndroidApp() {
        cnaMyFeedPage.scrollToFromMyFeedSection();
    }

    @And("I validate From My Feed Title in Andriod App in Tab")
    public void iValidateFromMyFeedTitleInAndriodAppInTab() {
        Assert.assertTrue(cnaMyFeedPage.validateFromMyFeedHeader());
    }

    @Then("I validate if Latest content list is displayed in From My feed scetion in Android App in Tab")
    public void iValidateIfLatestContentListIsDisplayedInFromMyFeedScetionInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateMyFeedArticleList());
    }

    @And("I validate if Go to My Feed Button is displayed in Android App in Tab")
    public void iValidateIfGoToMyFeedButtonIsDisplayedInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateGoToMyFeed());
    }

    @Then("I validate timestamp for articles in From My Feed section in Android App in Tab")
    public void iValidateTimestampForArticlesInFromMyFeedSectionInAndroidApp() {
        Assert.assertTrue(cnaMyFeedPage.validateTimestamp());
    }

    @And("I click on Go to My Feed Button in Android App in Tab")
    public void iClickOnGoToMyFeedButton() {
        cnaMyFeedPage.clickOnGoToMyFeed();
    }

    @Then("I unselect all the selected Topics from My Topics section in Android App in Tab")
    public void iUnselectAllTheSelectedTopicsFromMyTopicsSection() {
        cnaMyFeedPage.unselectAllTopics();
    }
}