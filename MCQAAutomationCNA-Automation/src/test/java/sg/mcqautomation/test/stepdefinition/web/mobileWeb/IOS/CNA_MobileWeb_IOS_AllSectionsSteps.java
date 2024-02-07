package sg.mcqautomation.test.stepdefinition.web.mobileWeb.IOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.mobileWeb.IOS.CNA_MobileWeb_IOS_AllSectionPage;

import java.awt.*;

public class CNA_MobileWeb_IOS_AllSectionsSteps {
    CNA_MobileWeb_IOS_AllSectionPage cnaWeb_allSectionPage = new CNA_MobileWeb_IOS_AllSectionPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on All Sections Menu Link from Home Page in IOS Mobile Web")
    public void i_click_on_all_sections_menu_link_from_home_page() {
        cnaWeb_allSectionPage.clickAllSectionsMenuLink();
    }

    @And("I validate if All sections Page is displayed in IOS Mobile Web")
    public void iValidateIfAllSectionsPageIsDisplayed() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateAllSectionsLandingPage());
    }

    @Then("I validate All sections Page menu section in IOS Mobile Web")
    public void iValidateAllSectionsPageMenuSection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateMenuSection());
    }

    @And("I validate Edition Switch Section in IOS Mobile Web")
    public void iValidateEditionSwitchSingaporeAsia() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateEditionSection());
    }

    @Then("I validate Search block in All sections Page in IOS Mobile Web")
    public void iValidateSearchBlockInAllSectionsPage() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateSearchTextBox());
    }

    @And("I validate Trending Topics section in IOS Mobile Web")
    public void iValidateTrendingTopicsSection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateTrendingTopics());
    }

    @And("I validate Follow CNA Section in IOS Mobile Web")
    public void iValidateFollowCNASection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateFollowCNASection());
    }

    @Then("I enter search text in Search Text box {string} in IOS Mobile Web")
    public void iEnterSearchTextInSearchTextBox(String searchText) throws AWTException {
        cnaWeb_allSectionPage.enterSearchText(searchText);
    }

    @Then("I click on close button in All Sections Page in IOS Mobile Web")
    public void iClickOnCloseButtonInAllSectionsPage() {
        cnaWeb_allSectionPage.clickOnCloseButton();
    }
}
