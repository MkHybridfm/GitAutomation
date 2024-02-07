package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_AuthorInformationPage;

public class CNA_MobileWeb_IOS_AuthorInformationSteps {

    CNA_MobileWeb_IOS_AuthorInformationPage CNAWeb_AuthorInformationPage = new CNA_MobileWeb_IOS_AuthorInformationPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert =new SoftAssertions();


    @Then("I click on commentary section and select a article in IOS Mobile Web")
    public void iClickOnCommentarySectionAndSelectAArticle() {
        CNAWeb_AuthorInformationPage.clickOnCommentarySection();
        CNAWeb_AuthorInformationPage.selectAnArticlefromCommentaryPage();
    }

    @And("I validate article author Info Block in IOS Mobile Web")
    public void iValidateArticleAuthorInfoBlock() {
        CNAWeb_AuthorInformationPage.validateAuthorInfoBlock();
    }

    @Then("I click on author profile link in IOS Mobile Web")
    public void iClickOnAuthorProfileLink() {
        CNAWeb_AuthorInformationPage.clickOnArticleInfoLink();
    }

    @And("I validate Author Profile Information Page Title in IOS Mobile Web")
    public void iValidateAuthorProfileInformationPageTitle() {
        CNAWeb_AuthorInformationPage.authorInformationPage();
    }

    @And("I validate Author block, follow button, social link, articles list and sort sections in IOS Mobile Web")
    public void iValidateAuthorBlockFollowButtonSocialLinkArticlesListAndSortSections() {
        CNAWeb_AuthorInformationPage.validateAuthorBlock();
        CNAWeb_AuthorInformationPage.validate_Sort_FilterSections();
    }

    @And("I click on Main menu icon in IOS Mobile Web")
    public void iClickOnMainMenuIconInIOSMobileWeb() {
        CNAWeb_AuthorInformationPage.clickMainMenuIcon();
    }

    @Then("I click on commentary section page link from the menu in IOS Mobile Web")
    public void iClickOnCommentarySectionPageLinkFromTheMenuInIOSMobileWeb() {
        CNAWeb_AuthorInformationPage.clickCommentarySectionPageLink();
    }

    @Then("I click on an article link from commentary page in IOS Mobile Web")
    public void iClickOnAnArticleLinkFromCommentaryPageInIOSMobileWeb() {
        CNAWeb_AuthorInformationPage.selectAnArticlefromCommentaryPage();
    }

}
