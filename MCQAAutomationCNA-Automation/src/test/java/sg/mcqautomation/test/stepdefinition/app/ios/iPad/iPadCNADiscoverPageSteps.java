package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNAArticlePage;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNADiscoverPage;


public class iPadCNADiscoverPageSteps {

    iPadCNADiscoverPage cnaDiscoverPage = new iPadCNADiscoverPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPadCNAArticlePage cNAArticlePage = new iPadCNAArticlePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @And("I click on discover section in iPad")
    public void iClickOnDiscoverSection() {
            cnaDiscoverPage.clickOnDiscoverSection();
    }

    @Then("I redirected to discover page in app view in iPad")
    @Then("I validate the header of discover page in iPad")
    public void iValidateTheDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.verifyHeaderOnDiscoverPage());
    }

    @And("I validate the surprise me functionality on Discover page in iPad")
    public void iValidateTheSurpriseMeFunctionalityOnDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.validateSurpriseMeFunctionality());
    }

    @And("I click on surprise me button in iPad")
    public void iClickOnSurpriseMeButton() throws InterruptedException {
        cnaDiscoverPage.clickOnSurpriseMeFunctionality();
    }

    @Then("I navigate to the article page in web view in iPad")
    public void iNavigateToTheArticlePageInWebView() {
        Assert.assertTrue( cnaDiscoverPage.validateUrl());
    }

    @And("I click on Done button on web view page in iPad")
    public void iClickOnDoneButtonOnWebViewPage() {
        cnaDiscoverPage.clickOnDoneButton();
    }

    @And("I click on article of discover page in iPad")
    public void iClickOnArticleOfDiscoverPage() {
        cnaDiscoverPage.clickOnArticleOnDiscoverPage();
    }

    @And("I click on back arrow on article page in iPad")
    public void iClickOnBackArrowOnArticlePage() {
        cnaDiscoverPage.clickOnBackArrow();
    }


    @Then("I validate the article title on article page in iPad")
    public void iValidateTheArticleTitleOnArticlePage() {
       // cNAArticlePage.handleArticleOkButton();
        Assert.assertTrue(cnaDiscoverPage.validateArticleTitle());
    }

    @And("I click on three dots on discover page in iPad")
    public void iClickOnThreeDotsOnDiscoverPage() {
        cnaDiscoverPage.clickOnThreeDotsOnDiscoverPage();
    }

    @Then("I validate the options on three dots in iPad")
    public void iValidateTheOptionsOnThreeDots() {
        Assert.assertTrue(cnaDiscoverPage.validateOptionsOnThreeDots());
    }

    @Then("I Verify Article Auther Image in iPad")
    public void articleautherImage() {
        Assert.assertTrue(cnaDiscoverPage.articleautherImage());
    }
    @Then("I Verify Article Auther Name in iPad")
    public void articleAuthorName() {
        Assert.assertTrue(cnaDiscoverPage.articleautherName());
    }

    @Then("I Verify Article Result Details in iPad")
    public void articleResult() {
        Assert.assertTrue(cnaDiscoverPage.articleResult());
    }

    @Then("I Verify Article Sort & Filter Details in iPad")
    public void articleSort() {
        Assert.assertTrue(cnaDiscoverPage.articleSort());
    }


}
