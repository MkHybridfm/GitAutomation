package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Lifestyle_BookmarkPage;

public class CNA_MobileWeb_Android_Lifestyle_BookmarkSteps {

    CNA_MobileWeb_Android_Lifestyle_BookmarkPage CNALifestyleWeb_BookmarkPage = new CNA_MobileWeb_Android_Lifestyle_BookmarkPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Lifestyle Landing Page in Android Mobile Web")
    public void iClickOnThreeDotsOfAArticleFromLifestyleLandingPage() {
            CNALifestyleWeb_BookmarkPage.clickOnThreeDotsOption();
    }

    @Then("I click on Bookmark option for a Top Story for Anonymous User in Android Mobile Web")
    public void iClickOnBookmarkOptionForATopStoryForAnonymousUser() {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionAnonymousUser();
    }

    @Then("I click on Bookmark option for a Top Story for loggedIn user in Android Mobile Web")
    public void iClickOnBookmarkOptionForATopStoryForLoggedInUser() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionLoggedInUser();
    }

    @And("I scroll down to videos section in Android Mobile Web")
    public void iScrollDownToVideosSection() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.scrollDownToVideoSection();
    }

    @When("I click on a video article link in Android Mobile Web")
    public void iClickOnAVideoArticleLink() {
        CNALifestyleWeb_BookmarkPage.clickOnAVideoLink();
    }
}
