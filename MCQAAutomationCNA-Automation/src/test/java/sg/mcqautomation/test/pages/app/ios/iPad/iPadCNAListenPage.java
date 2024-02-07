package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPadCNAListenPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNAListenPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By listenButton;
    private By header_listenPage;
    private By contentTitleOnListenPage;
    private By viewFullScheduleLink;
    private By contentTitleOnWebView;
    private By bookmarkOnListenPage;
    private By shareOnListenPage;
    private By bookbarkOption;
    private By article_ListenPage;
    private By playPodcast;
    private By threeDotsOnListen;
    private By selectPodcast;
    private By plyerPodcastDetails;
    private By plyerPodcastDetailsBT;
    private By plyerPodcastDetailsET;
    private By plyerPodcastRewind;
    private By plyerPodcastForward;
    private By plyerPodcastSlider;
    private By plyerPodcastClose;
    private By plyerPodcastPause;
    private By PodcastCount;
    private By LatestEpisodeCount;

    public void initElements() {
        this.listenButton = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Listen']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.header_listenPage = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Listen']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.contentTitleOnListenPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Listen now']//..//XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.viewFullScheduleLink = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='View Full Schedule']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.contentTitleOnWebView =MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkOnListenPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon bookmark outline\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.shareOnListenPage = MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='popup']//..//XCUIElementTypeButton[@name='Share']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.article_ListenPage =MobileAppLocator.GetLocator( "((//XCUIElementTypeButton[@name='icon menu grey' and @visible='true'])[3]//..//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.playPodcast = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Play']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDotsOnListen = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name='icon menu grey' and @visible='true'])[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.selectPodcast = MobileAppLocator.GetLocator( "(//XCUIElementTypeTable//XCUIElementTypeButton[@name='icon radio play']//..//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastDetails = MobileAppLocator.GetLocator("(//XCUIElementTypeButton[contains(@name,'icon rewind')]//..//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastDetailsBT = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[contains(@name,'icon rewind')]//..//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastDetailsET = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[contains(@name,'icon rewind')]//..//XCUIElementTypeStaticText)[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastRewind = MobileAppLocator.GetLocator("//XCUIElementTypeButton[contains(@name,'icon rewind')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastForward = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[contains(@name,'icon forward')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastSlider = MobileAppLocator.GetLocator("//XCUIElementTypeSlider", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastClose = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[contains(@name,'icon close')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.plyerPodcastPause = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[contains(@name,'icon close')]//..//XCUIElementTypeButton)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookbarkOption=MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name='popup']//..//XCUIElementTypeButton[@name='Bookmark']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.PodcastCount = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='icon menu grey']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.LatestEpisodeCount = MobileAppLocator.GetLocator("//XCUIElementTypeTable//XCUIElementTypeButton[@name='icon radio play']", MobileAppLocator.MobileElementType.XCUICustomElement);
    }

     public boolean verifyTheLiveContentOnListenPage(){
         return this.action.elementHelper.fnIsElementPresent(this.contentTitleOnListenPage);
     }

    public void clickOnListenPage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.listenButton);
        this.action.elementHelper.fnClick(this.listenButton);
    }

    public String  verifyHeaderOfListenPage(){
        return this.action.elementHelper.fnGetText(this.header_listenPage);
    }

    public void clickOnViewFullScheduleLink(){
        this.action.elementHelper.fnClick(this.viewFullScheduleLink);
    }

    public boolean verifyTheContentTitleOnWebView() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.contentTitleOnWebView);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.contentTitleOnWebView);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.contentTitleOnWebView);
        return this.action.elementHelper.fnIsElementPresent(this.contentTitleOnWebView);
    }

    public boolean verifyBookMarkAndShareOptions() {
          boolean  bln1 = this.action.elementHelper.fnIsElementPresent(this.bookmarkOnListenPage);
           boolean bln2 = this.action.elementHelper.fnIsElementPresent(this.shareOnListenPage);
           if ( bln1 && bln2)
               return true;
           return false;
    }

    public boolean verifyShareOptions() {
        return this.action.elementHelper.fnIsElementPresent(this.shareOnListenPage);
    }

    public boolean verifyBookmarkOptions() {
        return this.action.elementHelper.fnIsElementPresent(this.bookbarkOption);
    }

    public void clickONArticle() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_ListenPage);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_ListenPage);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_ListenPage);
        this.action.elementHelper.fnClick(this.article_ListenPage);
    }

    public void playPodcast() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.playPodcast);
            this.action.elementHelper.fnClick(this.playPodcast);
    }

    public void selectPodcast() throws InterruptedException {
        Thread.sleep(5000);
        this.action.elementHelper.fnClick(this.selectPodcast);
    }

    public void clickOnThreeDotsOnListenPage()  {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDotsOnListen);
        this.action.elementHelper.fnClick(threeDotsOnListen);
    }

    public boolean plyerPodcastDetails()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastDetails);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastDetails);
    }

    public boolean plyerPodcastDetailsBT()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastDetailsBT);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastDetailsBT);
    }

    public boolean plyerPodcastDetailsET()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastDetailsET);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastDetailsET);
    }

    public boolean plyerPodcastRewind()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastRewind);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastRewind);
    }

    public boolean plyerPodcastForward()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastForward);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastForward);
    }

    public boolean plyerPodcastPause()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastPause);
      return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastPause);
    }

    public boolean plyerPodcastSlider()  {
        this.action.waitHelper.fnWaitForVisibilityOf(this.plyerPodcastSlider);
       return this.action.elementHelper.fnIsElementPresent(this.plyerPodcastSlider);
    }

    public void plyerPodcastClose()  {
        this.action.elementHelper.fnClick(this.plyerPodcastClose);
    }

    public boolean verifyPodcastCount()  {
        return this.action.elementHelper.fnGetListofElement(this.PodcastCount).size()>0;
    }

    public boolean verifyLatestEpisodeCount()  {
        return this.action.elementHelper.fnGetListofElement(this.LatestEpisodeCount).size()>0;
    }
}