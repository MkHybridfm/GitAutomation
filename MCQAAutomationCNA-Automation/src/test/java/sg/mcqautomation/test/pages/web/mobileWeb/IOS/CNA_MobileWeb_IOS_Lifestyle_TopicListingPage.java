package sg.mcqautomation.test.pages.web.mobileWeb.IOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_IOS_Lifestyle_TopicListingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    private IOSDriver iosDriver;

    public CNA_MobileWeb_IOS_Lifestyle_TopicListingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.iosDriver = (IOSDriver) driver;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By relatedTopicsSection;
    private By submenuLivingLandingPage;
    private By menuIcon;
    private By subMenuLink;

    public void initElements() {
        this.relatedTopicsSection  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'related-topics')]]"));
        this.submenuLivingLandingPage  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='content-detail']//a[contains(.,'Homes')]"));
        this.menuIcon  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='toggle-expand__open']"));
        this.subMenuLink  =  AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Celebrity')]"));
    }


    public boolean validateRelatedTopicsSection(){
        this.action.waitHelper.waitFor(relatedTopicsSection);
        return this.action.elementHelper.fnVerifyIsDisplayed(relatedTopicsSection);
    }

    public void clickOnSubMenuInLivingLandingPage(){
        this.action.waitHelper.waitFor(submenuLivingLandingPage);
        this.action.javaScriptHelper.fnJSClick(submenuLivingLandingPage);
    }

    public void clickMenuIcon(){
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(menuIcon));
    }

    public void clickSubMenu(){
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(subMenuLink));
    }


}
