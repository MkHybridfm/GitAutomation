package sg.mcqautomation.test.stepdefinition.web.prod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_LandingPage;

public class CNAWeb_LandingPageSteps {

        CNAWeb_LandingPage CNAWeb_LandingPage = new CNAWeb_LandingPage(DriverFactory.getDriver(),
                DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert =new SoftAssertions();

        @And ("I verify all the section Pages in Landing Page")
        public void IVerifyAllTheSectionPagesInLandingPage() {
                CNAWeb_LandingPage.validateHeaderMenuSections();
        }

        @Then("I validate all the Category Header Components from header to Elsewhere Mediacorp Widget section")
        public void iValidateAllTheCategoryHeaderComponentsFromHeaderToElsewhereMediacorpWidgetSection() {
                CNAWeb_LandingPage.validateAllComponentsOfLandingPage();
        }

        @And("I validate Footer section components")
        public void iValidateFooterSectionComponents() {
                CNAWeb_LandingPage.validateFooterSection();
        }

        @And("I verify header section in other component pages and during scroll down")
        public void iVerifyHeaderSectionInOtherComponentPagesAndDuringScrollDown() {
                CNAWeb_LandingPage.validateHeaderInOtherPagesAndScroll();
        }

        @When("I click on the share link from any article in LandingPage")
        public void iClickOnTheShareLinkFromAnyArticleInLandingPage() {
                CNAWeb_LandingPage.clickNewsShareOption();
        }

        @Then("I validate Copy Link button and link text")
        public void iValidateCopyLinkButtonAndLinkText() {
                CNAWeb_LandingPage.validateCopyLinkButton();
        }

       @And("I validate share via social platform links")
        public void iValidateShareViaSocialPlatformLinks() {
                CNAWeb_LandingPage.validateShareViaSocialPlatformIcons();
        }

        @And("I verify Top Stories Primary and Secondary Components")
        public void iVerifyTopStoriesPrimaryAndSecondaryComponents() {
                CNAWeb_LandingPage.validateTopStoriesSections();
        }

    @And("I validate close pop up X button")
    public void iValidateClosePopUpXButton() {
        CNAWeb_LandingPage.validateClosePopUpButton();
    }

    @Then("I click on View More Latest News button")
    public void iClickOnViewMoreLatestNewsButton() {
        CNAWeb_LandingPage.clickViewMoreLatestNewButton();
    }

    @And("I validate if Latest News Page is displayed with all Components")
    public void iValidateIfLatestNewsPageIsDisplayedWithAllComponents() {
            CNAWeb_LandingPage.validateLatestNewsPage();
    }
}
