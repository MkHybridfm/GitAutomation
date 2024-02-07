package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_Lifestyle_HeaderMenuPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_Lifestyle_HeaderMenuPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By GoToLuxuryLink;
    private By luxuryHomePage;

    public void initElements() {
        this.GoToLuxuryLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'CNA Luxury')]"));
        this.luxuryHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Experiences')]"));
    }

    public void ClickOnGoToLuxuryLinkFromHeaderMenu(){
        this.action.javaScriptHelper.fnJSScrollToView(GoToLuxuryLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(GoToLuxuryLink);
    }

    public boolean validateLuxuryHomePage(){
        this.action.javaScriptHelper.fnJSScrollToView(luxuryHomePage);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.waitHelper.waitFor(luxuryHomePage);
        return this.action.elementHelper.fnVerifyIsDisplayed(luxuryHomePage);
    }


}
