package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_SettingsPage;

public class CNA_Android_Tab_SettingsPageSteps {

    CNA_Android_Tab_SettingsPage cnaSettingsPage = new CNA_Android_Tab_SettingsPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());


    @And("I click on meRewards on account section in Android App in Tab")
    public void iClickOnMeRewardsOnAccountSection() {
        cnaSettingsPage.clickONMeRewardsSec();
    }

    @Then("I validate the meRewards section page in Android App in Tab")
    public void iValidateTheMeRewardsSectionPage() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateMeRewardsSection());
    }

    @And("I click on back button in Android App in Tab")
    public void iClickOnBackButton() {
        cnaSettingsPage.clickOnBackButton();
        //cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the login button on settings page in Android App in Tab")
    public void iValidateTheLoginButtonOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.verifyLoginButtonOnSettingsPage());
    }

    @And("I click on manage meConnect account on account section in Android App in Tab")
    public void iClickOnManageMeConnectAccountOnAccountSection() {
        cnaSettingsPage.clickOnManageMeConnectAccount();
    }

    @Then("I validate the conformation message to access account on section page in Android App in Tab")
    public void iValidateTheConformationMessageToAccessAccountOnSectionPage() {
        Assert.assertTrue(cnaSettingsPage.validataConformationMessage());
    }

    @And("I click No button on conformation message in Android App in Tab")
    public void iClickNoButtonOnConformationMessage() {
        cnaSettingsPage.clickOnNoButtonOnConformationMessage();
    }

    @Then("I validate the notifications page in Android App in Tab")
    public void iValidateTheNotificationsPage() {
        Assert.assertTrue(cnaSettingsPage.validateNotificationsPage());
    }

    @And("I click on back button on manage meConnect in Android App in Tab")
    @And("I click on back arrow in Android App in Tab")
    public void iClickOnBackButtonOnManageMeConnect() {
        cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the display page in Android App in Tab")
    public void iValidateTheDisplayPage() {
        Assert.assertTrue(cnaSettingsPage.validateDisplayPage());
    }

    @Then("I validate the edition page in Android App in Tab")
    public void iValidateTheEditionPage() {
        Assert.assertTrue(cnaSettingsPage.validateEditionPage());
    }

    @Then("I validate the eye witness page in Android App in Tab")
    public void iValidateTheEyeWitnessPage() {
        Assert.assertTrue(cnaSettingsPage.validateEyeWitnessPage());
    }

    @Then("I validate the help & feedback page opened in web view in Android App in Tab")
    public void iValidateTheHelpFeedbackPageOpenedInWebView() throws InterruptedException {
       Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the advertisement sec opened in web view in Android App in Tab")
    public void iValidateTheAdvertisementSecOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the mediaCorp digital page opened in web view in Android App in Tab")
    public void iValidateTheMediaCorpDigitalPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
    }

    @Then("I validate the app version details on settings page in Android App in Tab")
    public void iValidateTheAppVersionDetailsOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppVersion());
    }

    @Then("I validate the conformation message on about page in Android App in Tab")
    public void iValidateTheConformationMessageOnAboutPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppConformationMessage());
    }

    @And("I click on cancel button in Android App in Tab")
    public void iClickOnCancelButton() {
        cnaSettingsPage.clickOnCancelButton();
    }

    @Then("I validate the terms of service page opened in web view in Android App in Tab")
    public void iValidateTheTermsOfServicePageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
       // Assert.assertTrue(cnaSettingsPage.validateContentHeaderOnWebView());
    }

    @Then("I validate the privacy policy page opened in web view in Android App in Tab")
    public void iValidateThePrivacyPolicyPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
      //  Assert.assertTrue(cnaSettingsPage.validateContentHeaderOnWebView());
    }
}



