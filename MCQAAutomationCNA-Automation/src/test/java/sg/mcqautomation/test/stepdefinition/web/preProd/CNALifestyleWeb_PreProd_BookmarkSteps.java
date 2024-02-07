package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALifestyleWeb_PreProd_BookmarkPage;

public class CNALifestyleWeb_PreProd_BookmarkSteps {

    CNALifestyleWeb_PreProd_BookmarkPage CNALifestyleWeb_BookmarkPage = new CNALifestyleWeb_PreProd_BookmarkPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on three dots of a article from Lifestyle Landing Page in PreProd")
    public void iClickOnThreeDotsOfAArticleFromLifestyleLandingPage() {
            CNALifestyleWeb_BookmarkPage.clickOnThreeDotsOption();
    }

    @Then("I click on Bookmark option for a Top Story for Anonymous User in PreProd")
    public void iClickOnBookmarkOptionForATopStoryForAnonymousUser() {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionAnonymousUser();
    }

    @Then("I click on Bookmark option for a Top Story for loggedIn user in PreProd")
    public void iClickOnBookmarkOptionForATopStoryForLoggedInUser() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.clickOnBookmarkOptionLoggedInUser();
    }

    @And("I scroll down to videos section in PreProd")
    public void iScrollDownToVideosSection() throws InterruptedException {
        CNALifestyleWeb_BookmarkPage.scrollDownToVideoSection();
    }

    @When("I click on a video article link in PreProd")
    public void iClickOnAVideoArticleLink() {
        CNALifestyleWeb_BookmarkPage.clickOnAVideoLink();
    }
}
