package sg.mcqautomation.test.pages.web.mobileWeb.IOS;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_IOS_Luxury_ListingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_IOS_Luxury_ListingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By luxuryPageSubMenu;
    private By luxuryMainMenuLink;
    private By submenuLink;


    public void initElements() {
        this.luxuryPageSubMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'content-detail')]]//a[contains(.,'Community')]"));
        this.luxuryMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='toggle-expand__open']"));
        this.submenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/a[contains(.,'Celebrations')]"));
    }

    public void clickOnluxuryPageSubMenu() {
        this.action.elementHelper.fnClick(luxuryPageSubMenu);
    }
    public void clickOnluxuryMainMenuIcon() {
        this.action.elementHelper.fnClick(luxuryMainMenuLink);
    }
    public void clickOnluxurySubmenuLink() {
        this.action.elementHelper.fnClick(submenuLink);
    }

    }
