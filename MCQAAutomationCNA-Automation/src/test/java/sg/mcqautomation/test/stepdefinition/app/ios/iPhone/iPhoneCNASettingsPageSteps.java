package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNASettingsPage;

public class iPhoneCNASettingsPageSteps {

    iPhoneCNASettingsPage cnaSettingsPage = new iPhoneCNASettingsPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());


    @And("I click on meRewards on account section in iPhone")
    public void iClickOnMeRewardsOnAccountSection() {
        cnaSettingsPage.clickONMeRewardsSec();
    }

    @Then("I Verify the meRewards section page in iPhone")
    public void iValidateTheMeRewardsSectionPage() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateMeRewardsSection());
    }

    @Then("I Verify the meRewards Page in iPhone")
    public void VerifymeRewardsSectionHeader() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardsSectionHeader());
    }

    @Then("I Verify Cashback under meRewards in iPhone")
    public void VerifymeRewardscashBack() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardscashBack());
    }

    @Then("I Verify Surveys meRewards in iPhone")
    public void VerifymeRewardssurveys() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardssurveys());
    }

    @Then("I Verify Coupons meRewards in iPhone")
    public void VerifymeRewardscoupons() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardscoupons());
    }

    @And("I click on back button in iPhone")
    public void iClickOnBackButton() {
        cnaSettingsPage.clickOnBackButton();
        //cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the login button on settings page in iPhone")
    public void iValidateTheLoginButtonOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.verifyLoginButtonOnSettingsPage());
    }

    @And("I click on manage meConnect account on account section in iPhone")
    public void iClickOnManageMeConnectAccountOnAccountSection() {
        cnaSettingsPage.clickOnManageMeConnectAccount();
    }

    @Then("I Verify the conformation message to access Manage meconnect account page in iPhone")
    public void iValidateTheConformationMessageToAccessAccountOnSectionPage() {
        Assert.assertTrue(cnaSettingsPage.validataConformationMessage());
    }

    @And("I click No button on conformation message in iPhone")
    public void iClickNoButtonOnConformationMessage() {
        cnaSettingsPage.clickOnNoButtonOnConformationMessage();
    }

    @And("I Click YES on Manage meconnect Popup in iPhone")
    public void clickOnYesButtonOnConformationMessage() {
        cnaSettingsPage.clickOnYesButtonOnConformationMessage();
    }

    @Then("I Verify the Notifications Page from Settings in iPhone")
    public void iValidateTheNotificationsPage() {
        Assert.assertTrue(cnaSettingsPage.validateNotificationsPage());
    }

    @And("I click on back button on manage meConnect in iPhone")
    @And("I click on back arrow in iPhone")
    public void iClickOnBackButtonOnManageMeConnect() {
        cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the display page in iPhone")
    public void iValidateTheDisplayPage() {
        Assert.assertTrue(cnaSettingsPage.validateDisplayPage());
    }

    @Then("I validate the edition page in iPhone")
    public void iValidateTheEditionPage() {
        Assert.assertTrue(cnaSettingsPage.validateEditionPage());
    }

    @Then("I validate the eye witness page in iPhone")
    public void iValidateTheEyeWitnessPage() {
        Assert.assertTrue(cnaSettingsPage.validateEyeWitnessPage());
    }

    @Then("I validate the help & feedback page opened in web view in iPhone")
    public void iValidateTheHelpFeedbackPageOpenedInWebView() throws InterruptedException {
       Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the advertisement sec opened in web view in iPhone")
    public void iValidateTheAdvertisementSecOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the mediaCorp digital page opened in web view in iPhone")
    public void iValidateTheMediaCorpDigitalPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
    }

    @Then("I Verify the CNA App Version Details in iPhone")
    public void iValidateTheAppVersionDetailsOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppVersion());
    }

    @Then("I validate the conformation message on about page in iPhone")
    public void iValidateTheConformationMessageOnAboutPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppConformationMessage());
    }

    @Then("I Verify the Channel ID Popup details in iPhone")
    public void verifChanelID() {
        Assert.assertTrue(cnaSettingsPage.VerifyChanelIDDetails());
    }

    @And("I Click on Cancel Button in Channel ID Popup in iPhone")
    public void chanelIDPopupCancel() {
        cnaSettingsPage.ChanelIDcancel();
    }

    @And("I click on cancel button in iPhone")
    public void iClickOnCancelButton() {
        cnaSettingsPage.clickOnCancelButton();
    }

    @Then("I Verify Terms of Service Screen opened in web view in iPhone")
    public void iValidateTheTermsOfServicePageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
    }

    @Then("I validate the privacy policy Screen opened in web view in iPhone")
    public void iValidateThePrivacyPolicyPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
      //  Assert.assertTrue(cnaSettingsPage.validateContentHeaderOnWebView());
    }

    @And("I Select {string} from Settings in iPhone")
    public void selectmenuOption(String  strOption) throws InterruptedException {
        cnaSettingsPage.selectSettingsOption(strOption);
    }

    @And("I Verify {string} Section from Settings in iPhone")
    public void verifymenuOption(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption));
    }




    @And("I Verify Loged In User Details in iPhone")
    public void LogedInUserDetails() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.LogedInUserDetails());
    }

    @Then("I Verify Manage meconnect account Screen in iPhone")
    public void verifymeConnect() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifymeConnect());
    }

    @And("I Verify {string} Info in Notification Screen from Settings in iPhone")
    @And("I Verify {string} in Notification Screen from Settings in iPhone")
    @And("I Verify {string} in Display Screen from Settings in iPhone")
    @And("I Verify {string} Alert Info in Notification Screen from Settings in iPhone")
    @And("I Verify {string} in Edition Screen from Settings in iPhone")
    @And("I Verify {string} in CNA Eyewitness Screen from Settings in iPhone")
    public void verifyMessageNotification(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption));
    }

    @And("I Verify {string} Alert Option in Notification Screen from Settings in iPhone")
    public void verifyMessageNotificationOption(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyAlertOption(strOption));
    }

    @And("I Select {string} Alert Option as {string} in Notification Screen from Settings in iPhone")
    public void verifyMessageNotificationOption(String  strOptionName,String strValue) throws InterruptedException {
        cnaSettingsPage.SwitchAlertOption(strOptionName,strValue);
    }

    @And("I Verify {string} Alert Option as {string} in Notification Screen from Settings in iPhone")
    public void verifyMessageNotificationOptionVerify(String  strOptionName,String strValue) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.SwitchAlertOptionVerify(strOptionName,strValue));
    }

    @And("I Verify {string} Option in {string} under Display Screen from Settings in iPhone")
    public void verifyMessage(String  strSubOption,String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption,strSubOption));
    }

    @And("I Select {string} Option in {string} under Display Screen from Settings in iPhone")
    public void selectSubMenu(String  strSubOption,String strOption) throws InterruptedException {
        cnaSettingsPage.SelectSubMenu(strOption,strSubOption);
    }

    @Then("I Verify Text Size Option in Display Screen in iPhone")
    public void verifyTextSize() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyTextSize());
    }
    @And("I Select {string} in Ediition Page from Settings in iPhone")
    public void selectEditionOption(String  strOption) throws InterruptedException {
        cnaSettingsPage.selectEditionOption(strOption);
    }

    @And("I Verify {string} info in CNA Eyewitness Screen from Settings in iPhone")
    @And("I Verify {string} info in Help and Feedback Screen from Settings in iPhone")
    @And("I Verify {string} info in Advertise with us Screen from Settings in iPhone")
    @And("I Verify {string} info in Mediacorp Digital Network Screen from Settings in iPhone")
    @And("I Verify {string} info in Privacy Policy Screen from Settings in iPhone")
    @And("I Verify {string} info in My Feed Screen in iPhone")
    @And("I Verify {string} Tab in Manage Feed Screen in iPhone")
    @And("I Verify {string} info in Manage Feed Screen in iPhone")
    @And("I Verify {string} info in Topic Section - Home Screen in iPhone")
    public void verifyCNAEyewitness(String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessageText(strOption));
    }

    @And("I Verify {string} Button in CNA Eyewitness Screen from Settings in iPhone")
    @And("I Verify {string} Button in Help and Feedback Screen from Settings in iPhone")
    public void verifyCNAEyewitnessButton(String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessageButton(strOption));
    }

    @And("I wait for sometime to load Help and Feedback Screen from Settings in iPhone")
    @And("I wait for sometime to load Advertise with us Screen from Settings in iPhone")
    @And("I wait for sometime to load Terms of Service Screen from Settings in iPhone")
    @And("I wait for sometime to load Privacy Policy Screen from Settings in iPhone")
    @And("I wait for sometime to load Auther Screen from Article Detail Page in iPhone")
    @And("I wait for sometime to load Article Detail Page in iPhone")
    public void waitforsometime() throws InterruptedException {
        Thread.sleep(10000);
    }

    @And("I Select OK from Logout Popup in iPhone")
    public void LogoutPopup() throws InterruptedException {
        cnaSettingsPage.LogoutPopup();
    }
}