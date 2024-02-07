package sg.mcqautomation.test.stepdefinition.app.android;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_ArticlePage;
import sg.mcqautomation.test.pages.app.android.CNA_Android_DiscoverPage;

public class CNA_Android_DiscoverPageSteps {

    CNA_Android_DiscoverPage cnaDiscoverPage = new CNA_Android_DiscoverPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    CNA_Android_ArticlePage cNAArticlePage = new CNA_Android_ArticlePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @And("I click on discover section in Android App")
    public void iClickOnDiscoverSection() {
            cnaDiscoverPage.clickOnDiscoverSection();
    }

    @Then("I redirected to discover page in app view in Android App")
    @Then("I validate the header of discover page in Android App")
    public void iValidateTheDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.verifyHeaderOnDiscoverPage());
    }

    @And("I validate the surprise me functionality on Discover page in Android App")
    public void iValidateTheSurpriseMeFunctionalityOnDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.validateSurpriseMeFunctionality());
    }

    @And("I click on surprise me button in Android App")
    public void iClickOnSurpriseMeButton() {
        cnaDiscoverPage.clickOnSurpriseMeFunctionality();
    }

    @Then("I navigate to the article page in web view in Android App")
    public void iNavigateToTheArticlePageInWebView() {
        Assert.assertTrue( cnaDiscoverPage.validateUrl());
    }

    @And("I click on Done button on web view page in Android App")
    public void iClickOnDoneButtonOnWebViewPage() {
        cnaDiscoverPage.clickOnDoneButton();
    }

    @And("I click on article of discover page in Android App")
    public void iClickOnArticleOfDiscoverPage() {
        cnaDiscoverPage.clickOnArticleOnDiscoverPage();
    }

    @And("I click on back arrow on article page in Android App")
    public void iClickOnBackArrowOnArticlePage() {
        cnaDiscoverPage.clickOnBackArrow();
    }


    @Then("I validate the article title on article page in Android App")
    public void iValidateTheArticleTitleOnArticlePage() {
       // cNAArticlePage.handleArticleOkButton();
        Assert.assertTrue(cnaDiscoverPage.validateArticleTitle());
    }

    @And("I click on three dots on discover page in Android App")
    public void iClickOnThreeDotsOnDiscoverPage() {
        cnaDiscoverPage.clickOnThreeDotsOnDiscoverPage();
    }

    @Then("I validate the options on three dots in Android App")
    public void iValidateTheOptionsOnThreeDots() {
        Assert.assertTrue(cnaDiscoverPage.validateOptionsOnThreeDots());
    }
}