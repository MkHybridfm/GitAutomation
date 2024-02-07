package sg.mcqautomation.test.pages.web.mobileWeb.IOS;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_IOS_Lifestyle_BookmarkPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    public IOSDriver iosDriver;

    public CNA_MobileWeb_IOS_Lifestyle_BookmarkPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.iosDriver = (IOSDriver) driver;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By threeDots;
    private By bookmarkOptionAnonymousUser;
    private By bookmarkOptionLoggedInUser;
    private By videoSection;
    private By videoLink;

    public void initElements() {
        this.threeDots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories')]]//div[@class[contains(.,'quick-link quick-link--list-object')]]"));
        this.bookmarkOptionAnonymousUser = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link bookmark-link-anonymous use-ajax']"));
        this.bookmarkOptionLoggedInUser = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link bookmark-link']"));
        this.videoSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Videos')]"));
        this.videoLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'video')]]/parent::div//a[@class[contains(.,'heading-link')]]"));

    }

    public void clickOnThreeDotsOption(){
        this.action.javaScriptHelper.fnJSScrollToView(iosDriver.findElement(threeDots));
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(threeDots));
    }

    public void clickOnBookmarkOptionAnonymousUser(){
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(bookmarkOptionAnonymousUser));
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