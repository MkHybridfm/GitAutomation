package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.util.List;

public class CNAWeb_PreProd_ManageInterestPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_PreProd_ManageInterestPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By manageInterestButton;
    private By manageInterestHeader;
    private By suggestedForYouSection;
    private By backButton;
    private By myFeedPage;
    private By manageFeedPage;
    private By myTopicsTab;
    private By addTopicsTab;
    private By topicsList;
    private By cancelButton;
    private By savePreferencesButton;
    private By trendingTopic;

    public void initElements() {
        this.manageInterestButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Manage Interests')]"));
        this.manageInterestHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--page-title']"));
        this.suggestedForYouSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='manage_interest-links']"));
        this.backButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button/a[contains(.,'Back')]"));
        this.myFeedPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[contains(.,'My Feed')]"));
        this.manageFeedPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Manage Feed')]"));
        this.myTopicsTab = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'My Topics')]"));
        this.addTopicsTab = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Add Topics')]"));
        this.topicsList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='manage_interest-links']//label[@class='container active']/input"));
        this.cancelButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Cancel')]"));
        this.savePreferencesButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "(//a[contains(.,'Save Preferences')])[2]"));
        this.trendingTopic = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "(//div[@class='manage_interest-links']//div[@class='form-item--interactive-checkbox']/label)[4]"));
       }

    public boolean validateManageInterestButton(){
        return this.action.elementHelper.fnIsElementPresent(manageInterestButton);
    }

    public void clickOnManageInterestButton(){
        this.action.elementHelper.fnClick(manageInterestButton);
    }

    public String verifyManageInterestPageHeader() {
        this.action.waitHelper.waitFor(manageInterestHeader);
        return this.action.elementHelper.fnGetText(manageInterestHeader);
    }

    public boolean validateSuggestedTopicsSection(){
        return this.action.elementHelper.fnIsElementPresent(suggestedForYouSection);
    }

    public void clickOnBackButton(){
        this.action.elementHelper.fnClick(backButton);
    }

    public boolean validateMyFeedPage(){
        this.action.waitHelper.waitFor(myFeedPage);
        return this.action.elementHelper.fnIsElementPresent(myFeedPage);
    }

    public boolean validateManageFeedPage(){
        this.action.waitHelper.waitFor(manageFeedPage);
        return this.action.elementHelper.fnIsElementPresent(manageFeedPage);
    }

    public boolean validateMyTopicsAndAddTopicsTabs(){
        boolean tabs = false;
        boolean bln1 = false;
        boolean bln2 = false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(myTopicsTab);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(addTopicsTab);

        if (bln1 && bln2)
            tabs = true;
        return tabs;
    }


    public boolean validateTopicsList(){
        boolean list = false;

        List<WebElement> List=null;

        List = this.action.elementHelper.fnGetListofElement(topicsList);
        if(List.size()>0)
            list=true;

        return list;
    }

    public boolean validateCancelAndSavePreferencesButton(){
        boolean tabs = false;
        boolean bln1 = false;
        boolean bln2 = false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(cancelButton);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(savePreferencesButton);

        if (bln1 && bln2)
            tabs = true;
        return tabs;
    }

    public void clickAddTopicsTab(){
        this.action.elementHelper.fnClick(addTopicsTab);
    }

    public void clickOnATrendingTopic(){
        this.action.javaScriptHelper.fnJSClick(trendingTopic);
    }
    public void clickSavePreferencesButton(){
        this.action.elementHelper.fnClick(savePreferencesButton);
    }

    public boolean validateMyFeedPageMyTopics(){
        this.action.waitHelper.waitFor(myFeedPage);
        return this.action.elementHelper.fnIsElementPresent(myFeedPage);
    }
}
