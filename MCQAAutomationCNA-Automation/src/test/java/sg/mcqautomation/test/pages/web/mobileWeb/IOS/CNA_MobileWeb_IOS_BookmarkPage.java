package sg.mcqautomation.test.pages.web.mobileWeb.IOS;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.util.List;

public class CNA_MobileWeb_IOS_BookmarkPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    public IOSDriver iosDriver;

    public CNA_MobileWeb_IOS_BookmarkPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.iosDriver = (IOSDriver) driver;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By myFeedMenuLink;
    private By myFeedPageHeader;
    private By bookmarkedTab;
    private By noBookmarkMessage;
    private By topStoriesSection;
    private By latestNewsection;
    private By quickLink3Dots;
    private By bookmarkOption_anonymous;
    private By loginScreenPopUp;
    private By bookmarkMessage;
    private By bookmarkTextChange;
    private By bookmarkOption;
    private By bookmarkArticleListInMyFeed;
    private By threedotsBookmarkMyFeedPage;
    private By bookmarkStatusMyFeedPage;
    private By bookmarkOptionMyFeedPage;
    private By myFeedMenuIcon;
    private By topStoriesArticleLink;
    private By bookmarkoptionFromArticlePage;
    private By bookmarksLinkfromProfilePopup;
    private By trendingTopicsHeader;
    private By trendingTopicList;
    private By savePreferences_Annonymous;

    public void initElements() {
        this.myFeedMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[contains(.,'My Feed')]"));
        this.myFeedPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'My Feed')]"));
        this.bookmarkedTab = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Bookmarked')]"));
        this.noBookmarkMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[@class[contains(.,'h3--page-title')]]/span"));
        this.topStoriesSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='main-menu__item']/a[contains(.,'Top Stories')]"));
        this.latestNewsection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Latest News')]"));
        this.quickLink3Dots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'quick-link quick-link')]]"));
        this.bookmarkOption_anonymous = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'bookmark-link-anonymous')]]"));
        this.loginScreenPopUp = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//form[@class='me-connect-login mc_meconnect_login']"));
        this.bookmarkMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'message-popup__content')]]//span"));
        this.bookmarkTextChange = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'link bookmark-link')]]//span"));
        this.bookmarkOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'link bookmark-link')]]"));
        this.bookmarkArticleListInMyFeed = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='ais-Hits-item']"));
        this.threedotsBookmarkMyFeedPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='quick-link quick-link--']"));
        this.bookmarkStatusMyFeedPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'bookmark-link')]]//span"));
        this.bookmarkOptionMyFeedPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'bookmark-link')]]"));
        this.myFeedMenuIcon = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[contains(.,'My Feed')]/parent::a"));
        this.topStoriesArticleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories-secondary')]]//h6/a"));
        this.bookmarkoptionFromArticlePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'content-share-bookmark')]]//a[@class='link bookmark-link']"));
        this.bookmarksLinkfromProfilePopup = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, " //a[contains(.,'Bookmarks')]"));
        this.trendingTopicsHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Trending Topics')]"));
        this.trendingTopicList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='myfeed-topic-container']//input"));
        this.savePreferences_Annonymous = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@class[contains(.,'anonymous')]]/a[contains(.,'Save Preferences')]"));

    }


    public boolean clickMyFeedSection() throws InterruptedException {
        this.action.elementHelper.fnClick(myFeedMenuLink);
        Thread.sleep(2000);
        return this.action.elementHelper.fnIsElementDisplayed(iosDriver.findElement(myFeedPageHeader));
    }

    public void clickOnBookmarkedTab(){
        this.action.waitHelper.waitFor(bookmarkedTab);
        this.action.javaScriptHelper.fnJSClick(bookmarkedTab);
    }

    public String validateNoBookmarkMessage(){
        this.action.waitHelper.waitFor(noBookmarkMessage);
        return this.action.elementHelper.fnGetText(noBookmarkMessage);
    }

    public void clickOnBookmarkOption_anonymous(){
        this.action.javaScriptHelper.fnJSClick(topStoriesSection);
        this.action.waitHelper.waitFor(latestNewsection);

        //Click on Bookmark Option
        this.action.javaScriptHelper.fnJSClick(this.quickLink3Dots);
        this.action.javaScriptHelper.fnJSClick(bookmarkOption_anonymous);

    }

    public boolean  validateRedirectionToLoginPage(){
        this.action.waitHelper.waitFor(loginScreenPopUp);
        return this.action.elementHelper.fnIsElementDisplayed(loginScreenPopUp);
    }

        public String validateBookmarkMessage() throws InterruptedException {
            Thread.sleep(1000);
            this.action.waitHelper.waitFor(bookmarkMessage);
            String msg = this.action.elementHelper.fnGetText(bookmarkMessage);
            System.out.println(msg);
            return msg;

        }

        public String validateBookmarkedTextChange() throws InterruptedException {
            Thread.sleep(500);
            return this.action.elementHelper.fnGetText(bookmarkTextChange);
        }

    public void clickOnBookmarkOption() {
              this.action.javaScriptHelper.fnJSClick(bookmarkOption);
    }

    public void clickOnUnBookmarkOption() throws InterruptedException {
        Thread.sleep(3000);
        this.action.javaScriptHelper.fnJSClick(bookmarkOption);
        Thread.sleep(1000);
    }

    public boolean validateBookmarkedArticlesList(){
        boolean bookmarkedArticles = false;

       List<WebElement> bookmarkedArticlesList=null;

        bookmarkedArticlesList = this.action.elementHelper.fnGetListofElement(bookmarkArticleListInMyFeed);
        if(bookmarkedArticlesList.size()>0)
            bookmarkedArticles=true;

        return bookmarkedArticles;

    }

    public void clickthreedotsBookmarkMyFeedPage() throws InterruptedException {
        Thread.sleep(1000);
        this.action.elementHelper.fnClick(this.threedotsBookmarkMyFeedPage);
    }

    public String validateBookmarkMessageMyFeed() throws InterruptedException {
        Thread.sleep(500);
        return this.action.elementHelper.fnGetText(bookmarkStatusMyFeedPage);
    }

    public void clickOnUnBookmarkOptionMyFeedPage() {
        this.action.javaScriptHelper.fnJSClick(bookmarkOptionMyFeedPage);
    }

    public boolean clickMyFeedSectionforLoggedInUser() throws InterruptedException {
        Thread.sleep(2000);
        this.action.javaScriptHelper.fnJSClick(myFeedMenuIcon);
        return this.action.elementHelper.fnIsElementDisplayed(myFeedPageHeader);
    }

    public void clickOnAArticleFromTopStories() {
       this.action.waitHelper.waitFor(topStoriesArticleLink);
       this.action.javaScriptHelper.fnJSClick(topStoriesArticleLink);
    }

    public void clickOnBookmarkFromArticleDetailPage() throws InterruptedException {
        Thread.sleep(2000);
        this.action.actionHelper.fnActionClick(bookmarkoptionFromArticlePage);
    }

    public void clickOnBookmarkLinkFromProfilePopupScreen (){
        this.action.javaScriptHelper.fnJSClick(bookmarksLinkfromProfilePopup);
    }

    public boolean validateTrendingTopicsSection()  {
        return this.action.elementHelper.fnIsElementDisplayed(trendingTopicsHeader);
    }

    public void clickOnTopics (){
        this.action.javaScriptHelper.fnJSClick(trendingTopicList);
    }

    public void clickSavePreferences (){
        this.action.javaScriptHelper.fnJSClick(savePreferences_Annonymous);
    }

    public void clickThreeDots(){
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(quickLink3Dots));
    }
}
