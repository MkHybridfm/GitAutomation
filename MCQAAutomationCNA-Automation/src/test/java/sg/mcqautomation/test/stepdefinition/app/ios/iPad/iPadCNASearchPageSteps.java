package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNAMyFeedPage;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNASearchPage;

public class iPadCNASearchPageSteps {

    iPadCNASearchPage cnaSearchPage = new iPadCNASearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPadCNAMyFeedPage cnaMyFeedPage = new iPadCNAMyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I Click on Search Button in iPad")
    public void iClickOnSearchButton() {
        cnaSearchPage.clickOnSearchPage();
    }

    @Then("I Verify the Search Screen with {string} in iPad")
    public void iValidateTheSearchPageWith(String text) throws InterruptedException {
        Assert.assertTrue(cnaSearchPage.verifySearchPageWithTrendingTopic().equalsIgnoreCase(text));
    }

    @And("I Click on Close Button on Search Screen in iPad")
    public void iClickOnCloseButtonOnSearchPage() {
        cnaSearchPage.clickOnCloseButtonOnSearchPage();
    }

    @Then("I validate search button and settings icon in iPad")
    public void iValidateSearchButtonAndSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }

    @And("I Enter Search Keyword as {string} on Search Bar in iPad")
    public void iEnterTheSearchKeywordAsOnSearchBar(String text) {
        cnaSearchPage.enterTheKeyValueToSearch(text);
    }

    @Then("I Verify the contents with the search key word in iPad")
    public void iVerifyTheContentsWithTheSearchKeyWord() {
        Assert.assertTrue(cnaSearchPage.verifyTheListOfKeyValuesWithSearchKeyWord());

    }
}