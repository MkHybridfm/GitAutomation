package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNASettingsPage;

public class iPadCNASettingsPageSteps {

    iPadCNASettingsPage cnaSettingsPage = new iPadCNASettingsPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());


    @And("I click on meRewards on account section in iPad")
    public void iClickOnMeRewardsOnAccountSection() {
        cnaSettingsPage.clickONMeRewardsSec();
    }

    @Then("I Verify the meRewards section page in iPad")
    public void iValidateTheMeRewardsSectionPage() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateMeRewardsSection());
    }

    @Then("I Verify the meRewards Page in iPad")
    public void VerifymeRewardsSectionHeader() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardsSectionHeader());
    }

    @Then("I Verify Cashback under meRewards in iPad")
    public void VerifymeRewardscashBack() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardscashBack());
    }

    @Then("I Verify Surveys meRewards in iPad")
    public void VerifymeRewardssurveys() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardssurveys());
    }

    @Then("I Verify Coupons meRewards in iPad")
    public void VerifymeRewardscoupons() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.VerifymeRewardscoupons());
    }

    @And("I click on back button in iPad")
    public void iClickOnBackButton() {
        cnaSettingsPage.clickOnBackButton();
        cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the login button on settings page in iPad")
    public void iValidateTheLoginButtonOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.verifyLoginButtonOnSettingsPage());
    }

    @And("I click on manage meConnect account on account section in iPad")
    public void iClickOnManageMeConnectAccountOnAccountSection() {
        cnaSettingsPage.clickOnManageMeConnectAccount();
    }

    @Then("I Verify the conformation message to access Manage meconnect account page in iPad")
    public void iValidateTheConformationMessageToAccessAccountOnSectionPage() {
        Assert.assertTrue(cnaSettingsPage.validataConformationMessage());
    }

    @And("I click No button on conformation message in iPad")
    public void iClickNoButtonOnConformationMessage() {
        cnaSettingsPage.clickOnNoButtonOnConformationMessage();
    }

    @And("I Click YES on Manage meconnect Popup in iPad")
    public void clickOnYesButtonOnConformationMessage() {
        cnaSettingsPage.clickOnYesButtonOnConformationMessage();
    }

    @Then("I Verify the Notifications Page from Settings in iPad")
    public void iValidateTheNotificationsPage() {
        Assert.assertTrue(cnaSettingsPage.validateNotificationsPage());
    }

    @And("I click on back button on manage meConnect in iPad")
    @And("I click on back arrow in iPad")
    public void iClickOnBackButtonOnManageMeConnect() {
        cnaSettingsPage.clickOnBackButton();
    }

    @Then("I validate the display page in iPad")
    public void iValidateTheDisplayPage() {
        Assert.assertTrue(cnaSettingsPage.validateDisplayPage());
    }

    @Then("I validate the edition page in iPad")
    public void iValidateTheEditionPage() {
        Assert.assertTrue(cnaSettingsPage.validateEditionPage());
    }

    @Then("I validate the eye witness page in iPad")
    public void iValidateTheEyeWitnessPage() {
        Assert.assertTrue(cnaSettingsPage.validateEyeWitnessPage());
    }

    @Then("I validate the help & feedback page opened in web view in iPad")
    public void iValidateTheHelpFeedbackPageOpenedInWebView() throws InterruptedException {
       Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the advertisement sec opened in web view in iPad")
    public void iValidateTheAdvertisementSecOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
        Assert.assertTrue(cnaSettingsPage.validateContactUsHeaderOnWebView());
    }

    @Then("I validate the mediaCorp digital page opened in web view in iPad")
    public void iValidateTheMediaCorpDigitalPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
    }

    @Then("I Verify the CNA App Version Details in iPad")
    public void iValidateTheAppVersionDetailsOnSettingsPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppVersion());
    }

    @Then("I validate the conformation message on about page in iPad")
    public void iValidateTheConformationMessageOnAboutPage() {
        Assert.assertTrue(cnaSettingsPage.validateAppConformationMessage());
    }

    @Then("I Verify the Channel ID Popup details in iPad")
    public void verifChanelID() {
        Assert.assertTrue(cnaSettingsPage.VerifyChanelIDDetails());
    }

    @And("I Click on Cancel Button in Channel ID Popup in iPad")
    public void chanelIDPopupCancel() {
        cnaSettingsPage.ChanelIDcancel();
    }

    @And("I click on cancel button in iPad")
    public void iClickOnCancelButton() {
        cnaSettingsPage.clickOnCancelButton();
    }

    @Then("I Verify Terms of Service Screen opened in web view in iPad")
    public void iValidateTheTermsOfServicePageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
    }

    @Then("I validate the privacy policy Screen opened in web view in iPad")
    public void iValidateThePrivacyPolicyPageOpenedInWebView() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.validateWebPageUrl());
      //  Assert.assertTrue(cnaSettingsPage.validateContentHeaderOnWebView());
    }

    @And("I Select {string} from Settings in iPad")
    public void selectmenuOption(String  strOption) throws InterruptedException {
        cnaSettingsPage.selectSettingsOption(strOption);
    }

    @And("I Verify {string} Section from Settings in iPad")
    public void verifymenuOption(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption));
    }


    @And("I Select OK from Logout Popup in iPad")
    public void LogoutPopup() throws InterruptedException {
        cnaSettingsPage.LogoutPopup();
    }

    @And("I Verify Loged In User Details in iPad")
    public void LogedInUserDetails() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.LogedInUserDetails());
    }

    @Then("I Verify Manage meconnect account Screen in iPad")
    public void verifymeConnect() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifymeConnect());
    }

    @And("I Verify {string} Info in Notification Screen from Settings in iPad")
    @And("I Verify {string} in Notification Screen from Settings in iPad")
    @And("I Verify {string} in Display Screen from Settings in iPad")
    @And("I Verify {string} Alert Info in Notification Screen from Settings in iPad")
    @And("I Verify {string} in Edition Screen from Settings in iPad")
    @And("I Verify {string} in CNA Eyewitness Screen from Settings in iPad")
    public void verifyMessageNotification(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption));
    }

    @And("I Verify {string} Alert Option in Notification Screen from Settings in iPad")
    public void verifyMessageNotificationOption(String  strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyAlertOption(strOption));
    }

    @And("I Select {string} Alert Option as {string} in Notification Screen from Settings in iPad")
    public void verifyMessageNotificationOption(String  strOptionName,String strValue) throws InterruptedException {
        cnaSettingsPage.SwitchAlertOption(strOptionName,strValue);
    }

    @And("I Verify {string} Alert Option as {string} in Notification Screen from Settings in iPad")
    public void verifyMessageNotificationOptionVerify(String  strOptionName,String strValue) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.SwitchAlertOptionVerify(strOptionName,strValue));
    }

    @And("I Verify {string} Option in {string} under Display Screen from Settings in iPad")
    public void verifyMessage(String  strSubOption,String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessage(strOption,strSubOption));
    }

    @And("I Select {string} Option in {string} under Display Screen from Settings in iPad")
    public void selectSubMenu(String  strSubOption,String strOption) throws InterruptedException {
        cnaSettingsPage.SelectSubMenu(strOption,strSubOption);
    }

    @Then("I Verify Text Size Option in Display Screen in iPad")
    public void verifyTextSize() throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyTextSize());
    }
    @And("I Select {string} in Ediition Page from Settings in iPad")
    public void selectEditionOption(String  strOption) throws InterruptedException {
        cnaSettingsPage.selectEditionOption(strOption);
    }

    @And("I Verify {string} info in CNA Eyewitness Screen from Settings in iPad")
    @And("I Verify {string} info in Help and Feedback Screen from Settings in iPad")
    @And("I Verify {string} info in Advertise with us Screen from Settings in iPad")
    @And("I Verify {string} info in Mediacorp Digital Network Screen from Settings in iPad")
    @And("I Verify {string} info in Privacy Policy Screen from Settings in iPad")
    @And("I Verify {string} info in My Feed Screen in iPad")
    @And("I Verify {string} Tab in Manage Feed Screen in iPad")
    @And("I Verify {string} info in Manage Feed Screen in iPad")
    @And("I Verify {string} info in Topic Section - Home Screen in iPad")
    public void verifyCNAEyewitness(String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessageText(strOption));
    }

    @And("I Verify {string} Button in CNA Eyewitness Screen from Settings in iPad")
    @And("I Verify {string} Button in Help and Feedback Screen from Settings in iPad")
    public void verifyCNAEyewitnessButton(String strOption) throws InterruptedException {
        Assert.assertTrue(cnaSettingsPage.verifyMessageButton(strOption));
    }

    @And("I wait for sometime to load Help and Feedback Screen from Settings in iPad")
    @And("I wait for sometime to load Advertise with us Screen from Settings in iPad")
    @And("I wait for sometime to load Terms of Service Screen from Settings in iPad")
    @And("I wait for sometime to load Privacy Policy Screen from Settings in iPad")
    @And("I wait for sometime to load Auther Screen from Article Detail Page in iPad")
    @And("I wait for sometime to load Article Detail Page in iPad")
    public void waitforsometime() throws InterruptedException {
        Thread.sleep(10000);
    }
}