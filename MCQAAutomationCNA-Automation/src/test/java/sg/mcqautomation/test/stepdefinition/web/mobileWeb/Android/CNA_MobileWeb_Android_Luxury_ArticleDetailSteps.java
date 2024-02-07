package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_Luxury_ArticleDetailPage;

public class CNA_MobileWeb_Android_Luxury_ArticleDetailSteps {


    CNA_MobileWeb_Android_Luxury_ArticleDetailPage CNALuxuryWeb_ArticleDetailPage = new CNA_MobileWeb_Android_Luxury_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on a article link from Luxury Landing Page in Android Mobile Web")
    public void IClickOnAArticleLinkFromLuxuryLandingPage() {
        CNALuxuryWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }

    @Given("I launch the CNA Luxury video article Url in Android Mobile Web")
    public void iLaunchTheCNALuxuryVideoArticleUrl() {
        CNALuxuryWeb_ArticleDetailPage.launchVideoArticlePage();
    }

    @Then("I  validate Luxury video article page Title in Android Mobile Web")
    public void iValidateLuxuryVideoArticlePageTitle() {
        CNALuxuryWeb_ArticleDetailPage.validateVideoArticlePageHeader();
    }
}
