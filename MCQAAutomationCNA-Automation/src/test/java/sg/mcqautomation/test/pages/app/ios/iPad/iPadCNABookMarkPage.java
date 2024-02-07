package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPadCNABookMarkPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNABookMarkPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
        this.threeDots_bookmark = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkEpisode_homePage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Bookmark\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkEpisode_articlePage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon bookmark outline\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myFeedSection = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"My Feed\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.skipForNow_myFeedSection = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Skip for now\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkedButton_myFeedSection = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Bookmarked\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfBookmarkedEpisodes = MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDots_myFeed = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarked_myFeed = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Bookmarked\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.toastMessageAfterTheBookMarkTheArticle = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Added to your bookmarks.\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.toastMessageAfterTheUnBookMarkTheArticle = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Removed from your bookmarks.\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.unBookmarkArticleOnHomePage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Bookmarked\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkLuxuryArticle = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"BOOKMARK\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.unBookmarkLuxuryArticle = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"BOOKMARKED\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDotsOnCNALuxury = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageInterests = MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name=\"Manage interests\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.selectFollowedTopic = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"You are following\"]/parent::XCUIElementTypeCell/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkedArticleList = MobileAppLocator.GetLocator("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]", MobileAppLocator.MobileElementType.XCUICustomElement);

    }


    public void clickOnThreeDots() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDots_bookmark, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDots_bookmark, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.threeDots_bookmark);
    }

    public void clickOnBookMarkEpisodeOnHomePage() {
        this.action.waitHelper.waitFor(this.bookmarkEpisode_homePage);
        this.action.elementHelper.fnClick(this.bookmarkEpisode_homePage);
    }

    public void clickOnBookMarkEpisodeOnArticlePage() throws InterruptedException {
        Thread.sleep(2000);
        this.action.elementHelper.fnClick(this.bookmarkEpisode_articlePage);
    }

    public void clickOnSkipForNow() {
        if(this.action.elementHelper.fnIsElementPresent(this.skipForNow_myFeedSection))
        this.action.elementHelper.fnClick(this.skipForNow_myFeedSection);
        else{
            this.action.elementHelper.fnClick(this.manageInterests);
            this.action.elementHelper.fnClick(this.selectFollowedTopic);
            this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.saveButtonOnManageInterests, MobileInteractionHelper.Direction.UP);
            this.action.elementHelper.fnClick(this.saveButtonOnManageInterests);
        }
    }

    public void clickOnBookmarkedSectionOnMyFeedSection() {
        this.action.elementHelper.fnClick(this.bookmarkedButton_myFeedSection);
    }

    public boolean validateBookmarkedEpisode(){
        return this.action.elementHelper.fnGetListofElement(this.listOfBookmarkedEpisodes).size()>0;
    }

    public void clickOnArticleOnMyFeedSection(){
        this.action.elementHelper.fnGetListofElement(this.listOfBookmarkedEpisodes).get(0).click();
    }

    public boolean validateEmptyBookmarkedEpisodeOnMyFeed(){
        return this.action.elementHelper.fnIsElementPresent(this.emptyBookmarks);
    }

    public void clickOnThreeDotsOnMyFeedSec(){
        this.action.elementHelper.fnClick(this.threeDots_myFeed);
    }

    public void clickOnUnBookMarkOnMyFeedSec(){
        this.action.elementHelper.fnClick(this.bookmarked_myFeed);
    }

    public String validateToastMessageAfterTheBookMarkTheArticle() throws InterruptedException {
        Thread.sleep(500);
        return this.action.elementHelper.fnGetText(this.toastMessageAfterTheBookMarkTheArticle);
    }

    public String validateToastMessageAfterTheUnBookMarkTheArticle() throws InterruptedException {
        Thread.sleep(500);
        return this.action.elementHelper.fnGetText(this.toastMessageAfterTheUnBookMarkTheArticle);
    }

    public void clickOnMyFeedSection() {
        this.action.elementHelper.fnClick(this.myFeedSection);
    }

    public void clickOnUnBookMarkEpisodeOnHomePage(){
        this.action.waitHelper.waitFor(this.unBookmarkArticleOnHomePage);
        this.action.elementHelper.fnClick(this.unBookmarkArticleOnHomePage);
    }

    public void clickAgainOnThreeDots() {
        if(this.action.elementHelper.fnIsElementPresent(this.threeDots_bookmark))
            this.action.elementHelper.fnClick(this.threeDots_bookmark);
    }

    public void clickBookmarkLuxuryArticle(){
        this.action.elementHelper.fnClick(this.bookmarkLuxuryArticle);
    }

    public void clickUnBookmarkLuxuryArticle(){
        this.action.elementHelper.fnClick(this.unBookmarkLuxuryArticle);
    }

    public void clickThreeDotsOnCNALuxury(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDotsOnCNALuxury, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.threeDotsOnCNALuxury, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.threeDotsOnCNALuxury);
    }

    public void clickAgainThreeDotsOnCNALuxury(){
        this.action.elementHelper.fnClick(this.threeDotsOnCNALuxury);
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
