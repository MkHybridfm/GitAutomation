package sg.mcqautomation.test.pages.app.ios.iPhone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPhoneCNAMyFeedPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPhoneCNAMyFeedPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By myFeedSection;
    private By manageInterestsMyFeedSection;
    private By listOfTopics_myFeedSec;
    private By saveButton_MyFeedSection;
    private By searchButton;
    private By settingsIcon;
    private By myFeedSecHeader;
    private By followingField;
    private By bookmarkedField;
    private By manageInterestsFields;
    private By listOfTopics_ManageInterests_myFeedSec;
    private By listOfTopics_following_myFeed;
    private By skipNowButton;
    private By manageInterests;
    private By selectFollowedTopic;
    private By saveButtonOnManageInterests;
    private By myfeedButton;
    private By myfeedList;
    private By threeDots;
    private By myTopicList;
    private By myTopicListHome;
    private By CreateMyFeed;
    private By ViewMoreTopics;


    public void initElements() {
        this.myFeedSection = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"My Feed\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageInterestsMyFeedSection = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Manage interests\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_myFeedSec = MobileAppLocator.GetLocator("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.saveButton_MyFeedSection =MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"Save\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.searchButton = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"icon search\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.settingsIcon = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"icon settings\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myFeedSecHeader = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"My Feed\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.bookmarkedField = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Bookmarked\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.followingField = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Following\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageInterestsFields = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Manage interests\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_ManageInterests_myFeedSec = MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_following_myFeed = MobileAppLocator.GetLocator( "//XCUIElementTypeTable//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.skipNowButton = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"Skip for now\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageInterests = MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name=\"Manage interests\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.selectFollowedTopic =MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"You are following\"]/parent::XCUIElementTypeCell/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.saveButtonOnManageInterests = MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name=\"Save\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myfeedButton = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"Manage Feed\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myfeedList = MobileAppLocator.GetLocator("//XCUIElementTypeTable//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDots = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name='icon menu grey'])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myTopicList = MobileAppLocator.GetLocator( "//XCUIElementTypeTable//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.myTopicListHome = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Create My Feed']//..//XCUIElementTypeTable//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.CreateMyFeed =MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Create My Feed' and @visible='true']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.ViewMoreTopics =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='View More Topics' and @visible='true']", MobileAppLocator.MobileElementType.XCUICustomElement);
    }


    public void clickOnMyFeedSection() {
        this.action.elementHelper.fnClick(this.myFeedSection);
    }

    public void clickOnManageInterestsOnMyFeedSection(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.manageInterestsMyFeedSection, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.manageInterestsMyFeedSection);
    }

    public boolean verifyListOfTopicsOnMyFeedSec(){
        try {
            return this.action.elementHelper.fnGetListofElement(this.listOfTopics_following_myFeed).size()>0;
        }
        catch (Exception e){return false;}
    }

    public void clickOnOneTopicOnMyFeedSec(){
        this.action.elementHelper.fnGetListofElement(this.listOfTopics_following_myFeed).get(0).click();
    }

    public void clickSaveButton(){
        if(this.action.elementHelper.fnIsElementPresent(this.saveButton_MyFeedSection))
            this.action.elementHelper.fnClick(this.saveButton_MyFeedSection);
        else{
            this.action.elementHelper.fnClick(this.manageInterests);
            this.action.elementHelper.fnClick(this.selectFollowedTopic);
            this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.saveButtonOnManageInterests, MobileInteractionHelper.Direction.UP);
            this.action.elementHelper.fnClick(this.saveButtonOnManageInterests);
        }
    }

    public boolean validateSearchButton(){
        return this.action.elementHelper.fnIsElementPresent(this.searchButton);
    }

    public boolean validateSettingsIcon(){
        return this.action.elementHelper.fnIsElementPresent(this.settingsIcon);
    }

    public String verifyMyFeedSecHeader(){
        return this.action.elementHelper.fnGetText(this.myFeedSecHeader);
    }

    public boolean validateFollowingField(){
        return this.action.elementHelper.fnIsElementPresent(this.followingField);
    }

    public boolean validateBookMarkedField(){
        return this.action.elementHelper.fnIsElementPresent(this.bookmarkedField);
    }

    public boolean validateManageInterestsField(){
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.manageInterestsFields, MobileInteractionHelper.Direction.UP);
    }

    public void selectAtopicOnManageIntersts(){
        this.action.elementHelper.fnGetListofElement(this.listOfTopics_ManageInterests_myFeedSec).get(0).click();
    }

    public boolean verifyListOfArticlesOnMyFeedSec(){
        try {
            return this.action.elementHelper.fnGetListofElement(this.listOfTopics_myFeedSec).size()>0;
        }
        catch (Exception e){return false;}
    }

    public void clickOnSkipNowButton(){
        this.action.elementHelper.fnClick(this.skipNowButton);
    }

    public void clickONBookmarkedField(){
        this.action.elementHelper.fnClick(this.bookmarkedField);
    }

    public void clickOnFollowingField(){
        this.action.elementHelper.fnClick(this.followingField);
    }

    public boolean verifyListDetils(){
            List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.listOfTopics_following_myFeed);
            if(eleList.size()>0)
            {
                List<WebElement> eleDetails=eleList.get(0).findElements(By.xpath("//XCUIElementTypeStaticText"));
                if(eleDetails.size()>0)
                    return true;
            }
            return false;
    }
    public boolean verifyListDetilsTime(){
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.listOfTopics_following_myFeed);
        if(eleList.size()>0)
        {
            List<WebElement> eleDetails=eleList.get(0).findElements(By.xpath("//XCUIElementTypeStaticText"));
            if(eleDetails.size()>0)
            {
                for(int i=0;i<eleDetails.size();i++)
                {
                    if(this.action.elementHelper.fnGetText(eleDetails.get(i)).toLowerCase().contains("ago"))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean verifyListDetilsbookmarkandShare(){
        List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.listOfTopics_following_myFeed);
        if(eleList.size()>0)
        {
            return eleList.get(0).findElements(By.xpath("//XCUIElementTypeButton[@name='icon menu grey']")).size()>0;
        }
        return false;
    }

    public boolean verifyMyFeedButton(){
        return this.action.elementHelper.fnIsElementPresent(this.myfeedButton);
    }

    public boolean verifyMyFeedList(){
        return this.action.elementHelper.fnGetListofElement(this.myfeedList).size() > 0;
    }

    public void clickonthreeDots(){
        this.action.elementHelper.fnClick(this.threeDots);
    }

    public void clickMyFeedTab(String strTab){
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strTab+"']");
        this.action.elementHelper.fnClick(loc);
    }

    public void clickMyFeedButton() throws InterruptedException {
        Thread.sleep(1000);
        this.action.elementHelper.fnClick(this.myfeedButton);
    }

    public boolean verifyMyTopicFeedList(){
        return this.action.elementHelper.fnGetListofElement(this.myTopicList).size()>0;
    }

    public int getMyTopicFeedList(){
        return this.action.elementHelper.fnGetListofElement(this.myTopicList).size();
    }

    public String getMyTopicFeedListName(){
         List<WebElement> elementList=this.action.elementHelper.fnGetListofElement(this.myTopicList);
         return elementList.get(elementList.size()).findElements(By.xpath("//XCUIElementTypeTable//XCUIElementTypeStaticText")).get(0).getText();
    }

    public boolean verifyMyTopicFeedListName(String strName){
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strName+"']");
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }

    public boolean verifyTopicsOptionInHomeScreen(){
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='Topics' and @visible ='true']");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }

    public boolean myTopicListHome(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.myTopicListHome, MobileInteractionHelper.Direction.UP);
        return this.action.elementHelper.fnGetListofElement(this.myTopicListHome).size()>0;
    }

    public void SelectMyTopicFromHome(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.myTopicListHome, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnGetListofElement(this.myTopicListHome).get(0).click();

    }

    public void clickCreateMyFeedButton(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.CreateMyFeed, MobileInteractionHelper.Direction.UP);
            this.action.elementHelper.fnClick(this.CreateMyFeed);
    }

    public void ViewMoreTopics(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.ViewMoreTopics, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.ViewMoreTopics);
    }

    public void ResetMyFeedList() {
        List<WebElement> elementList=this.action.elementHelper.fnGetListofElement(this.myTopicList);
        if(elementList.size()>1)
        {
            for(int i=0;i<elementList.size();i++)
            {
                elementList.get(i).click();
            }
        }
    }

}