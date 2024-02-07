package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_ArticleDetailPage;

public class CNAWeb_PreProd_ArticleDetailSteps {
    CNAWeb_PreProd_ArticleDetailPage CNAWeb_ArticleDetailPage = new CNAWeb_PreProd_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @When("I click on article from homepage in PreProd")
    public void iClickOnArticleFromHomepage() {
        CNAWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }

    @And("I validate article page Title in PreProd")
    public void iValidateArticlePageTitle() {
        CNAWeb_ArticleDetailPage.validateArticlePageTitle();
    }

    @Then("I validate article page Headline, Description, image Or video, Updated & published date and full story sections in PreProd")
    public void iValidateArticlePageSections() {
        CNAWeb_ArticleDetailPage.iValidateArticlePageSections();
    }

    @And("I validate Infinite scroll down functionality in Article Page in PreProd")
    public void iValidateInfiniteScrollDownFunctionalityInArticlePage() {
        CNAWeb_ArticleDetailPage.articleInfiniteScroll();
    }

    @Then("I validate Also worth Reading section in PreProd")
    public void iValidateAlsoWorthReadingSection() {
        CNAWeb_ArticleDetailPage.validateAlsoWorthReadingSection();
    }

    @And("I validate OutBrain section in PreProd")
    public void iValidateOutBrainSection() {
        CNAWeb_ArticleDetailPage.validateOutbrainSection();
    }

    @When("I click on video article from homepage in PreProd")
    public void iClickOnVideoArticleFromHomepage() throws InterruptedException {
        CNAWeb_ArticleDetailPage.clickOnVideoArticle();
    }

    @And("I validate video is muted by default in article detail page in PreProd")
    public void iValidateVideoIsByDefaultInArticleDetailPage(){
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateMutedVideo());
    }

    @Then("I validate video pause and play, maximize, Audio Mute and UnMute options in PreProd")
    public void iValidateVideoPauseAndPlayMaximizeAudioMuteAndUnMuteOptions() throws InterruptedException {
        CNAWeb_ArticleDetailPage.validateVideoOptions();
    }


    @Given("I launch the Context Snippet article detail Page in PreProd")
    public void iLaunchTheContextSnippetArticleDetailPage() {
        CNAWeb_ArticleDetailPage.openContextSnippetArticleURL();
    }

    @Then("I scroll down to the Context Snippet section in PreProd")
    public void iScrollDownToTheContextSnippetSection() {
        CNAWeb_ArticleDetailPage.scrollToContextSnippetSection();
    }


    @And("I click on Expand option in PreProd")
    public void iClickOnExpandOption() {
        CNAWeb_ArticleDetailPage.clickOnExpandOption();
    }

    @And("I validate the expanded context of Context Snippet in PreProd")
    public void iValidateTheExpandedContextOfContextSnippet() {
        CNAWeb_ArticleDetailPage.validateExpandedSectionofContextSnippet();
    }

    @Given("I Open a article with hero image or gallery in PreProd")
    public void iOpenAArticleWithHeroImageOrGallery() {
        CNAWeb_ArticleDetailPage.openArticleURLwithCarouselImage();
    }

    @Then("I validate the Image Icon with Carousel Images in PreProd")
    public void iValidateTheImageIconWithCarouselImages() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateCarouselImageSection());
    }

    @And("I scroll down to article detail page end in PreProd")
    public void iScrollDownToArticleDetailPageEnd() {
        CNAWeb_ArticleDetailPage.scrollTobottomOfArticle();
    }

    @Then("I validate if Header and Share options are sticky at top of Page during scroll in PreProd")
    public void iValidateIfHeaderAndShareOptionsAreStickyAtTopOfPageDuringScroll() throws InterruptedException {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateStickyHeader());
    }

    @Then("I Validate Expand to Read full story button in PreProd")
    public void iValidateExpandToReadFullStoryButton() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.expandToReadFullStoryButton());
    }

    @And("I click on Expand to read full Story button in PreProd")
    public void iClickOnExpandToReadFullStoryButton() {
        CNAWeb_ArticleDetailPage.clickOnExpandFullStoryButton();
    }

    @And("I validate if full story is expanded in PreProd")
    public void iValidateIfFullStoryIsExpanded() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.validateExpandedStory());
    }

    @And("I validate if share options are displayed in article detail Page in PreProd")
    public void iValidateIfShareOptionsAreDisplayedInArticleDetailPage() {
        Assert.assertTrue(CNAWeb_ArticleDetailPage.ValidateSocialMediaShareOption());
    }
}
