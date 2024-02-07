package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNALifestyleWeb_PreProd_LoginPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNALifestyleWeb_PreProd_LoginPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By mainMenuHomePage;
    private By menuLinkSignIn;
    private By userProfileAvatar;

    public void initElements() {
        this.mainMenuHomePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']"));
        this.menuLinkSignIn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='sign-in-link inline-menu__link']"));
        this.userProfileAvatar = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']"));

    }

    public void launchApplication() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.WEB) {
            this.action.browserNavigationHelper.fnGetURL(this.objConfig.appURL_LifeStyle);
        }
    }

    public boolean verifyHomePage() {
        this.action.waitHelper.waitFor(mainMenuHomePage);
        return this.action.elementHelper.fnVerifyIsDisplayed(mainMenuHomePage);
    }

    public void clickOnSignInbutton() {
        this.action.javaScriptHelper.fnJSClick(menuLinkSignIn);
    }

    public boolean validateLifestyleLoginUserLandingPage(){
        this.action.waitHelper.waitFor(userProfileAvatar);
        return this.action.elementHelper.fnIsElementDisplayed(userProfileAvatar);
    }

}
