package sg.mcqautomation.test.pages.app.android_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNA_Android_Tab_ArticlePage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_Android_Tab_ArticlePage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
    private By relatedTopic_CNALuxury;
    private By listOfTopics_lifeStyle;
    private By closeButtonOnShareWindow;
    private By relatedTopicOnCnaLuxury;
    private By oneRelatedTopicOnCnaLuxury;
    private By authorLink;
    private By fontSize1;
    private  By fontSize2;
    private By fontSize3;
    private  By fontSize4;
    private By fontSize5;
    private By oneRelatedTopic_CnaLuxury;


    public void initElements() {

        this.articleSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='top-header-page']/h1"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]"));
        this.okButton_articleSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='top-header-page']/h1"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "img_close"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"OK\"]"));
        this.articleTitle= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]"));
        this.moreArticles_ArticlePage= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'← Swipe for more articles →')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[contains(@name,'Source:')]/parent::XCUIElementTypeOther/parent::XCUIElementTypeCell/following::XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage"));
        this.relatedTopics_ArticlePage= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/tv_related_topic']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Related Topics\"]"));
        this.alsoWorthReading_ArticlePage= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Also worth reading')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Also worth reading\"]"));
        this.outBrain_ArticlePage= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_logo"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeImage[@name=\"outbrain_logo\"]"));
        //this.articleTitle= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView"),
              //  AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]"));
        this.shareButton_article= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_share"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon share\"]"));
        this.externalLink_shareOptions= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "android:id/sem_resolver_share_to_device_active_area"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeNavigationBar[@name=\"UIActivityContentView\"]/XCUIElementTypeOther/XCUIElementTypeOther"));
        this.fontSize_article= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "iv_text_resize"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"icon text size\"]"));
        this.menuButton= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Menu\"]"));
        this.commentarySec_Menu= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'Commentary')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Commentary\"]"));
        this.article_commentarySec= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_title']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]"));
        this.listOfRelatedTopics_articlePage= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"Related Topics\"]/following-sibling:: XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        this.headerOfTheRelatedTopic= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[@resource-id='com.channelnewsasia:id/tv_name']"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"));
        //this.headerOfTheRelatedTopic= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView"),
                //AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton"));
        this.listOfTopics_menuSec= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView/android.widget.TextView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton"));
        this.relatedTopic_CNALuxury= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'< RELATED TOPICS >')]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCell"));
        this.listOfTopics_lifeStyle= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText"));
        this.closeButtonOnShareWindow= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup/android.widget.ScrollView"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Close\"]"));
        this.relatedTopicOnCnaLuxury= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_related_topic"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]"));
        this.oneRelatedTopicOnCnaLuxury= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/group_related_topics']/android.widget.Button"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        this.authorLink= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.ID, "tv_author_names"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther//XCUIElementTypeLink/XCUIElementTypeTextView"));
        this.fontSize1= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.widget.RadioGroup/android.widget.RadioButton[1]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeCell[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText"));
        this.fontSize2= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.widget.RadioGroup/android.widget.RadioButton[2]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Close\"]"));
        this.fontSize3= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.widget.RadioGroup/android.widget.RadioButton[3]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]"));
        this.fontSize4= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.widget.RadioGroup/android.widget.RadioButton[4]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        this.fontSize5= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.FrameLayout/android.widget.RadioGroup/android.widget.RadioButton[5]"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther//XCUIElementTypeLink/XCUIElementTypeTextView"));
        this.oneRelatedTopic_CnaLuxury= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_APP, AppLocatorType.LocatorStrategy.XPATH, "//android.widget.TextView[contains(@text,'RELATED TOPICS')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.widget.Button"),
                AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_APP, AppLocatorType.LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther//XCUIElementTypeLink/XCUIElementTypeTextView"));
    }

    public void clickOnArticle(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 3);
        this.action.elementHelper.fnClick(articleSection);
    }

    public void handleArticleOkButton() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            this.action.elementHelper.fnClick(okButton_articleSection);
        } else {
            this.action.elementHelper.fnClick(okButton_articleSection);
        }
    }

    public boolean verifyToastMessage(){
        return  this.action.elementHelper.fnIsElementDisplayed(okButton_articleSection);
    }

    public boolean verifyArticleContentTitle() throws InterruptedException {
        Thread.sleep(1000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN);
        Thread.sleep(1000);
        return this.action.elementHelper.fnIsElementDisplayed(this.articleTitle);
    }

    public void verifySwipeFunctionality(){
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN);
    }

    public boolean verifySectionWithMoreArticle() throws InterruptedException {
        Thread.sleep(2000);
        for(int i=0;i<10;i++) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP);
        }
        for(int i=0;i<=8;i++) {
            try {
                this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 2);
                if (this.action.elementHelper.fnIsElementPresent(moreArticles_ArticlePage))
                    break;
            }
            catch (Exception e){
            }
        }
        return this.action.elementHelper.fnIsElementDisplayed(moreArticles_ArticlePage);
    }

    public String verifySectionWithRelatedTopics(){
        for(int i=0;i<=3;i++) {
            if (this.action.elementHelper.fnIsElementPresent(relatedTopics_ArticlePage)) {
                break;
            }
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 1);
        }
        return this.action.elementHelper.fnGetText(relatedTopics_ArticlePage);

    }

    public String verifySectionWithWorthReading(){
        for(int i=0;i<=3;i++) {
            if (this.action.elementHelper.fnIsElementPresent(alsoWorthReading_ArticlePage)) {
                break;
            }
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
        }
        return this.action.elementHelper.fnGetText(alsoWorthReading_ArticlePage);

    }

    public boolean verifySectionWithOutBrainRecommended(){
        for(int i=0;i<=3;i++) {
            if (this.action.elementHelper.fnIsElementPresent(outBrain_ArticlePage)) {
                break;
            }
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 1);
        }
        return this.action.elementHelper.fnIsElementPresent(outBrain_ArticlePage);

    }

    public boolean clickOnShareButton(){
        this.action.waitHelper.waitFor(shareButton_article);
       return this.action.elementHelper.fnIsElementPresent(shareButton_article);
    }

    public boolean verifyExternalLink(){
        return this.action.elementHelper.fnIsElementDisplayed(externalLink_shareOptions);
    }

    public void clickOnFontSize(){
        this.action.elementHelper.fnClick(fontSize_article);
    }

    public void clickOnMenu(){
        this.action.elementHelper.fnClick(menuButton);
    }
    public void clickOnCommentarySec(){
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
        }
        this.action.elementHelper.fnClick(commentarySec_Menu);
    }

    public void clickOnArticleOnCommentarySec() {
        this.action.elementHelper.fnClick(article_commentarySec);
    }

    public void clickOnOneRelatedTopic(){
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfRelatedTopics_articlePage);
        if(eleList.size()>0)
            eleList.get(0).click();
    }

    public boolean verifyHeaderOfTheRelatedTopic() throws InterruptedException {
        Thread.sleep(5000);
        this.action.waitHelper.waitFor(headerOfTheRelatedTopic);
        return this.action.elementHelper.fnIsElementDisplayed(headerOfTheRelatedTopic);
    }

    public boolean verifyListOfTopicsOnMenuSec(){
        boolean blnStatus =false;
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfTopics_menuSec);
        if(eleList.size()>0)
            blnStatus=true;
        return blnStatus;
    }

    public void clickOnOneTopicInMenuSec(){
        List<WebElement> eleList=null;
        eleList = this.action.elementHelper.fnGetListofElement(listOfTopics_menuSec);
        if(eleList.size()>0)
            eleList.get(0).click();
    }

    public boolean verifyLabelOnCNALuxury() {
         boolean blnStatus = false;
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN);

            if (this.action.elementHelper.fnIsElementPresent(relatedTopic_CNALuxury)) {
                blnStatus = true;
            }

            return blnStatus;
    }

    public void clickOnRelatedTopicOnLifeStyle(){
        if(this.objConfig.applicationType== GlobalConfig.ApplicationType.IOS_APP) {
            try {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP, 2);
            if (this.action.elementHelper.fnIsElementPresent(oneRelatedTopicOnCnaLuxury)) {
                this.action.elementHelper.fnClick(oneRelatedTopicOnCnaLuxury);
            } else {
                List<WebElement> eleList = null;
                eleList = this.action.elementHelper.fnGetListofElement(relatedTopic_CNALuxury);
                for (int k = 0; k < eleList.size(); k++) {
                    WebElement element = eleList.get(k).findElement(By.xpath("//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeButton//XCUIElementTypeStaticText[@name=\"  RELATED TOPICS  \"]/parent::XCUIElementTypeButton/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                    if (element.isDisplayed())
                        element.click();
                }
            }
        }
        catch(Exception e){
        }
    }
        else {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(oneRelatedTopicOnCnaLuxury);
            if (this.action.elementHelper.fnIsElementPresent(oneRelatedTopicOnCnaLuxury)) {
                List<WebElement> eleList = null;
                eleList = this.action.elementHelper.fnGetListofElement(oneRelatedTopicOnCnaLuxury);
                eleList.get(0).click();
            } else {
                List<WebElement> eleList = null;
                eleList = this.action.elementHelper.fnGetListofElement(oneRelatedTopic_CnaLuxury);
                eleList.get(0).click();
                }
            }
        }

    public void clickOnCloseButtonOnShareWindow() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.ANDROID_APP) {
            this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 1);
        } else {
            this.action.waitHelper.waitFor(closeButtonOnShareWindow);
            this.action.elementHelper.fnClick(closeButtonOnShareWindow);
        }
    }

    public void clickOnAuthorLink(){
        this.action.waitHelper.waitFor(authorLink);
        this.action.elementHelper.fnClick(authorLink);
    }

    public boolean verifyAuthorNameOnTheArticlePage(){
        return this.action.elementHelper.fnIsElementPresent(authorLink);
    }

    public boolean verifyFontSize() {
        if (this.objConfig.applicationType == GlobalConfig.ApplicationType.IOS_APP) {
            return true;
        } else {
            boolean blnStatus = false;
            boolean bln1 = false;
            boolean bln2 = false;
            boolean bln3 = false;
            boolean bln4 = false;
            boolean bln5 = false;

            bln1 = this.action.elementHelper.fnIsElementDisplayed(fontSize1);
            this.action.elementHelper.fnClick(fontSize1);
            bln2 = this.action.elementHelper.fnIsElementDisplayed(fontSize2);
            this.action.elementHelper.fnClick(fontSize2);
            bln3 = this.action.elementHelper.fnIsElementDisplayed(fontSize3);
            this.action.elementHelper.fnClick(fontSize3);
            bln4 = this.action.elementHelper.fnIsElementDisplayed(fontSize4);
            this.action.elementHelper.fnClick(fontSize4);
            bln5 = this.action.elementHelper.fnIsElementDisplayed(fontSize5);
            this.action.elementHelper.fnClick(fontSize5);

            if (bln1 && bln2 && bln3 && bln4 && bln5) {
                blnStatus = true;
            }

            return blnStatus;
        }

    }

    public void scrollToTop() throws InterruptedException {
        Thread.sleep(1000);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN);
    }

}
