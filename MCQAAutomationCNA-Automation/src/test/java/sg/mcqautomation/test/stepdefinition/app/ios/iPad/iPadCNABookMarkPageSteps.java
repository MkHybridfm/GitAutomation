package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNABookMarkPage;

public class iPadCNABookMarkPageSteps {

    iPadCNABookMarkPage cnaBookMarkPage = new iPadCNABookMarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on three dots of article in iPad")
    public void iClickOnThreeDotsOfArticle() {
        cnaBookMarkPage.clickOnThreeDots();
    }

    @Then("I click on bookmark button on article in iPad")
    public void iClickOnBookmarkButtonOnArticle() {
        cnaBookMarkPage.clickOnBookMarkEpisodeOnHomePage();
    }

    @And("I click on unBookmark on article page in iPad")
    @And("I click on bookmark on article page in iPad")
    public void iClickOnBookmarkOnArticlePage() throws InterruptedException {
        cnaBookMarkPage.clickOnBookMarkEpisodeOnArticlePage();
    }

    @And("I navigate on my feed section in iPad")
    public void iNavigateToMyFeedSection() {
        cnaBookMarkPage.clickOnMyFeedSection();
        cnaBookMarkPage.clickOnSkipForNow();
    }

    @And("I click on Bookmarked section on my feed in iPad")
    public void iClickOnBookmarkedSectionOnMyFeed() {
        cnaBookMarkPage.clickOnBookmarkedSectionOnMyFeedSection();

    }

    @Then("I validate the bookmarked episode under the my feed section in iPad")
    public void iValidateTheBookmarkedEpisodeUnderTheMyFeedSection() {
        Assert.assertTrue(cnaBookMarkPage.validateBookmarkedEpisode());
    }

    @And("I re navigate to article page in iPad")
    public void iReNavigateToArticlePage() {
        cnaBookMarkPage.clickOnArticleOnMyFeedSection();
    }



    @Then("I validate the bookmarked episode is empty under the my feed section in iPad")
    public void iValidateTheBookmarkedEpisodeIsEmptyUnderTheMyFeedSection() {
        Assert.assertTrue(cnaBookMarkPage.validateEmptyBookmarkedEpisodeOnMyFeed());

    }

    @And("I click on three dots on my feed sec in iPad")
    public void iClickOnThreeDotsOnMyFeedSec() {
        cnaBookMarkPage.clickOnThreeDotsOnMyFeedSec();
    }

    @Then("I click on bookmarked field to unBookmark in iPad")
    public void iClickOnBookmarkedFieldToUnBookmark() {
        cnaBookMarkPage.clickOnUnBookMarkOnMyFeedSec();
    }

    @Then("I validate the toast message as {string} in iPad")
    public void iValidateTheToastMessageAs(String text) throws InterruptedException {
         Assert.assertTrue(cnaBookMarkPage.validateToastMessageAfterTheBookMarkTheArticle().contains(text));
    }


    @And("I click on bookmarked button to unBookmark the article in iPad")
    public void iClickOnBookmarkedButtonToUnBookmarkTheArticle() {
        cnaBookMarkPage.clickOnUnBookMarkEpisodeOnHomePage();
    }

    @And("I click again on three dots of article in iPad")
    public void iClickAgainOnThreeDotsOfArticle() {
        cnaBookMarkPage.clickAgainOnThreeDots();
    }

    @Then("I click on bookmark button on luxury article in iPad")
    public void iClickOnBookmarkButtonOnLuxuryArticle() {
        cnaBookMarkPage.clickBookmarkLuxuryArticle();
    }

    @And("I click on bookmarked button to unBookmark the luxury article in iPad")
    public void iClickOnBookmarkedButtonToUnBookmarkTheLuxuryArticle() {
        cnaBookMarkPage.clickUnBookmarkLuxuryArticle();
    }

    @And("I click on three dots of article cna life style in iPad")
    @And("I click on three dots of article cna luxury in iPad")
    public void iClickOnThreeDotsOfArticleCnaLuxury() {
        cnaBookMarkPage.clickThreeDotsOnCNALuxury();
    }

    @And("I click again on three dots of article cna life style in iPad")
    @And("I click again on three dots of article cna luxury in iPad")
    public void iClickAgainOnThreeDotsOfArticleCnaLuxury() {
        cnaBookMarkPage.clickAgainThreeDotsOnCNALuxury();
    }

    @Then("I validate if Bookmarked articles list is displayed in Bookmarks Page in iPad")
    public void iValidateIfBookmarkedArticlesListIsDisplayedInBookmarksPageInIPad() {
        Assert.assertTrue(cnaBookMarkPage.validateArticlesList());
    }

    @And("I click on article link from Bookmark List in iPad")
    public void iClickOnArticleLinkFromBookmarkListInIPad() {
        cnaBookMarkPage.clickArticle();
    }
}



