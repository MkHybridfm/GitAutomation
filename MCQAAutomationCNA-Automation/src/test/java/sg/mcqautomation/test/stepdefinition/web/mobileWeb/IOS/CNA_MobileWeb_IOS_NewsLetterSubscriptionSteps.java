package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_NewsLetterSubscriptionPage;

public class CNA_MobileWeb_IOS_NewsLetterSubscriptionSteps {
    CNA_MobileWeb_IOS_NewsLetterSubscriptionPage CNAWeb_NewsLetterSubscriptionPage = new CNA_MobileWeb_IOS_NewsLetterSubscriptionPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Then("I scroll down to Footer Section in IOS Mobile Web")
    public void iScrollDownToFooterSection() throws InterruptedException {
        CNAWeb_NewsLetterSubscriptionPage.scrollToFooterSection();
    }

    @And("I click on Subscribe button in IOS Mobile Web")
    public void iClickOnSubscribeButton() throws InterruptedException {
        CNAWeb_NewsLetterSubscriptionPage.clickOnSubscribeButton();
    }

    @Then("I validate if error message is displayed in IOS Mobile Web")
    public void iValidateIfErrorMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateInvalidErrorMessage());
    }

    @And("I select a newsletter Category from drop down in IOS Mobile Web")
    public void iSelectANewsletterCategoryFromDropDown() {
        CNAWeb_NewsLetterSubscriptionPage.selectNewslettercategory();
    }

    @Then("I provide invalid email ID in IOS Mobile Web")
    public void iProvideInvalidEmailID() {
        CNAWeb_NewsLetterSubscriptionPage.enterInvalidEmailID();
    }

    @And("I validate if Please enter valid email address message is displayed in IOS Mobile Web")
    public void iValidateIfPleaseEnterValidEmailAddressMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateInvalidEmailErrorMessage());
    }

    @Then("I provide valid email ID in IOS Mobile Web")
    public void iProvideValidEmailID() {
        CNAWeb_NewsLetterSubscriptionPage.enterValidEmailID();
    }

    @Then("I validate if Thank you for Subscribing success message is displayed in IOS Mobile Web")
    public void iValidateIfThankYouForSubscribingSuccessMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateSuccessMessage());
    }
}
