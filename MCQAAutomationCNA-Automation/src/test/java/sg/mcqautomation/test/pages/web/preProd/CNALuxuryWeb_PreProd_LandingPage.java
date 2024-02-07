package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNALuxuryWeb_PreProd_LandingPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNALuxuryWeb_PreProd_LandingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By whatSNewSection;
    private By peopleSection;
    private By travelGuideSection;
    private By experiencesSection;
    private By aboutTimeSection;
    private By obsessionsSection;
    private By remarkableLivingSection  ;
    private By peopleMainMenuLink;
    private By experiencesMainMenuLink;
    private By peoplePageHeader;
    private By ExperiencesHeader;
    private By footerSection;
    private By infiniteSectionTwo;
    private By infiniteSectionOne;

    public void initElements() {
        this.whatSNewSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'What')]"));
        this.peopleSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'People')]"));
        this.travelGuideSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'Travel Guide')]"));
        this.experiencesSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'Experiences')]"));
        this.aboutTimeSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'About time')]"));
        this.obsessionsSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'Obsessions')]"));
        this.remarkableLivingSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2/span[contains(.,'Remarkable Living')]"));
        this.peopleMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'People')]"));
        this.experiencesMainMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//li/a[contains(.,'Experiences')]"));
        this.peoplePageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'People')]"));
        this.ExperiencesHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Experiences')]"));
        this.footerSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='clear-both footer-copyright']"));
        this.infiniteSectionOne = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='ss-infinite-scroll__content-one']"));
        this.infiniteSectionTwo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='ss-infinite-scroll__content-two']"));
    }


    public boolean validateLuxuryLandingPageComponents() {
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;
        boolean sec3 = false;
        boolean sec4 = false;
        boolean sec5 = false;
        boolean sec6 = false;
        boolean sec7 = false;

        this.action.javaScriptHelper.fnJSScrollToView(whatSNewSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec1 = this.action.elementHelper.fnIsElementDisplayed(whatSNewSection);

        this.action.javaScriptHelper.fnJSScrollToView(peopleSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec2 = this.action.elementHelper.fnIsElementDisplayed(peopleSection);

        this.action.javaScriptHelper.fnJSScrollToView(experiencesSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec4 = this.action.elementHelper.fnIsElementDisplayed(experiencesSection);

        this.action.javaScriptHelper.fnJSScrollToView(obsessionsSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec6 = this.action.elementHelper.fnIsElementDisplayed(obsessionsSection);

        if (sec1 && sec2 && sec4 && sec6 )
            sections = true;
        return sections;
    }

    public void clickPeopleMainmenuLink(){
        this.action.javaScriptHelper.fnJSClick(peopleMainMenuLink);
    }

    public void clickExperiencesMainmenuLink(){
        this.action.javaScriptHelper.fnJSClick(experiencesMainMenuLink);
    }

    public boolean validatePeopleLandingPage(){
        this.action.waitHelper.waitFor(peoplePageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(peoplePageHeader);
    }

    public boolean validateExperiencesLandingPage(){
        this.action.waitHelper.waitFor(ExperiencesHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(ExperiencesHeader);
    }

    public boolean articleInfiniteScroll(){
        boolean infiniteScroll=false;
        boolean art1 = false;
        boolean art2 = false;

        this.action.javaScriptHelper.fnJSScrollToView(footerSection);
        this.action.waitHelper.fnWaitForVisibilityOf(infiniteSectionOne);
        art1 = this.action.elementHelper.fnVerifyIsDisplayed(infiniteSectionOne);

        this.action.javaScriptHelper.fnJSScrollToView(footerSection);
        this.action.waitHelper.fnWaitForVisibilityOf(infiniteSectionTwo);
        art2 = this.action.elementHelper.fnVerifyIsDisplayed(infiniteSectionTwo);


        if(art1 && art2 )
            infiniteScroll=true;
        return infiniteScroll;
    }


}
