package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_BookMarkPage;

public class CNA_Android_Tab_BookMarkPageSteps {

    CNA_Android_Tab_BookMarkPage cnaBookMarkPage = new CNA_Android_Tab_BookMarkPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on three dots of article in Android App in Tab")
    public void iClickOnThreeDotsOfArticle() {
        cnaBookMarkPage.clickOnThreeDots();
    }

    @Then("I click on bookmark button on article in Android App in Tab")
    public void iClickOnBookmarkButtonOnArticle() {
        cnaBookMarkPage.clickOnBookMarkEpisodeOnHomePage();
    }

    @And("I click on unBookmark on article page in Android App in Tab")
    @And("I click on bookmark on article page in Android App in Tab")
    public void iClickOnBookmarkOnArticlePage() throws InterruptedException {
        cnaBookMarkPage.clickOnBookMarkEpisodeOnArticlePage();
    }

    @And("I navigate on my feed section in Android App in Tab")
    public void iNavigateToMyFeedSection() {
        cnaBookMarkPage.clickOnMyFeedSection();
        cnaBookMarkPage.clickOnSkipForNow();
    }

    @And("I click on Bookmarked section on my feed in Android App in Tab")
    public void iClickOnBookmarkedSectionOnMyFeed() {
        cnaBookMarkPage.clickOnBookmarkedSectionOnMyFeedSection();

    }

    @Then("I validate the bookmarked episode under the my feed section in Android App in Tab")
    public void iValidateTheBookmarkedEpisodeUnderTheMyFeedSection() {
        Assert.assertTrue(cnaBookMarkPage.validateBookmarkedEpisode());
    }

    @And("I re navigate to article page in Android App in Tab")
    public void iReNavigateToArticlePage() {
        cnaBookMarkPage.clickOnArticleOnMyFeedSection();
    }



    @Then("I validate the bookmarked episode is empty under the my feed section in Android App in Tab")
    public void iValidateTheBookmarkedEpisodeIsEmptyUnderTheMyFeedSection() {
        Assert.assertTrue(cnaBookMarkPage.validateEmptyBookmarkedEpisodeOnMyFeed());

    }

    @And("I click on three dots on my feed sec in Android App in Tab")
    public void iClickOnThreeDotsOnMyFeedSec() {
        cnaBookMarkPage.clickOnThreeDotsOnMyFeedSec();
    }

    @Then("I click on bookmarked field to unBookmark in Android App in Tab")
    public void iClickOnBookmarkedFieldToUnBookmark() {
        cnaBookMarkPage.clickOnUnBookMarkOnMyFeedSec();
    }

    @Then("I validate the toast message as {string} in Android App in Tab")
    public void iValidateTheToastMessageAs(String text) throws InterruptedException {
         Assert.assertTrue(cnaBookMarkPage.validateToastMessageAfterTheBookMarkTheArticle().contains(text));
    }


    @And("I click on bookmarked button to unBookmark the article in Android App in Tab")
    public void iClickOnBookmarkedButtonToUnBookmarkTheArticle() {
        cnaBookMarkPage.clickOnUnBookMarkEpisodeOnHomePage();
    }

    @And("I click again on three dots of article in Android App in Tab")
    public void iClickAgainOnThreeDotsOfArticle() {
        cnaBookMarkPage.clickAgainOnThreeDots();
    }

    @Then("I click on bookmark button on luxury article in Android App in Tab")
    public void iClickOnBookmarkButtonOnLuxuryArticle() {
        cnaBookMarkPage.clickBookmarkLuxuryArticle();
    }

    @And("I click on bookmarked button to unBookmark the luxury article in Android App in Tab")
    public void iClickOnBookmarkedButtonToUnBookmarkTheLuxuryArticle() {
        cnaBookMarkPage.clickUnBookmarkLuxuryArticle();
    }

    @And("I click on three dots of article cna life style in Android App in Tab")
    @And("I click on three dots of article cna luxury in Android App in Tab")
    public void iClickOnThreeDotsOfArticleCnaLuxury() {
        cnaBookMarkPage.clickThreeDotsOnCNALuxury();
    }

    @And("I click again on three dots of article cna life style in Android App in Tab")
    @And("I click again on three dots of article cna luxury in Android App in Tab")
    public void iClickAgainOnThreeDotsOfArticleCnaLuxury() {
        cnaBookMarkPage.clickAgainThreeDotsOnCNALuxury();
    }
}