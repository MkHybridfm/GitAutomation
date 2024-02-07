package sg.mcqautomation.test.stepdefinition.app.android;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_OnboardingPage;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_OnboardingSteps {

    public ActionEngineHelper action;

    CNA_Android_OnboardingPage cna_android_onboardingPage = new CNA_Android_OnboardingPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    @And("I validate if splash screen is displayed in Android App")
    public void iValidateIfSplashScreenIsDisplayedInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateSplashScreen());
    }

    @Then("I validate CNA OnBoarding Screen with Welcome screen is displayed in Android App")
    public void iValidateCNAOnBoardingScreenWithWelcomeScreenIsDisplayedInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateWelcomeScreen());
    }

    @And("I validate if welcome screen with CNA Logo, Get Started Link, Do it Later Links is displayed")
    public void iValidateIfWelcomeScreenWithCNALogoGetStartedLinkDoItLaterLinksIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateOnBoardingScreen());
    }

    @When("I Click on Do it Later Button in Android App")
    public void iClickOnDoItLaterButtonInAndroidApp() {
        cna_android_onboardingPage.clickDoItLaterLink();
    }

    @Then("I validate if Notification Screen is displayed on click of Do it Later link in Android App")
    public void iVerifyNotificationScreenInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateDoItLaterPopUp());
    }

    @And("I click on Yes I'll do it later option")
    public void iClickOnYesILlDoItLaterOption() {
        cna_android_onboardingPage.clickYesIWillDoItLaterLink();
    }

    @When("I click on No I'll continue button")
    public void iClickOnNoILlContinueButton() {
        cna_android_onboardingPage.clickNoIllContinueLink();
    }

    @Then("I validate if CNA Save preferences page is displayed in Android App")
    public void iValidateIfCNASavePreferencesPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSavePreferencesPage());
    }

    @When("I click on Get Started button in Android App")
    public void iClickOnGetStartedButtonInAndroidApp() {
        cna_android_onboardingPage.clickGetStartedButton();
    }

    @Then("I validate if CNA Save preferences page topic Listing and Options")
    public void iValidateIfCNASavePreferencesPageTopicListingAndOptions() {
        Assert.assertTrue(cna_android_onboardingPage.validateSavePreferencesPageListingsAndOptions());
    }

    @Then("I Verify CNA OnBoarding Save Preference Trending Topics List in Android App")
    public void iVerifyCNAOnBoardingSavePreferenceTrendingTopicsListInAndroidApp() {
        Assert.assertTrue(cna_android_onboardingPage.validateTrendingTopicsList());
    }

    @When("I Select Trending Topics in Android App")
    public void iSelectTrendingTopicsInAndroidApp() {
        cna_android_onboardingPage.selectTrendingTopic();
    }

    @Then("I Verify CNA OnBoarding Save Preference More Topics Section in Android App")
    public void iVerifyCNAOnBoardingSavePreferenceMoreTopicsSectionInAndroidApp() {
       Assert.assertTrue(cna_android_onboardingPage.validateMoreTopicsList());
    }

    @When("I Select More Topics in Android App")
    public void iSelectMoreTopicsInAndroidApp() {
        cna_android_onboardingPage.selectMoreTopic();
    }

    @When("I Click on Save Preference button in Android App")
    public void iClickOnSavePreferenceButtonInAndroidApp() {
        cna_android_onboardingPage.clickSavePreferencesButton();
    }

    @Then("I validate if meConnect Sign Up page is displayed")
    public void iValidateIfMeConnectSignUpPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignUpPage());
    }

    @And("I validate if Cna Logo, meConnect Logo, SignIn Link, Create Account Button are displayed")
    public void iValidateIfCnaLogoMeConnectLogoSignInLinkCreateAccountButtonAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignUpPageComponents());
    }

    @And("I validate if SignIn with Apple, Facebook and Google options are displayed")
    public void iValidateIfSignInWithAppleFacebookAndGoogleOptionsAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateMoreWaysToSignInOptions());
    }

    @Then("I click on Sign In with meConnect Link from Sign up page")
    public void iClickOnSignInWithMeConnectLinkFromSignUpPage() {
        cna_android_onboardingPage.clickOnSignInWithMeConnectLink();
    }

    @And("I validate if Sign In Page is displayed")
    public void iValidateIfSignInPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateSignInPage());
    }

    @And("I validate if Username, password fields are displayed")
    public void iValidateIfUsernamePasswordFieldsAreDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateUsernamePasswordFields());
    }

    @Then("I valdiate if Sign In, Cancel buttons and Forgot password link is displayed")
    public void iValdiateIfSignInCancelButtonsAndForgotPasswordLinkIsDisplayed() {
        cna_android_onboardingPage.validateSignInBackAndForgotPswdButtons();
    }

    @Then("I enter valid credentials in Username and Password fields")
    public void iEnterValidCredentialsInUsernameAndPasswordFields() throws InterruptedException {
        cna_android_onboardingPage.enterLoginCredentials();
    }

    @When("I click on Log In button")
    public void iClickOnLogInButton() {
        cna_android_onboardingPage.clickOnSignInButton();
    }

    @When("I click on login from Settings in Android App")
    public void iClickOnLoginFromSettingsInAndroidApp() {
        cna_android_onboardingPage.clickOnLoginButtonFromSettings();
    }

    @And("I click on Back button in SignIn Page in Android App")
    public void iClickOnBackButtonInSignInPageInAndroidApp() {
        cna_android_onboardingPage.clickBackButton();
    }

    @When("I click on Forgot Your Password link in Android app")
    public void iClickOnForgotYourPasswordLinkInAndroidApp() {
        cna_android_onboardingPage.clickForgotPasswordLink();
    }

    @Then("I validate if Forgot you password page is displayed")
    public void iValidateIfForgotYouPasswordPageIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateForgotPasswordPage());
    }

    @And("I validate if enter email address text, email field and Submit button is displayed")
    public void iValidateIfEnterEmailAddressTextEmailFieldAndSubmitButtonIsDisplayed() {
        Assert.assertTrue(cna_android_onboardingPage.validateForgotPasswordPageSections());
    }

    @Then("I validate if CNA logo is displayed in CNA Onboarding Screen in Android Mobile")
    public void iValidateIfCNALogoIsDisplayedInCNAOnboardingScreenInAndroidMobile() throws Throwable {
        Assert.assertTrue(cna_android_onboardingPage.validateCNALogo());
    }
}
