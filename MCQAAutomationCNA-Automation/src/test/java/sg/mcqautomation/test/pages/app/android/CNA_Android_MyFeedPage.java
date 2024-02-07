package sg.mcqautomation.test.pages.app.android;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_MyFeedPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    private AndroidDriver androidDriver;

    public CNA_Android_MyFeedPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.androidDriver = (AndroidDriver) driver;
        this.initElements();
    }

    private By myFeedSection;
    private By myFeedPageHeader;
    private By setUpMsgText;
    private By manageInterestButton;
    private By searchIcon;
    private By settingsOptions;
    private By filterOption;
    private By feedArticleList;
    private By threeDots;
    private By bookmarkOption;
    private By shareIcon;
    private By manageFeedPageHeader;
    private By myTopicSelectedList;
    private By selectTopicText;
    private By trendingTopicsSection;
    private By trendingTopicList;
    private By moreTopicsSection;
    private By moreTopicsList;
    private By savePreferencesButton;
    private By topicsHeaderHomePage;
    private By addTopicsText;
    private By feedListHomePage;
    private By createMyFeedButton;
    private By viewMoreTopicsButton;
    private By loginButton;
    private By fromMyFeedHeader;
    private By fromMyFeedArticleList;
    private By timestamp;
    private By goToMyFeedButton;

    public void initElements() {
        this.myFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.HorizontalScrollView//android.widget.LinearLayout[2]//android.widget.ImageView"));
        this.myFeedPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='My Feed']"));
        this.setUpMsgText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"));
        this.manageInterestButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_manage_feed"));
        this.searchIcon = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_search"));
        this.settingsOptions = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/iv_setting"));
        this.filterOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_filter"));
        this.feedArticleList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_following']//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"));
        this.threeDots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_following']//android.widget.ImageView[@resource-id='com.channelnewsasia:id/iv_options']"));
        this.bookmarkOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_bookmark"));
        this.shareIcon = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_share"));
        this.manageFeedPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Manage Feed']"));
        this.myTopicSelectedList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_selected_topics']/android.widget.CheckBox"));
        this.selectTopicText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_select_topic"));
        this.trendingTopicsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_trending_topics']"));
        this.trendingTopicList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_trending_topics']/android.widget.CheckBox"));
        this.moreTopicsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_more_topics']"));
        this.moreTopicsList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_more_topics']/android.widget.CheckBox"));
        this.savePreferencesButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_save"));
        this.topicsHeaderHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='Personalise My Feed'][@resource-id='com.channelnewsasia:id/tv_name']"));
        this.addTopicsText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_select_topic"));
        this.feedListHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_topic_list']/android.widget.TextView"));
        this.createMyFeedButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_save"));
        this.viewMoreTopicsButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/btn_view_all"));
        this.loginButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/bt_login"));
        this.fromMyFeedHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@text='From My Feed']"));
        this.fromMyFeedArticleList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_topic_list']/android.widget.LinearLayout"));
        this.timestamp = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.LinearLayout[@resource-id='com.channelnewsasia:id/item_thumbnail_story_primary']//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_time']"));
        this.goToMyFeedButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/bt_more"));

    }

    public boolean validateMyFeedOption(){
        return this.action.elementHelper.fnIsElementPresent(myFeedSection);
    }

    public void clickOnMyFeedSection() {
        this.action.waitHelper.waitFor(myFeedSection);
        this.action.elementHelper.fnClick(myFeedSection);
    }

    public boolean validateSavePreferencesPageListingsAndOptions()
    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.selectTopicText);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.trendingTopicsSection);
        //boolean bln3=this.action.elementHelper.fnIsElementPresent(this.trendingTopicList);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.moreTopicsSection);
        //boolean bln5=this.action.elementHelper.fnIsElementPresent(this.moreTopicsList);
        boolean bln6=this.action.elementHelper.fnIsElementPresent(this.savePreferencesButton);

        if(bln1 && bln2 && bln4 && bln6)
            return true;
        else
            return false;
    }

    public boolean validateMyFeedPageHeader(){
        this.action.waitHelper.waitFor(myFeedPageHeader);
        return this.action.elementHelper.fnIsElementPresent(myFeedPageHeader);
    }

    public String validateSetUpMsgText() throws InterruptedException {
        Thread.sleep(1000);
        return this.action.elementHelper.fnGetText(setUpMsgText);
    }

    public boolean validateManageInterestButtons(){
        this.action.waitHelper.waitFor(myFeedSection);
        return this.action.elementHelper.fnIsElementPresent(manageInterestButton);
    }

    public boolean validateSearchAndSettingsOptions()    {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.searchIcon);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.settingsOptions);

        if(bln1 && bln2 )
            return true;
        else
            return false;
    }

    public boolean validateFilterOption(){
        return this.action.elementHelper.fnIsElementPresent(filterOption);
    }

    public boolean validateFollowingArticlesList()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.feedArticleList);
            if(eleList.size()>0)
            {
                return true;
            }
        return false;
    }

    public void clickOnThreeDots() {
        this.action.elementHelper.fnClick(threeDots);
    }

    public boolean validateBookmarkOption(){
        return this.action.elementHelper.fnIsElementPresent(bookmarkOption);
    }

    public boolean validateShareOption(){
        return this.action.elementHelper.fnIsElementPresent(shareIcon);
    }

    public void clickHeader(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnTapByCoordinates(200, 400, 1);
    }

    public void clickOnManageInterestButton() {
        try{
            if( this.action.elementHelper.fnIsElementPresent(manageInterestButton)){
                this.action.elementHelper.fnClick(manageInterestButton);
            }
            else{}
        }
        catch(Exception e){}

    }

    public String validateManageFeedPage() {
        this.action.waitHelper.waitFor(manageFeedPageHeader);
        return this.action.elementHelper.fnGetText(manageFeedPageHeader);
    }

    public boolean validateMyTopicsTab(String link) {
        By loc=By.xpath("//android.widget.TextView[@text='"+link+"']");
        return this.action.elementHelper.fnIsElementPresent(loc);
    }

    public void clickMyFeedTab(String strTab){
        By loc=By.xpath("//android.widget.TextView[@text='"+strTab+"']");
        this.action.elementHelper.fnClick(loc);
    }

    public boolean verifyMyTopicFeedList(){
        return this.action.elementHelper.fnGetListofElement(this.myTopicSelectedList).size()>0;
    }

    public int getMyTopicFeedList(){
        return this.action.elementHelper.fnGetListofElement(this.myTopicSelectedList).size();
    }

    public String getMyTopicFeedListName(){
        List<WebElement> elementList=this.action.elementHelper.fnGetListofElement(this.myTopicSelectedList);
        return elementList.get(elementList.size()-1).findElements(By.xpath("//android.widget.CheckBox")).get(0).getText();
    }

    public boolean verifyMyTopicFeedListName(String strName){
        By loc=By.xpath("//android.widget.CheckBox[@text='"+strName+"']");
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
    }

    public void scrollToTopicsSectionHomePage(){
        this.action.elementHelper.fnClick(By.xpath("//android.widget.LinearLayout[@content-desc=\"Top Stories\"]"));
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 3);
        this.action.javaScriptHelper.fnJSScrollToView(By.id("com.channelnewsasia:id/rv_topic_list"));
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/rv_topic_list");
    }

    public boolean validateTopicsTitleAddTopicsText()    {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/tv_select_topic");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 1);
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.topicsHeaderHomePage);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.addTopicsText);

        if(bln1 && bln2 )
            return true;
        else
            return false;
    }

    public boolean validateFeedListInHomePage()
    {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/tv_select_topic");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);

        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.feedListHomePage);
        if(eleList.size()<=5)
        {
            return true;
        }
        return false;
    }

    public boolean validateCreateMyFeedAndViewMoreTopicsButton()    {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/btn_save");
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.createMyFeedButton);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.viewMoreTopicsButton);

        if(bln1 && bln2 )
            return true;
        else
            return false;
    }

    public void selectTopics() throws InterruptedException {
        By loc = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_topic_list']/android.widget.TextView[1]");
       // By loc1 = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_topic_list']/android.widget.TextView[2]");
        this.action.elementHelper.fnClick(loc);

    }

    public void clickOnCreateMyFeed() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/btn_save");
        this.action.elementHelper.fnClick(createMyFeedButton);
    }

    public void clickOnViewMoreTopicsButton() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/btn_view_all");
        this.action.elementHelper.fnClick(viewMoreTopicsButton);
    }

    public void clickOnLoginButtonFromSettings() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loginButton);
        this.action.elementHelper.fnClick(loginButton);
    }

    public void scrollToFromMyFeedSection(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(goToMyFeedButton);
    }


    public boolean validateMyFeedArticleList()
    {
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.fromMyFeedArticleList);
        if(eleList.size()>0)
        {
            return true;
        }
        return false;
    }

    public boolean validateFromMyFeedHeader(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToText("From My Feed");
        return this.action.elementHelper.fnIsElementPresent(fromMyFeedHeader);
    }

    public boolean validateGoToMyFeed(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/bt_more");
        return this.action.elementHelper.fnIsElementPresent(goToMyFeedButton);
    }

    public boolean validateTimestamp(){
        return this.action.elementHelper.fnIsElementPresent(timestamp);
    }

    public void clickOnGoToMyFeed() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/bt_more");
        this.action.elementHelper.fnClick(goToMyFeedButton);
    }

    public void unselectAllTopics() {
        try {
            if (this.action.elementHelper.fnIsElementPresent(myTopicSelectedList)) {

                List<WebElement> eleList = this.action.elementHelper.fnGetListofElement(this.myTopicSelectedList);
                int size = eleList.size();

                for (int i = 1; i <= size; i++) {
                    By loc = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.channelnewsasia:id/rv_selected_topics']/android.widget.CheckBox[" + i + "]");
                    this.action.elementHelper.fnClick(loc);
                }
            } else {
            }
        } catch (Exception e) {
        }

    }

}