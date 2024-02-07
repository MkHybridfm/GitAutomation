package sg.mcqautomation.test.pages.app.android_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_Tab_OnboardingPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Tab_OnboardingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By splashScreen;
    private By welcomeMessage;
    private By cnaLogo;
    private By exploreCNAHeader;
    private By tellUsWhatWording;
    private By getStartedButton;
    private By doItLaterLink;
    private By doItLaterAlertTitle;
    private By doItLaterChoosePreferenceMsg;
    private By noIllContinueButton;
    private By yesIllDOItLaterButton;
    private By savePreferencesPageHeader;
    private By selectTopicText;
    private By trendingTopicsSection;
    private By trendingTopicList;
    private By moreTopicsSection;
    private By moreTopicsList;
    private By savePreferencesButton;
    private By meConnectSignUpPageHeader;
    private By meConnectSignUpPageLogo;
    private By meConnectLogo;
    private By signUpPagePersonalizedContentMessage;
    private By signInWithMeconnectButton;
    private By createOneNowLink;
    private By continueWithAppleButton;
    private By continueWithGoogleButton;
    private By continueWithFacebookButton;
    private By orLoginWithMail;
    private By signInPageHeader;
    private By usernameField;
    private By passwordField;
    private By signInButton;
    private By cancelButton;
    private By ForgotPasswordButton;
    private By loginButtonSettings;
    private By forgotPasswordPageHeader;
    private By enterEmailText;
    private By emailTextBox;
    private By submitButton;


    public void initElements() {
        this.splashScreen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout[@resource-id='com.channelnewsasia:id/fm_container']"));
        this.welcomeMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_welcome_to"));
        this.cnaLogo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_app_logo"));
        this.exploreCNAHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_explore_cna"));
        this.tellUsWhatWording = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_tell_us"));
        this.getStartedButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/bt_get_started"));
        this.doItLaterLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_do_it_later"));
        this.doItLaterAlertTitle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Are you sure you want to do it later?']"));
        this.doItLaterChoosePreferenceMsg = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='If you choose to exit now, your preferences will not be saved.']"));
        this.noIllContinueButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "android:id/button2"));
        this.yesIllDOItLaterButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "android:id/button1"));
        this.savePreferencesPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Add topics to create your personal news feed'][@resource-id='com.channelnewsasia:id/tv_title']"));
        this.selectTopicText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_select_topic"));
        this.trendingTopicsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Trending Topics'][@resource-id='com.channelnewsasia:id/tv_name']"));
        this.trendingTopicList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_trending_topics']/android.widget.CheckBox"));
        this.moreTopicsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='More Topics'][@resource-id='com.channelnewsasia:id/tv_name']"));
        this.moreTopicsList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_more_topics']/android.widget.CheckBox"));
        this.savePreferencesButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_save"));
        this.meConnectSignUpPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='You are \n" + "signing in to']"));
        this.meConnectSignUpPageLogo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_mepass"));
        this.meConnectLogo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_me_connect"));
        this.signUpPagePersonalizedContentMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tvDefaultDetail"));
        this.signInWithMeconnectButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_social_login_meconnect"));
        this.createOneNowLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_create_me_connect_account"));
        this.continueWithAppleButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_social_login_apple"));
        this.continueWithGoogleButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_social_login_google"));
        this.continueWithFacebookButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_social_login_facebook"));
        this.orLoginWithMail = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/login_with_your_mail"));
        this.signInPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_signin"));
        this.usernameField = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/til_email']//android.widget.EditText"));
        this.passwordField = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/til_password']//android.widget.EditText"));
        this.signInButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_sign_in"));
        this.cancelButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_back"));
        this.ForgotPasswordButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_forget_password"));
        this.loginButtonSettings = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/bt_login"));
        this.forgotPasswordPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tvForgotPass"));
        this.enterEmailText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tvForgotPassMsg"));
        this.emailTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/text_input_editText"));
        this.submitButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_forgot_submit"));
    }

    public boolean validateSplashScreen(){
        return this.action.elementHelper.fnIsElementPresent(splashScreen);
    }

    public boolean validateWelcomeScreen(){
        this.action.waitHelper.waitFor(welcomeMessage);
        return this.action.elementHelper.fnIsElementPresent(welcomeMessage);
    }

    public boolean validateOnBoardingScreen()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.cnaLogo);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.exploreCNAHeader);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.tellUsWhatWording);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.getStartedButton);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.doItLaterLink);

        if(bln1 && bln2  && bln3 && bln4 && bln5)
            return true;
        else
            return false;
    }

    public void clickDoItLaterLink(){
        this.action.elementHelper.fnClick(doItLaterLink);
    }

    public boolean validateDoItLaterPopUp()
    {

        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.doItLaterAlertTitle);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.doItLaterChoosePreferenceMsg);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.noIllContinueButton);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.yesIllDOItLaterButton);

        if(bln1 && bln2  && bln3 && bln4)
            return true;
        else
            return false;
    }

    public void clickYesIWillDoItLaterLink(){
        this.action.elementHelper.fnClick(yesIllDOItLaterButton);
    }

    public void clickNoIllContinueLink(){
        this.action.elementHelper.fnClick(noIllContinueButton);
    }

    public boolean validateSavePreferencesPage(){
        return this.action.elementHelper.fnIsElementPresent(savePreferencesPageHeader);
    }


    public void clickGetStartedButton(){
        this.action.elementHelper.fnClick(getStartedButton);
    }

    public boolean validateSavePreferencesPageListingsAndOptions()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.selectTopicText);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.trendingTopicsSection);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.trendingTopicList);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.moreTopicsSection);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.moreTopicsList);
        boolean bln6=this.action.elementHelper.fnIsElementPresent(this.savePreferencesButton);

        if(bln1 && bln2  && bln3 && bln4 && bln5 && bln6)
            return true;
        else
            return false;
    }

    public boolean validateTrendingTopicsList()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.trendingTopicList);
        if(eleList.size()>0)
        {
           return true;
        }
        return false;
    }

    public void selectTrendingTopic(){
        this.action.elementHelper.fnClick(trendingTopicList);
    }


    public boolean validateMoreTopicsList()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.moreTopicsList);
        if(eleList.size()>0)
        {
            return true;
        }
        return false;
    }

    public void selectMoreTopic(){
        this.action.elementHelper.fnClick(moreTopicsList);
    }

    public void clickSavePreferencesButton(){
        this.action.elementHelper.fnClick(savePreferencesButton);
    }

    public boolean validateSignUpPage(){
        this.action.waitHelper.waitFor(meConnectSignUpPageHeader);
        return this.action.elementHelper.fnIsElementPresent(meConnectSignUpPageHeader);
    }

    public boolean validateSignUpPageComponents()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.meConnectSignUpPageLogo);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.meConnectLogo);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.signUpPagePersonalizedContentMessage);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.signInWithMeconnectButton);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.createOneNowLink);

        if(bln1 && bln2  && bln3 && bln4 && bln5 )
            return true;
        else
            return false;
    }

    public void clickOnSignInWithMeConnectLink(){
        this.action.elementHelper.fnClick(signInWithMeconnectButton);
    }

    public boolean validateMoreWaysToSignInOptions()    {

        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.continueWithAppleButton);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.continueWithGoogleButton);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.continueWithFacebookButton);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.orLoginWithMail);

        if(bln1 && bln2  && bln3 && bln4 )
            return true;
        else
            return false;
    }

    public boolean validateSignInPageFieldsAndLogo()    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.continueWithAppleButton);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.continueWithGoogleButton);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.continueWithFacebookButton);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.orLoginWithMail);

        if(bln1 && bln2  && bln3 && bln4 )
            return true;
        else
            return false;
    }

    public boolean validateSignInPage(){
        this.action.waitHelper.waitFor(signInPageHeader);
        return this.action.elementHelper.fnIsElementPresent(signInPageHeader);
    }

    public boolean validateUsernamePasswordFields()    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.usernameField);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.passwordField);

        if(bln1 && bln2 )
            return true;
        else
            return false;
    }

    public boolean validateSignInBackAndForgotPswdButtons()    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.signInButton);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.cancelButton);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.ForgotPasswordButton);

        if(bln1 && bln2 && bln3 )
            return true;
        else
            return false;
    }

    public void enterLoginCredentials() throws InterruptedException {
        this.action.elementHelper.fnType(this.usernameField,objConfig.username);
        this.action.elementHelper.fnClear(passwordField);
        Thread.sleep(2000);
        this.action.elementHelper.fnType(this.passwordField, objConfig.password);
    }


    public void clickOnSignInButton(){
        this.action.elementHelper.fnClick(signInButton);
    }

    public void clickOnLoginButtonFromSettings(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP);
        this.action.waitHelper.waitFor(loginButtonSettings);
        this.action.elementHelper.fnClick(loginButtonSettings);
    }

    public void clickBackButton(){
        this.action.elementHelper.fnClick(cancelButton);
    }

    public void clickForgotPasswordLink(){
        this.action.elementHelper.fnClick(ForgotPasswordButton);
    }

    public boolean validateForgotPasswordPage(){
        this.action.waitHelper.waitFor(forgotPasswordPageHeader);
        return this.action.elementHelper.fnIsElementPresent(forgotPasswordPageHeader);
    }


    public boolean validateForgotPasswordPageSections()    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.enterEmailText);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.emailTextBox);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.submitButton);

        if(bln1 && bln2 && bln3 )
            return true;
        else
            return false;
    }

}
