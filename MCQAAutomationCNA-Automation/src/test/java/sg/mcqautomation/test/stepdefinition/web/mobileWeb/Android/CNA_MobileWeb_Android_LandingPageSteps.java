package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_LandingPage;

public class CNA_MobileWeb_Android_LandingPageSteps {

    CNA_MobileWeb_Android_LandingPage CNAWeb_LandingPage = new CNA_MobileWeb_Android_LandingPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert =new SoftAssertions();

        @And ("I verify all the section Pages in Landing Page in Android Mobile Web")
        public void IVerifyAllTheSectionPagesInLandingPage() {
                CNAWeb_LandingPage.validateHeaderMenuSections();
        }

        @Then("I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section in Android Mobile Web")
        public void iValidateAllTheCategoryHeaderComponentsFromHeaderToElsewhereMediacorpWidgetSection() {
                CNAWeb_LandingPage.validateAllComponentsOfLandingPage();
        }

        @And("I validate Footer section components in Android Mobile Web")
        public void iValidateFooterSectionComponents() {
                CNAWeb_LandingPage.validateFooterSection();
        }

        @And("I verify header section in other component pages and during scroll down in Android Mobile Web")
        public void iVerifyHeaderSectionInOtherComponentPagesAndDuringScrollDown() {
                CNAWeb_LandingPage.validateHeaderInOtherPagesAndScroll();
        }

        @When("I click on the share link from any article in LandingPage in Android Mobile Web")
        public void iClickOnTheShareLinkFromAnyArticleInLandingPage() {
                CNAWeb_LandingPage.clickNewsShareOption();
        }

        @Then("I validate Copy Link button and link text in Android Mobile Web")
        public void iValidateCopyLinkButtonAndLinkText() {
                CNAWeb_LandingPage.validateCopyLinkButton();
        }

       @And("I validate share via social platform links in Android Mobile Web")
        public void iValidateShareViaSocialPlatformLinks() {
                CNAWeb_LandingPage.validateShareViaSocialPlatformIcons();
        }

        @And("I verify Top Stories Primary and Secondary Components in Android Mobile Web")
        public void iVerifyTopStoriesPrimaryAndSecondaryComponents() {
                CNAWeb_LandingPage.validateTopStoriesSections();
        }

    @And("I validate close pop up X button in Android Mobile Web")
    public void iValidateClosePopUpXButton() {
        CNAWeb_LandingPage.validateClosePopUpButton();
    }

    @Then("I click on View More Latest News button in Android Mobile Web")
    public void iClickOnViewMoreLatestNewsButton() {
        CNAWeb_LandingPage.clickViewMoreLatestNewButton();
    }

    @And("I validate if Latest News Page is displayed with all Components in Android Mobile Web")
    public void iValidateIfLatestNewsPageIsDisplayedWithAllComponents() {
            CNAWeb_LandingPage.validateLatestNewsPage();
    }
}
