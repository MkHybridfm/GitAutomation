package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_BookmarkPage;

public class CNAWeb_BookmarkSteps {

    CNAWeb_BookmarkPage CNAWeb_BookmarkPage = new CNAWeb_BookmarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on My feed section and validate My Feed page")
    public void iClickOnMyFeedSectionAndValidateMyFeedPage() throws InterruptedException {
        CNAWeb_BookmarkPage.clickMyFeedSection();
    }

    @When("I click on Bookmarked tab")
    public void iClickOnBookmarkedTab() {
        CNAWeb_BookmarkPage.clickOnBookmarkedTab();
    }

    @And("I validate if {string} message is displayed")
    public void iValidateIfMessageIsDisplayed(String message) {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateNoBookmarkMessage().contains(message));
    }

    @Then("I click on Bookmark option for a Top Story from Landing Page")
    public void iClickOnBookmarkOptionForATopStoryFromLandingPage() {
        CNAWeb_BookmarkPage.clickOnBookmarkOption_anonymous();
    }

    @Then("I click on Bookmark option for a Top Story")
    public void iClickOnBookmarkOptionForATopStory() {
        CNAWeb_BookmarkPage.clickOnBookmarkOption();
    }

    @And("I validate if user is redirected to Login Page")
    public void iValidateIfUserIsRedirectedToLoginPage() {
        CNAWeb_BookmarkPage.validateRedirectionToLoginPage();
    }

    @And("I validate if {string} toast message is displayed")
    public void iValidateIfToastMessageIsDisplayed(String BookmarkMessage) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkMessage().contains(BookmarkMessage));
    }

    @Then("I click on Bookmarked option")
    public void iClickOnBookmarkedOption() throws InterruptedException {
        CNAWeb_BookmarkPage.clickOnUnBookmarkOption();
    }


    @And("I validate if Bookmark button is changed to {string}")
    public void iValidateIfBookamarkButtonIsChangedTo(String message) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkedTextChange().contains(message));
    }


    @Then("I validate if bookmarked articles are present in Bookmark Page")
    public void iValidateIfBookmarkedArticlesArePresentInBookmarkPage() {
        CNAWeb_BookmarkPage.validateBookmarkedArticlesList();
    }

    @And("I click on three dots of Article in bookmarks")
    public void iClickOnThreeDotsOfArticleInBookmarks() throws InterruptedException {
        CNAWeb_BookmarkPage.clickthreedotsBookmarkMyFeedPage();
    }

    @And("I validate the status of Bookmark Option is {string}")
    public void iValidateTheStatusOfBookmarkOptionIs(String bookmarkmessage) throws InterruptedException {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateBookmarkMessageMyFeed().contains(bookmarkmessage));
    }

    @Then("I Click on unBookmark option")
    public void iClickOnUnBookmarkOption() {
        CNAWeb_BookmarkPage.clickOnUnBookmarkOptionMyFeedPage();
    }

    @And("I click on My feed section for loggedIn user")
    public void iClickOnMyFeedSectionForLoggedInUser() throws InterruptedException {
        CNAWeb_BookmarkPage.clickMyFeedSectionforLoggedInUser();
    }

    @Then("I click on a article from top stories")
    public void iClickOnAArticleFromTopStories() {
        CNAWeb_BookmarkPage.clickOnAArticleFromTopStories();
    }

    @And("I click on article bookmark icon from article detail page")
    public void iClickOnArticleBookmarkIconFromArticleDetailPage() throws InterruptedException {
        CNAWeb_BookmarkPage.clickOnBookmarkFromArticleDetailPage();
    }

    @And("I click on Bookmark Link from Profile popup screen")
    public void iClickOnBookmarkLinkFromProfilePopupScreen() {
        CNAWeb_BookmarkPage.clickOnBookmarkLinkFromProfilePopupScreen();
    }

    @Then("I validate if Trending Topics section is displayed")
    public void iValidateIfTrendingTopicsSectionIsDisplayed() {
        Assert.assertTrue(CNAWeb_BookmarkPage.validateTrendingTopicsSection());
    }

    @And("I Select a topics from Trending Topics")
    public void iSelectATopicsFromTrendingTopics() {
        CNAWeb_BookmarkPage.clickOnTopics();
    }

    @Then("I click on Save Preferences button")
    public void iClickOnSavePreferencesButton() {
        CNAWeb_BookmarkPage.clickSavePreferences();
    }


}
