package sg.mcqautomation.test.pages.app.android;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_LifeStylePage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_LifeStylePage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By article_lifeStyle;
    private By listOfTopics_CNALifeStylePage;
    private By womenCategoryLabel;
    private By entertainmentCategoryLabel;
    private By styleAndBeautyCategoryLabel;
    private By wellnessCategoryLabel;
    private By livingCategoryLabel;
    private By diningCategoryLabel;
    private By travelCategoryLabel;
    private By celebrity_entertainment;
    private By filterAndOptions_lifeStyle;
    private By videoRadioButton_lifeStyle;
    private By applyButton_softAndOptions;
    private By firstVideoOnVideoPage;
    private By relatedStories_Luxury;
    private By listOfTopics_CNALuxuryPage;
    private By experiencesTopicsOnLuxurySec;
    private By obsessionsTopicsOnLuxurySec;
    private By peopleTopicsOnLuxurySec;
    private By remarkableLivingTopicsOnLuxurySec;
    private By celebrationsTopicsOnLuxurySec;
    private By listOfTopicsOnluxuryArticlePage;
    private By relatedTopic_CNALuxury;
    private By authorNameOnLifeStyle;

    public void initElements() {

        this.article_lifeStyle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]"));
        this.listOfTopics_CNALifeStylePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell//XCUIElementTypeStaticText"));
        this.entertainmentCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Entertainment')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Entertainment\"]"));
        this.wellnessCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Wellness')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Wellness\"]"));
        this.womenCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Women')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Women\"]"));
        this.livingCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Living')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Living\"]"));
        this.styleAndBeautyCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Style & Beauty')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Style & Beauty\"]"));
        this.diningCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Dining')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Dining\"]"));
        this.travelCategoryLabel = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Travel')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Travel\"]"));
        this.celebrity_entertainment = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Celebrity')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Celebrity\"]"));
        this.filterAndOptions_lifeStyle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_sort_filter"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Sort & Filter\"]"));
        this.videoRadioButton_lifeStyle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.CheckBox[contains(@text,'Video')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Video\"]"));
        this.applyButton_softAndOptions = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "bt_apply"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"APPLY\"]"));
        this.firstVideoOnVideoPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Sort & Filter\"]/parent:: XCUIElementTypeCell/following-sibling::XCUIElementTypeCell"));
        this.relatedStories_Luxury = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCollectionView/XCUIElementTypeCell[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText"));
        this.listOfTopics_CNALuxuryPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
        this.experiencesTopicsOnLuxurySec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Experiences')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Experiences\"]"));
        this.obsessionsTopicsOnLuxurySec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Obsessions')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Obsessions\"]"));
        this.peopleTopicsOnLuxurySec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'People')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"People\"]"));
        this.remarkableLivingTopicsOnLuxurySec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Remarkable Living')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Remarkable Living\"]"));
        this.celebrationsTopicsOnLuxurySec = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Celebrations')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Celebrations\"]"));
        this.listOfTopicsOnluxuryArticlePage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        this.relatedTopic_CNALuxury= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCell"));
        this.authorNameOnLifeStyle= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_author_names"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeTextView/XCUIElementTypeTextView"));

    }


    public void clickOnArticle() throws InterruptedException {
        Thread.sleep(2000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
        this.action.waitHelper.waitFor(article_lifeStyle);
        this.action.elementHelper.fnClick(article_lifeStyle);
    }

    public boolean verifyListOfSectionsUnderTheLifeStyleMenuPage(){
        boolean blnStatus = false;
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfTopics_CNALifeStylePage);
        if(eleList.size()>0)
            blnStatus = true;
        return blnStatus;
    }

    public String validateWomenCategory(){
        return this.action.elementHelper.fnGetText(womenCategoryLabel);
    }

    public String validateEntertainmentCategory(){
        return this.action.elementHelper.fnGetText(entertainmentCategoryLabel);
    }

    public String validateStyleAndBeautyCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        return this.action.elementHelper.fnGetText(styleAndBeautyCategoryLabel);
    }

    public String validateWellnessCategory(){
        return this.action.elementHelper.fnGetText(wellnessCategoryLabel);
    }

    public String validateLivingCategory(){
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        }
        return this.action.elementHelper.fnGetText(livingCategoryLabel);
    }

    public String validateDiningCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
        return this.action.elementHelper.fnGetText(diningCategoryLabel);
    }

    public String validateTravelCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
        return this.action.elementHelper.fnGetText(travelCategoryLabel);
    }

    public void clickOnCelebrityField(){
        this.action.waitHelper.waitFor(celebrity_entertainment);
        this.action.elementHelper.fnClick(celebrity_entertainment);
    }

    public void clickOnFilterAndOptions(){
        this.action.elementHelper.fnClick(filterAndOptions_lifeStyle);
    }

    public void selectVideoLabel(){
        this.action.elementHelper.fnClick(videoRadioButton_lifeStyle);
    }

    public void selectApplyButtonOnSortAndOptions(){
        this.action.elementHelper.fnClick(applyButton_softAndOptions);
    }

    public void clickOnFirstVideo(){
        this.action.elementHelper.fnClick(firstVideoOnVideoPage);
    }

    public void clickOnEntertainmentField(){
        this.action.elementHelper.fnClick(entertainmentCategoryLabel);
    }

    public String verifyRelatedStoriesOnLuxury(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        this.action.waitHelper.waitFor(relatedStories_Luxury);
        return this.action.elementHelper.fnGetText(relatedStories_Luxury);
    }

    public boolean validateListOfTopicsOnLuxurySec(){
        boolean blnStatus = false;
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfTopics_CNALuxuryPage);
        if(eleList.size()>0)
            blnStatus = true;
        return blnStatus;
    }

    public String validateExperiencesTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(experiencesTopicsOnLuxurySec);
    }

    public String validateObsessionsTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(obsessionsTopicsOnLuxurySec);
    }

    public String validatePeopleTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(peopleTopicsOnLuxurySec);
    }

    public String validateRemarkableLivingTopicsOnLuxurySec(){
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        }
        return this.action.elementHelper.fnGetText(remarkableLivingTopicsOnLuxurySec);
    }

    public String validateCelebrationsTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(celebrationsTopicsOnLuxurySec);
    }

    public void clickONCelebrationFieldUnderLuxury(){
        this.action.elementHelper.fnClick(celebrationsTopicsOnLuxurySec);
    }

    public void clickOnLuxuryTopicOnArticlePage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
        List<WebElement> eleList = null;
        eleList = this.action.elementHelper.fnGetListofElement(relatedTopic_CNALuxury);
        for (int k = 0; k < eleList.size(); k++) {
            WebElement element = eleList.get(k).findElement(By.xpath("//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeButton//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]"));
            if (element.isDisplayed())
                element.findElement(By.xpath("/parent::XCUIElementTypeButton/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCollectionView/XCUIElementTypeCell")).click();
        }
    }

    public boolean verifyAuthorNameOnLifeStyle(){
        for (int i = 0; i <= 10; i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
                if (this.action.elementHelper.fnIsElementPresent(authorNameOnLifeStyle))
                    break;
            } catch (Exception e) {
            }
        }
        return this.action.elementHelper.fnIsElementDisplayed(authorNameOnLifeStyle);
    }

    public void clickOnAuthorName(){
         this.action.elementHelper.fnClick(authorNameOnLifeStyle);
    }


}