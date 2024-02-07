package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNAWeb_ArticleDetailPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_ArticleDetailPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By latestnewsArticleLink;
    private By articlePageHeadline;
    private By articleCategory;
    private By articleImage;
    private By updatedAndPublishedDate;
    private By articleFullStory;
    private By articleSource;
    private By article2;
    private By article3;
    private By article4;
    private By article2_expandFullStory;
    private By article3_expandFullStory;
    private By alsoWorthReadingSection;
    private By outBrainSection;
    private By videoArticle;
    private By videoArticleLink;
    private By videoArticleDetailPage;
    private By pauseBtn;
    private By playBtn;
    private By unmuteBtn;
    private By muteBtn;
    private By videoFullscreen;
    private By videoExitFullscreen;
    private By playVideoBtn;
    private By contextSnippetSection;
    private By contextSnippetExpand;
    private By contextSnippetCollapse;
    private By photoGallery;
    private By nextImageArrow;
    private By previousImageArrow;
    private By articleStickyHeader;
    private  By articleExpandedFullStory;
    private By whatsappOption;
    private By telegramOption;
    private By facebookOption;
    private By twitterOption;
    private By mailOption;
    private By linkedInOption;
    private By footerSection;

    public void initElements() {
        this.latestnewsArticleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Latest News')]/parent::div//h6/a"));
        this.articlePageHeadline = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--page-title']"));
        this.articleCategory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//p[@class[contains(.,'content-detail__category')]]"));
        this.articleImage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@class[contains(.,'detail-hero-media')]]"));
        this.updatedAndPublishedDate = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'article-publish')]]"));
        this.articleFullStory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'content-wrapper')]]/div[@class='text']//p"));
        this.articleSource = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='source source--with-label']"));
        this.article2 = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[2]//h1"));
        this.article3 = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[3]//h1"));
        this.article4 = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[4]//h1"));
        this.article2_expandFullStory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[2]//a[@class='article__read-full-story-button']"));
        this.article3_expandFullStory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[3]//a[@class='article__read-full-story-button']"));
        this.alsoWorthReadingSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Also worth reading')]/parent::section"));
        this.outBrainSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='ob_holder']/parent::section"));
        this.videoArticle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Latest Videos')]"));
        this.videoArticleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Latest Videos')]/parent::div//div[@class='slick-track']/div[6]//h5/a"));
        this.videoArticleDetailPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'video-wrapper')]]//video[@role='application']"));
        this.pauseBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Pause']"));
        this.playBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Play']"));
        this.unmuteBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Unmute']"));
        this.muteBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Mute']"));
        this.videoFullscreen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Fullscreen']/span[contains(.,'Fullscreen')]"));
        this.playVideoBtn = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Play Video']"));
        this.contextSnippetSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='context-snippet context-snippet--']"));
        this.contextSnippetExpand = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'context-snippet')]]//span[@class='context-snippet__expand']"));
        this.contextSnippetCollapse = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'context-snippet')]]//span[@class='context-snippet__collapse']"));
        this.photoGallery = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='photo-gallery']"));
        this.nextImageArrow = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@class='slick-next slick-arrow']"));
        this.previousImageArrow = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@class='slick-prev slick-arrow']"));
        this.articleStickyHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'article-navigation')]]"));
        this.articleExpandedFullStory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article[2]//div[@class='layout__region layout__region--first']//div[@class='text-long']"));
        this.whatsappOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'whatsapp')]]"));
        this.telegramOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'telegram')]]"));
        this.facebookOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'facebook')]]"));
        this.twitterOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'twitter')]]"));
        this.mailOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'email')]]"));
        this.linkedInOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//article//a[@class[contains(.,'linkedin')]]"));
        this.footerSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'footer')]]//p[contains(.,'Copyright')]"));
    }

    public void clickOnlatestnewsArticle(){
        this.action.javaScriptHelper.fnJSClick(latestnewsArticleLink);
    }
    public boolean validateArticlePageTitle(){
        this.action.waitHelper.fnWaitForVisibilityOf(articlePageHeadline);
        this.action.javaScriptHelper.fnJSScrollToView(articlePageHeadline);
        return this.action.elementHelper.fnVerifyIsDisplayed(articlePageHeadline);
    }

    public boolean iValidateArticlePageSections(){
        boolean articleDetailPageSections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;
        boolean sec4=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(articleCategory);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(articleImage);
        sec3 = this.action.elementHelper.fnIsElementDisplayed(updatedAndPublishedDate);
        sec4 = this.action.elementHelper.fnIsElementDisplayed(articleFullStory);

        if(sec1 && sec2&& sec3 && sec4 )
            articleDetailPageSections=true;
        return articleDetailPageSections;
    }

    public boolean articleInfiniteScroll(){
        boolean infiniteScroll=false;
        boolean art1 = false;
        boolean art2 = false;
        boolean art3 = false;

        this.action.javaScriptHelper.fnJSScrollToView(articleSource);
        this.action.waitHelper.fnWaitForVisibilityOf(article2);
        art1 = this.action.elementHelper.fnVerifyIsDisplayed(article2);

        this.action.javaScriptHelper.fnJSScrollToView(article2_expandFullStory);
        this.action.waitHelper.fnWaitForVisibilityOf(article3);
        art2 = this.action.elementHelper.fnVerifyIsDisplayed(article3);

        this.action.javaScriptHelper.fnJSScrollToView(article3_expandFullStory);
        this.action.waitHelper.fnWaitForVisibilityOf(article4);
        art3 = this.action.elementHelper.fnVerifyIsDisplayed(article4);

        if(art1 && art2 && art3)
            infiniteScroll=true;
        return infiniteScroll;
    }

    public boolean validateAlsoWorthReadingSection(){
        this.action.javaScriptHelper.fnJSScrollToView(alsoWorthReadingSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(alsoWorthReadingSection);
    }

    public boolean validateOutbrainSection(){
        this.action.javaScriptHelper.fnJSScrollToView(outBrainSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(outBrainSection);
    }

    public boolean clickOnVideoArticle() throws InterruptedException {
        //this.action.waitHelper.fnWaitForVisibilityOf(videoArticle);
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(videoArticle);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        Thread.sleep(2000);
        this.action.javaScriptHelper.fnJSClick(videoArticleLink);
        Thread.sleep(2000);
        this.action.waitHelper.waitFor(videoArticleDetailPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(videoArticleDetailPage);
    }

    public boolean validateMutedVideo(){
        this.action.javaScriptHelper.fnJSScrollToView(videoArticleDetailPage);
        String IsMuted=  this.action.elementHelper.fnGetAttribute(this.videoArticleDetailPage, "muted");
        Boolean b = Boolean.valueOf(IsMuted);
        return b;
        }

    public boolean validateVideoOptions() throws InterruptedException {
        boolean videoOptions=false;
        boolean opt1 = false;
        boolean opt2 = false;
        boolean opt3 = false;
        boolean opt4 = false;
        boolean opt5 = false;

        this.action.javaScriptHelper.fnJSClick(playVideoBtn);
        Thread.sleep(10000);
        this.action.javaScriptHelper.fnJSScrollToView(videoArticleDetailPage);

        opt1 = this.action.elementHelper.fnIsElementDisplayed(pauseBtn);
        this.action.javaScriptHelper.fnJSClick(pauseBtn);
        Thread.sleep(2000);

        opt2 = this.action.elementHelper.fnIsElementDisplayed(playBtn);
        this.action.javaScriptHelper.fnJSClick(playBtn);

        opt3 = this.action.elementHelper.fnIsElementDisplayed(unmuteBtn);
        this.action.javaScriptHelper.fnJSClick(unmuteBtn);
        Thread.sleep(5000);

        this.action.javaScriptHelper.fnJSScrollToView(videoArticleDetailPage);
        opt4 = this.action.elementHelper.fnIsElementDisplayed(muteBtn);
        this.action.javaScriptHelper.fnJSClick(muteBtn);
        opt5 = this.action.elementHelper.fnIsElementDisplayed(videoFullscreen);

        if(opt1 && opt2 && opt3 && opt4 && opt5)
            videoOptions=true;
        return videoOptions;
    }

    public void openContextSnippetArticleURL(){
        this.action.browserNavigationHelper.fnGetURL("https://cnalifestyle.channelnewsasia.com/wellness/reduce-salt-sodium-intake-cardiovascular-disease-hypertension-stroke-310826");
    }

    public void scrollToContextSnippetSection(){
        this.action.waitHelper.waitFor(articlePageHeadline);
        this.action.javaScriptHelper.fnJSScrollToView(contextSnippetSection);
    }
    public void clickOnExpandOption(){
        this.action.javaScriptHelper.fnJSClick(contextSnippetExpand);
    }

    public boolean validateExpandedSectionofContextSnippet(){
        return this.action.elementHelper.fnIsElementDisplayed(contextSnippetCollapse);
    }


    public void openArticleURLwithCarouselImage(){
        this.action.browserNavigationHelper.fnGetURL("https://www.channelnewsasia.com/singapore/tanjong-pagar-car-crash-accident-killed-coroner-inquiry-2736196");
    }

    public boolean validateCarouselImageSection() throws InterruptedException {
        this.action.javaScriptHelper.fnJSScrollToView(photoGallery);
        this.action.javaScriptHelper.fnJSScrollToView(photoGallery);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();

        boolean imageGallery=false;
        boolean opt1 = false;
        boolean opt2 = false;
        boolean opt3 = false;

        opt1 = this.action.elementHelper.fnIsElementDisplayed(photoGallery);
        opt2 = this.action.elementHelper.fnIsElementDisplayed(nextImageArrow);
        this.action.javaScriptHelper.fnJSClick(nextImageArrow);
        Thread.sleep(1000);
        opt3 = this.action.elementHelper.fnIsElementDisplayed(previousImageArrow);

        if(opt1 && opt2 &&opt3 )
            imageGallery=true;
        return imageGallery;
    }

    public void scrollTobottomOfArticle(){
        this.action.javaScriptHelper.fnJSScrollToView(footerSection);
        //this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        }

    public boolean validateStickyHeader() throws InterruptedException {
        Thread.sleep(2000);
        return this.action.elementHelper.fnVerifyIsDisplayed(articleStickyHeader);
    }

    public boolean expandToReadFullStoryButton(){
        this.action.waitHelper.fnWaitForVisibilityOf(article2);
        this.action.elementHelper.fnVerifyIsDisplayed(article2);

        this.action.javaScriptHelper.fnJSScrollToView(article2_expandFullStory);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnVerifyIsDisplayed(article2_expandFullStory);
    }

    public void clickOnExpandFullStoryButton(){
        this.action.javaScriptHelper.fnJSClick(article2_expandFullStory);
    }

    public boolean validateExpandedStory(){
        this.action.waitHelper.waitFor(articleExpandedFullStory);
        return this.action.elementHelper.fnVerifyIsDisplayed(articleExpandedFullStory);
    }


    public boolean ValidateSocialMediaShareOption(){
        boolean shareOptions=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;
        boolean sec4=false;
        boolean sec5=false;
        boolean sec6=false;
        boolean sec7=false;

       // sec1 = this.action.elementHelper.fnVerifyIsDisplayed(shareSection);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(whatsappOption);
        sec3 = this.action.elementHelper.fnVerifyIsDisplayed(telegramOption);
        sec4 = this.action.elementHelper.fnVerifyIsDisplayed(facebookOption);
        sec5 = this.action.elementHelper.fnVerifyIsDisplayed(twitterOption);
        sec6 = this.action.elementHelper.fnVerifyIsDisplayed(mailOption);
        sec7 = this.action.elementHelper.fnVerifyIsDisplayed(linkedInOption);

        if(sec2&& sec3 && sec4 &&  sec5&& sec6 && sec7 )
            shareOptions=true;
        return shareOptions;
    }
}

