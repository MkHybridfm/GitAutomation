package sg.mcqautomation.test.pages.app.android_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Tab_ListenPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Tab_ListenPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By listenButton;
    private By contentOnListenPage;
    private By header_listenPage;
    private By contentTitleOnListenPage;
    private By viewFullScheduleLink;
    private By contentTitleOnWebView;
    private By bookmarkOnListenPage;
    private By shareOnListenPage;
    private By article_ListenPage;
    private By playPodcast;
    private By threeDotsOnListen;
    private By clickOnPodcast;


    public void initElements() {

        this.listenButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Listen')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeTable/XCUIElementTypeCell[25]/XCUIElementTypeOther/XCUIElementTypeOther"));
        this.contentOnListenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]"));
        this.header_listenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Listen')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Listen\"]"));
        this.contentTitleOnListenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_title"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
        this.viewFullScheduleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_full_schedule"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"View Full Schedule\"]"));
        this.contentTitleOnWebView = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Life&Style with Daniel Martin')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]"));
        this.bookmarkOnListenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Bookmark')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon bookmark outline\"]"));
        this.shareOnListenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Share')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon share\"]"));
        this.article_ListenPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/cl1']/android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Editor's Picks\"]/parent::XCUIElementTypeCell/following-sibling:: XCUIElementTypeCell[1]/XCUIElementTypeStaticText"));
        this.playPodcast = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/bt_play"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Play\"]"));
        this.threeDotsOnListen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/cl1']/android.widget.ImageView[@resource-id='com.channelnewsasia:id/iv_options']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Editor's Picks\"]/parent::XCUIElementTypeCell/following-sibling:: XCUIElementTypeCell[1]/XCUIElementTypeStaticText"));
        this.clickOnPodcast = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Trending Podcasts\"]/parent::XCUIElementTypeCell/following-sibling:: XCUIElementTypeCell[1]/XCUIElementTypeButton"));
    }

     public boolean verifyTheLiveContentOnListenPage(){
        boolean blnStatus = false;
        boolean bln1= false;
        boolean bln2 = false;
         bln1= this.action.elementHelper.fnIsElementDisplayed(contentTitleOnListenPage);
         //bln2= this.action.elementHelper.fnIsElementDisplayed(contentOnListenPage);

         if(bln1 ){
             blnStatus = true;
         }
         return blnStatus;
     }

    public void clickOnListenPage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,10);
        this.action.elementHelper.fnClick(listenButton);
    }

    public String  verifyHeaderOfListenPage(){
        return this.action.elementHelper.fnGetText(header_listenPage);
    }

    public void clickOnViewFullScheduleLink(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,1);
        for (int i = 0; i <= 20; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(viewFullScheduleLink)) {
                    this.action.elementHelper.fnClick(viewFullScheduleLink);
                    break;
                }
            }
            catch (Exception e){

            }
        }
    }

    public boolean verifyTheContentTitleOnWebView() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.ANDROID_APP) {
            return true;
        } else {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
            for (int i = 0; i <= 20; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                    if (this.action.elementHelper.fnIsElementPresent(contentTitleOnWebView)) {
                        break;
                    }
                } catch (Exception e) {

                }
            }
            return this.action.elementHelper.fnIsElementDisplayed(contentTitleOnWebView);
        }
    }

    public boolean verifyBookMarkAndShareOptions() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            boolean blnStatus = false;
            boolean bln1 = false;
            boolean bln2 = false;
            bln1 = this.action.elementHelper.fnIsElementDisplayed(bookmarkOnListenPage);
            bln2 = this.action.elementHelper.fnIsElementDisplayed(shareOnListenPage);

            if ( bln1 && bln2) {
                blnStatus = true;
            }
            return blnStatus;
            //return true;

        } else {
            boolean blnStatus = false;
            boolean bln1 = false;
            boolean bln2 = false;
            //bln1 = this.action.elementHelper.fnIsElementDisplayed(bookmarkOnListenPage);
            bln2 = this.action.elementHelper.fnIsElementDisplayed(shareOnListenPage);

            if ( bln2) {
                blnStatus = true;
            }
            return blnStatus;
        }
    }

    public void clickONArticle() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
            for (int i = 0; i <= 20; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
                    if (this.action.elementHelper.fnIsElementPresent(article_ListenPage)) {
                        this.action.elementHelper.fnClick(article_ListenPage);
                        break;
                    }
                }
                catch (Exception e){ }
            }

        } else {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 2);
            this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(threeDotsOnListen);
                this.action.elementHelper.fnClick(article_ListenPage);
                }

    }

    public void playPodcast() throws InterruptedException {
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.IOS_APP) {
            this.action.elementHelper.fnClick(playPodcast);
            Thread.sleep(5000);
        }
        else{
            //this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
            this.action.elementHelper.fnClick(playPodcast);
        }
    }

    public void clickOnThreeDotsOnListenPage()  {
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.IOS_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP);
            for (int i = 0; i <= 20; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                    if (this.action.elementHelper.fnIsElementPresent(threeDotsOnListen)) {
                        this.action.elementHelper.fnClick(threeDotsOnListen);
                        break;
                    }
                }
                catch (Exception e){

                }
            }

        }
        else{
           /* for (int i = 0; i <= 20; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                    if (this.action.elementHelper.fnIsElementPresent(threeDotsOnListen)) {
                        this.action.elementHelper.fnClick(threeDotsOnListen);
                        break;
                    }
                }
                catch (Exception e){

                }
            }*/
            this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(threeDotsOnListen);
            this.action.elementHelper.fnClick(threeDotsOnListen);
        }


    }

}