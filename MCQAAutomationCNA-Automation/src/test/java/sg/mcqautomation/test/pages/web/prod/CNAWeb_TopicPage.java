package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CNAWeb_TopicPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_TopicPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By worldCategoryArticleFromTopStories;
    private By worldCategoryArticleBlock;
    private By relatedTopicsSection;
    private By relatedTopicArticle;
    private By followButton;
    private By topicName;
    private By articleList;
    private By articleTitle;
    private By sortSection;
    private By paginationSection;
    private By filterSection;
    private By publishedDateTime;
    private By followButton_anonymous;
    private By followButton_LogInUser;
    private By getFollowButtonText;
    private By articleList_FeedFollowingPage;
    private By topicName_UnFollow;
    private By buttonFollowing;
    private By noFollowingTopics_message;
    private By suggestedTopicsSection;

    public void initElements() {
        this.worldCategoryArticleFromTopStories = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//p/a[contains(.,'Singapore')]/ancestor::div[@class='list-object']//h6/a"));
        this.worldCategoryArticleBlock = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//p/a[contains(.,'Singapore')]/ancestor::div[@class='list-object']"));
        this.relatedTopicsSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'related-topics')]]//h4"));
        this.relatedTopicArticle  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'related-topics')]]//a"));
        this.followButton  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[contains(.,'Follow')]"));
        this.followButton_anonymous  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@class[contains(.,'follow-link-anonymous')]]"));
        this.topicName  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'content-list--header')]]/h1"));
        this.articleList  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h6/ancestor::div[@class='media-object']"));
        this.articleTitle  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='media-object']//h6"));
        this.sortSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//details[@id[contains(.,'sort-options')]]"));
        this.paginationSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='pager__link']/parent::li/parent::ul"));
        this.filterSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'sort_by')]]"));
        this.publishedDateTime  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class[contains(.,'timestamp timeago')]]"));
        this.followButton_LogInUser  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='meConnectFollow']"));
        this.getFollowButtonText  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='meConnectFollow']//span"));
        this.buttonFollowing  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='meConnectFollow']//span[contains(.,'Following')]"));
        this.articleList_FeedFollowingPage  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='ais-Hits-item']"));
        this.topicName_UnFollow  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='topic_container']/a"));
        this.noFollowingTopics_message  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[@class='h3 h3--page-title']/span"));
        this.suggestedTopicsSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='trending-block']"));


    }


    public void clickOnArticlefromTopStory(){
        this.action.waitHelper.waitFor(worldCategoryArticleBlock);
        this.action.javaScriptHelper.fnJSScrollToView(worldCategoryArticleFromTopStories);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.actionHelper.fnActionClick(worldCategoryArticleFromTopStories);
    }
    public boolean validateRelatedTopicsSection(){
        this.action.waitHelper.waitFor(relatedTopicsSection);
        return this.action.elementHelper.fnVerifyIsDisplayed(relatedTopicsSection);
    }

    public void clickOnARelatedArticle(){
        this.action.waitHelper.waitFor(relatedTopicArticle);
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(relatedTopicArticle);
        System.out.println("Page title is : " + driver.getTitle());
    }

    public boolean validateTopicListingPage(){
        this.action.waitHelper.waitFor(followButton);
        return this.action.elementHelper.fnVerifyIsDisplayed(followButton);
    }

    public boolean validateTopListingPageSections(){
        boolean topiclistingPageSections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(followButton);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(topicName);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(articleTitle);

        if(sec1 && sec2&& sec3 )
            topiclistingPageSections=true;
        return topiclistingPageSections;
    }

    public boolean articleListInTopicListing(){
        boolean list=false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(articleList);
        if (articlesList.size() > 0)
            list = true;
        return list;
    }

    public boolean validateSortPaginationOptions(){
        boolean sortPagination=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;
        boolean sec4=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(sortSection);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(publishedDateTime);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(filterSection);
       /* this.action.javaScriptHelper.fnJSScrollToView(paginationSection);
        sec4 = this.action.elementHelper.fnIsElementDisplayed(paginationSection);*/

        if(sec1 && sec2&& sec3)
            sortPagination=true;
        return sortPagination;
    }
    public void clickOnFollowButtonAnonymousUser(){
        this.action.javaScriptHelper.fnJSScrollToView(followButton_anonymous);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.actionHelper.fnActionClick(followButton_anonymous);
    }

    public void clickOnFollowButtonLoggedInUser(){
        this.action.javaScriptHelper.fnJSScrollToView(followButton_LogInUser);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(followButton_LogInUser);
    }

    public String verifyFollowButtonAfterClick() throws InterruptedException {
        return this.action.elementHelper.fnGetText(getFollowButtonText);
    }

    public boolean articleListInFeedFollowingPage(){
        boolean list=false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(articleList_FeedFollowingPage);
        if (articlesList.size() > 0)
            list = true;
        return list;
    }

    public void clickOnTopicName() {
        this.action.javaScriptHelper.fnJSClick(topicName_UnFollow);

        Set<String> allWindowHandles = this.driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(allWindowHandles);
        String topicListingPage = windowStrings.get(2);
        this.driver.switchTo().window(topicListingPage);
        }

    public void clickOnFollowingAndUnFollowTopic(){
        this.action.javaScriptHelper.fnJSScrollToView(followButton);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.actionHelper.fnActionClick(followButton);
    }

    public boolean validateSuggestedTopicsSection(){
        return this.action.elementHelper.fnIsElementPresent(suggestedTopicsSection);
    }

    public String noFollowingTopicsMsgValidation(){
        return this.action.elementHelper.fnGetText(noFollowingTopics_message);
    }

}

