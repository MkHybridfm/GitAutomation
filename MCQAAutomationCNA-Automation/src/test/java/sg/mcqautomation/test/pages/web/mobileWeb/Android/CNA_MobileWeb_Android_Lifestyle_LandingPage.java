package sg.mcqautomation.test.pages.web.mobileWeb.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_Android_Lifestyle_LandingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_Android_Lifestyle_LandingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By topStoriesSection;
    private By entertainmentSection;
    private By cnaLuxurySection;
    private By womenSection;
    private By styleSection;
    private By wellnessSection;
    private By livingSection;
    private By videosSection;
    private By diningSection;
    private By travelSection;
    private By footerSection;
    private By entertainmentMainMenuLink;
    private By livingMainMenuLink;
    private By travelMainMenuLink;
    private By entertainmentLandingPageHeader;
    private By livingLandingPageHeader;
    private By travelLandingPageHeader;
    private By SignINOption;
    private By SearchOption;


    public void initElements() {
        this.topStoriesSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='block-ss-top-stories']"));
        this.entertainmentSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Entertainment')]"));
        this.cnaLuxurySection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'CNA Luxury')]"));
        this.womenSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Women')]"));
        this.styleSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Style')]"));
        this.wellnessSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Wellness')]"));
        this.livingSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Living')]"));
        this.videosSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Videos')]"));
        this.diningSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Dining')]"));
        this.travelSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Travel')]"));
        this.footerSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//footer[@class='footer']"));
        this.entertainmentMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'Entertainment')]"));
        this.livingMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'Living')]"));
        this.travelMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'Travel')]"));
        this.entertainmentLandingPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--section-title'][contains(.,'ENTERTAINMENT')]"));
        this.livingLandingPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--section-title'][contains(.,'LIVING')]"));
        this.travelLandingPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--section-title'][contains(.,'TRAVEL')]"));
        this.SignINOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logged-in-user use-ajax inline-menu__link']"));
        this.SearchOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.ANDROID_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='search-menu-link inline-menu__link']"));
    }


    public boolean validateLifestyleLandingPageComponents() {
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;
        boolean sec3 = false;
        boolean sec4 = false;
        boolean sec5 = false;
        boolean sec6 = false;
        boolean sec7 = false;
        boolean sec8 = false;
        boolean sec9 = false;
        boolean sec10 = false;
        boolean sec11 = false;

        this.action.javaScriptHelper.fnJSScrollToView(topStoriesSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec1 = this.action.elementHelper.fnIsElementDisplayed(topStoriesSection);

        this.action.javaScriptHelper.fnJSScrollToView(entertainmentSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec2 = this.action.elementHelper.fnIsElementDisplayed(entertainmentSection);

        this.action.javaScriptHelper.fnJSScrollToView(cnaLuxurySection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec3 = this.action.elementHelper.fnIsElementDisplayed(cnaLuxurySection);

        this.action.javaScriptHelper.fnJSScrollToView(womenSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec4 = this.action.elementHelper.fnIsElementDisplayed(womenSection);

        this.action.javaScriptHelper.fnJSScrollToView(styleSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec5 = this.action.elementHelper.fnIsElementDisplayed(styleSection);

        this.action.javaScriptHelper.fnJSScrollToView(wellnessSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec6 = this.action.elementHelper.fnIsElementDisplayed(wellnessSection);

        this.action.javaScriptHelper.fnJSScrollToView(livingSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec7 = this.action.elementHelper.fnIsElementDisplayed(livingSection);

        this.action.javaScriptHelper.fnJSScrollToView(videosSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec8 = this.action.elementHelper.fnIsElementDisplayed(videosSection);

        this.action.javaScriptHelper.fnJSScrollToView(diningSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec9 = this.action.elementHelper.fnIsElementDisplayed(diningSection);

        this.action.javaScriptHelper.fnJSScrollToView(travelSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec10 = this.action.elementHelper.fnIsElementDisplayed(travelSection);

        this.action.javaScriptHelper.fnJSScrollToView(footerSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec11 = this.action.elementHelper.fnIsElementDisplayed(footerSection);

        if (sec1 && sec2 && sec3 && sec4 && sec5 && sec6 && sec7 &&sec8 && sec9 && sec10 && sec11)
            sections = true;
        return sections;
    }

    public void clickEntertainmentMainmenuLink(){
        this.action.javaScriptHelper.fnJSScrollToView(entertainmentMainMenuLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(entertainmentMainMenuLink);
    }

    public void clickLivingMainmenuLink(){
        this.action.javaScriptHelper.fnJSScrollToView(livingMainMenuLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(livingMainMenuLink);
    }

    public void clickTravelMainmenuLink(){
        this.action.javaScriptHelper.fnJSScrollToView(travelMainMenuLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(travelMainMenuLink);
    }

    public boolean validateEntertainmentLandingPage(){
        this.action.waitHelper.waitFor(entertainmentLandingPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(entertainmentLandingPageHeader);
    }

    public boolean validateLivingLandingPage(){
        this.action.waitHelper.waitFor(livingLandingPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(livingLandingPageHeader);
    }

    public boolean validateTravelLandingPage(){
        this.action.waitHelper.waitFor(travelLandingPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(travelLandingPageHeader);
    }

    public boolean validateProfileIconAndSearchMenu(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;

        sec1 = this.action.elementHelper.fnVerifyIsDisplayed(SignINOption);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(SearchOption);

        if(sec1 && sec2)
            sections=true;
        return sections;
    }



}
