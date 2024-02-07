package sg.mcqautomation.test.pages.web.mobileWeb.IOS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.awt.*;
import java.util.List;

public class CNA_MobileWeb_IOS_WatchPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_IOS_WatchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

        private By videoFullscreen;
        private By videoArticle;
        private By onAirFlag;
        private By videoTitle;
        private By videoPublishedDate;
        private By videoDescription;
        private By threeDots;
        private By shareoption;
        private By watchPageHeader;
        private By viewFullTvScheduleLink;
        private By tVSchedulePageHeader;
        private By tvScheduleList;
        private By recommendedSectionHeader;
        private By recommendedSectionVideoList;
        private By survivingTheOddsSectionHeader;
        private By seriesVideoLink;
        private By seriesVideoComponentPageHeader;
        private By followButton;
        private By seasonsDropdown;
        private By latestEpisodesList;
        private By seriesVideoTitle;
        private By seriesVideoDescription;
        private By seriesVideoPublishedDate;
        private By shareOptions;
        private By moreVideosLinkNewsSection;
        private By allVideosPageHeader;
        private By sortOptionAllVideosPage;
        private By videothumbnail;
        private By paginationSection;
        private By searchTextBox;
        private By returnToMainPageButton;
        private By refreshDisplayAllVideosPage;
        private By watchPageViewMoreButton;
        private By ViewMoreVideosList;
        private By clickOnVideoLink;
        private By videoPageHeader;
        private By videoFullScreen;
        private By viewAllProgramsCTA;
        private By onDemandVideoPage;
        private By onDemandPagesearch;
        private By onDemandPagination;
        private By onDemandPageVideoSection;

        public void initElements() {
            this.videoFullscreen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='vjs-control-bar vjs-focus-within']/button[@title='Fullscreen']"));
            this.videoArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'video-wrapper')]]//video[@role='application']"));
            this.onAirFlag = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='indicator__flag']"));
            this.videoTitle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class='h2 list-schedule__heading']"));
            this.videoPublishedDate = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='list-schedule__datetime']"));
            this.videoDescription = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//p[@class='paragraph paragraph--desc']"));
            this.threeDots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='quick-link quick-link--']"));
            this.shareoption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link link-- trigger-popup']"));
            this.watchPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Watch')]"));
            this.viewFullTvScheduleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'block-schedule-program')]]/a"));
            this.tVSchedulePageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'LIVE TV International Schedule')]"));
            this.tvScheduleList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='all-list-schedule__container-col-two']"));
            this.recommendedSectionHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h4[contains(.,'Recommended')]"));
            this.recommendedSectionVideoList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h4[contains(.,'Recommended')]/parent::section//div[@class='media-object']"));
            this.survivingTheOddsSectionHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Surviving The Odds')]"));
            this.seriesVideoLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Surviving The Odds')]/parent::div//h3"));
            this.seriesVideoComponentPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'block-video-heading--with-follow-btn')]]"));
            this.followButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='meConnectFollowAnonymous']"));
            this.seasonsDropdown = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//select[@id='edit-field-season-target-id']"));
            this.latestEpisodesList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='views-infinite-scroll-content-wrapper clearfix']/div"));
            this.seriesVideoTitle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[@class='h2 h2--video-ep-title']"));
            this.seriesVideoDescription = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='content-detail__description content-detail__description--video']"));
            this.seriesVideoPublishedDate = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='content-detail__date']"));
            this.shareOptions = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='content-detail__col-two']//div[@class='a2a-share-link a2a_kit']"));
            this.moreVideosLinkNewsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'More videos')]"));
            this.allVideosPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'All Videos')]"));
            this.sortOptionAllVideosPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//select[@id='edit-sort-order']"));
            this.videothumbnail = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h6/a"));
            this.paginationSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div//ul[@class='pager__items js-pager__items']"));
            this.searchTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='all-video all-video--search all-video--video']//input[@id='algolia-search-input']"));
            this.returnToMainPageButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Return to the Main Page')]"));
            this.refreshDisplayAllVideosPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[contains(.,'Showing')]/b[contains(.,'16')]"));
            this.watchPageViewMoreButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='stories-infinte-scroll']"));
            this.ViewMoreVideosList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='grid-cards-four-column grid-card-carousel-mobile']/div"));
            this.clickOnVideoLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h6/a"));
            this.videoPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1"));
            this.videoFullScreen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@class='vjs-fullscreen-control vjs-control vjs-button']"));
            this.viewAllProgramsCTA = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'layout')]]/a[@class='link link--desktop']"));
            this.onDemandVideoPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Video on Demand')]"));
            this.onDemandPagesearch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@id='block-algoliaautocompletesearch-2']//input"));
            this.onDemandPagination = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//ul[@class='pager__items js-pager__items']"));
            this.onDemandPageVideoSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='all-video all-video--vod-list']"));

        }


    public boolean  validateVideoAutoPlay(){
        this.action.javaScriptHelper.fnJSScrollToView(videoArticle);
        String autoPlaying=  this.action.elementHelper.fnGetAttribute(this.videoArticle, "playsinline");
        Boolean b = Boolean.valueOf(autoPlaying);
        return b;
    }

    public boolean validateOnAirFlag(){
            this.action.waitHelper.fnWaitForVisibilityOf(onAirFlag);
        this.action.javaScriptHelper.fnJSScrollToView(onAirFlag);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
            return this.action.elementHelper.fnIsElementDisplayed(onAirFlag);
        }

    public boolean iValidateVideoMetadata(){
        boolean articleDetailPageSections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(videoTitle);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(videoDescription);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(videoPublishedDate);

        if(sec1 && sec2&& sec3 )
            articleDetailPageSections=true;
        return articleDetailPageSections;
    }

    public boolean validateFullScreen() {
        return this.action.elementHelper.fnIsElementDisplayed(videoFullScreen);
    }

    public boolean validateShareOption(){
        this.action.javaScriptHelper.fnJSScrollToView(watchPageHeader);

        this.action.javaScriptHelper.fnJSClick(threeDots);
        return this.action.elementHelper.fnIsElementDisplayed(shareoption);
    }

    public void clickOnShareLink(){
        this.action.javaScriptHelper.fnJSClick(shareoption);
    }

    public boolean validateViewFullScheduleLink() {
        this.action.javaScriptHelper.fnJSScrollToView(onAirFlag);
        return this.action.elementHelper.fnIsElementDisplayed(viewFullTvScheduleLink);
        }

    public void clickViewFullScheduleLink(){
        this.action.javaScriptHelper.fnJSClick(viewFullTvScheduleLink);
    }

    public boolean validateFullScehdulePage() {
        this.action.waitHelper.waitFor(tVSchedulePageHeader);
        return this.action.elementHelper.fnIsElementDisplayed(tVSchedulePageHeader);
    }

    public boolean validateTVScheduleList(){
        return this.action.elementHelper.fnIsElementDisplayed(tvScheduleList);
    }

    public boolean validateRecommendedSectionHeader() throws InterruptedException {
            Thread.sleep(2000);
        this.action.waitHelper.waitFor(recommendedSectionHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(recommendedSectionHeader);
    }
    public boolean validateRecommendedSectionVideoList(){
        boolean list=false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(recommendedSectionVideoList);
        if (articlesList.size() > 0)
            list = true;
        return list;
    }

    public void clickOnSeriesVideoLink(){
        this.action.javaScriptHelper.fnJSScrollToView(seriesVideoLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(seriesVideoLink);
    }

    public boolean validateSeriesComponentVideoPageHeader() throws InterruptedException {
            Thread.sleep(2000);
        this.action.waitHelper.waitFor(seriesVideoComponentPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(seriesVideoComponentPageHeader);
    }

    public boolean followButtonLastestEpisodeDropdwown(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(followButton);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(seasonsDropdown);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(latestEpisodesList);

        if(sec1 && sec2&& sec3 )
            sections=true;
        return sections;
    }
    public boolean validateSeriesVideoTitle(){
        this.action.javaScriptHelper.fnJSScrollToView(seriesVideoTitle);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnVerifyIsDisplayed(seriesVideoTitle);
    }

    public boolean validateVideoDescDateShareOption() {
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;
        boolean sec3 = false;

        this.action.javaScriptHelper.fnJSScrollToView(seriesVideoDescription);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec1 = this.action.elementHelper.fnVerifyIsDisplayed(seriesVideoDescription);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(seriesVideoPublishedDate);
        sec3 = this.action.elementHelper.fnVerifyIsDisplayed(shareOptions);

        if (sec1 && sec2 && sec3)
            sections = true;
        return sections;
    }

    public void clickOnMoreVideosLink() throws InterruptedException {
        this.action.javaScriptHelper.fnJSScrollToView(moreVideosLinkNewsSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSClick(moreVideosLinkNewsSection);
    }

    public boolean validateAllVideosPageHeader() throws InterruptedException {
            Thread.sleep(2000);
        this.action.waitHelper.waitFor(allVideosPageHeader);
        this.action.javaScriptHelper.fnJSScrollToView(watchPageHeader);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(allVideosPageHeader);
    }

    public boolean validateSortOptionDisplay(){
       return this.action.elementHelper.fnIsElementDisplayed(sortOptionAllVideosPage);
    }

    public boolean validateVideoThumbnail(){
        boolean list=false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(videothumbnail);
        if (articlesList.size() > 0)
            list = true;
        return list;
    }

    public boolean validatePaginationSection() throws InterruptedException {
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(paginationSection);
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementPresent(paginationSection);
    }

    public void enterSearchText(String searchText) throws AWTException {
        this.action.javaScriptHelper.fnJSScrollToView(searchTextBox);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        driver.findElement(searchTextBox).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.action.elementHelper.fnType(this.searchTextBox, searchText);
        driver.findElement(this.searchTextBox).sendKeys(Keys.ENTER);
    }

    public void clickReturnToHomePage(){
        this.action.waitHelper.waitFor(returnToMainPageButton);
        this.action.javaScriptHelper.fnJSScrollToView(returnToMainPageButton);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(returnToMainPageButton);
    }
    public boolean validateAllVideosPageRefreshDisplay(){
            this.action.waitHelper.waitFor(refreshDisplayAllVideosPage);
        return this.action.elementHelper.fnIsElementPresent(refreshDisplayAllVideosPage);
    }

    public void clickViewMoreWatchPage(){
        this.action.javaScriptHelper.fnJSScrollToView(searchTextBox);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(watchPageViewMoreButton);
    }

    public boolean validateVideosAfterViewMoreCLick() throws InterruptedException {
            Thread.sleep(2000);
        this.action.waitHelper.waitFor(ViewMoreVideosList);
        boolean list=false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(ViewMoreVideosList);
        if (articlesList.size() > 0)
            list = true;
        return list;
    }
    public void clickOnVideoFromWatchPage(){
        this.action.javaScriptHelper.fnJSScrollToView(clickOnVideoLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(clickOnVideoLink);
    }

    public boolean validateVideoPageHeader() throws InterruptedException {
            Thread.sleep(2000);
        this.action.waitHelper.waitFor(videoPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(videoPageHeader);
    }

    public void openSeriesComponentLink() {
            this.action.browserNavigationHelper.fnGetURL("https://www.channelnewsasia.com/watch/league-extraordinary-makers/rise-makers-2669411");

    }

    public void clickViewAllProgrammesCTA(){
            this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(viewAllProgramsCTA);
    }

    public boolean validateOnDemandVideoPage() {
        this.action.waitHelper.waitFor(onDemandVideoPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(onDemandVideoPage);
    }

    public boolean validateOnDemandVideosPageContent(){
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;
        boolean sec3 = false;

        sec1 = this.action.elementHelper.fnVerifyIsDisplayed(onDemandPagesearch);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(onDemandPageVideoSection);
        this.action.javaScriptHelper.fnJSScrollToView(onDemandPagination);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec3 = this.action.elementHelper.fnVerifyIsDisplayed(onDemandPagination);

        if (sec1 && sec2 && sec3)
            sections = true;
        return sections;
    }
}


