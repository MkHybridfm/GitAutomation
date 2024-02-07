package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_Luxury_ArticleDetailPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_Luxury_ArticleDetailPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By articleLinkFromLandingPage;
    private By videoArticlePageHeader;

    public void initElements() {
        this.articleLinkFromLandingPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class='hero-banner__heading']/a"));
        this.videoArticlePageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class[contains(.,'blocknodevideotitle')]]"));    }

    public void clickOnlatestnewsArticle(){
        this.action.javaScriptHelper.fnJSScrollToView(articleLinkFromLandingPage);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(articleLinkFromLandingPage);
    }


    public void launchVideoArticlePage(){
            this.action.browserNavigationHelper.fnGetURL("https://cnaluxury.channelnewsasia.com/watch/bangkoks-chinatown-tcm-shop-transformed-restaurant-cna-luxury-197706");
    }

    public boolean validateVideoArticlePageHeader(){
       return this.action.elementHelper.fnVerifyIsDisplayed(videoArticlePageHeader);
    }

}
