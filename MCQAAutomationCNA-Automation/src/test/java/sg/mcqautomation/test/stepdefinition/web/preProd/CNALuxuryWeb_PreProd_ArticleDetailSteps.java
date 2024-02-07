package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNALuxuryWeb_PreProd_ArticleDetailPage;

public class CNALuxuryWeb_PreProd_ArticleDetailSteps {


    CNALuxuryWeb_PreProd_ArticleDetailPage CNALuxuryWeb_ArticleDetailPage = new CNALuxuryWeb_PreProd_ArticleDetailPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert = new SoftAssertions();

    @And("I click on a article link from Luxury Landing Page in PreProd")
    public void IClickOnAArticleLinkFromLuxuryLandingPage() {
        CNALuxuryWeb_ArticleDetailPage.clickOnlatestnewsArticle();
    }


    @Given("I launch the CNA Luxury video article Url in PreProd")
    public void iLaunchTheCNALuxuryVideoArticleUrl() {
        CNALuxuryWeb_ArticleDetailPage.launchVideoArticlePage();
    }

    @Then("I  validate Luxury video article page Title in PreProd")
    public void iValidateLuxuryVideoArticlePageTitle() {
        CNALuxuryWeb_ArticleDetailPage.validateVideoArticlePageHeader();
    }
}
