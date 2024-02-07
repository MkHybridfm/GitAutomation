package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNAArticlePage;

public class iPadCNAArticleSteps {

    iPadCNAArticlePage cNAArticlePage = new iPadCNAArticlePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    String strText="";

    @And("I click on article on homepage in iPad")
    public void iClickOnArticleOnHomepage() {
        cNAArticlePage.clickOnArticle();
    }

    @Then("I validate the article page in iPad")
    public void iValidateTheArticlePage() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyArticleContentTitle());
    }

    @And("I validate toast message on the article page in iPad")
    public void iValidateToastMessageOnTheArticlePage() {
        Assert.assertTrue(cNAArticlePage.verifyToastMessage());
        cNAArticlePage.handleArticleOkButton();
    }

    @Then("I validate the {string} section in iPad")
    public void iValidateTheSection(String text) {
        if(text.equalsIgnoreCase("Related topics"))
        Assert.assertTrue(cNAArticlePage.verifySectionWithRelatedTopics().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Also worth reading"))
            Assert.assertTrue(cNAArticlePage.verifySectionWithWorthReading().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Outbrain"))
            Assert.assertTrue(cNAArticlePage.verifySectionWithOutBrainRecommended());

    }

    @Then("I verify scroll functionality on Home page in iPad")
    public void iVerifyScrollFunctionalityOnHomePage() {
        cNAArticlePage.verifySwipeFunctionality();
    }

    @And("I validate the the context with {string} in iPad")
    public void iValidateTheTheContextWith(String text) throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifySectionWithMoreArticle());

    }
    @And("I click again on share button in iPad")
    @And("I click on share button in iPad")
    public void iClickOnShareButton() {
        cNAArticlePage.clickOnShareButton();
    }

    @Then("I verify share external link in iPad")
    public void iVerifyShareExternalLink() {
        Assert.assertTrue(cNAArticlePage.verifyExternalLink());

    }

    @And("I click on font size button in iPad")
    public void iClickOnFontSizeButton() {
        cNAArticlePage.clickOnFontSize();
    }

    @Then("I validate different font size buttons in iPad")
    public void iValidateDifferentFontSizeButtons() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyFontSize());
    }

    @And("I click on Menu in iPad")
    @And("I again click on Menu in iPad")
    public void iClickOnMenu() {
        cNAArticlePage.clickOnMenu();
    }

    @And("I Select {string} from menu in iPad")
    public void selectmenuOption(String  strOption) throws InterruptedException {
        cNAArticlePage.selectMenuOption(strOption);
    }

    @And("I Verify {string} from menu in iPad")
    public void verifymenuOption(String  strOption) throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyMenuOption(strOption));
    }

    @And("I Verify {string} Screen in iPad")
    public void verifyPageDetails(String  strOption) throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyPageDetails(strOption));
    }

    @And("I click on commentary section header in iPad")
    public void iClickOnCommunitySectionHeader() {
        cNAArticlePage.clickOnCommentarySec();
    }

    @And("I click on article in iPad")
    public void iClickOnArticle() {
        cNAArticlePage.clickOnArticleOnCommentarySec();
    }

    @Then("I validate the author name on article page in iPad")
    public void iValidateTheAuthorNameOnArticlePage() {
        Assert.assertTrue(cNAArticlePage.verifyAuthorNameOnTheArticlePage());
    }

    @And("I click on author link in iPad")
    public void iClickOnAuthorLink() {
        cNAArticlePage.clickOnAuthorLink();
    }

    @Then("I Verify Author Follow Button in Web View iPad")
    public void followButton() {
        Assert.assertTrue(cNAArticlePage.followButton());
    }

    @Then("I Verify Author Name in Web View iPad")
    public void authorName() {
        Assert.assertTrue(cNAArticlePage.AuthorName());
    }

    @Then("I Verify Author Image in Web View iPad")
    public void authorImage() {
        Assert.assertTrue(cNAArticlePage.AuthorImage());
    }

    @And("I click on one related topic in iPad")
    public void iClickOnOneRelatedTopic() {
        cNAArticlePage.clickOnOneRelatedTopic();
    }

    @Then("I validate the header title in topic listing screen in iPad")
    public void headertitle() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyHeaderOfTheRelatedTopic());
    }

    @Then("I validate sort & filter in topic listing screen in iPad")
    public void filter() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyHeadersortfilter());
    }

    @Then("I validate result count in topic listing screen in iPad")
    public void resultcount() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyresultcount());
    }

    @Then("I validate the header title of the topic in iPad")
    public void iValidateTheHeaderTitleOfTheTopic() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyHeaderOfTheRelatedTopic());
    }

    @Then("I validate the list of topics in menu section in iPad")
    public void iValidateTheListOfTopicsInMenuSection() {
        Assert.assertTrue(cNAArticlePage.verifyListOfTopicsOnMenuSec());
    }

    @And("I click on one of the topic in iPad")
    public void iClickOnOfTheTopic() {
        cNAArticlePage.clickOnOneTopicInMenuSec();
    }

    @Then("I validate the {string} section on CNA life style in iPad")
    @Then("I validate the {string} section on CNA luxury in iPad")
    public void iValidateTheSectionOnCNALuxuryLifeStyle(String text) {
        Assert.assertTrue(cNAArticlePage.verifyLabelOnCNALuxury(text));
    }

    @And("I click on one related topic on life style article in iPad")
    public void iClickOnOneRelatedTopicOnLifeStyleArticle() {
        cNAArticlePage.clickOnRelatedTopicOnLifeStyle();

    }
    @And("I click on one related topic on CNA luxury article in iPad")
    public void clickOnRelatedTopicOnLifeStyleLuxery() {
        cNAArticlePage.clickOnRelatedTopicOnLifeStyleLuxery();

    }
    @And("I click on close button share info page in iPad")
    public void iClickOnCloseButtonShareInfoPage() {
        cNAArticlePage.clickOnCloseButtonOnShareWindow();
    }


    @Then("I verify share button in iPad")
    public void iVerifyShareButton() {
        Assert.assertTrue(cNAArticlePage.clickOnShareButton());
    }

    @And("I Select {string} from Bottom Tab in iPad")
    public void selectfromBottomTab(String strOption) throws InterruptedException {
        cNAArticlePage.SelectFromBottom(strOption);
    }

    @Then("I Verify Related topics List on the article page in iPad")
    public void verifyRelatedTopics() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyRelatedTopics());
    }

    @And("I Select One Related topics on the article page in iPad")
    public void selectRelatedTopics() throws InterruptedException {
        strText=cNAArticlePage.GetRelatedTopicsName();
        cNAArticlePage.selectRelatedTopics();
    }

    @Then("I Verify Related topics Header on the article page in iPad")
    public void verifyRelatedTopicsHeader() throws InterruptedException {
        Assert.assertTrue(cNAArticlePage.verifyRelatedTopicsHeader(strText));
    }
}
