package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPadCNALifeStylePage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNALifeStylePage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
    private By relatedTopic_CNALuxury;
    private By authorNameOnLifeStyle;

    public void initElements() {
        this.article_lifeStyle = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='icon menu grey']//..//..", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_CNALifeStylePage = MobileAppLocator.GetLocator("//XCUIElementTypeCollectionView//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.entertainmentCategoryLabel = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Entertainment\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.wellnessCategoryLabel = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Wellness\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.womenCategoryLabel = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Women\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.livingCategoryLabel = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Living\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.styleAndBeautyCategoryLabel = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Style & Beauty\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.diningCategoryLabel = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Dining\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.travelCategoryLabel = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Travel\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.celebrity_entertainment = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Celebrity\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.filterAndOptions_lifeStyle = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Sort & Filter\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videoRadioButton_lifeStyle = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Video\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.applyButton_softAndOptions = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"APPLY\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.firstVideoOnVideoPage = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"Sort & Filter\"]/parent:: XCUIElementTypeCell/following-sibling::XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.relatedStories_Luxury = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='  RELATED STORIES  ']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_CNALuxuryPage = MobileAppLocator.GetLocator( "//XCUIElementTypeCollectionView//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.experiencesTopicsOnLuxurySec = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Experiences\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.obsessionsTopicsOnLuxurySec = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Obsessions\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.peopleTopicsOnLuxurySec = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"People\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.remarkableLivingTopicsOnLuxurySec = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Remarkable Living\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.celebrationsTopicsOnLuxurySec = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Celebrations\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.relatedTopic_CNALuxury= MobileAppLocator.GetLocator( "//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.authorNameOnLifeStyle= MobileAppLocator.GetLocator("(//XCUIElementTypeCollectionView//XCUIElementTypeLink)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
}


    public void clickOnArticle() throws InterruptedException {
        Thread.sleep(6000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_lifeStyle);
        this.action.elementHelper.fnClick(this.article_lifeStyle);
    }

    public boolean verifyListOfSectionsUnderTheLifeStyleMenuPage(){
        try {
            return this.action.elementHelper.fnGetListofElement(this.listOfTopics_CNALifeStylePage).size()>4;
        }
        catch (Exception e){return false;}
    }

    public String validateWomenCategory(){
        return this.action.elementHelper.fnGetText(this.womenCategoryLabel);
    }

    public String validateEntertainmentCategory(){
        return this.action.elementHelper.fnGetText(this.entertainmentCategoryLabel);
    }

    public String validateStyleAndBeautyCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.styleAndBeautyCategoryLabel);
        return this.action.elementHelper.fnGetText(this.styleAndBeautyCategoryLabel);
    }

    public String validateWellnessCategory(){
        return this.action.elementHelper.fnGetText(this.wellnessCategoryLabel);
    }

    public String validateLivingCategory(){
        return this.action.elementHelper.fnGetText(this.livingCategoryLabel);
    }

    public String validateDiningCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.diningCategoryLabel);
        return this.action.elementHelper.fnGetText(this.diningCategoryLabel);
    }

    public String validateTravelCategory(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.travelCategoryLabel);
        return this.action.elementHelper.fnGetText(this.travelCategoryLabel);
    }

    public void clickOnCelebrityField(){
        this.action.waitHelper.waitFor(this.celebrity_entertainment);
        this.action.elementHelper.fnClick(this.celebrity_entertainment);
    }

    public void clickOnFilterAndOptions(){
        this.action.elementHelper.fnClick(this.filterAndOptions_lifeStyle);
    }

    public void selectVideoLabel(){
        this.action.elementHelper.fnClick(this.videoRadioButton_lifeStyle);
    }

    public void selectApplyButtonOnSortAndOptions(){
        this.action.elementHelper.fnClick(this.applyButton_softAndOptions);
    }

    public void clickOnFirstVideo(){
        this.action.elementHelper.fnClick(this.firstVideoOnVideoPage);
    }

    public void clickOnEntertainmentField(){
        this.action.elementHelper.fnClick(this.entertainmentCategoryLabel);
    }

    public boolean verifyRelatedStoriesOnLuxury(String strDetails){
        By loc=By.xpath("//XCUIElementTypeStaticText[contains(@name,'"+strDetails+"')]");
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedStories_Luxury);
    }

    public boolean validateListOfTopicsOnLuxurySec(){
        try {
            return this.action.elementHelper.fnGetListofElement(this.listOfTopics_CNALuxuryPage).size()>4;
        }
        catch (Exception e){return false;}
    }

    public String validateExperiencesTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(this.experiencesTopicsOnLuxurySec);
    }

    public String validateObsessionsTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(this.obsessionsTopicsOnLuxurySec);
    }

    public String validatePeopleTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(this.peopleTopicsOnLuxurySec);
    }

    public String validateRemarkableLivingTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(this.remarkableLivingTopicsOnLuxurySec);
    }

    public String validateCelebrationsTopicsOnLuxurySec(){
        return this.action.elementHelper.fnGetText(this.celebrationsTopicsOnLuxurySec);
    }

    public void clickONCelebrationFieldUnderLuxury(){
        this.action.elementHelper.fnClick(this.celebrationsTopicsOnLuxurySec);
    }

    public void clickOnLuxuryTopicOnArticlePage(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopic_CNALuxury);
        List<WebElement> eleList =  this.action.elementHelper.fnGetListofElement(this.relatedTopic_CNALuxury);
        for (int k = 0; k < eleList.size(); k++) {
            WebElement element = eleList.get(k).findElement(By.xpath("//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeButton//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]"));
            if (element.isDisplayed())
                element.findElement(By.xpath("/parent::XCUIElementTypeButton/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCollectionView/XCUIElementTypeCell")).click();
        }
    }

    public boolean verifyAuthorNameOnLifeStyle(){
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.authorNameOnLifeStyle, MobileInteractionHelper.Direction.UP);
    }

    public void clickOnAuthorName(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,4);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.authorNameOnLifeStyle);
         this.action.elementHelper.fnClick(this.authorNameOnLifeStyle);
    }
}