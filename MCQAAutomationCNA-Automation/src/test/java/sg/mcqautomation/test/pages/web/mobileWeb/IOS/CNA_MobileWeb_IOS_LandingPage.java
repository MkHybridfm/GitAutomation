package sg.mcqautomation.test.pages.web.mobileWeb.IOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

import java.util.List;

public class CNA_MobileWeb_IOS_LandingPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNA_MobileWeb_IOS_LandingPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By menuTopStories;
    private By menuLatestNews;
    private By menuDiscover;
    private By menuSingapore;
    private By menuAsia;
    private By menuCommentary;
    private By menuSustainability;
    private By menuCNAInsider;
    private By menuLifestyle;
    private By menuWatch;
    private By menuListen;
    private By menuAllSections;
    private By latestNewsComponent;
    private By topStoriesPrimaryComponent;
    private By topStoriesSecondaryComponent;
    private By singaporeComponent;
    private By asiaComponent;
    private By worldComponent;
    private By covid_19Component;
    private By commentaryComponent;
    private By lifestyleComponent;
    private By correspondentReportsComponent;
    private By cnaInsiderComponent;
    private By businessComponent;
    private By sportComponent;
    private By latestVideosComponent;
    private By elsewhereMediaCorpComponent;
    private By footerCNASection;
    private By footerAboutCNA;
    private By footerFollowOurNews;
    private By footerSubscribeNow;
    private By mainNavigationMenu;
    private By singaporeLandingPage;
    private By watchLandingPage;
    private By quickLink3Dots;
    private By shareOption;
    private By copyLinkButton;
    private By copyLinktext;
    private By shareNewsPopUp;
    private By whatsappLink;
    private By telegramLink;
    private By facebookLink;
    private By twitterLink;
    private By emailLink;
    private By linkedINLink;
    private By topPrimaryStoriesList;
    private By topSecondaryStoriesList;
    private By closePopUpButton;
    private By viewMoreLatestNews;
    private By LatestNewsPage;

    public void initElements() {
        this.menuTopStories = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Top Stories')]"));
        this.menuLatestNews = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Latest News')]"));
        this.menuDiscover = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Discover')]"));
        this.menuSingapore = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Singapore')]"));
        this.menuAsia = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Asia')]"));
        this.menuCommentary = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Commentary')]"));
        this.menuSustainability = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Sustainability')]"));
        this.menuCNAInsider = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'CNA Insider')]"));
        this.menuLifestyle = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Lifestyle')]"));
        this.menuWatch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Watch')]"));
        this.menuListen = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Listen')]"));
        this.menuAllSections = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class[contains(.,'all-section-menu')]]"));
        this.latestNewsComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'layout__region')]]//section[@class[contains(.,'latest-news')]]"));
        this.topStoriesPrimaryComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories-primary')]]"));
        this.topStoriesSecondaryComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories-secondary')]]"));
        this.singaporeComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Singapore')]/parent::div"));
        this.asiaComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Asia')]/parent::div"));
        this.worldComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'World')]/parent::div"));
        this.covid_19Component = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'COVID-19')]/parent::div"));
        this.commentaryComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Commentary')]/parent::div"));
        this.lifestyleComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Lifestyle')]/parent::div"));
        this.correspondentReportsComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Correspondents')]/parent::div"));
        this.cnaInsiderComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'CNA Insider')]/parent::div"));
        this.businessComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Business')]/parent::div"));
        this.sportComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Sport')]/parent::div"));
        this.latestVideosComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section//h2[contains(.,'Latest Videos')]/parent::div"));
        this.elsewhereMediaCorpComponent = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Elsewhere from Mediacorp')]/parent::div/parent::section"));
        this.footerCNASection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'CNA Sections')]/parent::nav/parent::div[@id[contains(.,'cna-theme-footerleft')]]"));
        this.footerAboutCNA = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'About CNA')]/parent::nav/parent::div[@id[contains(.,'cna-theme-footerright')]]"));
        this.footerSubscribeNow = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@id='block-footersubscription']"));
        this.footerFollowOurNews = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@id[contains(.,'cna-theme-socialmedialinks')]]"));
        this.mainNavigationMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@id[contains(.,'cna-theme-socialmedialinks')]]"));
        this.singaporeLandingPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Singapore')]"));
        this.watchLandingPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Watch')]"));
        this.quickLink3Dots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'quick-link quick-link')]]"));
        this.shareOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class[contains(.,'trigger-popup--share')]]"));
        this.copyLinkButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='copy-link']//button"));
        this.copyLinktext = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='copy-link']//input"));
        this.shareNewsPopUp = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__dialog--share-link')]]"));
        this.whatsappLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'WhatsApp')]/ancestor::a"));
        this.telegramLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'Telegram')]/ancestor::a"));
        this.facebookLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'Facebook')]/ancestor::a"));
        this.twitterLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'Twitter')]/ancestor::a"));
        this.emailLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'Email')]/ancestor::a"));
        this.linkedINLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'popup__content--share-link')]]//span[contains(.,'LinkedIn')]/ancestor::a"));
        this.topPrimaryStoriesList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories-primary')]]//div[@class[contains(.,'media-object__content')]]"));
        this.topSecondaryStoriesList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'top-stories-secondary')]]/div[@class='list-object']"));
        this.closePopUpButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='popup__close']"));
        this.viewMoreLatestNews = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'View more latest news')]"));
        this.LatestNewsPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Latest from Singapore')]"));
    }

    public boolean validateHeaderMenuSections() {
        boolean blnMenuLinks = false;
        boolean bln1 = false;
        boolean bln2 = false;
        boolean bln3 = false;
        boolean bln4 = false;
        boolean bln5 = false;
        boolean bln6 = false;
        boolean bln7 = false;
        boolean bln8 = false;
        boolean bln9 = false;
        boolean bln10 = false;
        boolean bln11 = false;
        boolean bln12 = false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(menuTopStories);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(menuLatestNews);
      //  bln3 = this.action.elementHelper.fnIsElementDisplayed(menuDiscover);
        bln4 = this.action.elementHelper.fnIsElementDisplayed(menuSingapore);
        bln5 = this.action.elementHelper.fnIsElementDisplayed(menuAsia);
        bln6 = this.action.elementHelper.fnIsElementDisplayed(menuCommentary);
        bln7 = this.action.elementHelper.fnIsElementDisplayed(menuSustainability);
        bln8 = this.action.elementHelper.fnIsElementDisplayed(menuCNAInsider);
        bln9 = this.action.elementHelper.fnIsElementDisplayed(menuLifestyle);
        bln10 = this.action.elementHelper.fnIsElementDisplayed(menuWatch);
        bln11 = this.action.elementHelper.fnIsElementDisplayed(menuListen);
        bln12 = this.action.elementHelper.fnIsElementDisplayed(menuAllSections);

        if (bln1 && bln2 && bln4 && bln5 && bln6 && bln7 && bln8 && bln9 && bln10 && bln11 && bln12)
            blnMenuLinks = true;
        return blnMenuLinks;
    }

    public boolean validateAllComponentsOfLandingPage() {
        boolean landingComponents = false;
        boolean cmp1 = false;
        boolean cmp2 = false;
        boolean cmp3 = false;
        boolean cmp4 = false;
        boolean cmp5 = false;
        boolean cmp6 = false;
        boolean cmp7 = false;
        boolean cmp8 = false;
        boolean cmp9 = false;
        boolean cmp10 = false;
        boolean cmp11 = false;
        boolean cmp12 = false;
        boolean cmp13 = false;
        boolean cmp14 = false;
        boolean cmp15 = false;

        cmp1 = this.action.elementHelper.fnIsElementDisplayed(latestNewsComponent);
        cmp2 = this.action.elementHelper.fnIsElementDisplayed(topStoriesPrimaryComponent);
        cmp3 = this.action.elementHelper.fnIsElementDisplayed(topStoriesSecondaryComponent);
        this.action.javaScriptHelper.fnJSScrollToView(singaporeComponent);
        cmp4 = this.action.elementHelper.fnIsElementDisplayed(singaporeComponent);
        this.action.javaScriptHelper.fnJSScrollToView(asiaComponent);
        cmp5 = this.action.elementHelper.fnIsElementDisplayed(asiaComponent);
        this.action.javaScriptHelper.fnJSScrollToView(worldComponent);
        cmp6 = this.action.elementHelper.fnIsElementDisplayed(worldComponent);
        //this.action.javaScriptHelper.fnJSScrollToView(covid_19Component);
        //cmp7 = this.action.elementHelper.fnIsElementDisplayed(covid_19Component);
        this.action.javaScriptHelper.fnJSScrollToView(commentaryComponent);
        cmp8 = this.action.elementHelper.fnIsElementDisplayed(commentaryComponent);
        this.action.javaScriptHelper.fnJSScrollToView(lifestyleComponent);
        cmp9 = this.action.elementHelper.fnIsElementDisplayed(lifestyleComponent);
        /*this.action.javaScriptHelper.fnJSScrollToView(correspondentReportsComponent);
        cmp10 = this.action.elementHelper.fnIsElementDisplayed(correspondentReportsComponent);
        this.action.javaScriptHelper.fnJSScrollToView(cnaInsiderComponent);
        cmp11 = this.action.elementHelper.fnIsElementDisplayed(cnaInsiderComponent);*/
        this.action.javaScriptHelper.fnJSScrollToView(businessComponent);
        cmp12 = this.action.elementHelper.fnIsElementDisplayed(businessComponent);
       /* this.action.javaScriptHelper.fnJSScrollToView(sportComponent);
        cmp13 = this.action.elementHelper.fnIsElementDisplayed(sportComponent);*/
        this.action.javaScriptHelper.fnJSScrollToView(latestVideosComponent);
        cmp14 = this.action.elementHelper.fnIsElementDisplayed(latestVideosComponent);
        this.action.javaScriptHelper.fnJSScrollToView(elsewhereMediaCorpComponent);
        cmp15 = this.action.elementHelper.fnIsElementDisplayed(elsewhereMediaCorpComponent);

        if (cmp1 && cmp2 && cmp3 && cmp4 && cmp5 && cmp6 && cmp8 && cmp9 && cmp12 && cmp14 && cmp15)
            landingComponents = true;
        return landingComponents;
    }

    public boolean validateFooterSection() {
        boolean footerSection = false;
        boolean bln1 = false;
        boolean bln2 = false;
        boolean bln3 = false;
        boolean bln4 = false;

        this.action.javaScriptHelper.fnJSScrollToView(footerAboutCNA);
        bln1 = this.action.elementHelper.fnIsElementDisplayed(footerAboutCNA);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(footerCNASection);
        bln3 = this.action.elementHelper.fnIsElementDisplayed(footerFollowOurNews);
        bln4 = this.action.elementHelper.fnIsElementDisplayed(footerSubscribeNow);

        if (bln1 && bln2 && bln3 && bln4)
            footerSection = true;
        return footerSection;
    }

    public boolean validateHeaderInOtherPagesAndScroll() {
        boolean mainmenu = false;
        boolean mainmenu_landing = false;
        boolean mainmenu_SingaporePage = false;
        boolean mainmenu_WatchPage = false;

        mainmenu_landing = this.action.elementHelper.fnIsElementDisplayed(mainNavigationMenu);

        this.action.javaScriptHelper.fnJSClick(menuSingapore);
        this.action.waitHelper.fnWaitForVisibilityOf(singaporeLandingPage);
        this.action.javaScriptHelper.fnJSScrollToView(footerAboutCNA);

        mainmenu_SingaporePage = this.action.elementHelper.fnVerifyIsDisplayed(mainNavigationMenu);

        this.action.elementHelper.fnClick(menuWatch);
        this.action.waitHelper.fnWaitForVisibilityOf(watchLandingPage);
        this.action.javaScriptHelper.fnJSScrollToView(footerAboutCNA);

        mainmenu_WatchPage = this.action.elementHelper.fnIsElementDisplayed(mainNavigationMenu);

        if (mainmenu_landing && mainmenu_SingaporePage && mainmenu_WatchPage)
            mainmenu = true;
        return mainmenu;
    }

    public void clickNewsShareOption() {
        this.action.javaScriptHelper.fnJSClick(this.quickLink3Dots);
        this.action.javaScriptHelper.fnJSClick(shareOption);
    }

    public boolean validateCopyLinkButton() {
        this.action.waitHelper.waitFor(shareNewsPopUp);
        boolean copyOptions = false;
        boolean bln1 = false;
        boolean bln2 = false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(copyLinkButton);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(copyLinktext);

        if (bln1 && bln2)
            copyOptions = true;
        return copyOptions;
    }

    public boolean validateShareViaSocialPlatformIcons() {
        this.action.waitHelper.waitFor(shareNewsPopUp);
        boolean ShareLinks = false;
        boolean bln1 = false;
        boolean bln2 = false;
        boolean bln3 = false;
        boolean bln4 = false;
        boolean bln5 = false;
        boolean bln6 = false;

        bln1 = this.action.elementHelper.fnIsElementDisplayed(whatsappLink);
        bln2 = this.action.elementHelper.fnIsElementDisplayed(telegramLink);
        bln3 = this.action.elementHelper.fnIsElementDisplayed(facebookLink);
        bln4 = this.action.elementHelper.fnIsElementDisplayed(twitterLink);
        bln5 = this.action.elementHelper.fnIsElementDisplayed(emailLink);
        bln6 = this.action.elementHelper.fnIsElementDisplayed(linkedINLink);

        if (bln1 && bln2 && bln3 &&bln4 &&bln5 &&bln6)
            ShareLinks = true;
        return ShareLinks;
    }

    public boolean validateTopStoriesSections() {
        boolean topStories = false;
        boolean primary = false;
        boolean Secondary = false;

        List<WebElement> primaryarticles = null;
        List<WebElement> secondaryarticles = null;
        primaryarticles = this.action.elementHelper.fnGetListofElement(topPrimaryStoriesList);
        if (primaryarticles.size() > 0)
            primary = true;

        secondaryarticles = this.action.elementHelper.fnGetListofElement(topSecondaryStoriesList);
        if (secondaryarticles.size() > 0)
            Secondary = true;

        if (primary && Secondary)
            topStories = true;
        return topStories;

    }

    public boolean validateClosePopUpButton() {
        return this.action.elementHelper.fnIsElementDisplayed(closePopUpButton);
    }

    public void clickViewMoreLatestNewButton(){
        this.action.javaScriptHelper.fnJSClick(viewMoreLatestNews);
    }

    public boolean validateLatestNewsPage(){
        this.action.waitHelper.waitFor(LatestNewsPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(LatestNewsPage);
    }
}



