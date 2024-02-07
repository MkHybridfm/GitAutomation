package sg.mcqautomation.test.pages.app.ios.iPhone;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPhoneCNAWatchPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPhoneCNAWatchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
    private By videocontrol;
    private By videocontrolstarttime;
    private By videocontrolendime;
    private By videocontrolsound;

    public void initElements() {

        this.watchSec = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Watch']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.HeaderOfWatchPage = MobileAppLocator.GetLocator( "(//XCUIElementTypeStaticText[@name='Watch'])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.liveStatusButton = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='CNA Livestream']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.fullTvSchedule = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='View full TV schedule']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.labelOnLiveTv = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='LIVE TV International schedule']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.latestEpisodeOnWatch = MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.youMayLikeVideo = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='You May Also Like']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.popularShows_Watch = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Popular Shows']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDots_watch =MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name='icon menu grey'])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.shareButton_watch =MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name='icon menu grey'])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.latestOnCovid = MobileAppLocator.GetLocator("//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[17]//XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDots_Watch_latest = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name='icon menu grey'])[12]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkOnWatchPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Bookmark']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.shareOnWatchPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.durationOfVideo = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Bookmark']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.currentTime = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.playButtonOnVideo = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.durationSeekBarOnVideo = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.fullScreenButtonOnVideo =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Bookmark']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.pauseButtonOnVideo =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.closeButtonOnVideo =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videocontrol = MobileAppLocator.GetLocator("//XCUIElementTypeOther[@name='Video']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videocontrolstarttime=MobileAppLocator.GetLocator( "(//XCUIElementTypeOther[@name='Video']//..//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videocontrolendime=MobileAppLocator.GetLocator( "(//XCUIElementTypeOther[@name='Video']//..//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videocontrolsound=MobileAppLocator.GetLocator( "(//XCUIElementTypeOther[@name='Video']//..//XCUIElementTypeButton)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
    }

    public void clickOnWatchSec() throws InterruptedException {
        Thread.sleep(2000);
        this.action.elementHelper.fnClick(this.watchSec);
    }

    public boolean verifyHeaderOfTheWatchPage() throws InterruptedException {
        Thread.sleep(5000);
        return this.action.elementHelper.fnIsElementPresent(this.HeaderOfWatchPage);
    }
    public boolean verifyLiveStatusOnWatchPage() throws InterruptedException {
        Thread.sleep(25000);
        return this.action.elementHelper.fnIsElementPresent(this.liveStatusButton);
    }

    public void clickOnFullTvSchedule(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.fullTvSchedule, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.fullTvSchedule);
    }

    public boolean verifyLabelOnLiveTv(){
        return this.action.elementHelper.fnIsElementPresent(this.labelOnLiveTv);
    }

    public void clickOnLatestEpisode() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.latestEpisodeOnWatch);
    }

    public String verifyTheReferenceVideoLabel() throws InterruptedException {
        Thread.sleep(3000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.youMayLikeVideo);
       return this.action.elementHelper.fnGetText(this.youMayLikeVideo);
    }

    public String verifyPopularShowsLabel(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.popularShows_Watch);
        return this.action.elementHelper.fnGetText(this.popularShows_Watch);
    }

    public boolean validateVideoPlayerControls() throws InterruptedException {
            return this.action.elementHelper.fnIsElementPresent(this.videocontrol);
    }

    public void clickOnThreeDotsUnderTheRecommendedSec() {
            this.action.elementHelper.fnClick(this.threeDots_watch);
        }

    public void clickOnThreeDots() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDots_Watch_latest, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.threeDots_latest);
        }


    public boolean verifyShareOptions(){
        this.action.waitHelper.waitFor(this.shareButton_watch);
        return this.action.elementHelper.fnIsElementPresent(this.shareButton_watch);
    }

    public boolean validateVideoPlayerControlsstarttime() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.videocontrolstarttime);
    }

    public boolean validateVideoPlayerControlsendtime() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.videocontrolendime);
    }

    public boolean validateVideoPlayerControlssound() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.videocontrolsound);
    }
}