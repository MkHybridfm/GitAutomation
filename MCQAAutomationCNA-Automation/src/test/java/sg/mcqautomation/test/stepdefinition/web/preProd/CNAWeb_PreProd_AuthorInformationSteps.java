package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_AuthorInformationPage;

public class CNAWeb_PreProd_AuthorInformationSteps {

    CNAWeb_PreProd_AuthorInformationPage CNAWeb_AuthorInformationPage = new CNAWeb_PreProd_AuthorInformationPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert =new SoftAssertions();


    @Then("I click on commentary section and select a article in PreProd")
    public void iClickOnCommentarySectionAndSelectAArticle() {
        CNAWeb_AuthorInformationPage.clickOnCommentarySection();
        CNAWeb_AuthorInformationPage.selectAnArticlefromCommentaryPage();
    }

    @And("I validate article author Info Block in PreProd")
    public void iValidateArticleAuthorInfoBlock() {
        CNAWeb_AuthorInformationPage.validateAuthorInfoBlock();
    }

    @Then("I click on author profile link in PreProd")
    public void iClickOnAuthorProfileLink() {
        CNAWeb_AuthorInformationPage.clickOnArticleInfoLink();
    }

    @And("I validate Author Profile Information Page Title in PreProd")
    public void iValidateAuthorProfileInformationPageTitle() {
        CNAWeb_AuthorInformationPage.authorInformationPage();
    }

    @And("I validate Author block, follow button, social link, articles list and sort sections in PreProd")
    public void iValidateAuthorBlockFollowButtonSocialLinkArticlesListAndSortSections() {
        CNAWeb_AuthorInformationPage.validateAuthorBlock();
        CNAWeb_AuthorInformationPage.validate_Sort_FilterSections();
    }
}
