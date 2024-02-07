package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_DiscoverPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_DiscoverPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By myDiscoverSection;
    private By manageInterestsMyFeedSection;
    private By listOfTopics_myFeedSec;
    private By saveButton_MyFeedSection;
    private By surpriseMe;
    private By webViewUrl_DiscoverPage;
    private By DoneButton_webViewDiscoverPage;
    private By article_DiscoverPage;
    private By backArrow_DiscoverPage;
    private By headerOnDiscoverPage;
    private By articleTitle_discoverPage;
    private By backButton;
    private By threeDots_DiscoverPage;
    private By seeMoreLikeThis;
    private By seeFewerLikeThis;
    private By shareOption_discover;


    public void initElements() {

        this.myDiscoverSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Discover')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Discover\"]"));
        this.manageInterestsMyFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Manage interests\"]"));
        this.listOfTopics_myFeedSec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
        this.saveButton_MyFeedSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"Save\"])[1]"));
        this.surpriseMe = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "bt_surprise_me"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Surprise me\"]"));
        this.webViewUrl_DiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"URL\"]"));
        this.DoneButton_webViewDiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Done\"]"));
        this.article_DiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage"));
        this.backArrow_DiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_back"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon back\"]"));
        this.headerOnDiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "com.channelnewsasia:id/tv_label"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Trending\"]"));
        this.articleTitle_discoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_title"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]"));
        this.backButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_back"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon back\"]"));
        this.threeDots_DiscoverPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_options"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "(//XCUIElementTypeButton[@name=\"icon menu grey\"])"));
        this.seeMoreLikeThis = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_see_more"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"See more like this\"]"));
        this.seeFewerLikeThis = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_see_less"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"See fewer like this\"]"));
        this.shareOption_discover = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_share"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Share\"]"));
    }


    public void clickOnDiscoverSection() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        for (int i = 0; i <= 10; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                if (this.action.elementHelper.fnIsElementPresent(myDiscoverSection))
                    break;
            } catch (Exception e) {
            }
        }
        this.action.elementHelper.fnClick(myDiscoverSection);
    }

    public boolean validateSurpriseMeFunctionality() throws InterruptedException {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            for (int i = 0; i <= 15; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                    if (this.action.elementHelper.fnIsElementPresent(surpriseMe))
                        break;
                } catch (Exception e) {
                }
            }
        }
        else{
            for (int i = 0; i <= 5; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                    if (this.action.elementHelper.fnIsElementPresent(surpriseMe))
                        break;
                } catch (Exception e) {
                }
            }
        }

        return this.action.elementHelper.fnIsElementDisplayed(surpriseMe);
    }

    public void clickOnSurpriseMeFunctionality(){
        this.action.elementHelper.fnClick(surpriseMe);
    }

    public boolean validateUrl() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            return this.action.elementHelper.fnIsElementDisplayed(webViewUrl_DiscoverPage);
        } else {
            return true;
        }
    }

    public void clickOnDoneButton() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            this.action.elementHelper.fnClick(DoneButton_webViewDiscoverPage);
        } else {
            this.action.waitHelper.waitFor(backButton);
            this.action.elementHelper.fnClick(backButton);
        }
    }

    public void clickOnArticleOnDiscoverPage() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            this.action.elementHelper.fnClick(article_DiscoverPage);
        } else {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 8);
            for (int i = 0; i <= 10; i++) {
                try {
                    this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
                    if (this.action.elementHelper.fnIsElementPresent(article_DiscoverPage))
                        break;
                } catch (Exception e) {
                }
            }
            this.action.elementHelper.fnClick(article_DiscoverPage);
        }
    }

    public void clickOnBackArrow(){
        this.action.elementHelper.fnClick(backArrow_DiscoverPage);
    }

    public boolean verifyHeaderOnDiscoverPage() throws InterruptedException {
        Thread.sleep(4000);
        this.action.waitHelper.waitFor(headerOnDiscoverPage);
        return this.action.elementHelper.fnIsElementDisplayed(headerOnDiscoverPage);
    }

    public boolean validateArticleTitle(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN,2);
        return this.action.elementHelper.fnIsElementDisplayed(articleTitle_discoverPage);
    }

    public void clickOnThreeDotsOnDiscoverPage(){
        this.action.elementHelper.fnClick(threeDots_DiscoverPage);
    }

    public boolean validateOptionsOnThreeDots(){
        boolean blnStatus = true;
        boolean bln1 = false;
        boolean bln2 = false;
        boolean bln3 = false;

        bln1 =  this.action.elementHelper.fnIsElementDisplayed(seeMoreLikeThis);
        bln2 =  this.action.elementHelper.fnIsElementDisplayed(seeFewerLikeThis);
        bln3 =  this.action.elementHelper.fnIsElementDisplayed(shareOption_discover);

        if(bln1 && bln2 && bln3){
            blnStatus =true;
        }
        return blnStatus;
    }

}