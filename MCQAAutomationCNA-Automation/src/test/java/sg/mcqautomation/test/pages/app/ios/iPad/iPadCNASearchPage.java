package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPadCNASearchPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNASearchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By searchPageWithTrendingTopic;
    private By searchButton;
    private By closeButtonOnSearchPage;
    private By keyWordOnSearchBar;
    private By listOfKeyValuesWithSearchKeyWord;


    public void initElements() {
        this.searchPageWithTrendingTopic = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Trending Topics\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.searchButton = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon search\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.closeButtonOnSearchPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon close\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.keyWordOnSearchBar = MobileAppLocator.GetLocator( "//XCUIElementTypeTextField[@value='Search CNA']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfKeyValuesWithSearchKeyWord = MobileAppLocator.GetLocator("//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton", MobileAppLocator.MobileElementType.XCUICustomElement);
    }


    public String verifySearchPageWithTrendingTopic () throws InterruptedException {
        Thread.sleep(4000);
        return this.action.elementHelper.fnGetText(this.searchPageWithTrendingTopic);
    }

    public void clickOnSearchPage(){
        this.action.elementHelper.fnClick(this.searchButton);
    }

    public void clickOnCloseButtonOnSearchPage(){
        this.action.elementHelper.fnClick(this.closeButtonOnSearchPage);
    }

    public void enterTheKeyValueToSearch(String keyValue){
        this.action.elementHelper.fnType(this.keyWordOnSearchBar,keyValue);
    }

    public boolean verifyTheListOfKeyValuesWithSearchKeyWord(){
        try {
            return this.action.elementHelper.fnGetListofElement(this.listOfKeyValuesWithSearchKeyWord).size()>0;
        }
        catch (Exception e){
            return false;
        }
    }
}