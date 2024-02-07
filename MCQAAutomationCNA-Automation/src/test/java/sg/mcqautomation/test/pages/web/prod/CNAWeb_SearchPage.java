package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.awt.*;
import java.util.List;

public class CNAWeb_SearchPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_SearchPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By menuLinkSearch;
    private By searchTextBox;
    private By cnaLogo;
    private By trendingTopics;
    private By autoSearchSuggestion;
    private By searchResultsPageHeader;
    private By sortSection;
    private By trendingTopicsSearchResultsPage;
    private By serachResultsAcrticleList;
    private By paginationSection;
    private By resetSearchTextBox;
    private By emptyResults;
    private By watchMainMenu;
    private By watchPageHeader;
    private By recentSearchSection;
    private By recentSearchClearLink;
    private By filterSection;
    private By categorySection;
    private By recentSearchClear;
    private By trendingTopicLink;

    public void initElements() {
        this.menuLinkSearch = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='search-menu-link inline-menu__link']"));
        this.searchTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='trending-topics'][@class[contains(.,'algolia-search-modal')]]/parent::div//input[@id='algolia-search-input']"));
        this.cnaLogo = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//a[@class='logo-link']/img"));
        this.trendingTopics = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='trending-topics'][@class[contains(.,'algolia-search-modal')]]"));
        this.autoSearchSuggestion = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//span[@class='aa-dropdown-menu aa-with-3']/div"));
        this.searchResultsPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[contains(.,'You searched for')]"));
        this.sortSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='sort_by']"));
        this.trendingTopicsSearchResultsPage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//section[@id='block-views-block-hot-topics-trending-block']"));
        this.serachResultsAcrticleList = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='search-result media-object']"));
        this.paginationSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div/ul[@class='ais-Pagination-list pager__items']"));
        this.resetSearchTextBox = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='trending-topics'][@class[contains(.,'algolia-search-modal')]]/parent::div//button[@id='algolia-autocomplete-reset']"));
        this.emptyResults = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='ais-Hits ais-Hits--empty']"));
        this.watchMainMenu = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//nav[@id='main-nav']//a[contains(.,'Watch')]"));
        this.watchPageHeader = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h1[@class='h1 h1--page-title'][contains(.,'Watch')]"));
        this.recentSearchSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='recent-search']"));
        this.recentSearchClearLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='recent-search']/parent::div//div[contains(.,'Clear')]"));
        this.filterSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='sort_by']"));
        this.categorySection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//form/details[@id='edit-field-category-target-id-collapsible--2']"));
        this.recentSearchClear = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='recent-search']/parent::div//div[contains(.,'Clear')]/span"));
        this.trendingTopicLink = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='trending-topics'][@class[contains(.,'algolia-search-modal')]]//a"));
    }

    public void clickOnSearchMenu() {
        this.action.waitHelper.waitFor(menuLinkSearch);
        this.action.javaScriptHelper.fnJSClick(menuLinkSearch);
    }

    public boolean validateSearchPageDisplay() {
        this.action.waitHelper.waitFor(searchTextBox);
        this.action.javaScriptHelper.fnJSScrollToView(searchTextBox);
        return this.action.elementHelper.fnIsElementPresent(searchTextBox);
    }

    public boolean validateTrendingTopicsAndCNALogo() {
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(cnaLogo);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(trendingTopics);

        if (sec1 && sec2)
            sections = true;
        return sections;
    }

    public void enter3CharactersInSearchTextBox() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        this.action.javaScriptHelper.fnJSType(searchTextBox, "As");
        this.action.elementHelper.fnType(searchTextBox, "i");
    }

    public boolean validateSearchAutoSuggestions() throws InterruptedException {
        Thread.sleep(1000);
        this.action.waitHelper.waitFor(autoSearchSuggestion);
        return this.action.elementHelper.fnIsElementPresent(autoSearchSuggestion);
    }

    public void enterSearchText(String searchText) throws AWTException {
        this.action.waitHelper.waitFor(searchTextBox);
        this.action.elementHelper.fnClick(resetSearchTextBox);
        this.action.elementHelper.fnType(this.searchTextBox, searchText);
        driver.findElement(this.searchTextBox).sendKeys(Keys.ENTER);
       /* Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/

    }

    public boolean validateSearchResultsPageHeader() {
        this.action.waitHelper.waitFor(searchResultsPageHeader);
        return this.action.elementHelper.fnVerifyIsDisplayed(searchResultsPageHeader);

    }

    public boolean validateTrendingTopicsAndSortingOptions() {
        boolean sections = false;
        boolean sec1 = false;
        boolean sec2 = false;

        sec1 = this.action.elementHelper.fnIsElementDisplayed(sortSection);
        sec2 = this.action.elementHelper.fnIsElementDisplayed(trendingTopicsSearchResultsPage);

        if (sec1 && sec2)
            sections = true;
        return sections;
    }

    public boolean articleListInSearchResults() {
        boolean list = false;
        List<WebElement> articlesList = null;

        articlesList = this.action.elementHelper.fnGetListofElement(serachResultsAcrticleList);
        if (articlesList.size() == 15)
            list = true;
        return list;
    }

    public boolean validatePaginationSection() {
        this.action.javaScriptHelper.fnJSScrollToView(paginationSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementPresent(paginationSection);
    }

    public boolean validateEmptySearchResultsSection() {
        return this.action.elementHelper.fnIsElementPresent(emptyResults);
    }

    public void clickOnWatchMenu() {
        this.action.waitHelper.waitFor(watchMainMenu);
        this.action.javaScriptHelper.fnJSClick(watchMainMenu);
    }

    public void validateWatchPageHeader() throws InterruptedException {
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(watchPageHeader);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
       // return this.action.elementHelper.fnIsElementPresent(watchPageHeader);
    }

    public boolean validateRecentSearchSection() {
        this.action.waitHelper.fnWaitForVisibilityOf(searchTextBox);
        this.action.elementHelper.fnIsElementPresent(recentSearchSection);
        return true;
    }

    public void clickOnClearLinkRecentSearch() {
        this.action.waitHelper.fnWaitForVisibilityOf(recentSearchClearLink);
        this.action.javaScriptHelper.fnJSClick(recentSearchClearLink);
    }

    public boolean validateFilterAndCategorySections() {
        this.action.javaScriptHelper.fnJSScrollToView(serachResultsAcrticleList);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
        return this.action.elementHelper.fnIsElementDisplayed(filterSection);
    }

    public boolean validateRecentSearchSecionIsReset() {
        this.action.elementHelper.fnIsElementPresent(recentSearchClear);
        return false;
    }

    public void clickOnTrendingTopic() {
        this.action.windowSwitchHelper.fnSwitchToWindowAfterClick(trendingTopicLink);
    }


}
