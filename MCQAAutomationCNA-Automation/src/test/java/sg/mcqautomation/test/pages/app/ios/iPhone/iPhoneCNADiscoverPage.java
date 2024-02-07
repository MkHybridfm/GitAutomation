package sg.mcqautomation.test.pages.app.ios.iPhone;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPhoneCNADiscoverPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPhoneCNADiscoverPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
    private By articleautherImage;
    private By articleautherName;
    private By articleResult;
    private By articleSort;
    private By surpriseMeLogo;

    public void initElements() {
        this.myDiscoverSection = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Discover\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageInterestsMyFeedSection = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Manage interests\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_myFeedSec = MobileAppLocator.GetLocator("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.saveButton_MyFeedSection = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"Save\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.surpriseMe = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Surprise me']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.webViewUrl_DiscoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"URL\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.DoneButton_webViewDiscoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Done\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.article_DiscoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.backArrow_DiscoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon back\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.headerOnDiscoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Trending\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.articleTitle_discoverPage = MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.backButton = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon back\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.threeDots_DiscoverPage = MobileAppLocator.GetLocator( "(//XCUIElementTypeButton[@name=\"icon menu grey\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.seeMoreLikeThis = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"See more like this\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.seeFewerLikeThis = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"See fewer like this\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.shareOption_discover = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"Share\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.articleautherImage = MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name='article']//XCUIElementTypeImage", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.articleautherName = MobileAppLocator.GetLocator( "(//XCUIElementTypeOther[@name='article']//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.articleResult = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Showing']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.articleSort = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Sort & Filter']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.surpriseMeLogo = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='icon surprise me circle']", MobileAppLocator.MobileElementType.XCUICustomElement);
    }


    public void clickOnDiscoverSection() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.myDiscoverSection, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.myDiscoverSection, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.myDiscoverSection);
    }

    public boolean validateSurpriseMeFunctionality() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP,10);
        Thread.sleep(5000);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.surpriseMe, MobileInteractionHelper.Direction.UP);
    }

    public void clickOnSurpriseMeFunctionality() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.surpriseMe, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.surpriseMe);
    }

    public boolean validateUrl() {
            return this.action.elementHelper.fnIsElementPresent(this.webViewUrl_DiscoverPage);
    }

    public void clickOnDoneButton() {
            this.action.elementHelper.fnClick(this.DoneButton_webViewDiscoverPage);
    }

    public void clickOnArticleOnDiscoverPage() {
            this.action.elementHelper.fnClick(this.article_DiscoverPage);
    }

    public void clickOnBackArrow(){
        this.action.elementHelper.fnClick(this.backArrow_DiscoverPage);
    }

    public boolean verifyHeaderOnDiscoverPage() throws InterruptedException {
        Thread.sleep(4000);
        this.action.waitHelper.waitFor(this.headerOnDiscoverPage);
        return this.action.elementHelper.fnIsElementPresent(this.headerOnDiscoverPage);
    }

    public boolean validateArticleTitle(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,2);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN,2);
        return this.action.elementHelper.fnIsElementPresent(this.articleTitle_discoverPage);
    }

    public void clickOnThreeDotsOnDiscoverPage(){
        this.action.elementHelper.fnClick(this.threeDots_DiscoverPage);
    }

    public boolean validateOptionsOnThreeDots(){
        boolean bln1 =  this.action.elementHelper.fnIsElementPresent(this.seeMoreLikeThis);
        boolean bln2 =  this.action.elementHelper.fnIsElementPresent(this.seeFewerLikeThis);
        boolean bln3 =  this.action.elementHelper.fnIsElementPresent(this.shareOption_discover);
        if(bln1 && bln2 && bln3)
            return true;
        return false;
    }
    public boolean articleautherImage(){
        return this.action.elementHelper.fnIsElementPresent(this.articleautherImage);
    }

    public boolean articleautherName(){
        return this.action.elementHelper.fnGetText(this.articleautherName).length()>0;
    }

    public boolean articleResult(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.articleResult);
        return this.action.elementHelper.fnIsElementPresent(this.articleResult);
    }

    public boolean articleSort(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.articleSort);
        return this.action.elementHelper.fnIsElementPresent(this.articleSort);
    }
}