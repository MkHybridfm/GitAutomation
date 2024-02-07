package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_ArticlePage;

public class CNA_Android_Tab_ArticleSteps {

    CNA_Android_Tab_ArticlePage cNAArticlePage = new CNA_Android_Tab_ArticlePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    @And("I click on article on homepage in Android App in Tab")
    public void iClickOnArticleOnHomepage() {
        cNAArticlePage.clickOnArticle();
    }

    @Then("I validate the article page in Android App in Tab")
    public void iValidateTheArticlePage() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyArticleContentTitle());
    }

    @And("I validate toast message on the article page in Android App in Tab")
    public void iValidateToastMessageOnTheArticlePage() {
        Assert.assertTrue(cNAArticlePage.verifyToastMessage());
        cNAArticlePage.handleArticleOkButton();
    }

    @Then("I validate the {string} section in Android App in Tab")
    public void iValidateTheSection(String text) {
        if(text.equalsIgnoreCase("Related topics"))
        Assert.assertTrue(cNAArticlePage.verifySectionWithRelatedTopics().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Also worth reading"))
            Assert.assertTrue(cNAArticlePage.verifySectionWithWorthReading().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Outbrain"))
            Assert.assertTrue(cNAArticlePage.verifySectionWithOutBrainRecommended());

    }

    @Then("I verify scroll functionality on Home page in Android App in Tab")
    public void iVerifyScrollFunctionalityOnHomePage() {
        cNAArticlePage.verifySwipeFunctionality();
    }

    @And("I validate the the context with {string} in Android App in Tab")
    public void iValidateTheTheContextWith(String text) throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifySectionWithMoreArticle());

    }
    @And("I click again on share button in Android App in Tab")
    @And("I click on share button in Android App in Tab")
    public void iClickOnShareButton() {
        cNAArticlePage.clickOnShareButton();
    }

    @Then("I verify share external link in Android App in Tab")
    public void iVerifyShareExternalLink() {
        Assert.assertTrue(cNAArticlePage.verifyExternalLink());

    }

    @And("I click on font size button in Android App in Tab")
    public void iClickOnFontSizeButton() {
        cNAArticlePage.clickOnFontSize();
    }

    @Then("I validate different font size buttons in Android App in Tab")
    public void iValidateDifferentFontSizeButtons() {
        Assert.assertTrue(cNAArticlePage.verifyFontSize());
    }

    @And("I click on Menu in Android App in Tab")
    @And("I again click on Menu in Android App in Tab")
    public void iClickOnMenu() {
        cNAArticlePage.clickOnMenu();
    }

    @And("I click on commentary section header in Android App in Tab")
    public void iClickOnCommunitySectionHeader() {
        cNAArticlePage.clickOnCommentarySec();
    }

    @And("I click on article in Android App in Tab")
    public void iClickOnArticle() {
        cNAArticlePage.clickOnArticleOnCommentarySec();
    }

    @Then("I validate the author name on article page in Android App in Tab")
    public void iValidateTheAuthorNameOnArticlePage() {
        Assert.assertTrue(cNAArticlePage.verifyAuthorNameOnTheArticlePage());
    }

    @And("I click on author link in Android App in Tab")
    public void iClickOnAuthorLink() {
        cNAArticlePage.clickOnAuthorLink();
    }

    @And("I click on one related topic in Android App in Tab")
    public void iClickOnOneRelatedTopic() {
        cNAArticlePage.clickOnOneRelatedTopic();
    }

    @Then("I validate the header title of the topic in Android App in Tab")
    public void iValidateTheHeaderTitleOfTheTopic() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyHeaderOfTheRelatedTopic());
    }

    @Then("I validate the list of topics in menu section in Android App in Tab")
    public void iValidateTheListOfTopicsInMenuSection() {
        Assert.assertTrue(cNAArticlePage.verifyListOfTopicsOnMenuSec());
    }

    @And("I click on one of the topic in Android App in Tab")
    public void iClickOnOfTheTopic() {
        cNAArticlePage.clickOnOneTopicInMenuSec();
    }

    @Then("I validate the {string} section on CNA life style in Android App in Tab")
    @Then("I validate the {string} section on CNA luxury in Android App in Tab")
    public void iValidateTheSectionOnCNALuxuryLifeStyle(String text) {
        Assert.assertTrue(cNAArticlePage.verifyLabelOnCNALuxury());
    }

    @And("I click on one related topic on life style article in Android App in Tab")
    public void iClickOnOneRelatedTopicOnLifeStyleArticle() {
        cNAArticlePage.clickOnRelatedTopicOnLifeStyle();

    }

    @And("I click on close button share info page in Android App in Tab")
    public void iClickOnCloseButtonShareInfoPage() {
        cNAArticlePage.clickOnCloseButtonOnShareWindow();
    }


    @Then("I verify share button in Android App in Tab")
    public void iVerifyShareButton() {
        Assert.assertTrue(cNAArticlePage.clickOnShareButton());
    }

    @And("I scroll to top of the Page")
    public void iScrollToTopOfThePage() throws InterruptedException {
        cNAArticlePage.scrollToTop();
    }
}
