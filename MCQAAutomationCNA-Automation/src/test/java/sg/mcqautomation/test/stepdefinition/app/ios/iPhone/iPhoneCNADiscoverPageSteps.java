package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAArticlePage;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNADiscoverPage;

public class iPhoneCNADiscoverPageSteps {

    iPhoneCNADiscoverPage cnaDiscoverPage = new iPhoneCNADiscoverPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPhoneCNAArticlePage cNAArticlePage = new iPhoneCNAArticlePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @And("I click on discover section in iPhone")
    public void iClickOnDiscoverSection() {
            cnaDiscoverPage.clickOnDiscoverSection();
    }

    @Then("I redirected to discover page in app view in iPhone")
    @Then("I validate the header of discover page in iPhone")
    public void iValidateTheDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.verifyHeaderOnDiscoverPage());
    }

    @And("I validate the surprise me functionality on Discover page in iPhone")
    public void iValidateTheSurpriseMeFunctionalityOnDiscoverPage() throws InterruptedException {
        Assert.assertTrue(cnaDiscoverPage.validateSurpriseMeFunctionality());
    }

    @And("I click on surprise me button in iPhone")
    public void iClickOnSurpriseMeButton() throws InterruptedException {
        cnaDiscoverPage.clickOnSurpriseMeFunctionality();
    }

    @Then("I navigate to the article page in web view in iPhone")
    public void iNavigateToTheArticlePageInWebView() {
        Assert.assertTrue( cnaDiscoverPage.validateUrl());
    }

    @And("I click on Done button on web view page in iPhone")
    public void iClickOnDoneButtonOnWebViewPage() {
        cnaDiscoverPage.clickOnDoneButton();
    }

    @And("I click on article of discover page in iPhone")
    public void iClickOnArticleOfDiscoverPage() {
        cnaDiscoverPage.clickOnArticleOnDiscoverPage();
    }

    @And("I click on back arrow on article page in iPhone")
    public void iClickOnBackArrowOnArticlePage() {
        cnaDiscoverPage.clickOnBackArrow();
    }


    @Then("I validate the article title on article page in iPhone")
    public void iValidateTheArticleTitleOnArticlePage() {
       // cNAArticlePage.handleArticleOkButton();
        Assert.assertTrue(cnaDiscoverPage.validateArticleTitle());
    }

    @And("I click on three dots on discover page in iPhone")
    public void iClickOnThreeDotsOnDiscoverPage() {
        cnaDiscoverPage.clickOnThreeDotsOnDiscoverPage();
    }

    @Then("I validate the options on three dots in iPhone")
    public void iValidateTheOptionsOnThreeDots() {
        Assert.assertTrue(cnaDiscoverPage.validateOptionsOnThreeDots());
    }

    @Then("I Verify Article Auther Image in iPhone")
    public void articleautherImage() {
        Assert.assertTrue(cnaDiscoverPage.articleautherImage());
    }
    @Then("I Verify Article Auther Name in iPhone")
    public void articleAuthorName() {
        Assert.assertTrue(cnaDiscoverPage.articleautherName());
    }

    @Then("I Verify Article Result Details in iPhone")
    public void articleResult() {
        Assert.assertTrue(cnaDiscoverPage.articleResult());
    }

    @Then("I Verify Article Sort & Filter Details in iPhone")
    public void articleSort() {
        Assert.assertTrue(cnaDiscoverPage.articleSort());
    }


}
