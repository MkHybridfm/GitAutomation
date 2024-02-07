package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_DiscoverPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_DiscoverPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By discoverMenuLink;
    private By discoverLandingPage;
    private By discoverTrendingSection;
    private By discoverEditorsPickSection;
    private By discoverRecommendedSection;
    private By threeDots;
    private By seeMoreLikeThisLink;
    private By seeFewerLikeThiLink;
    private By shareLink;
    private By scrollToSurpriseMeSection;
    private By supriseMeButton;
    private By articlePageHeader;
    private By allSectionsLink;

    public void initElements() {
        this.discoverMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[text()='Discover']"));
        this.discoverLandingPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class[contains(.,'discover-block-title')]]"));
        this.discoverTrendingSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class[contains(.,'discover-block-title')]][contains(.,'Trending')]"));
        this.discoverEditorsPickSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class[contains(.,'discover-block-title')]][contains(.,'Editor')]"));
        this.discoverRecommendedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class[contains(.,'discover-block-title')]][contains(.,'Recommended')]"));
        this.threeDots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'slick-current slick-active')]]//div[@class='quick-link quick-link--']"));
        this.seeMoreLikeThisLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'slick-current slick-active')]]//a[contains(.,'See more like this')]"));
        this.seeFewerLikeThiLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'slick-current slick-active')]]//a[contains(.,'See fewer like this')]"));
        this.shareLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'slick-current slick-active')]]//a[contains(.,'Share')]"));
        this.scrollToSurpriseMeSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='cia-widget-recommended-cards-block']"));
        this.supriseMeButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='floating__long floating__long--is-visual']//a[contains(.,'Surprise me')]"));
        this.articlePageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--page-title']"));
        this.allSectionsLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[text()='+ All Sections']"));

    }

    public void clickDiscoverMenuLink(){
        this.action.javaScriptHelper.fnJSClick(discoverMenuLink);
    }

    public boolean validateDiscoverLandingPage() {
        this.action.waitHelper.waitFor(discoverLandingPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(discoverLandingPage);
    }

    public boolean validateDiscoverPageSections(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(discoverTrendingSection);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(discoverEditorsPickSection);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(discoverRecommendedSection);

        if(sec1 && sec2&& sec3 )
            sections=true;
        return sections;
    }

    public void clickThreeDotsLink(){
        this.action.javaScriptHelper.fnJSClick(threeDots);
    }

    public boolean validateQuickLinksSections(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(seeMoreLikeThisLink);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(seeFewerLikeThiLink);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(shareLink);

        if(sec1 && sec2&& sec3 )
            sections=true;
        return sections;
    }

    public boolean scrollToSurpriseMeSection() throws InterruptedException {
        Thread.sleep(1000);
            this.action.javaScriptHelper.fnJSScrollToView(scrollToSurpriseMeSection);
        Thread.sleep(1000);
            this.action.waitHelper.waitFor(supriseMeButton);
            return this.action.elementHelper.fnVerifyIsDisplayed(supriseMeButton);
        }

    public void clickSurpriseMEButton(){
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(supriseMeButton);
    }

    public boolean validateArticlePageAfterClick() {
        this.action.waitHelper.waitFor(articlePageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(articlePageHeader);
    }

}
