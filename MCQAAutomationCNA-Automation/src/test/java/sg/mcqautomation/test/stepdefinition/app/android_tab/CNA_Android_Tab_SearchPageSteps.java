package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_MyFeedPage;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_SearchPage;

public class CNA_Android_Tab_SearchPageSteps {

    CNA_Android_Tab_SearchPage cnaSearchPage = new CNA_Android_Tab_SearchPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());
    CNA_Android_Tab_MyFeedPage cnaMyFeedPage = new CNA_Android_Tab_MyFeedPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on search button in Android App in Tab")
    public void iClickOnSearchButton() {
        cnaSearchPage.clickOnSearchPage();
    }

    @Then("I validate the search page with {string} in Android App in Tab")
    public void iValidateTheSearchPageWith(String text) throws InterruptedException {
        Assert.assertTrue(cnaSearchPage.verifySearchPageWithTrendingTopic().equalsIgnoreCase(text));
    }

    @And("I click on close button on search page in Android App in Tab")
    public void iClickOnCloseButtonOnSearchPage() {
        cnaSearchPage.clickOnCloseButtonOnSearchPage();
    }

    @Then("I validate search button and settings icon in Android App in Tab")
    public void iValidateSearchButtonAndSettingsIcon() {
        Assert.assertTrue(cnaMyFeedPage.validateSearchAndSettingsOptions());
    }

    @And("I enter the search keyword as {string} on search bar in Android App in Tab")
    public void iEnterTheSearchKeywordAsOnSearchBar(String text) {
        cnaSearchPage.enterTheKeyValueToSearch(text);
    }

    @Then("I verify the contents with the search key word in Android App in Tab")
    public void iVerifyTheContentsWithTheSearchKeyWord() {
        Assert.assertTrue(cnaSearchPage.verifyTheListOfKeyValuesWithSearchKeyWord());
    }
}