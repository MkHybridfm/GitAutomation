package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNALoginPage;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNAMyFeedPage;

public class iPadCNAMyFeedPageSteps {

    iPadCNAMyFeedPage cnaMyFeedPage = new iPadCNAMyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPadCNALoginPage cnaLoginPage = new iPadCNALoginPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();
    public int intListCount=0;
    public String strTopicName="";

    @And("I click on my feed section in iPad")
    public void iClickOnMyFeedSection() {
        cnaMyFeedPage.clickOnMyFeedSection();
    }

    @And("I re navigate on my feed section in iPad")
    public void iReNavigateOnMyFeedSection() {
        cnaMyFeedPage.clickOnMyFeedSection();
    }


    @And("I click on manage interests in iPad")
    public void iClickOnManageInterests() {
        cnaMyFeedPage.clickOnManageInterestsOnMyFeedSection();
    }

    @Then("I validate the list of topics on my feed section in iPad")
    public void iValidateTheListOfTopicsOnMyFeedSection() {
        Assert.assertTrue(cnaMyFeedPage.verifyListOfTopicsOnMyFeedSec());
    }

    @Then("I validate the topics details on my feed section in iPad")
    public void topicdetails() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetils());
    }

    @Then("I validate the topics publish time on my feed section in iPad")
    public void topicdetailstime() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetilsTime());
    }

    @Then("I validate the topics bookmark and share icon on my feed section in iPad")
    public void topicdetailbookmarkshare() {
        Assert.assertTrue(cnaMyFeedPage.verifyListDetilsbookmarkandShare());
    }

    @And("I click on one of the topic on my feed section in iPad")
    public void iClickOnOneOfTheTopicOnMyFeedSection() {
        cnaMyFeedPage.clickOnOneTopicOnMyFeedSec();
        //cnaMyFeedPage.clickSaveButton();
    }

    @Then("I validate the CNA logo, search button and settings icon in iPad")
    public void iValidateTheCNALogoSearchButtonAndSettingsIcon() {
       // Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }

    @Then("I Verify the CNA Logo in iPad")
    public void cnaLogo() {
        //Assert.assertTrue(cnaLoginPage.validateLogoOnCreateMeConnectAccountPage());
    }

    @Then("I Verify the Search Button in iPad")
    public void validateSearchButton() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
    }

    @Then("I Verify the Settings Icon in iPad")
    public void validateSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }


    @And("I validate header section as {string} in iPad")
    public void iValidateHeaderSectionAs(String text) {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedSecHeader().contains(text));
    }

    @Then("I validate following and bookmarked fields in iPad")
    public void iValidateFollowingAndBookmarkedFields() {
        Assert.assertTrue(cnaMyFeedPage.validateBookMarkedField());
        Assert.assertTrue(cnaMyFeedPage.validateFollowingField());
    }

    @Then("I validate the manage interests on the my feed sec in iPad")
    public void iValidateTheManageInterestsOnTheMyFeedSec() {
        Assert.assertTrue(cnaMyFeedPage.validateManageInterestsField());
    }


    @And("I click on save button in iPad")
    public void iClickOnSaveButton() {
        cnaMyFeedPage.clickSaveButton();
    }

    @Then("I get the list of the topics and select one topic in iPad")
    public void iGetTheListOfTheTopicsAndSelectOneTopic() {
        cnaMyFeedPage.selectAtopicOnManageIntersts();
    }

    @Then("I validate the my feed page observed with related articles for the selected topic in iPad")
    public void iValidateTheMyFeedPageObservedWithRelatedArticlesForTheSelectedTopic() {
        Assert.assertTrue(cnaMyFeedPage.verifyListOfArticlesOnMyFeedSec());

    }

    @And("I click on skip now button in iPad")
    public void iClickOnSkipNowButton() {
        cnaMyFeedPage.clickOnSkipNowButton();
    }

    @And("I click on bookmarked field on my feed sec in iPad")
    public void iClickOnBookmarkedFieldOnMyFeedSec() {
        cnaMyFeedPage.clickONBookmarkedField();
    }

    @And("I click on following filed in iPad")
    public void iClickOnFollowingFiled() {
        cnaMyFeedPage.clickOnFollowingField();
    }

    @And("I Verify Manage Feed Button My Feed Screen in iPad")
    public void verifyMyFeedButton() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedButton());
    }

    @And("I Verify the List of Feed in My Feed Screen in iPad")
    public void verifyMyFeedList() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyFeedList());
    }
    @And("I Click on three dots in Feed in My Feed Screen in iPad")
    public void clickOnThreeDots() {
        cnaMyFeedPage.clickonthreeDots();
    }

    @And("I Click on Manage Feed Button My Feed Screen in iPad")
    public void clickMyFeedButton() {
        cnaMyFeedPage.clickMyFeedButton();
    }

    @And("I Click {string} Tab in Manage Feed Screen in iPad")
    public void clickMyFeedButton(String strtab) {
        cnaMyFeedPage.clickMyFeedTab(strtab);
    }

    @And("I Verify My Topic List in Manage Feed Screen in iPad")
    public void VerifyMyFeedButton() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedList());
        intListCount=cnaMyFeedPage.getMyTopicFeedList();
        strTopicName=cnaMyFeedPage.getMyTopicFeedListName();

    }

    @And("I Reset My Topic List in Manage Feed Screen in iPad")
    public void ResetMyFeedButton() {
        cnaMyFeedPage.ResetMyFeedList();
    }

    @And("I Verify New Topic is Added under My Topics Tab in Manage Feed Screen in iPad")
    public void VerifyMyFeedListCount() {
        int intListCountUpdated=cnaMyFeedPage.getMyTopicFeedList();
        Assert.assertTrue(intListCountUpdated >intListCount);
    }

    @And("I Verify New Topic is Displayed in My Feed Screen in iPad")
    public void VerifyMyFeedNewTopic() {
        Assert.assertTrue(cnaMyFeedPage.verifyMyTopicFeedListName(strTopicName));
    }

    @And("I Verify Topics is Displayed in Top Stories Screen in iPad")
    public void VerifyMyTopicsInHomeScreen() {
        Assert.assertTrue(cnaMyFeedPage.verifyTopicsOptionInHomeScreen());
    }

    @And("I Verify List of Topics for My Feed in Home Screen in iPad")
    public void VerifyListofTopics() {
        Assert.assertTrue(cnaMyFeedPage.myTopicListHome());
    }

    @And("I Click on Create My Feed Button in Home Screen in iPad")
    public void clickCreateMyFeedButton() {
        cnaMyFeedPage.clickCreateMyFeedButton();
    }

    @And("I Select List of Topics for My Feed under Home Screen in iPad")
    public void SelectMyTopicFromHome() {
        cnaMyFeedPage.SelectMyTopicFromHome();
    }

    @And("I Click on View More Topics Button in Home Screen in iPad")
    public void clickViewMoreTopicsButton() {
        cnaMyFeedPage.ViewMoreTopics();
    }
}