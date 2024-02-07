package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_OnboardingPage;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Tab_OnboardingSteps {

    public ActionEngineHelper action;

    CNA_Android_Tab_OnboardingPage cna_android_onboardingPage = new CNA_Android_Tab_OnboardingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    @And("I validate if splash screen is displayed in Android App in Tab")
    public void iValidateIfSplashScreenIsDisplayedInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateSplashScreen());
    }

    @Then("I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App in Tab")
    public void iValidateCNAOnBoardingScreenWithWelcomeScreenIsDisplayedInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateWelcomeScreen());
    }

    @And("I validate if welcome screen with CNA Logo, Get Started Link, Do it Later Links is displayed in Android App in Tab")
    public void iValidateIfWelcomeScreenWithCNALogoGetStartedLinkDoItLaterLinksIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateOnBoardingScreen());
    }

    @When("I Click on Do it Later Button in Android App in Tab")
    public void iClickOnDoItLaterButtonInAndroidApp() {
        cna_android_onboardingPage.clickDoItLaterLink();
    }

    @Then("I validate if Notification Screen is displayed on click of Do it Later link in Android App in Tab")
    public void iVerifyNotificationScreenInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateDoItLaterPopUp());
    }

    @And("I click on Yes I'll do it later option in Tab")
    public void iClickOnYesILlDoItLaterOption() {
        cna_android_onboardingPage.clickYesIWillDoItLaterLink();
    }

    @When("I click on No I'll continue button in Android App in Tab")
    public void iClickOnNoILlContinueButton() {
        cna_android_onboardingPage.clickNoIllContinueLink();
    }

    @Then("I validate if CNA Save preferences page is displayed in Android App in Tab")
    public void iValidateIfCNASavePreferencesPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSavePreferencesPage());
    }

    @When("I click on Get Started button in Android App in Tab")
    public void iClickOnGetStartedButtonInAndroidApp() {
        cna_android_onboardingPage.clickGetStartedButton();
    }

    @Then("I validate if CNA Save preferences page topic Listing and Options in Android App in Tab")
    public void iValidateIfCNASavePreferencesPageTopicListingAndOptions() {
        Assert.assertTrue(cna_android_onboardingPage.validateSavePreferencesPageListingsAndOptions());
    }

    @Then("I Verify CNA OnBoarding Save Preference Trending Topics List in Android App in Tab")
    public void iVerifyCNAOnBoardingSavePreferenceTrendingTopicsListInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateTrendingTopicsList());
    }

    @When("I Select Trending Topics in Android App in Tab")
    public void iSelectTrendingTopicsInAndroidApp() {
        cna_android_onboardingPage.selectTrendingTopic();
    }

    @Then("I Verify CNA OnBoarding Save Preference More Topics Section in Android App in Tab")
    public void iVerifyCNAOnBoardingSavePreferenceMoreTopicsSectionInAndroidApp() {
       Assert.assertTrue(cna_android_onboardingPage.validateMoreTopicsList());
    }

    @When("I Select More Topics in Android App in Tab")
    public void iSelectMoreTopicsInAndroidApp() {
        cna_android_onboardingPage.selectMoreTopic();
    }

    @When("I Click on Save Preference button in Android App in Tab")
    public void iClickOnSavePreferenceButtonInAndroidApp() {
        cna_android_onboardingPage.clickSavePreferencesButton();
    }

    @Then("I validate if meConnect Sign Up page is displayed in Android App in Tab")
    public void iValidateIfMeConnectSignUpPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignUpPage());
    }

    @And("I validate if Cna Logo, meConnect Logo, SignIn Link, Create Account Button are displayed in Android App in Tab")
    public void iValidateIfCnaLogoMeConnectLogoSignInLinkCreateAccountButtonAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignUpPageComponents());
    }

    @And("I validate if SignIn with Apple, Facebook and Google options are displayed in Android App in Tab")
    public void iValidateIfSignInWithAppleFacebookAndGoogleOptionsAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateMoreWaysToSignInOptions());
    }

    @Then("I click on Sign In with meConnect Link from Sign up page in Android App in Tab")
    public void iClickOnSignInWithMeConnectLinkFromSignUpPage() {
        cna_android_onboardingPage.clickOnSignInWithMeConnectLink();
    }

    @And("I validate if Sign In Page is displayed in Android App in Tab")
    public void iValidateIfSignInPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignInPage());
    }

    @And("I validate if Username, password fields are displayed in Android App in Tab")
    public void iValidateIfUsernamePasswordFieldsAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateUsernamePasswordFields());
    }

    @Then("I valdiate if Sign In, Cancel buttons and Forgot password link is displayed in Android App in Tab")
    public void iValdiateIfSignInCancelButtonsAndForgotPasswordLinkIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignInBackAndForgotPswdButtons());
    }

    @Then("I enter valid credentials in Username and Password fields in Android App in Tab")
    public void iEnterValidCredentialsInUsernameAndPasswordFields() throws InterruptedException {
        cna_android_onboardingPage.enterLoginCredentials();
    }

    @When("I click on Log In button in Android App in Tab")
    public void iClickOnLogInButton() {
        cna_android_onboardingPage.clickOnSignInButton();
    }

    @When("I click on login from Settings in Android App in Tab")
    public void iClickOnLoginFromSettingsInAndroidApp() {
        cna_android_onboardingPage.clickOnLoginButtonFromSettings();
    }

    @And("I click on Back button in SignIn Page in Android App in Tab")
    public void iClickOnBackButtonInSignInPageInAndroidApp() {
        cna_android_onboardingPage.clickBackButton();
    }

    @When("I click on Forgot Your Password link in Android App in Tab")
    public void iClickOnForgotYourPasswordLinkInAndroidApp() {
        cna_android_onboardingPage.clickForgotPasswordLink();
    }

    @Then("I validate if Forgot you password page is displayed in Android App in Tab")
    public void iValidateIfForgotYouPasswordPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateForgotPasswordPage());
    }

    @And("I validate if enter email address text, email field and Submit button is displayed in Android App in Tab")
    public void iValidateIfEnterEmailAddressTextEmailFieldAndSubmitButtonIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateForgotPasswordPageSections());
    }
}
