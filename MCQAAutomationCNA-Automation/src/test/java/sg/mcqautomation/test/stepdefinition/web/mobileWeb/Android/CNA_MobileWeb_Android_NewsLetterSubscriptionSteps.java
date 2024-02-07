package sg.mcqautomation.test.stepdefinition.web.mobileWeb.Android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.Android.CNA_MobileWeb_Android_NewsLetterSubscriptionPage;
import sg.mcqautomation.test.pages.web.prod.CNAWeb_NewsLetterSubscriptionPage;

public class CNA_MobileWeb_Android_NewsLetterSubscriptionSteps {
    CNA_MobileWeb_Android_NewsLetterSubscriptionPage CNAWeb_NewsLetterSubscriptionPage = new CNA_MobileWeb_Android_NewsLetterSubscriptionPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();


    @Then("I scroll down to Footer Section in Android Mobile Web")
    public void iScrollDownToFooterSection() {
        CNAWeb_NewsLetterSubscriptionPage.scrollToFooterSection();
    }

    @And("I click on Subscribe button in Android Mobile Web")
    public void iClickOnSubscribeButton() throws InterruptedException {
        CNAWeb_NewsLetterSubscriptionPage.clickOnSubscribeButton();
    }

    @Then("I validate if error message is displayed in Android Mobile Web")
    public void iValidateIfErrorMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateInvalidErrorMessage());
    }

    @And("I select a newsletter Category from drop down in Android Mobile Web")
    public void iSelectANewsletterCategoryFromDropDown() {
        CNAWeb_NewsLetterSubscriptionPage.selectNewslettercategory();
    }

    @Then("I provide invalid email ID in Android Mobile Web")
    public void iProvideInvalidEmailID() {
        CNAWeb_NewsLetterSubscriptionPage.enterInvalidEmailID();
    }

    @And("I validate if Please enter valid email address message is displayed in Android Mobile Web")
    public void iValidateIfPleaseEnterValidEmailAddressMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateInvalidEmailErrorMessage());
    }

    @Then("I provide valid email ID in Android Mobile Web")
    public void iProvideValidEmailID() {
        CNAWeb_NewsLetterSubscriptionPage.enterValidEmailID();
    }

    @Then("I validate if Thank you for Subscribing success message is displayed in Android Mobile Web")
    public void iValidateIfThankYouForSubscribingSuccessMessageIsDisplayed() {
        Assert.assertTrue(CNAWeb_NewsLetterSubscriptionPage.validateSuccessMessage());
    }
}
