package sg.mcqautomation.test.pages.app.android_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Tab_SettingsPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Tab_SettingsPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By meRewardsButton;
    private By cashBack;
    private By coupons;
    private By surveys;
    private By meRewardsSectionHeader;
    private By backButton;
    private By loginButton_searchPage;
    private By manageMeConnectButton;
    private By contentOnconformationMessage;
    private By yesButton;
    private By noButton;
    private By alertsButton;
    private By asia_AlertMeOn;
    private By singapore_AlertMeOn;
    private By world_AlertMeOn;
    private By cnaInsider_AlertMeOn;
    private By titleHeader_display;
    private By textSize_display;
    private By onlyOnWifi_display;
    private By videoAutoPlay_display;
    private By Theme_display;
    private By titleHeader_edition;
    private By singapore_edition;
    private By asia_edition;
    private By titleHeader_eyeWitness;
    private By content_eyeWitness;
    private By submitYourTip_eyeWitness;
    private By findMyLocationButton_eyeWitness;
    private By submitNewTipsButton;
    private By webUrl_helpAndFeedBack;
    private By contactUsHeader_helpAndFeedBackWebView;
    private By appVersion;
    private By appConformationMessage;
    private By cancelButton;
    private By contentHeaderOnWebView;

    public void initElements() {

        this.meRewardsButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_me_reward"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther"));
        this.meRewardsSectionHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_name"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"meRewards\"]"));
        this.cashBack = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Cashback: $0.00')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"CashBack: \"]"));
        this.coupons = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_me_reward"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Coupons:\"]"));
        this.surveys = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_me_reward"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Surveys:\"]"));
        this.backButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_back"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon back\"]"));
        this.loginButton_searchPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "bt_login"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Log in\"]"));
        this.manageMeConnectButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_manage_me_connect_account"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Manage meCONNECT account\"]"));
        this.contentOnconformationMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "android:id/message"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Do you want to change password, update personal details and more?\"]"));
        this.yesButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Button[contains(@text,'Yes')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Yes\"]"));
        this.noButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Button[contains(@text,'No')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"No\"]"));
        this.alertsButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Alerts')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Alerts\"]"));
        this.asia_AlertMeOn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Switch[contains(@text,'Asia')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Asia\"]"));
        this.singapore_AlertMeOn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Switch[contains(@text,'Singapore')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Singapore\"]"));
        this.world_AlertMeOn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Switch[contains(@text,'World')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"World\"]"));
        this.cnaInsider_AlertMeOn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Switch[contains(@text,'CNA Insider ON')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"CNA Insider\"]"));
        this.titleHeader_display = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_name"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Display\"]"));
        this.textSize_display = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Text size')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Text size \"]"));
        this.videoAutoPlay_display = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Video autoplay')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Video autoplay\"]"));
        this.onlyOnWifi_display = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.RadioButton[contains(@text,'Only on Wi-Fi')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Only on Wi-Fi\"]"));
        this.Theme_display = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Theme')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Theme\"]"));
        this.titleHeader_edition = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_name"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Edition\"]"));
        this.singapore_edition = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.RadioButton[contains(@text,'Singapore')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Singapore\"]"));
        this.asia_edition = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.RadioButton[contains(@text,'Asia')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Asia\"]"));
        this.titleHeader_eyeWitness = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_name"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"CNA Eyewitness\"]"));
        this.content_eyeWitness = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_message"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText"));
        this.findMyLocationButton_eyeWitness = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "btn_find_location"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Find my location\"]"));
        this.submitYourTip_eyeWitness = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_submit_news_trip"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Submit Your News Tip\"]"));
        this.submitNewTipsButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "btn_submit_new_tip"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Submit my news tip\"]"));
        this.webUrl_helpAndFeedBack = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther[@name=\"URL\"]"));
        this.contactUsHeader_helpAndFeedBackWebView = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Contact Us')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeStaticText[@name=\"Contact Us\"])[1]"));
        this.appVersion = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_app_version"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]"));
        this.appConformationMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "android:id/message"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeStaticText[@name=\"Channel Id\"])[2]"));
        this.cancelButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.Button[contains(@text,'Cancel')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Cancel\"]"));
        this.contentHeaderOnWebView = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Cancel\"]"));

    }


    public boolean validateMeRewardsSection() throws InterruptedException {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;
        boolean bln4=false;
        boolean bln5=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.meRewardsSectionHeader);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.cashBack);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.coupons);
        bln4=this.action.elementHelper.fnIsElementDisplayed(this.surveys);
        bln5=this.action.elementHelper.fnIsElementDisplayed(this.backButton);

        if(bln1 && bln2 && bln3 && bln4 && bln5)
            blnStatus=true;
        return blnStatus;
    }

    public void clickONMeRewardsSec(){
        this.action.waitHelper.waitFor(meRewardsButton);
        this.action.elementHelper.fnClick(meRewardsButton);
    }

    public void clickOnBackButton(){
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 4);
        }
        this.action.waitHelper.waitFor(backButton);
        this.action.elementHelper.fnClick(backButton);
    }

    public boolean verifyLoginButtonOnSettingsPage(){
        this.action.waitHelper.waitFor(loginButton_searchPage);
        return this.action.elementHelper.fnIsElementDisplayed(loginButton_searchPage);
    }

    public void clickOnManageMeConnectAccount(){
        this.action.waitHelper.waitFor(manageMeConnectButton);
        this.action.elementHelper.fnClick(manageMeConnectButton);
    }

    public boolean validataConformationMessage() {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.contentOnconformationMessage);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.yesButton);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.noButton);


        if(bln1 && bln2 && bln3 )
            blnStatus=true;
        return blnStatus;
    }

    public void clickOnNoButtonOnConformationMessage(){
        this.action.waitHelper.waitFor(noButton);
        this.action.elementHelper.fnClick(noButton);
    }

    public boolean validateNotificationsPage() {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;
        boolean bln4=false;
        boolean bln5=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.alertsButton);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.asia_AlertMeOn);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.singapore_AlertMeOn);
        bln4=this.action.elementHelper.fnIsElementDisplayed(this.world_AlertMeOn);
        //bln5=this.action.elementHelper.fnIsElementDisplayed(this.cnaInsider_AlertMeOn);


        if(bln1 && bln2 && bln3 && bln4 )
            blnStatus=true;
        return blnStatus;
    }

    public boolean validateDisplayPage() {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;
        boolean bln4=false;
        boolean bln5=false;
        boolean bln6=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.titleHeader_display);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.backButton);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.textSize_display);
        bln4=this.action.elementHelper.fnIsElementDisplayed(this.videoAutoPlay_display);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
        bln5=this.action.elementHelper.fnIsElementDisplayed(this.onlyOnWifi_display);
        bln6=this.action.elementHelper.fnIsElementDisplayed(this.Theme_display);


        if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 )
            blnStatus=true;
        return blnStatus;
    }

    public boolean validateEditionPage() {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;
        boolean bln4=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.titleHeader_edition);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.backButton);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.singapore_edition);
        bln4=this.action.elementHelper.fnIsElementDisplayed(this.asia_edition);

        if(bln1 && bln2 && bln3 && bln4 )
            blnStatus=true;
        return blnStatus;
    }

    public boolean validateEyeWitnessPage() {
        boolean blnStatus=false;
        boolean bln1=false;
        boolean bln2=false;
        boolean bln3=false;
        boolean bln4=false;
        boolean bln5=false;
        boolean bln6=false;

        bln1=this.action.elementHelper.fnIsElementDisplayed(this.titleHeader_eyeWitness);
        bln2=this.action.elementHelper.fnIsElementDisplayed(this.backButton);
        bln3=this.action.elementHelper.fnIsElementDisplayed(this.content_eyeWitness);
        bln4=this.action.elementHelper.fnIsElementDisplayed(this.submitYourTip_eyeWitness);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,10);
        bln5=this.action.elementHelper.fnIsElementDisplayed(this.findMyLocationButton_eyeWitness);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,5);
        bln6=this.action.elementHelper.fnIsElementDisplayed(this.submitNewTipsButton);


        if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 )
            blnStatus=true;
        return blnStatus;
    }

    public boolean validateWebPageUrl() throws InterruptedException {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            Thread.sleep(15000);
            this.action.waitHelper.waitFor(webUrl_helpAndFeedBack);
            return this.action.elementHelper.fnIsElementDisplayed(webUrl_helpAndFeedBack);
        } else {
            return true;
        }
    }

    public boolean validateContactUsHeaderOnWebView(){
        return this.action.elementHelper.fnIsElementDisplayed(contactUsHeader_helpAndFeedBackWebView);
    }

    public boolean validateAppVersion(){
        return this.action.elementHelper.fnIsElementDisplayed(appVersion);
    }

    public boolean validateAppConformationMessage(){
        return this.action.elementHelper.fnIsElementDisplayed(appConformationMessage);
    }

    public void clickOnCancelButton(){
        this.action.waitHelper.waitFor(cancelButton);
        this.action.elementHelper.fnClick(cancelButton);
    }

    public boolean validateContentHeaderOnWebView(){
        return this.action.elementHelper.fnIsElementDisplayed(contentHeaderOnWebView);
    }

}