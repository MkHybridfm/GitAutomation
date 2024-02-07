package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_SearchPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_SearchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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

        this.searchPageWithTrendingTopic = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Trending Topics')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Trending Topics\"]"));
        this.searchButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_search"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon search\"]"));
        this.closeButtonOnSearchPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_close"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon close\"]"));
        this.keyWordOnSearchBar = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "et_search"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeTextField[@value='Search CNA']"));
        this.listOfKeyValuesWithSearchKeyWord = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton"));
    }


    public String verifySearchPageWithTrendingTopic () throws InterruptedException {
        Thread.sleep(4000);
        return this.action.elementHelper.fnGetText(searchPageWithTrendingTopic);
    }

    public void clickOnSearchPage(){
        this.action.elementHelper.fnClick(searchButton);
    }

    public void clickOnCloseButtonOnSearchPage(){
        this.action.elementHelper.fnClick(closeButtonOnSearchPage);
    }

    public void enterTheKeyValueToSearch(String keyValue){
        this.action.elementHelper.fnType(keyWordOnSearchBar,keyValue);
    }

    public boolean verifyTheListOfKeyValuesWithSearchKeyWord(){
        boolean blnStatus = false;
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfKeyValuesWithSearchKeyWord);
        if(eleList.size()>0)
            blnStatus = true;
        return blnStatus;
    }
}