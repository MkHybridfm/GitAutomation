package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNALifestyleWeb_BookmarkPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNALifestyleWeb_BookmarkPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By threeDots;
    private By bookmarkOptionAnonymousUser;
    private By bookmarkOptionLoggedInUser;
    private By videoSection;
    private By videoLink;

    public void initElements() {
        this.threeDots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories')]]//div[@class[contains(.,'quick-link quick-link--list-object')]]"));
        this.bookmarkOptionAnonymousUser = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link bookmark-link-anonymous use-ajax']"));
        this.bookmarkOptionLoggedInUser = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link bookmark-link']"));
        this.videoSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Videos')]"));
        this.videoLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'video')]]/parent::div//a[@class[contains(.,'heading-link')]]"));

    }

    public void clickOnThreeDotsOption(){
        this.action.javaScriptHelper.fnJSScrollToView(threeDots);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(threeDots);
    }

    public void clickOnBookmarkOptionAnonymousUser(){
        this.action.javaScriptHelper.fnJSClick(bookmarkOptionAnonymousUser);
    }

    public void clickOnBookmarkOptionLoggedInUser() throws InterruptedException {
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(bookmarkOptionLoggedInUser);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.waitHelper.waitFor(bookmarkOptionLoggedInUser);
        Thread.sleep(4000);
        this.action.javaScriptHelper.fnJSClick(bookmarkOptionLoggedInUser);
    }

    public void scrollDownToVideoSection() throws InterruptedException {
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(videoLink);
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
    }

    public void clickOnAVideoLink(){
        this.action.waitHelper.waitFor(videoLink);
        this.action.javaScriptHelper.fnJSClick(videoLink);
    }

}