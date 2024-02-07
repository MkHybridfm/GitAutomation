package sg.mcqautomation.test.pages.app.android_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Tab_HomePage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Tab_HomePage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By homePageSectionLandingHeader;

    public void initElements() {

        this.homePageSectionLandingHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.LinearLayout[@content-desc=\"Top Stories\"]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther[@name=\"Top Stories\"]"));
    }


    public boolean validateHomePageSectionLandingHeader() throws InterruptedException {
        Thread.sleep(2000);
        this.action.waitHelper.waitFor(homePageSectionLandingHeader);
        return this.action.elementHelper.fnIsElementDisplayed(homePageSectionLandingHeader);
    }


}