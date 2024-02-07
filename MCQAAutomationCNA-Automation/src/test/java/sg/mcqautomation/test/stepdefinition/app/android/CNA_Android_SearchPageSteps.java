package sg.mcqautomation.test.stepdefinition.app.android;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_MyFeedPage;
import sg.mcqautomation.test.pages.app.android.CNA_Android_SearchPage;

public class CNA_Android_SearchPageSteps {

    CNA_Android_SearchPage cnaSearchPage = new CNA_Android_SearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    CNA_Android_MyFeedPage cnaMyFeedPage = new CNA_Android_MyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on search button in Android App")
    public void iClickOnSearchButton() {
        cnaSearchPage.clickOnSearchPage();
    }

    @Then("I validate the search page with {string} in Android App")
    public void iValidateTheSearchPageWith(String text) throws InterruptedException {
        Assert.assertTrue(cnaSearchPage.verifySearchPageWithTrendingTopic().equalsIgnoreCase(text));
    }

    @And("I click on close button on search page in Android App")
    public void iClickOnCloseButtonOnSearchPage() {
        cnaSearchPage.clickOnCloseButtonOnSearchPage();
    }

    @Then("I validate search button and settings icon in Android App")
    public void iValidateSearchButtonAndSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchAndSettingsOptions());
    }

    @And("I enter the search keyword as {string} on search bar in Android App")
    public void iEnterTheSearchKeywordAsOnSearchBar(String text) {
        cnaSearchPage.enterTheKeyValueToSearch(text);
    }

    @Then("I verify the contents with the search key word in Android App")
    public void iVerifyTheContentsWithTheSearchKeyWord() {
        Assert.assertTrue(cnaSearchPage.verifyTheListOfKeyValuesWithSearchKeyWord());
    }
}