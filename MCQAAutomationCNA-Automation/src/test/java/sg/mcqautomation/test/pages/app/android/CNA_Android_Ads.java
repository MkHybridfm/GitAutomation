package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Ads {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Ads(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By lbAdd;
    private By IMU_add;
    private By newsReport;
    private By podcast;
    private By docAndShows;
    private By homeButton;


    public void initElements() {

        this.lbAdd = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "ad_title"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeStaticText[@name=\"ADVERTISEMENT\"])"));
        this.IMU_add = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'ADVERTISEMENT')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeStaticText[@name=\"ADVERTISEMENT\"])[2]"));
        this.newsReport = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'News Reports')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"News Reports\"]"));
        this.podcast = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Podcasts')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Podcasts\"]"));
        this.docAndShows = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Documentaries & Shows')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Documentaries & Shows\"]"));
        this.homeButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Home\"]"));
    }


    public boolean validateLBAddOnSecLandingPage() throws InterruptedException {
        Thread.sleep(7000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 5);
        this.action.waitHelper.waitFor(lbAdd);
        return this.action.elementHelper.fnIsElementDisplayed(lbAdd);
    }

    public void swipeSecLandingPage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.LEFT);
    }

    public boolean validateIMUAddOnSecLandingPage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 10);
        boolean blnStatus= false;
            for (int i = 0; i <= 30; i++) {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
                    if (this.action.elementHelper.fnIsElementPresent(IMU_add)) {
                        blnStatus = true;
                        break;
                    }
                   else if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                            blnStatus = true;
                            break;
                    }
                }
        return blnStatus;
    }

    public boolean validateLBAddOnWatchPage()  {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN,4);
        for(int i=0;i<=20;i++) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
            if (this.action.elementHelper.fnIsElementPresent(lbAdd))
                break;
        }
        return this.action.elementHelper.fnIsElementDisplayed(lbAdd);
    }

    public boolean validateIMUAddOnWatchPage(){
        boolean blnStatus= false;
        for (int i = 0; i <= 60; i++) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
            if (this.action.elementHelper.fnIsElementPresent(IMU_add)) {
                blnStatus = true;
                break;
            }
                else if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                blnStatus = true;
                break;
            }
        }
        return blnStatus;
    }

    public boolean validateIMUAddOnArticleLandingPage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 8);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 10);
        boolean blnStatus= false;
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
                if (this.action.elementHelper.fnIsElementPresent(IMU_add)) {
                    blnStatus = true;
                    break;
                }
                if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                        blnStatus = true;
                        break;
                    }
                   else
                       this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
            }
            catch (Exception e) {
            }
        }
        return blnStatus;
    }

    public void clickOnNewsReports() {
        boolean blnStatus = false;
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 5);
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(newsReport)) {
                    this.action.elementHelper.fnClick(newsReport);
                    blnStatus = true;
                    break;
                }
            } catch (Exception e) {

            }

        }
    }

    public void clickOnPodcast(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 5);
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(podcast)) {
                    break;
                }
            } catch (Exception e) {

            }
        }
        this.action.elementHelper.fnClick(podcast);
    }

    public void clickOnDocsAndShows(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 5);
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(docAndShows)) {
                    break;
                }
            } catch (Exception e) {

            }
        }
        this.action.elementHelper.fnClick(docAndShows);
    }

    public boolean validateLBAddOnNewReports() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                    break;
                }
            } catch (Exception e) {

            }
        }
            return this.action.elementHelper.fnIsElementDisplayed(lbAdd);
        }


    public boolean validateIMUAddOnNewReports(){
        boolean blnStatus= false;
        for (int i = 0; i <= 20; i++) {
            try{
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                if (this.action.elementHelper.fnIsElementPresent(IMU_add)) {
                    blnStatus = true;
                    break;
                }
                if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                    blnStatus = true;
                    break;
                }
                else
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
            }
            catch (Exception e) {
            }
        }
        return blnStatus;
    }

    public boolean validateLBAddOnPodcast()  {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,1);
        this.action.waitHelper.waitFor(lbAdd);
        return this.action.elementHelper.fnIsElementDisplayed(lbAdd);
    }

    public void clickOnHomeButton(){
        this.action.elementHelper.fnClick(homeButton);
    }

    public boolean validateIMUAdds(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
        boolean blnStatus= false;
        for (int i = 0; i <= 60; i++) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
            if (this.action.elementHelper.fnIsElementPresent(IMU_add)) {
                blnStatus = true;
                break;
            }
            else if (this.action.elementHelper.fnIsElementPresent(lbAdd)) {
                blnStatus = true;
                break;
            }
        }
        return blnStatus;
    }
}