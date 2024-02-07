package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.util.List;

public class CNA_MobileWeb_Android_AuthorInformationPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    private AndroidDriver androidDriver;

    public CNA_MobileWeb_Android_AuthorInformationPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.androidDriver = (AndroidDriver) driver;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By commentarySectionLink;
    private By articleLink;
    private By authorInfoBlock;
    private By authorName;
    private By authorInfoPage;
    private By authorInfoPage_Image;
    private By authorInfoPage_Name;
    private By authorFollowBtn;
    private By authorArticleList;
    private By authorSummary;
    private By sortSection;
    private By filterSection;
    private By articleHeader;
    private By mainMenuIcon;
    private By commentarySectionPageLink;

    public void initElements() {
        this.commentarySectionLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='main-menu__item']/a[contains(.,'Commentary')]"));
        this.articleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[@class='h3 list-object__heading']/a"));
        this.authorInfoBlock = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'author-info-block')]]"));
        this.authorName = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'author-card__body')]]//h6/a"));
        this.authorInfoPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='author-card']"));
        this.authorInfoPage_Image = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='author-card__figure']/img"));
        this.authorInfoPage_Name = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class[contains(.,'author-name')]]"));
        this.authorFollowBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='meConnectFollowAnonymous']"));
        this.authorArticleList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'author-entity-list')]]//h6"));
        this.authorSummary = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='author-card author-card--']//div[@class='text-long']//p"));
        this.sortSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'sort_by')]]"));
        this.filterSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h4[contains(.,'Filter')]/parent::form//div[@id[contains(.,'edit-type')]]"));
        this.articleHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class[contains(.,'h1--page-title')]]"));
        this.mainMenuIcon = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='toggle-expand__open']"));
        this.commentarySectionPageLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Commentary')][@class[contains(.,'hamburger-menu')]]"));

    }


    public void clickOnCommentarySection(){
        this.action.javaScriptHelper.fnJSClick(commentarySectionLink);
    }

    public void selectAnArticlefromCommentaryPage(){
        this.action.waitHelper.fnWaitForVisibilityOf(articleLink);
        this.action.javaScriptHelper.fnJSClick(articleLink);
    }

    public boolean validateAuthorInfoBlock(){
        boolean authorInfo=false;
        boolean sec1=false;
        boolean sec2=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(authorInfoBlock);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(authorName);

        if(sec1 && sec2)
            authorInfo=true;
        return authorInfo;
    }

    public void clickOnArticleInfoLink(){
        this.action.javaScriptHelper.fnJSScrollToView(articleHeader);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(authorName);
    }

    public boolean authorInformationPage(){
        this.action.waitHelper.fnWaitForVisibilityOf(authorInfoPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(authorInfoPage);
    }

    public boolean validateAuthorBlock(){
        boolean authorInfo=false;
        boolean name=false;
        boolean img=true;
        boolean follow=false;
        boolean authorDesc =true;
        boolean articleList=false;
        List<WebElement> articles=null;

        name = this.action.elementHelper.fnVerifyIsDisplayed(authorInfoPage_Name);
        follow = this.action.elementHelper.fnVerifyIsDisplayed(authorFollowBtn);
        img = this.action.elementHelper.fnVerifyIsDisplayed(authorInfoPage_Image);
        //authorDesc  = this.action.elementHelper.fnIsElementDisplayed(authorSummary);

        //Author Article List
        articles = this.action.elementHelper.fnGetListofElement(authorArticleList);
        if(articles.size()>0)
            articleList=true;

        if(name && img && follow && articleList )
            authorInfo=true;
        return authorInfo;
    }

    public boolean validate_Sort_FilterSections(){
        boolean sections=false;
        boolean sort=false;
        boolean filter=false;

        sort = this.action.elementHelper.fnIsElementDisplayed(sortSection);
        filter = this.action.elementHelper.fnIsElementDisplayed(filterSection);

        if(sort && filter)
            sections=true;
        return sections;
    }

    public void clickMainMenuIcon(){
        this.action.javaScriptHelper.fnJSClick(androidDriver.findElement(mainMenuIcon));
    }

    public void clickCommentarySectionPageLink(){
        this.action.javaScriptHelper.fnJSClick(androidDriver.findElement(commentarySectionPageLink));
    }

}

