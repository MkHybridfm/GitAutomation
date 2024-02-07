package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Lifestyle_ArticleDetailPage;

public class CNA_MobileWeb_Android_Lifestyle_ArticleDetailSteps {

    CNA_MobileWeb_Android_Lifestyle_ArticleDetailPage CNALifestyleWeb_ArticleDetailPage = new CNA_MobileWeb_Android_Lifestyle_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on a article link from top stories in Android Mobile Web")
    public void IClickOnAArticleLinkFromTopStories() throws InterruptedException {
        CNALifestyleWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }

    @And("I validate article author Info Block and Share Options in Article detail Page in Android Mobile Web")
    public void iValidateArticleAuthorInfoBlockAndShareOptionsInArticleDetailPage() {
        CNALifestyleWeb_ArticleDetailPage.validateArticleAuthorBlockAndShareOptions();
    }

    @Then("I validate Also worth Reading section in Lifestyle article detail page in Android Mobile Web")
    public void iValidateAlsoWorthReadingSectionInLifestyleArticleDetailPage() {

    }

    @And("I validate OutBrain section article detail page in Android Mobile Web")
    public void iValidateOutBrainSectionArticleDetailPage() {
    }
}
