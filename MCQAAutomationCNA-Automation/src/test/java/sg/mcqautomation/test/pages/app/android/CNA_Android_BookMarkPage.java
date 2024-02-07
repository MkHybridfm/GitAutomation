package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_BookMarkPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_BookMarkPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By threeDots_bookmark;
    private By bookmarkEpisode_homePage;
    private By bookmarkEpisode_articlePage;
    private By skipForNow_myFeedSection;
    private By bookmarkedButton_myFeedSection;
    private By listOfBookmarkedEpisodes;
    private By threeDots_myFeed;
    private By bookmarked_myFeed;
    private By toastMessageAfterTheBookMarkTheArticle;
    private By toastMessageAfterTheUnBookMarkTheArticle;
    private By myFeedSection;
    private By unBookmarkArticleOnHomePage;
    private By bookmarkLuxuryArticle;
    private By unBookmarkLuxuryArticle;
    private By threeDotsOnCNALuxury;
    private By manageInterests;
    private By selectFollowedTopic;
    private By saveButtonOnManageInterests;
    private By emptyBookmarks;
    private By bookmarkedArticleList;


    public void initElements() {

        this.threeDots_bookmark = AppLocator.GetLocator(
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_options"));
        this.bookmarkEpisode_homePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='top-header-page']/h1"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmark\"]"));
        this.bookmarkEpisode_articlePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon bookmark outline\"]"));
        this.myFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"My Feed\"]"));
        this.skipForNow_myFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_skip"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Skip for now\"]"));
        this.bookmarkedButton_myFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmarked"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Bookmarked\"]"));
        this.listOfBookmarkedEpisodes = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
        this.threeDots_myFeed = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_options"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]"));
        this.bookmarked_myFeed = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmarked\"]"));
        this.toastMessageAfterTheBookMarkTheArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_message"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Added to your bookmarks.\"]"));
        this.toastMessageAfterTheUnBookMarkTheArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_message"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Removed from your bookmarks.\"]"));
        this.unBookmarkArticleOnHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Bookmarked\"]"));
        this.bookmarkLuxuryArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"BOOKMARK\"]"));
        this.unBookmarkLuxuryArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_bookmark"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"BOOKMARKED\"]"));
        this.threeDotsOnCNALuxury = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_options"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[3]"));
        this.manageInterests = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "btn_manage_interests"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"Manage interests\"])[1]"));
        this.selectFollowedTopic = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"You are following\"]/parent::XCUIElementTypeCell/XCUIElementTypeStaticText"));
        this.saveButtonOnManageInterests = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "btn_save"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"Save\"])[1]"));
        this.emptyBookmarks = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text[contains(.,'have any bookmarks right now.')]]"));


        this.bookmarkedArticleList = AppLocator.GetLocator(
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.LinearLayout[@resource-id='com.channelnewsasia:id/item_thumbnail_story']/android.view.ViewGroup"));

    }


    public void clickOnThreeDots() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDots_bookmark, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDots_bookmark, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.threeDots_bookmark);
    }

    public void clickOnBookMarkEpisodeOnHomePage() {
        this.action.waitHelper.waitFor(bookmarkEpisode_homePage);
        this.action.elementHelper.fnClick(bookmarkEpisode_homePage);
    }

    public void clickOnBookMarkEpisodeOnArticlePage() throws InterruptedException {
        Thread.sleep(2000);
        //this.action.waitHelper.waitFor(bookmarkEpisode_articlePage);
        this.action.elementHelper.fnClick(bookmarkEpisode_articlePage);
    }

    public void clickOnSkipForNow() {
        if(this.action.elementHelper.fnIsElementPresent(skipForNow_myFeedSection))
        this.action.elementHelper.fnClick(skipForNow_myFeedSection);
        else{
            this.action.elementHelper.fnClick(manageInterests);
            this.action.elementHelper.fnClick(selectFollowedTopic);
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 4);
            this.action.elementHelper.fnClick(saveButtonOnManageInterests);
        }
    }

    public void clickOnBookmarkedSectionOnMyFeedSection() {
        this.action.elementHelper.fnClick(bookmarkedButton_myFeedSection);
    }

    public boolean validateBookmarkedEpisode(){
        boolean blnStatus= false;
        List<WebElement> eleList=null;
        eleList=  this.action.elementHelper.fnGetListofElement(this.listOfBookmarkedEpisodes);
        if(eleList.size()>0)
            blnStatus= true;
        return blnStatus;
    }

    public void clickOnArticleOnMyFeedSection(){
        List<WebElement> eleList=null;
        eleList=  this.action.elementHelper.fnGetListofElement(this.listOfBookmarkedEpisodes);
        eleList.get(0).click();
    }

    public boolean validateEmptyBookmarkedEpisodeOnMyFeed(){
        boolean flag = false;
        try {
            if (this.action.elementHelper.fnIsElementDisplayed(emptyBookmarks)) {
                flag = true;
            }
        }
        catch (Exception e){
            flag = true;
        }
        return flag;
    }

    public void clickOnThreeDotsOnMyFeedSec(){
        this.action.elementHelper.fnClick(threeDots_myFeed);
    }

    public void clickOnUnBookMarkOnMyFeedSec(){
        this.action.elementHelper.fnClick(bookmarked_myFeed);
    }

    public String validateToastMessageAfterTheBookMarkTheArticle() throws InterruptedException {
        Thread.sleep(1000);
        return this.action.elementHelper.fnGetText(toastMessageAfterTheBookMarkTheArticle);
    }

    public String validateToastMessageAfterTheUnBookMarkTheArticle() throws InterruptedException {
        Thread.sleep(1000);
        return this.action.elementHelper.fnGetText(toastMessageAfterTheUnBookMarkTheArticle);
    }

    public void clickOnMyFeedSection() {
        this.action.elementHelper.fnClick(myFeedSection);
    }

    public void clickOnUnBookMarkEpisodeOnHomePage(){
        this.action.waitHelper.waitFor(unBookmarkArticleOnHomePage);
        this.action.elementHelper.fnClick(unBookmarkArticleOnHomePage);
    }

    public void clickAgainOnThreeDots() {
                if(this.action.elementHelper.fnIsElementPresent(threeDots_bookmark))
                    this.action.elementHelper.fnClick(threeDots_bookmark);
    }

    public void clickBookmarkLuxuryArticle(){
        this.action.elementHelper.fnClick(bookmarkLuxuryArticle);
    }

    public void clickUnBookmarkLuxuryArticle(){
        this.action.elementHelper.fnClick(unBookmarkLuxuryArticle);
    }

    public void clickThreeDotsOnCNALuxury(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
        for (int i = 0; i < 10; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(threeDotsOnCNALuxury))
                    this.action.elementHelper.fnClick(threeDotsOnCNALuxury);
                break;
            } catch (Exception e) {

            }
        }
    }

    public void clickAgainThreeDotsOnCNALuxury(){
        this.action.elementHelper.fnClick(threeDotsOnCNALuxury);
    }

    public boolean validateArticlesList(){
        boolean blnStatus= false;
        List<WebElement> eleList=null;
        eleList=  this.action.elementHelper.fnGetListofElement(this.bookmarkedArticleList);
        if(eleList.size()>0)
            blnStatus= true;
        return blnStatus;
    }

    public void clickArticle(){
        this.action.elementHelper.fnClick(bookmarkedArticleList);
    }



}
