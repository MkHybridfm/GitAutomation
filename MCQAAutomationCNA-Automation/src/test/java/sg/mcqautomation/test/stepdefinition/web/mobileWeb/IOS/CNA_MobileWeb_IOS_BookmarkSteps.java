package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_BookmarkPage;

public class CNA_MobileWeb_IOS_BookmarkSteps {

    CNA_MobileWeb_IOS_BookmarkPage CNAWeb_BookmarkPage = new CNA_MobileWeb_IOS_BookmarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on My feed section and validate My Feed page in IOS Mobile Web")
    public void iClickOnMyFeedSectionAndValidateMyFeedPage() throws InterruptedException {
        CNAWeb_BookmarkPage.clickMyFeedSection();
    }

    @When("I click on Bookmarked tab in IOS Mobile Web")
    public void iClickOnBookmarkedTab() {
        CNAWeb_BookmarkPage.clickOnBookmarkedTab();
    }

    @And("I validate if {string} message is displayed in IOS Mobile Web")
    public void iValidateIfMessageIsDisplayed(String message) {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateNoBookmarkMessage().contains(message));
    }

    @Then("I click on Bookmark option for a Top Story from Landing Page in IOS Mobile Web")
    public void iClickOnBookmarkOptionForATopStoryFromLandingPage() {
        CNAWeb_BookmarkPage.clickOnBookmarkOption_anonymous();
    }

    @Then("I click on Bookmark option for a Top Story in IOS Mobile Web")
    public void iClickOnBookmarkOptionForATopStory() {
        CNAWeb_BookmarkPage.clickOnBookmarkOption();
    }

    @And("I validate if user is redirected to Login Page in IOS Mobile Web")
    public void iValidateIfUserIsRedirectedToLoginPage() {
        CNAWeb_BookmarkPage.validateRedirectionToLoginPage();
    }

    @And("I validate if {string} toast message is displayed in IOS Mobile Web")
    public void iValidateIfToastMessageIsDisplayed(String BookmarkMessage) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkMessage().contains(BookmarkMessage));
    }

    @Then("I click on Bookmarked option in IOS Mobile Web")
    public void iClickOnBookmarkedOption() throws InterruptedException {
        CNAWeb_BookmarkPage.clickOnUnBookmarkOption();
    }


    @And("I validate if Bookmark button is changed to {string} in IOS Mobile Web")
    public void iValidateIfBookamarkButtonIsChangedTo(String message) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkedTextChange().contains(message));
    }


    @Then("I validate if bookmarked articles are present in Bookmark Page in IOS Mobile Web")
    public void iValidateIfBookmarkedArticlesArePresentInBookmarkPage() {
        CNAWeb_BookmarkPage.validateBookmarkedArticlesList();
    }

    @And("I click on three dots of Article in bookmarks in IOS Mobile Web")
    public void iClickOnThreeDotsOfArticleInBookmarks() throws InterruptedException {
        CNAWeb_BookmarkPage.clickthreedotsBookmarkMyFeedPage();
    }

    @And("I validate the status of Bookmark Option is {string} in IOS Mobile Web")
    public void iValidateTheStatusOfBookmarkOptionIs(String bookmarkmessage) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkMessageMyFeed().contains(bookmarkmessage));
    }

    @Then("I Click on unBookmark option in IOS Mobile Web")
    public void iClickOnUnBookmarkOption() {
        CNAWeb_BookmarkPage.clickOnUnBookmarkOptionMyFeedPage();
    }

    @And("I click on My feed section for loggedIn user in IOS Mobile Web")
    public void iClickOnMyFeedSectionForLoggedInUser() throws InterruptedException {
        CNAWeb_BookmarkPage.clickMyFeedSectionforLoggedInUser();
    }

    @Then("I click on a article from top stories in IOS Mobile Web")
    public void iClickOnAArticleFromTopStories() {
        CNAWeb_BookmarkPage.clickOnAArticleFromTopStories();
    }

    @And("I click on article bookmark icon from article detail page in IOS Mobile Web")
    public void iClickOnArticleBookmarkIconFromArticleDetailPage() throws InterruptedException {
        CNAWeb_BookmarkPage.clickOnBookmarkFromArticleDetailPage();
    }

    @And("I click on Bookmark Link from Profile popup screen in IOS Mobile Web")
    public void iClickOnBookmarkLinkFromProfilePopupScreen() {
        CNAWeb_BookmarkPage.clickOnBookmarkLinkFromProfilePopupScreen();
    }

    @Then("I validate if Trending Topics section is displayed in IOS Mobile Web")
    public void iValidateIfTrendingTopicsSectionIsDisplayed() {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateTrendingTopicsSection());
    }

    @And("I Select a topics from Trending Topics in IOS Mobile Web")
    public void iSelectATopicsFromTrendingTopics() {
        CNAWeb_BookmarkPage.clickOnTopics();
    }

    @Then("I click on Save Preferences button in IOS Mobile Web")
    public void iClickOnSavePreferencesButton() {
        CNAWeb_BookmarkPage.clickSavePreferences();
    }

    @When("I click on three dots of a article from CNA Landing Page in IOS Mobile Web")
    public void iClickOnThreeDotsOfAArticleFromCNALandingPageInIOSMobileWeb() {
        CNAWeb_BookmarkPage.clickThreeDots();
    }
}
