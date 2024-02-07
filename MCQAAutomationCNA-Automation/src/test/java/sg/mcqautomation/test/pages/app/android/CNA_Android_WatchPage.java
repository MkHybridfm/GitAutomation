package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_WatchPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_WatchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By watchSec;
    private By HeaderOfWatchPage;
    private By liveStatusButton;
    private By fullTvSchedule;
    private By labelOnLiveTv;
    private By latestEpisodeOnWatch;
    private By youMayLikeVideo;
    private By popularShows_Watch;
    private By threeDots_watch;
    private By shareButton_watch;
    private By latestOnCovid;
    private By threeDots_Watch_latest;
    private By bookmarkOnWatchPage;
    private By shareOnWatchPage;
    private By durationOfVideo;
    private By currentTime;
    private By playButtonOnVideo;
    private By durationSeekBarOnVideo;
    private By fullScreenButtonOnVideo;
    private By pauseButtonOnVideo;
    private By closeButtonOnVideo;
    private By threeDots_latest;

    public void initElements() {

        this.watchSec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_name'][@text='Watch']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Watch\"]"));
        this.HeaderOfWatchPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Watch')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeStaticText[@name=\"Watch\"])[1]"));
        this.liveStatusButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "live"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\" LIVE\"]"));
        this.fullTvSchedule = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_full_program"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"View full TV schedule\"]"));
        this.labelOnLiveTv = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'LIVE TV \n" +
                        "International schedule')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"LIVE TV International schedule\"]"));
        this.latestEpisodeOnWatch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Latest')]/parent::android.view.ViewGroup/following-sibling::androidx.recyclerview.widget.RecyclerView//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]"));
        this.youMayLikeVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'You May Also Like')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"You May Also Like\"]"));
        this.popularShows_Watch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Popular Shows')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Popular Shows\"]"));
        this.threeDots_watch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_options"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]"));
        this.shareButton_watch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_share"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]"));
        this.latestOnCovid = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[17]//XCUIElementTypeStaticText"));
        this.threeDots_Watch_latest = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Trending'][@resource-id='com.channelnewsasia:id/tv_name']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[12]"));
        this.bookmarkOnWatchPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmark\"]"));
        this.shareOnWatchPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
        this.durationOfVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmark\"]"));
        this.currentTime = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
        this.playButtonOnVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "bt_play"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
        this.durationSeekBarOnVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "seek_bar"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
        this.fullScreenButtonOnVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "full_screen"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmark\"]"));
        this.pauseButtonOnVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "play"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
        this.closeButtonOnVideo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_close"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));

        this.threeDots_latest = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.ImageView[@resource-id='com.channelnewsasia:id/iv_options']"));
    }

    public void clickOnWatchSec() throws InterruptedException {
        Thread.sleep(2000);
        this.action.elementHelper.fnClick(watchSec);
    }

    public boolean verifyHeaderOfTheWatchPage() throws InterruptedException {
        Thread.sleep(5000);
        this.action.waitHelper.waitFor(HeaderOfWatchPage);
        return this.action.elementHelper.fnIsElementDisplayed(HeaderOfWatchPage);
    }
    public boolean verifyLiveStatusOnWatchPage() throws InterruptedException {
        Thread.sleep(25000);
        return this.action.elementHelper.fnIsElementDisplayed(liveStatusButton);
    }

    public void clickOnFullTvSchedule(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        this.action.elementHelper.fnClick(fullTvSchedule);
    }

    public boolean verifyLabelOnLiveTv(){
        return this.action.elementHelper.fnIsElementDisplayed(labelOnLiveTv);
    }

    public void clickOnLatestEpisode() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(latestEpisodeOnWatch);
                this.action.elementHelper.fnClick(latestEpisodeOnWatch);
    }

    public String verifyTheReferenceVideoLabel() throws InterruptedException {
        Thread.sleep(3000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(youMayLikeVideo);
       return this.action.elementHelper.fnGetText(youMayLikeVideo);
    }

    public String verifyPopularShowsLabel(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(popularShows_Watch);
        return this.action.elementHelper.fnGetText(popularShows_Watch);
    }

    public boolean validateVideoPlayerControls() throws InterruptedException {
        Thread.sleep(43000);
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            //this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
            boolean blnStatus = false;
            boolean bln1 = false;
            boolean bln2 = false;
            boolean bln3 = false;
            boolean bln4 = false;

            bln1 = this.action.elementHelper.fnIsElementDisplayed(bookmarkOnWatchPage);
            bln2 = this.action.elementHelper.fnIsElementDisplayed(shareOnWatchPage);
            bln3 = this.action.elementHelper.fnIsElementDisplayed(currentTime);
            bln4 = this.action.elementHelper.fnIsElementDisplayed(durationOfVideo);


            if (bln1 && bln2 && bln1 && bln2) {
                blnStatus = true;
            }
            return blnStatus;
        } else {
            boolean blnStatus = false;
            boolean bln1 = false;
            boolean bln2 = false;
            boolean bln3 = false;
            boolean bln4 = false;
            boolean bln5 = false;

            bln1 = this.action.elementHelper.fnIsElementDisplayed(playButtonOnVideo);
            this.action.elementHelper.fnClick(playButtonOnVideo);
            bln2 = this.action.elementHelper.fnIsElementDisplayed(durationSeekBarOnVideo);
            bln3 = this.action.elementHelper.fnIsElementDisplayed(fullScreenButtonOnVideo);
            bln4 = this.action.elementHelper.fnIsElementDisplayed(pauseButtonOnVideo);
            bln5 = this.action.elementHelper.fnIsElementDisplayed(closeButtonOnVideo);
            this.action.elementHelper.fnClick(closeButtonOnVideo);

            if (bln1 && bln2 && bln3 && bln4 && bln5) {
                blnStatus = true;
            }
            return blnStatus;
        }
    }

    public void clickOnThreeDotsUnderTheRecommendedSec() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 4);
            for (int i = 0; i < 15; i++) {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                if (this.action.elementHelper.fnIsElementPresent(threeDots_watch)) {
                    this.action.elementHelper.fnClick(threeDots_watch);
                    break;
                }
            }
        } else {
            this.action.elementHelper.fnClick(threeDots_watch);
        }
    }

    public void clickOnThreeDots() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {

        } else {
            for (int i = 0; i <= 20; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
                    if (this.action.elementHelper.fnIsElementDisplayed(threeDots_Watch_latest)) {
                        this.action.elementHelper.fnClick(threeDots_latest);
                        break;
                    }
                } catch (Exception e) {
                }
            }
        }
//        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,16);
//        this.action.elementHelper.fnClick(threeDots_watch);
        }


    public boolean verifyShareOptions(){
        this.action.waitHelper.waitFor(shareButton_watch);
        return this.action.elementHelper.fnIsElementDisplayed(shareButton_watch);
    }





}