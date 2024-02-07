package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_SearchPage;

import java.awt.*;

public class CNA_MobileWeb_IOS_SearchSteps {

    CNA_MobileWeb_IOS_SearchPage CNAWeb_SearchPage = new CNA_MobileWeb_IOS_SearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

            public SoftAssertions softAssert =new SoftAssertions();

    @When("I Click on Search Option in Primary Links section from Home Page in IOS Mobile Web")
    public void iClickOnSearchOptionInPrimaryLinksSectionFromHomePage() {
        CNAWeb_SearchPage.clickOnSearchMenu();
    }

    @And("I validate Search Overlay Page is displayed in IOS Mobile Web")
    public void iValidateSearchOverlayPageIsDisplayed() {
        CNAWeb_SearchPage.validateSearchPageDisplay();
    }

    @And("I Validate if Trending Topics, Search Text box and CNA Logo is displayed in IOS Mobile Web")
    public void iValidateIfTrendingTopicsSearchTextBoxAndCNALogoIsDisplayed() {
        CNAWeb_SearchPage.validateTrendingTopicsAndCNALogo();
    }

    @Then("I enter three characters in Search Text field in IOS Mobile Web")
    public void iEnterCharactersInSearchTextField() throws AWTException, InterruptedException {
        CNAWeb_SearchPage.enter3CharactersInSearchTextBox();
    }

    @And("I validate if Search Auto suggestions are displayed in IOS Mobile Web")
    public void iValidateIfSearchAutoSuggestionsAreDisplayed() throws InterruptedException {
        Assert.assertTrue(CNAWeb_SearchPage.validateSearchAutoSuggestions());
    }

    @Then("I enter the content to search in Search Text field {string} in IOS Mobile Web")
    public void iEnterTheContentToSearchInSearchTextField(String searchText) throws AWTException {
        CNAWeb_SearchPage.enterSearchText(searchText);
    }

    @And("I Validate if Search results are displayed in IOS Mobile Web")
    public void iValidateIfSearchResultsAreDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateSearchResultsPageHeader());
    }

    @And("I validate if Search results are displayed with Sort Functionality and Trending Topics option in IOS Mobile Web")
    public void iValidateIfSearchResultsAreDisplayedWithSortFunctionalityAndTrendingTopicsOption() {
        CNAWeb_SearchPage.validateTrendingTopicsAndSortingOptions();
    }

    @Then("I validate if maximum15 stories are displayed in each page in IOS Mobile Web")
    public void iValidateIfStoriesAreDisplayedInEachPage() {
        Assert.assertTrue(CNAWeb_SearchPage.articleListInSearchResults());
    }

    @And("I validate if pagination functionality is available in IOS Mobile Web")
    public void iValidateIfPaginationFunctionalityIsAvailable() {
        CNAWeb_SearchPage.validatePaginationSection();
    }

    @And("I validate if Empty search results are displayed in IOS Mobile Web")
    public void iValidateIfEmptySearchResultsAreDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateEmptySearchResultsSection());
    }

    @And("I click on Watch section in IOS Mobile Web")
    public void iClickOnWatchSection() {
        CNAWeb_SearchPage.clickOnWatchMenu();
    }

    @Then("I validate if Recent search section with topics is displayed in IOS Mobile Web")
    public void iValidateIfRecentSearchSectionWithTopicsIsDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateRecentSearchSection());
       }

    @And("I Click on the clear link in Recent Searches section in IOS Mobile Web")
    public void iClickOnTheClearLinkInRecentSearchesSection() {
        CNAWeb_SearchPage.clickOnClearLinkRecentSearch();
    }

    @And("I validate if the recent Search history is reset in IOS Mobile Web")
    public void iValidateIfTheRecentSearchHistoryIsReset() {
        Assert.assertFalse(CNAWeb_SearchPage.validateRecentSearchSecionIsReset());
    }

    @Then("I validate the Filter, Sort and Category sections in search results page in IOS Mobile Web")
    public void iValidateTheFilterSortAndCategorySectionsInSearchResultsPage() {
        CNAWeb_SearchPage.validateFilterAndCategorySections();
    }

    @And("I validate Watch Page header in IOS Mobile Web")
    public void iValidateWatchPageHeader() throws InterruptedException {
        CNAWeb_SearchPage.validateWatchPageHeader();
    }

    @Then("I click on one of the trending Topics from Sugesstion in IOS Mobile Web")
    public void iClickOnOneOfTheTrendingTopicsFromSugesstion() {
        CNAWeb_SearchPage.clickOnTrendingTopic();
    }
}
