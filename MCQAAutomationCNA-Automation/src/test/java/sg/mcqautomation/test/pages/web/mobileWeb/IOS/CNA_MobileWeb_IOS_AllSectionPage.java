package sg.mcqautomation.test.pages.web.mobileWeb.IOS;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CNA_MobileWeb_IOS_AllSectionPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_IOS_AllSectionPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By allSectionsMenuLink;
    private By allSectionPage;
    private By cnaLogo;
    private By TopStoriesPrimaryMenu;
    private By TopStoriesSecondaryMenu;
    private By editionSwitchSection;
    private By searchTextBox;
    private By trendingTopics;
    private By followCNASection;
    private By searchInput;
    private By closeButton;

    public void initElements() {
        this.allSectionsMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/span[@class='all-section-menu main-menu__link']"));
        this.allSectionPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='modal__edition-menu']"));
        this.cnaLogo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='all-section-menu-modal']//div[@class='modal__logo']"));
        this.TopStoriesPrimaryMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='all-section-menu-modal']//a[contains(.,'Top Stories')]"));
        this.TopStoriesSecondaryMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='modal__secondary-menu']//a[contains(.,'Singapore')]"));
        this.editionSwitchSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='modal__content__col modal__content__col--two']//div[@class='edition-block']"));
        this.searchTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='modal__content__col modal__content__col--two']//input"));
        this.trendingTopics = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='hot-trending-topics']"));
        this.followCNASection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='follow-block']"));
        this.searchInput = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='algolia-search']//input[@id='algolia-search-input']"));
        this.closeButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='close modal__close']"));

    }

    public void clickAllSectionsMenuLink(){
        this.action.javaScriptHelper.fnJSClick(allSectionsMenuLink);
    }

    public boolean validateAllSectionsLandingPage() {
        this.action.waitHelper.waitFor(allSectionPage);
        return this.action.elementHelper.fnIsElementDisplayed(allSectionPage);
    }

    public boolean validateMenuSection(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(cnaLogo);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(TopStoriesPrimaryMenu);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(TopStoriesSecondaryMenu);

        if(sec1 && sec2 && sec3 )
            sections=true;
        return sections;
    }

    public boolean validateEditionSection() {
        return this.action.elementHelper.fnVerifyIsDisplayed(editionSwitchSection);
    }

    public boolean validateSearchTextBox() {
        return this.action.elementHelper.fnIsElementDisplayed(searchTextBox);
    }

    public boolean validateTrendingTopics() {
        return this.action.elementHelper.fnIsElementDisplayed(trendingTopics);
    }

    public boolean validateFollowCNASection() {
        return this.action.elementHelper.fnIsElementDisplayed(followCNASection);
    }

    public void enterSearchText(String searchText) throws AWTException {
        this.action.waitHelper.waitFor(searchInput);
        this.action.javaScriptHelper.fnJSClick(searchInput);
        this.action.elementHelper.fnType(this.searchInput, searchText);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void clickOnCloseButton(){
        this.action.javaScriptHelper.fnJSClick(closeButton);
    }

}
