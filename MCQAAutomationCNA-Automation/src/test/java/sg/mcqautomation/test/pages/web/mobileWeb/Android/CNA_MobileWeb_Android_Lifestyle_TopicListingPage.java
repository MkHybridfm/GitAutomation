package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_Lifestyle_TopicListingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_Lifestyle_TopicListingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By relatedTopicsSection;
    private By submenuLivingLandingPage;

    public void initElements() {
        this.relatedTopicsSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'related-topics')]]"));
        this.submenuLivingLandingPage  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='content-detail']//a[contains(.,'Homes')]"));
    }


    public boolean validateRelatedTopicsSection(){
        this.action.waitHelper.waitFor(relatedTopicsSection);
        return this.action.elementHelper.fnVerifyIsDisplayed(relatedTopicsSection);
    }

    public void clickOnSubMenuInLivingLandingPage(){
        this.action.waitHelper.waitFor(submenuLivingLandingPage);
        this.action.javaScriptHelper.fnJSClick(submenuLivingLandingPage);
    }
}
