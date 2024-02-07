package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.utilities.FileUtilities;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_LoginPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    private AndroidDriver androidDriver;

    public CNA_MobileWeb_Android_LoginPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.androidDriver = androidDriver;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By  mainMenuHomePage;
    private By  menuLinkSignIn;
    private By  menuLinkFeed;
    private By  menuLinkSearch;
    private By  headerSignInwithMeConnect;
    private By  username_web;
    private By  password_web;
    private By  btnSignIn;
    private By  userProfilephoto;
    private By  userProfileName;
    private By errorLogin;
    private By btncreateMeConnectAccount;
    private By btnContinueWithApple;
    private By btnContinueWithFacebook;
    private By btnContinueWithGoogle;
    private By linkForgotPassword;
    private By createMeConnectAccountPage;
    private By first_name;
    private By last_name;
    private By email_address;
    private By email_password;
    private By password_confirm;
    private By gender_dropdown;
    private By genderSelectMale;
    private By dateOfBirth;
    private By termsAndConditions;
    private By btnCreateNow;
    private By AccountCreatedsuccessMessage;
    private By emailRequiredErrorMessage;
    private By passwordRequiredErrorMessage;
    private By forgotPasswordLink;
    private By forgotPasswordPopup;
    private By emailtextBox;
    private By submitButton;
    private By enterValidEmailWarningMessage;

    public void initElements() {

        this.mainMenuHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']"));
        this.menuLinkSignIn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'sign-in-link')]]"));
        this.menuLinkFeed = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[contains(.,'My Feed')]"));
        this.menuLinkSearch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[contains(.,'Search')]"));
        this.headerSignInwithMeConnect = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[contains(.,'You are signing in to')]"));
        this.username_web = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//input[@id='edit-email']"));
        this.password_web = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//input[@id='edit-password']"));
        this.btnSignIn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[contains(.,'Sign in')]"));
        this.userProfilephoto = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']"));
        this.userProfileName = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']/span"));
        this.errorLogin = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='password-value']"));
        this.btncreateMeConnectAccount = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Create One Now')]"));
        this.btnContinueWithApple = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='btnAppleSignIn']/parent::a"));
        this.btnContinueWithFacebook = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='btnFBSignIn']/parent::a"));
        this.btnContinueWithGoogle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='btnGoogleSignIn']/parent::a"));
        this.linkForgotPassword = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Forgot your password?')]"));
        this.createMeConnectAccountPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[contains(.,'Create your meconnect account')]"));
        this.first_name = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-first-name"));
        this.last_name = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-last-name"));
        this.email_address = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-email"));
        this.email_password = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-password"));
        this.password_confirm = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-confirm-password"));
        this.gender_dropdown = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='select2-edit-gender-container']/parent::span"));
        this.dateOfBirth = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-dob"));
        this.termsAndConditions = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.ID, "edit-terms-condition"));
        this.btnCreateNow = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[contains(.,'Create Now')]"));
        this.genderSelectMale = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[contains(.,'Male')]"));
        this.AccountCreatedsuccessMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[text()='Thank you, Your meconnect account has been created.']"));
        this.emailRequiredErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='email-message']"));
        this.passwordRequiredErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='password-value']"));
        this.forgotPasswordLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Forgot your password')]"));
        this.forgotPasswordPopup = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='form-user forgot-password user-details']"));
        this.emailtextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='form-user forgot-password user-details']//input[@name='email']"));
        this.submitButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='form-user forgot-password user-details']//input[@name='op']"));
        this.enterValidEmailWarningMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@id='email-error-message']"));

    }

    public void launchApplication() {
          this.action.browserNavigationHelper.fnGetURL(this.objConfig.appURL);
    }

    public boolean verifyHomePage() {
        this.action.waitHelper.waitFor(mainMenuHomePage);
        return this.action.elementHelper.fnVerifyIsDisplayed(mainMenuHomePage);
    }

    public boolean verifyPrimaryMenuLinks() {
        boolean blnMenuLinks=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(menuLinkSignIn);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(menuLinkFeed);
        bln3 = this.action.elementHelper.fnIsElementDisplayed(menuLinkSearch);
        if(bln1 && bln2 && bln3 )
            blnMenuLinks=true;
        return blnMenuLinks;
    }

    public void clickOnSignIn(){
        this.action.javaScriptHelper.fnJSClick(menuLinkSignIn);
    }

    public boolean signInOnBoardingPage(){
        return this.action.elementHelper.fnIsElementDisplayed(headerSignInwithMeConnect);
    }

    public void loginWithValidCreds(){
        this.action.elementHelper.fnType(this.username_web,objConfig.username);
        this.action.elementHelper.fnType(this.password_web, objConfig.password);
    }

    public void clickSignInButton() throws InterruptedException {
        this.action.javaScriptHelper.fnJSClick(btnSignIn);
        Thread.sleep(5000);
    }

    public void refreshBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    public void validateProfilePhoto(){
        this.action.waitHelper.fnWaitForVisibilityOf(userProfilephoto);
        this.action.elementHelper.fnIsElementDisplayed(userProfilephoto);
    }

    public void validateUsername(){
        this.action.elementHelper.fnIsElementDisplayed(userProfileName);
    }

    public boolean validatePrimaryNavigationBars(){
        boolean blnMenuLinks=false;
        boolean bln1=false;
        boolean bln2=false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(menuLinkFeed);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(menuLinkSearch);

        if(bln1 && bln2 )
            blnMenuLinks=true;
        return blnMenuLinks;
    }

    public void loginWithInvalidValidCreds(String username, String password){
        this.action.elementHelper.fnType(this.username_web,username);
        this.action.elementHelper.fnType(this.password_web, password);
    }

    public String fnGetLoginError() throws InterruptedException {
        Thread.sleep(2000);
        return this.action.elementHelper.fnGetText(this.errorLogin);
    }

    public boolean loginOptionsValidations()   {
        boolean signInOptions=false;
        boolean meConnectAccount=false;
        boolean appleLogin=false;
        boolean facebookLogin=false;
        boolean googleLogin=false;


        meConnectAccount = this.action.elementHelper.fnIsElementDisplayed(btncreateMeConnectAccount);
        appleLogin = this.action.elementHelper.fnIsElementDisplayed(btnContinueWithApple);
        facebookLogin = this.action.elementHelper.fnIsElementDisplayed(btnContinueWithFacebook);
        googleLogin = this.action.elementHelper.fnIsElementDisplayed(btnContinueWithGoogle);

        if(meConnectAccount && appleLogin && facebookLogin && googleLogin )
            signInOptions=true;
        return signInOptions;
    }

    public boolean loginToCNAWithMeConnectSectionsValidations() {
        boolean meConnectSignINSection = false;
        boolean username=false;
        boolean password=false;
        boolean forgotPassword=false;

        username = this.action.elementHelper.fnIsElementDisplayed(username_web);
        password = this.action.elementHelper.fnIsElementDisplayed(password_web);
        forgotPassword = this.action.elementHelper.fnIsElementDisplayed(linkForgotPassword);

        if(username && password && forgotPassword )
            meConnectSignINSection=true;
        return meConnectSignINSection;
    }

    public void clickOnCreateNewMeConnectButton(){
        this.action.javaScriptHelper.fnJSClick(btncreateMeConnectAccount);
    }

    public void CreateNewMeConnectAccount() throws InterruptedException {
        //Validate if Create Account page is displayed
        this.action.elementHelper.fnIsElementDisplayed(createMeConnectAccountPage);

        //Enter Values for Account creation
        String strRandomValue= FileUtilities.GetCurrentTimeStampAsString();
        String email = "cna.test" + strRandomValue + "@gmail.com";
        String password = "cnaTest123$";

        this.action.elementHelper.fnType(this.first_name, "Automation");
        this.action.elementHelper.fnType(this.last_name, "QA");
        this.action.elementHelper.fnType(this.email_address, email);
        this.action.elementHelper.fnType(this.email_password, password);
        this.action.elementHelper.fnType(this.password_confirm, password);
        //gender dropdown
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSClick(androidDriver.findElement(gender_dropdown));
        Thread.sleep(1000);
        //this.action.waitHelper.waitFor(genderSelectMale);
        this.action.javaScriptHelper.fnJSClick(androidDriver.findElement(genderSelectMale));

        this.action.elementHelper.fnType(this.dateOfBirth, "01/01/1985");
        this.action.javaScriptHelper.fnJSClick(this.termsAndConditions);
        this.action.waitHelper.fnWaitForElementClickable(btnCreateNow);
        Thread.sleep(2000);
        this.action.javaScriptHelper.fnJSClick(this.btnCreateNow);
    }

    public boolean validateSuccessMessage(){
        return this.action.elementHelper.fnVerifyIsDisplayed(AccountCreatedsuccessMessage);
    }

    public boolean validateWarningMessage(){
        boolean errorMsg=false;
        boolean bln1=false;
        boolean bln2=false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(emailRequiredErrorMessage);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(passwordRequiredErrorMessage);
        if(bln1 && bln2 )
            errorMsg=true;
        return errorMsg;
    }

    public void clickForgotPasswordLink(){
        this.action.javaScriptHelper.fnJSClick(forgotPasswordLink);
    }

    public boolean validateForgotPasswordPopup(){
        this.action.waitHelper.waitFor(forgotPasswordPopup);
        return this.action.elementHelper.fnVerifyIsDisplayed(forgotPasswordPopup);
    }

    public boolean validateSubmitButtonAndEmailTextbox(){
        boolean forgotpassword=false;
        boolean bln1=false;
        boolean bln2=false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(emailtextBox);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(submitButton);
        if(bln1 && bln2 )
            forgotpassword=true;
        return forgotpassword;
    }

    public void clickSubmitButton(){
        this.action.javaScriptHelper.fnJSClick(submitButton);
    }

    public boolean validateEnterValidmailMessage(){
        this.action.waitHelper.waitFor(enterValidEmailWarningMessage);
        return this.action.elementHelper.fnVerifyIsDisplayed(enterValidEmailWarningMessage);
    }


}
