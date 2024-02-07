package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNALifestyleWeb_ArticleDetailPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNALifestyleWeb_ArticleDetailPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By articleLinkFromTopStories;
    private By articlePageAuthourBlock;
    private By articlePageShareOptions;
    private By alsoWorthReadingSection;
    private By outBrainSection;

    public void initElements() {
        this.articleLinkFromTopStories = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'h2')]]"));
        this.articlePageAuthourBlock = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'articlefield-author')]]"));
        this.articlePageShareOptions = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='js-popup-content with-authors']"));
        this.alsoWorthReadingSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'RECOMMENDED')]"));
        this.outBrainSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='OUTBRAIN']"));
    }

    public void clickOnlatestnewsArticle(){
        this.action.javaScriptHelper.fnJSClick(articleLinkFromTopStories);
    }

    public boolean validateArticleAuthorBlockAndShareOptions(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        this.action.javaScriptHelper.fnJSScrollToView(articlePageAuthourBlock);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();

        sec1 = this.action.elementHelper.fnVerifyIsDisplayed(articlePageAuthourBlock);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(articlePageShareOptions);

        if(sec1 && sec2)
            sections=true;
        return sections;
    }

    public boolean validateAlsoWorthReadingSection(){
        this.action.javaScriptHelper.fnJSScrollToView(alsoWorthReadingSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(alsoWorthReadingSection);
    }

    public boolean validateOutbrainSection(){
        this.action.javaScriptHelper.fnJSScrollToView(outBrainSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(outBrainSection);
    }

}
