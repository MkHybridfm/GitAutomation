package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNALuxuryWeb_ArticleDetailPage;

public class CNALuxuryWeb_ArticleDetailSteps {


    CNALuxuryWeb_ArticleDetailPage CNALuxuryWeb_ArticleDetailPage = new CNALuxuryWeb_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on a article link from Luxury Landing Page")
    public void IClickOnAArticleLinkFromLuxuryLandingPage() {
        CNALuxuryWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }


    @Given("I launch the CNA Luxury video article Url")
    public void iLaunchTheCNALuxuryVideoArticleUrl() {
        CNALuxuryWeb_ArticleDetailPage.launchVideoArticlePage();
    }

    @Then("I  validate Luxury video article page Title")
    public void iValidateLuxuryVideoArticlePageTitle() {
        CNALuxuryWeb_ArticleDetailPage.validateVideoArticlePageHeader();
    }
}
