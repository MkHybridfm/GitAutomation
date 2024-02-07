package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALifestyleWeb_ArticleDetailPage;

public class CNALifestyleWeb_ArticleDetailSteps {

    CNALifestyleWeb_ArticleDetailPage CNALifestyleWeb_ArticleDetailPage = new CNALifestyleWeb_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on a article link from top stories")
    public void IClickOnAArticleLinkFromTopStories() {
        CNALifestyleWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }

    @And("I validate article author Info Block and Share Options in Article detail Page")
    public void iValidateArticleAuthorInfoBlockAndShareOptionsInArticleDetailPage() {
        CNALifestyleWeb_ArticleDetailPage.validateArticleAuthorBlockAndShareOptions();
    }

    @Then("I validate Also worth Reading section in Lifestyle article detail page")
    public void iValidateAlsoWorthReadingSectionInLifestyleArticleDetailPage() {

    }

    @And("I validate OutBrain section article detail page")
    public void iValidateOutBrainSectionArticleDetailPage() {
    }
}
