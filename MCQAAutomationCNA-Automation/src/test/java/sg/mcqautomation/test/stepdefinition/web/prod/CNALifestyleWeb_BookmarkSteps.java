package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALifestyleWeb_BookmarkPage;

public class CNALifestyleWeb_BookmarkSteps {

    CNALifestyleWeb_BookmarkPage CNALifestyleWeb_BookmarkPage = new CNALifestyleWeb_BookmarkPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Lifestyle Landing Page")
    public void iClickOnThreeDotsOfAArticleFromLifestyleLandingPage() {
            CNALifestyleWeb_BookmarkPage.clickOnThreeDotsOption();
    }

    @Then("I click on Bookmark option for a Top Story for Anonymous User")
    public void iClickOnBookmarkOptionForATopStoryForAnonymousUser() {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionAnonymousUser();
    }

    @Then("I click on Bookmark option for a Top Story for loggedIn user")
    public void iClickOnBookmarkOptionForATopStoryForLoggedInUser() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionLoggedInUser();
    }

    @And("I scroll down to videos section")
    public void iScrollDownToVideosSection() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.scrollDownToVideoSection();
    }

    @When("I click on a video article link")
    public void iClickOnAVideoArticleLink() {
        CNALifestyleWeb_BookmarkPage.clickOnAVideoLink();
    }
}
