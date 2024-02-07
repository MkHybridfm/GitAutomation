package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPadCNASSO {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNASSO(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }
    private By OBWelcome;
    private By OBCNALogo;
    private By OBCNAExploreMsg;
    private By OBCNATellUsMsg;
    private By OBCNAGetStarted;
    private By OBCNADoitlater;
    private By OBCNADoitlaterPopup;
    private By OBCNApermission_notification;
    private By OBCNAPMNMsg1;
    private By OBCNAPMNMsg2;
    private By OBCNAPMNMsg3;
    private By OBCNABtnManageNotifications;
    private By OBCNABtnNotificationsAllow;
    private By OBCNAPMTrkMsg1;
    private By OBCNAPMTrkMsg2;
    private By OBCNAPMTrkMsg3;
    private By OBCNAPMTrkMsg4;
    private By OBCNABtnManageTracking;
    private By PRCNAPrefMsg1;
    private By PRCNAPrefMsg2;
    private By PRCNAPrefTrendingTopics;

    private By PRCNAPrefMoreTopics;
    private By PRCNAPrefMoreTopicsNameList;

    private By PRCNAPrefSavePref;
    private By LoginCNAMsg1;
    private By LoginCNAImg1;
    private By LoginCNAImg2;
    private By LoginCNAMsg2;
    private By LoginCNASigninwithmeconnect;
    private By LoginCNACreateNewAccount;
    private By LoginCNAOR;
    private By LoginCNAApple;
    private By LoginCNAFaceBook;
    private By LoginCNAGoogle;
    private By LoginCNADoItLater;
    private  By allowAppTracking;
    private By allowAppTracking14;


    //***
    private By PRCNAPrefTrendingTopicsList;
    private By PRCNAPrefMoreTopicsOptionList;


    public void initElements() {
        this.PRCNAPrefTrendingTopicsList = MobileAppLocator.GetLocator("(//XCUIElementTypeScrollView)[2]//XCUIElementTypeButton", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefMoreTopicsOptionList =MobileAppLocator.GetLocator("//XCUIElementTypeTable//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);

        //****

        this.OBWelcome = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Welcome to']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNALogo = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='logo-cna-new']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAExploreMsg = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Explore CNA in a brand new way']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNATellUsMsg = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[contains(@name,'Tell us')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAGetStarted =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Get Started']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNADoitlater = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Do it later']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNADoitlaterPopup = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Yes, I’ll do it later']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNApermission_notification = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='permission_notification']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMNMsg1 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Stay In The Loop']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMNMsg2 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Enable notifications so that we can keep you updated on the latest stories, videos and podcasts.']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMNMsg3 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='These notifications can be configured under Settings at any time.']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNABtnManageNotifications = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Manage Notifications']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNABtnNotificationsAllow = MobileAppLocator.GetLocator("//XCUIElementTypeAlert[contains(@name,'Would Like to Send You Notifications')]//XCUIElementTypeButton[@name='Allow']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMTrkMsg1 = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='permission_tracking']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMTrkMsg2 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Keep CNA Free']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMTrkMsg3 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Ads help in supporting our operations. Allow CNA to track your activity across other apps and websites, so that we can recommend ads that are relevant to you based on your preferences.']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNAPMTrkMsg4 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='By tapping this, you are granting the CNA app permission to track your activity.']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.OBCNABtnManageTracking = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Manage Tracking']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefMsg1 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Add topics to create your personal news feed']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefMsg2 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Please select at least one topic.']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefTrendingTopics = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Trending Topics']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefMoreTopics = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='More Topics']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefMoreTopicsNameList = MobileAppLocator.GetLocator("//XCUIElementTypeTable//XCUIElementTypeOther", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PRCNAPrefSavePref = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Save Preferences']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAMsg1 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='You are signing in to']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAImg1 = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='cna-logo-horizontal-colour']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAImg2 = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='new-meconnect-logo']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAMsg2 = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"For personalised and seamless access across Mediacorp's digital services\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNASigninwithmeconnect = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Sign in with meconnect']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNACreateNewAccount = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"Don’t have an account yet? Create one now\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAOR = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='OR']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAApple = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue with Apple']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAFaceBook = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue with Facebook']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNAGoogle = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Continue with Google']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LoginCNADoItLater = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Do it later']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.allowAppTracking=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Allow']" , MobileAppLocator.MobileElementType.XCUICustomElement);
        this.allowAppTracking14=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Allow Tracking']" , MobileAppLocator.MobileElementType.XCUICustomElement);
    }
//Tell us what you like and we will recommend content to you based on your preferences.
    public boolean fnOnBoardingScreen()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.OBWelcome);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.OBCNALogo);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.OBCNAExploreMsg);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.OBCNATellUsMsg);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.OBCNAGetStarted);
        if(bln1 && bln2  && bln3 && bln4 && bln5)
            return true;
        else
            return false;
    }

    public void fnClickonDoItLater()
    {
        this.action.elementHelper.fnClick(this.OBCNADoitlater);
        this.action.elementHelper.fnClick(this.OBCNADoitlaterPopup);
    }

    public void fnClickGetStarted()
    {
        this.action.elementHelper.fnClick(this.OBCNAGetStarted);
    }

    public boolean fnOnBoardingPermissionScreen()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.OBCNApermission_notification);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMNMsg1);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMNMsg2);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMNMsg3);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.OBCNABtnManageNotifications);
        if(bln1 && bln2  && bln3 && bln4 && bln5)
            return true;
        else
            return false;
    }

    public void fnClickOBCNABtnManageNotifications()
    {
        this.action.elementHelper.fnClick(this.OBCNABtnManageNotifications);
        this.action.elementHelper.fnClick(this.OBCNABtnNotificationsAllow);
    }

    public boolean fnOnBoardingManageTracking()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMTrkMsg1);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMTrkMsg2);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMTrkMsg3);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.OBCNAPMTrkMsg4);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.OBCNABtnManageTracking);
        if(bln1 && bln2  && bln3 && bln4 && bln5)
            return true;
        else
            return false;
    }

    public void fnOBCNABtnManageTracking()
    {
        this.action.elementHelper.fnClick(this.OBCNABtnManageTracking);
        if(this.action.elementHelper.fnIsElementPresent(this.allowAppTracking))
            this.action.elementHelper.fnClick(this.allowAppTracking);
        if(this.action.elementHelper.fnIsElementPresent(this.allowAppTracking14))
            this.action.elementHelper.fnClick(this.allowAppTracking14);
    }

    public boolean fnOnBoardingSavePreferences()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.PRCNAPrefMsg1);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.PRCNAPrefMsg2);
        if(bln1 && bln2)
            return true;
        else
            return false;
    }
    public boolean fnOnBoardingSavePreferencesTrendingTopics()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.PRCNAPrefTrendingTopics);
       List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.PRCNAPrefTrendingTopicsList);
        if(bln1 && eleList.size()>0)
            return true;
        else
            return false;
    }



    public boolean fnOnBoardingSavePreferencesMoreTopics()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.PRCNAPrefMoreTopics);
        List<WebElement> eleListName=this.action.elementHelper.fnGetListofElement(this.PRCNAPrefMoreTopicsNameList);
        List<WebElement> eleListTopic=this.action.elementHelper.fnGetListofElement(this.PRCNAPrefMoreTopicsOptionList);
        if(bln1 && eleListName.size()>0 && eleListTopic.size()>0)
            return true;
        else
            return false;
    }



    public void fnClickonSavePref() throws InterruptedException {
        this.action.elementHelper.fnClick(this.PRCNAPrefSavePref);
        Thread.sleep(2000);
    }

    public boolean fnLoginScreen()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.LoginCNAMsg1);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.LoginCNAMsg2);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.LoginCNAImg1);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.LoginCNAImg2);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.LoginCNAOR);
        if(bln1 && bln2  && bln3 && bln4 && bln5)
            return true;
        else
            return false;
    }

    public boolean LoginCNASigninwithmeconnect()
    {
       return this.action.elementHelper.fnIsElementPresent(this.LoginCNASigninwithmeconnect);
    }

    public boolean LoginCNACreateNewAccount()
    {
        return this.action.elementHelper.fnIsElementPresent(this.LoginCNACreateNewAccount);
    }

    public boolean LoginCNAApple()
    {
        return this.action.elementHelper.fnIsElementPresent(this.LoginCNAApple);
    }

    public boolean LoginCNAFaceBook()
    {
        return this.action.elementHelper.fnIsElementPresent(this.LoginCNAFaceBook);
    }

    public boolean LoginCNAGoogle()
    {
        return this.action.elementHelper.fnIsElementPresent(this.LoginCNAGoogle);
    }

    public boolean LoginCNADoItLater()
    {
        return this.action.elementHelper.fnIsElementPresent(this.LoginCNADoItLater);
    }

    public void LoginCNAClickDoItLater()
    {
        this.action.elementHelper.fnClick(this.LoginCNADoItLater);
        this.action.elementHelper.fnClick(this.OBCNADoitlaterPopup);
    }

    //
    public boolean fnSelectTrendingTopics()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.PRCNAPrefTrendingTopicsList);
        if(eleList.size()>0)
        {
            this.action.elementHelper.fnClick(eleList.get(0));
            return true;
        }
        return false;
    }

    public boolean fnSelectMoreTopics()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.PRCNAPrefMoreTopicsOptionList);
        if(eleList.size()>0)
        {
            this.action.elementHelper.fnClick(eleList.get(0));
            return true;
        }
        return false;
    }
}