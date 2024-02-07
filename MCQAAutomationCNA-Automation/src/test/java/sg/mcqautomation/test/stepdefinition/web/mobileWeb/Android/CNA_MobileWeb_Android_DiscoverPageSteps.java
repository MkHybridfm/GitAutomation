package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_DiscoverPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_DiscoverPage;

public class CNA_MobileWeb_Android_DiscoverPageSteps {
    CNA_MobileWeb_Android_DiscoverPage CNAWeb_DiscoverPage = new CNA_MobileWeb_Android_DiscoverPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on Discover Menu Link in Android Mobile Web")
    public void iClickOnDiscoverMenuLink() {
        CNAWeb_DiscoverPage.clickDiscoverMenuLink();
    }

    @Then("I validate if Discovery Landing page is displayed in Android Mobile Web")
    public void iValidateIfDiscoveryLandingPageIsDisplayed() {
        Assert.assertTrue(CNAWeb_DiscoverPage.validateDiscoverLandingPage());
    }

    @And("I validate if Trending sections, Editors Pick Section and Recommended for you section is displayed in Android Mobile Web")
    public void iValidateIfTrendingSectionsEditorsPickSectionAndRecommendedForYouSectionIsDisplayed() {
        Assert.assertTrue(CNAWeb_DiscoverPage.validateDiscoverPageSections());
    }

    @Then("I Click on three dots of articles in Discover page in Android Mobile Web")
    public void iClickOnThreeDotsOfArticlesInDiscoverPage() {
        CNAWeb_DiscoverPage.clickThreeDotsLink();
    }

    @And("I validate See more like this, See fewer like this and Share options in Android Mobile Web")
    public void iValidateSeeMoreLikeThisSeeFewerLikeThisAndShareOptions() {
        Assert.assertTrue(CNAWeb_DiscoverPage.validateQuickLinksSections());
    }

    @And("I Scroll down to Surprise me section in Android Mobile Web")
    public void iScrollDownToSurpriseMeSection() throws InterruptedException {
        Assert.assertTrue(CNAWeb_DiscoverPage.scrollToSurpriseMeSection());
    }

    @Then("I click on Surprise Me button in Android Mobile Web")
    public void iClickOnSurpriseMeButton() {
            CNAWeb_DiscoverPage.clickSurpriseMEButton();
    }

    @And("I validate if user is navigated to new tab Article Page in Android Mobile Web")
    public void iValidateIfUserIsNavigatedToNewTabArticlePage() {
            CNAWeb_DiscoverPage.validateArticlePageAfterClick();
    }

}
