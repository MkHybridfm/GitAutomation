package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class CNAWeb_PreProd_ListenPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_PreProd_ListenPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By listenMenuLink ;
    private By listenPageHeader ;
    private By onAirSection ;
    private By viewFullScheduleSection;
    private By editorsPicksSection;
    private By CNA_938ProgrammesSection;
    private By newsFromCNASection;
    private By radioOnDemandSection;
    private By viewFullSchedule;
    private By viewFullSchedulePAge;
    private By podcastArticleLink;
    private By podcastPlayPage;
    private By podcastPlayButton;
    private By podcastPauseButton;
    private By podcastPlayControlSection;
    private By viewAllLink;
    private By allPosdcatsPageHeader;
    private By searchTextBox;
    private By sortSection;
    private By paginationSection;
    private By paginationNextButton;
    private By ShowingCount;
    private By threedots;
    private By bookmark;
    private By Share;
    private By listenNowButton;
    private By playButton;
    private By pauseButton;
    private By loadMoreEpisodes;
    private By latestEpisodesList;
    private By findOutmoreLink;
    private By podcastDescription;
    private By podcastShare;
    private By viewMoreCTA;

    public void initElements() {
        this.listenMenuLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='main-menu__item']/a[contains(.,'Listen')]"));
        this.listenPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'Listen')]"));
        this.onAirSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='list-schedule']"));
        this.viewFullScheduleSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='list-schedules__rowone']"));
        this.editorsPicksSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'Editor')]"));
        this.CNA_938ProgrammesSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'CNA938 Programmes')]"));
        this.newsFromCNASection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'From CNA938')]"));
        this.radioOnDemandSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h2[contains(.,'CNA938 Radio On-Demand')]"));
        this.viewFullSchedule = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'View full schedule')]"));
        this.viewFullSchedulePAge = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='all-list-schedule__container-col-two']"));
        this.podcastArticleLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h5/a"));
        this.podcastPlayPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--podcast-main-title']"));
        this.podcastPlayButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='podcast-play'][contains(.,'Play')]"));
        this.podcastPauseButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@id='podcast-play']"));
        this.podcastPlayControlSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='podcast-player-wrapper']"));
        this.viewAllLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'View more')]"));
        this.allPosdcatsPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1"));
        this.searchTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//input[@placeholder='Search for podcasts and episodes']"));
        this.sortSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//select[@id='edit-sort-order']"));
        this.paginationSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//ul[@class='pager__items js-pager__items']"));
        this.paginationNextButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//li[@class='pager__item pager__item--next']/a"));
        this.ShowingCount = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='summary']/b"));
        this.threedots = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class[contains(.,'middle')]]//div[@class='quick-link quick-link--list-object']"));
        this.bookmark = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link bookmark-link-anonymous use-ajax']"));
        this.Share = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='link trigger-popup trigger-popup--share']"));
        this.listenNowButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[contains(.,'Listen now')]"));
        this.playButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Play']"));
        this.pauseButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//button[@title='Pause']"));
        this.loadMoreEpisodes= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Load more episodes')]"));
        this.latestEpisodesList= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='views-row']"));
        this.findOutmoreLink= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[contains(.,'Find out more')]"));
        this.podcastDescription= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='podcast-main__description']"));
        this.podcastShare= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='a2a-share-link a2a_kit']"));
        this.viewMoreCTA= AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@title='View more']"));

    }

    public void clickListenMenuLink(){
        this.action.javaScriptHelper.fnJSClick(listenMenuLink);
    }

    public boolean validateListenLandingPage() {
        this.action.waitHelper.waitFor(listenPageHeader);
        return this.action.elementHelper.fnIsElementDisplayed(listenPageHeader);
    }

    public boolean validateListenPageSections(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;
        boolean sec4=false;
        boolean sec5=false;
        boolean sec6=false;
        boolean sec7=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(onAirSection);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(viewFullScheduleSection);
        //sec3 = this.action.elementHelper.fnIsElementDisplayed(editorsPicksSection);
        sec4 = this.action.elementHelper.fnIsElementDisplayed(CNA_938ProgrammesSection);
        //sec5 = this.action.elementHelper.fnIsElementDisplayed(newsFromCNASection);
        //sec6 = this.action.elementHelper.fnIsElementDisplayed(radioOnDemandSection);
        sec7 = this.action.elementHelper.fnIsElementDisplayed(viewMoreCTA);

        if(sec1 && sec2 && sec4 &&sec7)
            sections=true;
        return sections;
    }

    public void clickViewFullScheduleLink(){
        this.action.javaScriptHelper.fnJSScrollToView(viewFullSchedule);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(viewFullSchedule);
    }

    public boolean viewFullSchedulePage(){
        this.action.waitHelper.waitFor(viewFullSchedulePAge);
        return this.action.elementHelper.fnVerifyIsDisplayed(viewFullSchedulePAge);
    }

    public void clickOnPodcastLink(){
        this.action.javaScriptHelper.fnJSScrollToView(viewFullSchedule);
        this.action.javaScriptHelper.fnJSClick(podcastArticleLink);
    }

    public boolean validatepodcastPlayPage(){
        this.action.waitHelper.waitFor(podcastPlayPage);
        return this.action.elementHelper.fnVerifyIsDisplayed(podcastPlayPage);
    }

    public void clickOnPlayButton(){
        this.action.javaScriptHelper.fnJSScrollToView(podcastPlayButton);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(podcastPlayButton);
    }

    public boolean validatepodcastPlayControlSection(){
        this.action.waitHelper.waitFor(podcastPlayControlSection);
        return this.action.elementHelper.fnVerifyIsDisplayed(podcastPlayControlSection);
    }

    public boolean validatePodcastPlaybutton(){
        this.action.waitHelper.waitFor(podcastPlayButton);
        return this.action.elementHelper.fnVerifyIsDisplayed(podcastPlayButton);
    }

    public void clickOnViewAllLInk(){
        this.action.javaScriptHelper.fnJSScrollToView(viewAllLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(viewAllLink);
    }

    public boolean validateAllPodacstsPage(){
        this.action.waitHelper.waitFor(allPosdcatsPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(allPosdcatsPageHeader);
    }

    public boolean validateSearchSortingPaginationSections(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(searchTextBox);
        //sec2 = this.action.elementHelper.fnIsElementDisplayed(sortSection);
        this.action.javaScriptHelper.fnJSScrollToView(paginationSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        sec3 = this.action.elementHelper.fnIsElementDisplayed(paginationSection);

        if(sec1 && sec3 )
            sections=true;
        return sections;
    }

    public boolean validateShowingCount(){
        String showCountfirstPage = this.action.elementHelper.fnGetText(ShowingCount);
        String[] parts = showCountfirstPage.split(" ");
        String First = parts[0];
        int number = Integer.parseInt(First);

        this.action.javaScriptHelper.fnJSClick(paginationNextButton);
        this.action.waitHelper.waitFor(sortSection);

        String showCountSecondPage = this.action.elementHelper.fnGetText(ShowingCount);
        String[] second= showCountfirstPage.split(" ");
        String Next = parts[0];
        int numberChange = Integer.parseInt(Next);

        if(numberChange> number) {
            return true;
        }
        else{
            return false;
        }
    }

    public void clickOnthreeDots(){
        this.action.javaScriptHelper.fnJSScrollToView(threedots);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.javaScriptHelper.fnJSClick(threedots);
    }

    public boolean validateBookmarkShareOptions(){
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(bookmark);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(Share);

        if(sec1 && sec2 )
            sections=true;
        return sections;
    }

    public void clickOnListenNow(){
        this.action.javaScriptHelper.fnJSScrollToView(listenNowButton);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(listenNowButton);
    }

    public boolean validatePlayandPauseFunctions() throws InterruptedException {
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;
        this.action.waitHelper.waitFor(playButton);

        sec1 = this.action.elementHelper.fnIsElementDisplayed(playButton);
        this.action.javaScriptHelper.fnJSClick(playButton);
        Thread.sleep(2000);

        sec2 = this.action.elementHelper.fnIsElementDisplayed(pauseButton);

        if(sec1 && sec2 )
            sections=true;
        return sections;
    }

    public void clickLoadMoreEpisodesButton() throws InterruptedException {
        this.action.javaScriptHelper.fnJSScrollToView(loadMoreEpisodes);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSClick(loadMoreEpisodes);
    }

    public boolean latestEpisodeListValidation() throws InterruptedException {
        boolean list = false;
        List<WebElement> articlesList = null;

        Thread.sleep(2000);
        articlesList = this.action.elementHelper.fnGetListofElement(latestEpisodesList);
        if (articlesList.size() > 5)
            list = true;
        return list;
    }

    public void clickFindOutMoreLink(){
        this.action.javaScriptHelper.fnJSScrollToView(findOutmoreLink);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(findOutmoreLink);
    }


    public boolean validatePodcastDescAndShareOptions() {
        boolean sections=false;
        boolean sec1=false;
        boolean sec2=false;

        this.action.waitHelper.waitFor(podcastDescription);

        sec1 = this.action.elementHelper.fnIsElementDisplayed(podcastDescription);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(podcastShare);

        if(sec1 && sec2 )
            sections=true;
        return sections;
    }
}
