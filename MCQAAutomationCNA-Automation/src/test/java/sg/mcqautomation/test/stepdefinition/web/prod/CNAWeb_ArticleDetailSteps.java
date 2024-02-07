package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_ArticleDetailPage;

public class CNAWeb_ArticleDetailSteps {
    CNAWeb_ArticleDetailPage CNAWeb_ArticleDetailPage = new CNAWeb_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I click on article from homepage")
    public void iClickOnArticleFromHomepage() {
        CNAWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }

    @And("I validate article page Title")
    public void iValidateArticlePageTitle() {
        CNAWeb_ArticleDetailPage.validateArticlePageTitle();
    }

    @Then("I validate article page Headline, Description, image Or video, Updated & published date and full story sections")
    public void iValidateArticlePageSections() {
        CNAWeb_ArticleDetailPage.iValidateArticlePageSections();
    }

    @And("I validate Infinite scroll down functionality in Article Page")
    public void iValidateInfiniteScrollDownFunctionalityInArticlePage() {
        CNAWeb_ArticleDetailPage.articleInfiniteScroll();
    }

    @Then("I validate Also worth Reading section")
    public void iValidateAlsoWorthReadingSection() {
        CNAWeb_ArticleDetailPage.validateAlsoWorthReadingSection();
    }

    @And("I validate OutBrain section")
    public void iValidateOutBrainSection() {
        CNAWeb_ArticleDetailPage.validateOutbrainSection();
    }

    @When("I click on video article from homepage")
    public void iClickOnVideoArticleFromHomepage() throws InterruptedException {
        CNAWeb_ArticleDetailPage.clickOnVideoArticle();
    }

    @And("I validate video is muted by default in article detail page")
    public void iValidateVideoIsByDefaultInArticleDetailPage(){
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateMutedVideo());
    }

    @Then("I validate video pause and play, maximize, Audio Mute and UnMute options")
    public void iValidateVideoPauseAndPlayMaximizeAudioMuteAndUnMuteOptions() throws InterruptedException {
        CNAWeb_ArticleDetailPage.validateVideoOptions();
    }


    @Given("I launch the Context Snippet article detail Page")
    public void iLaunchTheContextSnippetArticleDetailPage() {
        CNAWeb_ArticleDetailPage.openContextSnippetArticleURL();
    }

    @Then("I scroll down to the Context Snippet section")
    public void iScrollDownToTheContextSnippetSection() {
        CNAWeb_ArticleDetailPage.scrollToContextSnippetSection();
    }


    @And("I click on Expand option")
    public void iClickOnExpandOption() {
        CNAWeb_ArticleDetailPage.clickOnExpandOption();
    }

    @And("I validate the expanded context of Context Snippet")
    public void iValidateTheExpandedContextOfContextSnippet() {
        CNAWeb_ArticleDetailPage.validateExpandedSectionofContextSnippet();
    }

    @Given("I Open a article with hero image or gallery")
    public void iOpenAArticleWithHeroImageOrGallery() {
        CNAWeb_ArticleDetailPage.openArticleURLwithCarouselImage();
    }

    @Then("I validate the Image Icon with Carousel Images")
    public void iValidateTheImageIconWithCarouselImages() throws InterruptedException {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateCarouselImageSection());
    }

    @And("I scroll down to article detail page end")
    public void iScrollDownToArticleDetailPageEnd() {
        CNAWeb_ArticleDetailPage.scrollTobottomOfArticle();
    }

    @Then("I validate if Header and Share options are sticky at top of Page during scroll")
    public void iValidateIfHeaderAndShareOptionsAreStickyAtTopOfPageDuringScroll() throws InterruptedException {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateStickyHeader());
    }

    @Then("I Validate Expand to Read full story button")
    public void iValidateExpandToReadFullStoryButton() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.expandToReadFullStoryButton());
    }

    @And("I click on Expand to read full Story button")
    public void iClickOnExpandToReadFullStoryButton() {
        CNAWeb_ArticleDetailPage.clickOnExpandFullStoryButton();
    }

    @And("I validate if full story is expanded")
    public void iValidateIfFullStoryIsExpanded() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateExpandedStory());
    }

    @And("I validate if share options are displayed in article detail Page")
    public void iValidateIfShareOptionsAreDisplayedInArticleDetailPage() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.ValidateSocialMediaShareOption());
    }
}
