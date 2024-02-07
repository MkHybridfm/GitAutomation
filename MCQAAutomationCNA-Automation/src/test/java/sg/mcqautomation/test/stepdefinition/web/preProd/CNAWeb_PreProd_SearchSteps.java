package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_SearchPage;

import java.awt.*;

public class CNAWeb_PreProd_SearchSteps {

            CNAWeb_PreProd_SearchPage CNAWeb_SearchPage = new CNAWeb_PreProd_SearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

            public SoftAssertions softAssert =new SoftAssertions();

    @When("I Click on Search Option in Primary Links section from Home Page in PreProd")
    public void iClickOnSearchOptionInPrimaryLinksSectionFromHomePage() {
        CNAWeb_SearchPage.clickOnSearchMenu();
    }

    @And("I validate Search Overlay Page is displayed in PreProd")
    public void iValidateSearchOverlayPageIsDisplayed() {
        CNAWeb_SearchPage.validateSearchPageDisplay();
    }

    @And("I Validate if Trending Topics, Search Text box and CNA Logo is displayed in PreProd")
    public void iValidateIfTrendingTopicsSearchTextBoxAndCNALogoIsDisplayed() {
        CNAWeb_SearchPage.validateTrendingTopicsAndCNALogo();
    }

    @Then("I enter three characters in Search Text field in PreProd")
    public void iEnterCharactersInSearchTextField() throws AWTException, InterruptedException {
        CNAWeb_SearchPage.enter3CharactersInSearchTextBox();
    }

    @And("I validate if Search Auto suggestions are displayed in PreProd")
    public void iValidateIfSearchAutoSuggestionsAreDisplayed() throws InterruptedException {
        Assert.assertTrue(CNAWeb_SearchPage.validateSearchAutoSuggestions());
    }

    @Then("I enter the content to search in Search Text field {string} in PreProd")
    public void iEnterTheContentToSearchInSearchTextField(String searchText) throws AWTException {
        CNAWeb_SearchPage.enterSearchText(searchText);
    }

    @And("I Validate if Search results are displayed in PreProd")
    public void iValidateIfSearchResultsAreDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateSearchResultsPageHeader());
    }

    @And("I validate if Search results are displayed with Sort Functionality and Trending Topics option in PreProd")
    public void iValidateIfSearchResultsAreDisplayedWithSortFunctionalityAndTrendingTopicsOption() {
        Assert.assertTrue(CNAWeb_SearchPage.validateTrendingTopicsAndSortingOptions());
    }

    @Then("I validate if maximum15 stories are displayed in each page in PreProd")
    public void iValidateIfStoriesAreDisplayedInEachPage() {
        Assert.assertTrue(CNAWeb_SearchPage.articleListInSearchResults());
    }

    @And("I validate if pagination functionality is available in PreProd")
    public void iValidateIfPaginationFunctionalityIsAvailable() {
        CNAWeb_SearchPage.validatePaginationSection();
    }

    @And("I validate if Empty search results are displayed in PreProd")
    public void iValidateIfEmptySearchResultsAreDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateEmptySearchResultsSection());
    }

    @And("I click on Watch section in PreProd")
    public void iClickOnWatchSection() {
        CNAWeb_SearchPage.clickOnWatchMenu();
    }

    @Then("I validate if Recent search section with topics is displayed in PreProd")
    public void iValidateIfRecentSearchSectionWithTopicsIsDisplayed() {
        Assert.assertTrue(CNAWeb_SearchPage.validateRecentSearchSection());
       }

    @And("I Click on the clear link in Recent Searches section in PreProd")
    public void iClickOnTheClearLinkInRecentSearchesSection() {
        CNAWeb_SearchPage.clickOnClearLinkRecentSearch();
    }

    @And("I validate if the recent Search history is reset in PreProd")
    public void iValidateIfTheRecentSearchHistoryIsReset() {
        Assert.assertFalse(CNAWeb_SearchPage.validateRecentSearchSecionIsReset());
    }

    @Then("I validate the Filter, Sort and Category sections in search results page in PreProd")
    public void iValidateTheFilterSortAndCategorySectionsInSearchResultsPage() {
        CNAWeb_SearchPage.validateFilterAndCategorySections();
    }

    @And("I validate Watch Page header in PreProd")
    public void iValidateWatchPageHeader() throws InterruptedException {
        CNAWeb_SearchPage.validateWatchPageHeader();
    }

    @Then("I click on one of the trending Topics from Sugesstion in PreProd")
    public void iClickOnOneOfTheTrendingTopicsFromSugesstion() {
        CNAWeb_SearchPage.clickOnTrendingTopic();
    }
}
