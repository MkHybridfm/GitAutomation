package sg.mcqautomation.test.pages.app.ios.iPhone;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPhoneCNAHomePage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPhoneCNAHomePage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By homePageSectionLandingHeader;

    public void initElements() {
        this.homePageSectionLandingHeader = MobileAppLocator.GetLocator("//XCUIElementTypeOther[@name=\"Top Stories\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
    }


    public boolean validateHomePageSectionLandingHeader() throws InterruptedException {
        Thread.sleep(2000);
        this.action.waitHelper.waitFor(this.homePageSectionLandingHeader);
        return this.action.elementHelper.fnIsElementDisplayed(this.homePageSectionLandingHeader);
    }

    public boolean validateHomePageSectionLandingTab(String strSectionName) throws InterruptedException {
        Thread.sleep(2000);
        By loc=By.xpath("//XCUIElementTypeTable//XCUIElementTypeStaticText[@name='"+strSectionName+"']");
        return this.action.elementHelper.fnIsElementPresent(loc);
    }

    public void swipeSecLandingPageLeft(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.LEFT);
    }

    public void swipeSecLandingPageRight(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.RIGHT);
    }


}