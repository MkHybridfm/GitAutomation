package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNALuxuryWeb_PreProd_ListingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNALuxuryWeb_PreProd_ListingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By luxuryPageSubMenu;


    public void initElements() {
        this.luxuryPageSubMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'related-topics')]]//a"));
    }

    public void clickOnluxuryPageSubMenu() {
        this.action.waitHelper.waitFor(luxuryPageSubMenu);
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(luxuryPageSubMenu);
    }

}
