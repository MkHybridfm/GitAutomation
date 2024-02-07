package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_Luxury_HeaderMenuPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_Luxury_HeaderMenuPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By GoToLifestyleLink;
    private By lifestyleHomePage;

    public void initElements() {
        this.GoToLifestyleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'CNA Lifestyle')]"));
        this.lifestyleHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'Entertainment')]"));
    }

    public void ClickOnGoToLifestyleLinkFromHeaderMenu(){
        this.action.javaScriptHelper.fnJSScrollToView(GoToLifestyleLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(GoToLifestyleLink);
    }

    public boolean validateLuxuryHomePage() throws InterruptedException {
        Thread.sleep(2000);
        this.action.waitHelper.waitFor(lifestyleHomePage);
        return this.action.elementHelper.fnVerifyIsDisplayed(lifestyleHomePage);
    }


}
