package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNALoginPage;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAMyFeedPage;

public class iPhoneCNAMyFeedPageSteps {

    iPhoneCNAMyFeedPage cnaMyFeedPage = new iPhoneCNAMyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPhoneCNALoginPage cnaLoginPage = new iPhoneCNALoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();
    public int intListCount=0;
    public String strTopicName="";

    @And("I click on my feed section in iPhone")
    public void iClickOnMyFeedSection() {
        cnaMyFeedPage.clickOnMyFeedSection();
    }

    @And("I re navigate on my feed section in iPhone")
    public void iReNavigateOnMyFeedSection() {
        cnaMyFeedPage.clickOnMyFeedSection();
    }


    @And("I click on manage interests in iPhone")
    public void iClickOnManageInterests() {
        cnaMyFeedPage.clickOnManageInterestsOnMyFeedSection();
    }

    @Then("I validate the list of topics on my feed section in iPhone")
    public void iValidateTheListOfTopicsOnMyFeedSection() {
        Assert.assertTrue(cnaMyFeedPage.verifyListOfTopicsOnMyFeedSec());
    }

    @Then("I validate the topics details on my feed section in iPhone")
    public void topicdetails() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetils());
    }

    @Then("I validate the topics publish time on my feed section in iPhone")
    public void topicdetailstime() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetilsTime());
    }

    @Then("I validate the topics bookmark and share icon on my feed section in iPhone")
    public void topicdetailbookmarkshare() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetilsbookmarkandShare());
    }

    @And("I click on one of the topic on my feed section in iPhone")
    public void iClickOnOneOfTheTopicOnMyFeedSection() {
        cnaMyFeedPage.clickOnOneTopicOnMyFeedSec();
        //cnaMyFeedPage.clickSaveButton();
    }

    @Then("I validate the CNA logo, search button and settings icon in iPhone")
    public void iValidateTheCNALogoSearchButtonAndSettingsIcon() {
        Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }

    @Then("I Verify the CNA Logo in iPhone")
    public void cnaLogo() {
        Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
    }

    @Then("I Verify the Search Button in iPhone")
    public void validateSearchButton() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
    }

    @Then("I Verify the Settings Icon in iPhone")
    public void validateSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }


    @And("I validate header section as {string} in iPhone")
    public void iValidateHeaderSectionAs(String text) {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedSecHeader().contains(text));
    }

    @Then("I validate following and bookmarked fields in iPhone")
    public void iValidateFollowingAndBookmarkedFields() {
        Assert.assertTrue(cnaMyFeedPage.validateBookMarkedField());
        Assert.assertTrue(cnaMyFeedPage.validateFollowingField());
    }

    @Then("I validate the manage interests on the my feed sec in iPhone")
    public void iValidateTheManageInterestsOnTheMyFeedSec() {
        Assert.assertTrue(cnaMyFeedPage.validateManageInterestsField());
    }


    @And("I click on save button in iPhone")
    public void iClickOnSaveButton() {
        cnaMyFeedPage.clickSaveButton();
    }

    @Then("I get the list of the topics and select one topic in iPhone")
    public void iGetTheListOfTheTopicsAndSelectOneTopic() {
        cnaMyFeedPage.selectAtopicOnManageIntersts();
    }

    @Then("I validate the my feed page observed with related articles for the selected topic in iPhone")
    public void iValidateTheMyFeedPageObservedWithRelatedArticlesForTheSelectedTopic() {
        Assert.assertTrue(cnaMyFeedPage.verifyListOfArticlesOnMyFeedSec());

    }

    @And("I click on skip now button in iPhone")
    public void iClickOnSkipNowButton() {
        cnaMyFeedPage.clickOnSkipNowButton();
    }

    @And("I click on bookmarked field on my feed sec in iPhone")
    public void iClickOnBookmarkedFieldOnMyFeedSec() {
        cnaMyFeedPage.clickONBookmarkedField();
    }

    @And("I click on following filed in iPhone")
    public void iClickOnFollowingFiled() {
        cnaMyFeedPage.clickOnFollowingField();
    }

    @And("I Verify Manage Feed Button My Feed Screen in iPhone")
    public void verifyMyFeedButton() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedButton());
    }

    @And("I Verify the List of Feed in My Feed Screen in iPhone")
    public void verifyMyFeedList() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedList());
    }
    @And("I Click on three dots in Feed in My Feed Screen in iPhone")
    public void clickOnThreeDots() {
        cnaMyFeedPage.clickonthreeDots();
    }

    @And("I Click on Manage Feed Button My Feed Screen in iPhone")
    public void clickMyFeedButton() throws InterruptedException {
        cnaMyFeedPage.clickMyFeedButton();
    }

    @And("I Click {string} Tab in Manage Feed Screen in iPhone")
    public void clickMyFeedButton(String strtab) {
        cnaMyFeedPage.clickMyFeedTab(strtab);
    }

    @And("I Verify My Topic List in Manage Feed Screen in iPhone")
    public void VerifyMyFeedButton() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedList());
        intListCount=cnaMyFeedPage.getMyTopicFeedList();
        //strTopicName=cnaMyFeedPage.getMyTopicFeedListName();

    }

    @And("I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPhone")
    public void VerifyMyFeedListCount() {
        int intListCountUpdated=cnaMyFeedPage.getMyTopicFeedList();
        Assert.assertTrue(intListCountUpdated >intListCount);
    }

    @And("I Verify New Topic is Displayed in My Feed Screen in iPhone")
    public void VerifyMyFeedNewTopic() {
       // Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedListName(strTopicName));
    }

    @And("I Verify Topics is Displayed in Top Stories Screen in iPhone")
    public void VerifyMyTopicsInHomeScreen() {
        Assert.assertTrue(cnaMyFeedPage.verifyTopicsOptionInHomeScreen());
    }

    @And("I Verify List of Topics for My Feed in Home Screen in iPhone")
    public void VerifyListofTopics() {
        Assert.assertTrue(cnaMyFeedPage.myTopicListHome());
    }

    @And("I Click on Create My Feed Button in Home Screen in iPhone")
    public void clickCreateMyFeedButton() {
        cnaMyFeedPage.clickCreateMyFeedButton();
    }

    @And("I Select List of Topics for My Feed under Home Screen in iPhone")
    public void SelectMyTopicFromHome() {
        cnaMyFeedPage.SelectMyTopicFromHome();
    }

    @And("I Click on View More Topics Button in Home Screen in iPhone")
    public void clickViewMoreTopicsButton() {
        cnaMyFeedPage.ViewMoreTopics();
    }

    @And("I Reset My Topic List in Manage Feed Screen in iPhone")
    public void ResetMyFeedButton() {
        cnaMyFeedPage.ResetMyFeedList();
    }
}