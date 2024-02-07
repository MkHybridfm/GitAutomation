package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAMyFeedPage;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNASearchPage;

public class iPhoneCNASearchPageSteps {

    iPhoneCNASearchPage cnaSearchPage = new iPhoneCNASearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    iPhoneCNAMyFeedPage cnaMyFeedPage = new iPhoneCNAMyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I Click on Search Button in iPhone")
    public void iClickOnSearchButton() {
        cnaSearchPage.clickOnSearchPage();
    }

    @Then("I Verify the Search Screen with {string} in iPhone")
    public void iValidateTheSearchPageWith(String text) throws InterruptedException {
        Assert.assertTrue(cnaSearchPage.verifySearchPageWithTrendingTopic().equalsIgnoreCase(text));
    }

    @And("I Click on Close Button on Search Screen in iPhone")
    public void iClickOnCloseButtonOnSearchPage() {
        cnaSearchPage.clickOnCloseButtonOnSearchPage();
    }

    @Then("I validate search button and settings icon in iPhone")
    public void iValidateSearchButtonAndSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchButton());
        Assert.assertTrue(cnaMyFeedPage.validateSettingsIcon());
    }

    @And("I Enter Search Keyword as {string} on Search Bar in iPhone")
    public void iEnterTheSearchKeywordAsOnSearchBar(String text) {
        cnaSearchPage.enterTheKeyValueToSearch(text);
    }

    @Then("I Verify the contents with the search key word in iPhone")
    public void iVerifyTheContentsWithTheSearchKeyWord() {
        Assert.assertTrue(cnaSearchPage.verifyTheListOfKeyValuesWithSearchKeyWord());

    }
}