package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPadCNAArticlePage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNAArticlePage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }
    private By articleSection;
    private By okButton_articleSection;
    private By articleTitle;
    private By moreArticles_ArticlePage;
    private By relatedTopics_ArticlePage;
    private By alsoWorthReading_ArticlePage;
    private By outBrain_ArticlePage;
    private By shareButton_article;
    private By externalLink_shareOptions;
    private By fontSize_article;
    private By menuButton;
    private By commentarySec_Menu;
    private By article_commentarySec;
    private By listOfRelatedTopics_articlePage;
    private By headerOfTheRelatedTopic;
    private By listOfTopics_menuSec;
    private By closeButtonOnShareWindow;
    private By oneRelatedTopicOnCnaLuxury;
    private By oneRelatedTopicOnCnalifestyle;
    private By authorLink;
    private By fontSize;
    private By followButton;
    private By authorName;
    private By authorImage;
    private By sortfilter;
    private By resultcount;
    private By relatedTopicList;

    public void initElements() {
        this.articleSection = MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name='icon menu grey']//..//..)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.okButton_articleSection = MobileAppLocator.GetLocator("OK", MobileAppLocator.MobileElementType.XCUIElementTypeButton);
        this.articleTitle= MobileAppLocator.GetLocator("(//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]//XCUIElementTypeStaticText)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.moreArticles_ArticlePage= MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[contains(@name,'Source:')]/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.relatedTopics_ArticlePage= MobileAppLocator.GetLocator("Related Topics", MobileAppLocator.MobileElementType.XCUIElementTypeStaticText);
        this.alsoWorthReading_ArticlePage= MobileAppLocator.GetLocator("Also worth reading", MobileAppLocator.MobileElementType.XCUIElementTypeStaticText);
        this.outBrain_ArticlePage= MobileAppLocator.GetLocator("//XCUIElementTypeImage[@name=\"outbrain_logo\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.shareButton_article= MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon share\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.externalLink_shareOptions= MobileAppLocator.GetLocator( "//XCUIElementTypeNavigationBar[@name=\"UIActivityContentView\"]/XCUIElementTypeOther/XCUIElementTypeOther", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.fontSize_article= MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"icon text size\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.menuButton= MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Menu\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.commentarySec_Menu= MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Commentary\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.article_commentarySec= MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfRelatedTopics_articlePage= MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Related Topics\"]/following-sibling:: XCUIElementTypeCollectionView/XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.headerOfTheRelatedTopic= MobileAppLocator.GetLocator( "(//XCUIElementTypeStaticText[@name='Sort & Filter']//..//..//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.listOfTopics_menuSec= MobileAppLocator.GetLocator("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.closeButtonOnShareWindow= MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Close\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.oneRelatedTopicOnCnaLuxury= MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[contains(@name,'RELATED TOPICS') and @visible='true']//../..//..//XCUIElementTypeCollectionView//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.oneRelatedTopicOnCnalifestyle= MobileAppLocator.GetLocator( "//XCUIElementTypeButton[contains(@name,'RELATED TOPICS') and @visible='true']//../..//..//XCUIElementTypeCollectionView//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.authorLink= MobileAppLocator.GetLocator( "(//XCUIElementTypeCollectionView//XCUIElementTypeLink)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.fontSize= MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='A']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.followButton= MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name='article']//XCUIElementTypeButton[@name='button']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.authorName= MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name='article']//XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.authorImage= MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name='article']//XCUIElementTypeImage", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.sortfilter=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Sort & Filter']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.resultcount= MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[contains(@name,'Showing')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.relatedTopicList=MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Related Topics']//..//XCUIElementTypeCollectionView//XCUIElementTypeCell", MobileAppLocator.MobileElementType.XCUICustomElement);
    }
    public void clickOnArticle(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.articleSection);
        this.action.elementHelper.fnClick(this.articleSection);
    }

    public void handleArticleOkButton() {
            this.action.elementHelper.fnClick(this.okButton_articleSection);
    }

    public boolean verifyToastMessage(){
        return  this.action.elementHelper.fnIsElementPresent(this.okButton_articleSection);
    }

    public boolean verifyArticleContentTitle() throws InterruptedException {
        Thread.sleep(5000);
        return this.action.elementHelper.fnGetText(this.articleTitle).length()>5;
    }

    public void verifySwipeFunctionality(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN);
    }

    public boolean verifySectionWithMoreArticle() throws InterruptedException {
        Thread.sleep(15000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP,20);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.moreArticles_ArticlePage, MobileInteractionHelper.Direction.DOWN);
    }

    public String verifySectionWithRelatedTopics(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopics_ArticlePage, MobileInteractionHelper.Direction.DOWN);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopics_ArticlePage, MobileInteractionHelper.Direction.DOWN);
        return this.action.elementHelper.fnGetText(this.relatedTopics_ArticlePage);
    }

    public String verifySectionWithWorthReading(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.alsoWorthReading_ArticlePage, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.alsoWorthReading_ArticlePage, MobileInteractionHelper.Direction.UP);
        return this.action.elementHelper.fnGetText(this.alsoWorthReading_ArticlePage);
    }

    public boolean verifySectionWithOutBrainRecommended(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.outBrain_ArticlePage, MobileInteractionHelper.Direction.UP);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.outBrain_ArticlePage, MobileInteractionHelper.Direction.UP);
    }

    public boolean clickOnShareButton(){
        this.action.waitHelper.waitFor(this.shareButton_article);
       return this.action.elementHelper.fnIsElementPresent(this.shareButton_article);
    }

    public boolean verifyExternalLink(){
        return this.action.elementHelper.fnIsElementPresent(this.externalLink_shareOptions);
    }

    public void clickOnFontSize(){
        this.action.elementHelper.fnClick(this.fontSize_article);
    }

    public void clickOnMenu(){
        this.action.elementHelper.fnClick(this.menuButton);
    }
    public void clickOnCommentarySec(){
        this.action.elementHelper.fnClick(this.commentarySec_Menu);
    }

    public void clickOnArticleOnCommentarySec() {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_commentarySec, MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.article_commentarySec, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.article_commentarySec);
    }

    public void clickOnOneRelatedTopic(){
        this.action.elementHelper.fnGetListofElement(this.listOfRelatedTopics_articlePage).get(0).click();
    }

    public boolean verifyHeaderOfTheRelatedTopic() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.headerOfTheRelatedTopic);
    }

    public boolean verifyHeadersortfilter() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.sortfilter);
    }

    public boolean verifyresultcount() throws InterruptedException {
        return this.action.elementHelper.fnIsElementPresent(this.resultcount);
    }

    public boolean verifyListOfTopicsOnMenuSec(){
        return this.action.elementHelper.fnGetListofElement(this.listOfTopics_menuSec).size()>0;
    }

    public void clickOnOneTopicInMenuSec(){
        this.action.elementHelper.fnGetListofElement(this.listOfTopics_menuSec).get(0).click();
    }

    public boolean verifyLabelOnCNALuxury(String strDetails) {
        By loc=By.xpath("//XCUIElementTypeStaticText[contains(@name,'"+strDetails+"')]");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 5);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }


    public void clickOnRelatedTopicOnLifeStyle(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.oneRelatedTopicOnCnalifestyle, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.action.elementHelper.fnGetListofElement(this.oneRelatedTopicOnCnalifestyle).get(0));
      }

    public void clickOnRelatedTopicOnLifeStyleLuxery(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.oneRelatedTopicOnCnaLuxury, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(this.action.elementHelper.fnGetListofElement(this.oneRelatedTopicOnCnaLuxury).get(0));
    }

    public void clickOnCloseButtonOnShareWindow() {
            this.action.waitHelper.waitFor(this.closeButtonOnShareWindow);
            this.action.elementHelper.fnClick(this.closeButtonOnShareWindow);
    }

    public void clickOnAuthorLink(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,4);
        this.action.elementHelper.fnClick(this.authorLink);
    }

    public boolean followButton(){
       return this.action.elementHelper.fnIsElementPresent(this.followButton);
    }

    public boolean AuthorName(){
        return this.action.elementHelper.fnIsElementPresent(this.authorName);
    }

    public boolean AuthorImage(){
        return this.action.elementHelper.fnIsElementPresent(this.authorImage);
    }

    public boolean verifyAuthorNameOnTheArticlePage(){
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.authorLink, MobileInteractionHelper.Direction.UP);
    }

    public boolean verifyFontSize() throws InterruptedException {
            List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.fontSize);
            if(eleList.size()>0)
            {
                this.action.elementHelper.fnClick(eleList.get(0));
                Thread.sleep(3000);
                this.action.elementHelper.fnClick(eleList.get(1));
                Thread.sleep(3000);
                this.action.elementHelper.fnClick(eleList.get(2));
                Thread.sleep(3000);
                this.action.elementHelper.fnClick(eleList.get(3));
                Thread.sleep(3000);
                this.action.elementHelper.fnClick(eleList.get(4));
                Thread.sleep(3000);
                return true;
            }
            return false;
        }


    public void selectMenuOption(String strOption) throws InterruptedException {
        //Thread.sleep(5000);
        By locOption =By.xpath("//XCUIElementTypeStaticText[@name='"+strOption+"' and @visible ='true']");
       // this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,3);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(locOption, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(locOption);
    }

    public boolean verifyMenuOption(String strOption) throws InterruptedException {
        //Thread.sleep(5000);
        By locOption =By.xpath("//XCUIElementTypeStaticText[@name='"+strOption+"']");
        //this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,1);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(locOption, MobileInteractionHelper.Direction.UP);
    }

    public boolean verifyPageDetails(String strOption) throws InterruptedException {
        Thread.sleep(5000);
        By locOption =By.xpath("//XCUIElementTypeStaticText[@name='"+strOption+"' and @visible ='true']");
        this.action.waitHelper.fnWaitForVisibilityOf(locOption);
        return this.action.elementHelper.fnIsElementPresent(locOption);
    }

    public void SelectFromBottom(String strOption) throws InterruptedException {
        Thread.sleep(5000);
        By locOption =By.xpath("//XCUIElementTypeTabBar[@name='Tab Bar']//XCUIElementTypeButton[@name='"+strOption+"']");
        this.action.elementHelper.fnClick(locOption);
    }

    public boolean verifyRelatedTopics() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopicList, MobileInteractionHelper.Direction.UP);
        return this.action.elementHelper.fnGetListofElement(this.relatedTopicList).size()>0;
    }

    public String GetRelatedTopicsName() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopicList, MobileInteractionHelper.Direction.UP);
        return this.action.elementHelper.fnGetListofElement(this.relatedTopicList).get(0).findElement(By.xpath("//XCUIElementTypeStaticText")).getText();
    }

    public void selectRelatedTopics() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.relatedTopicList, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnGetListofElement(this.relatedTopicList).get(0).click();
    }

    public boolean verifyRelatedTopicsHeader(String strText) throws InterruptedException {
        By locOption =MobileAppLocator.GetLocator(strText, MobileAppLocator.MobileElementType.XCUIElementTypeStaticText);
        return this.action.elementHelper.fnIsElementPresent(locOption);
    }
}
