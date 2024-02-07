package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_ProfilePopupPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_ProfilePopupPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By userProfilephoto;
    private By profilePopUp;
    private By meRewardsSection;
    private By manageInterestLink;
    private By BookmarksLink;
    private By MyFeedLink;
    private By SignOutLink;
    private By manageMeConnectAccountBtn;
    private  By profileSetupPage;


    public void initElements() {
        this.userProfilephoto = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']"));
        this.profilePopUp = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']"));
        this.meRewardsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='reward']"));
        this.manageInterestLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Manage Interests')]"));
        this.BookmarksLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Bookmarks')]"));
        this.MyFeedLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'My Feed')]"));
        this.SignOutLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Sign Out')]"));
        this.manageMeConnectAccountBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@id='managemeconnect']"));
        this.profileSetupPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='menu-item home']/span[contains(.,'Home')]"));

    }

    public void clickOnProfilePhoto(){
        this.action.waitHelper.fnWaitForVisibilityOf(userProfilephoto);
        this.action.javaScriptHelper.fnJSClick(userProfilephoto);
    }
    public boolean popUpScreen(){
        this.action.waitHelper.fnWaitForVisibilityOf(profilePopUp);
        return this.action.elementHelper.fnIsElementDisplayed(profilePopUp);
    }

    public boolean validateProfileInformationPopUp() throws InterruptedException {
        boolean profilePopUpSections=false;
        boolean lnk1=false;
        boolean lnk2=false;
        boolean lnk3=false;
        boolean lnk4=false;
        boolean lnk5=false;
        boolean lnk6=false;

        Thread.sleep(2000);
        lnk1 = this.action.elementHelper.fnIsElementDisplayed(meRewardsSection);
        lnk2 = this.action.elementHelper.fnIsElementDisplayed(manageInterestLink);
        lnk3 = this.action.elementHelper.fnIsElementDisplayed(BookmarksLink);
        lnk4 = this.action.elementHelper.fnIsElementDisplayed(MyFeedLink);
        lnk5 = this.action.elementHelper.fnIsElementDisplayed(SignOutLink);
        lnk6 = this.action.elementHelper.fnIsElementDisplayed(manageMeConnectAccountBtn);
        if(lnk1 && lnk2 && lnk3 && lnk4 && lnk5 && lnk6 )
            profilePopUpSections=true;
        return profilePopUpSections;
    }

    public void signOutYourAccount(){
        this.action.javaScriptHelper.fnJSClick(SignOutLink);
    }

    public boolean validateManageMeconnectButton() throws InterruptedException {
        Thread.sleep(2000);
        this.action.waitHelper.fnWaitForVisibilityOf(manageMeConnectAccountBtn);
        return this.action.elementHelper.fnIsElementDisplayed(manageMeConnectAccountBtn);
    }

    public void clickManageMeConnectButton(){
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(manageMeConnectAccountBtn);
    }

    public boolean validateMeConnectProfileSetupPage(){
        this.action.waitHelper.fnWaitForVisibilityOf(profileSetupPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(profileSetupPage);
    }



}
