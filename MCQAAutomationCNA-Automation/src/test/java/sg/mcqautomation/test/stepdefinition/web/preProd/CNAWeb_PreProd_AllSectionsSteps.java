package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_AllSectionPage;

import java.awt.*;

public class CNAWeb_PreProd_AllSectionsSteps {
            CNAWeb_PreProd_AllSectionPage cnaWeb_allSectionPage = new CNAWeb_PreProd_AllSectionPage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @And("I click on All Sections Menu Link from Home Page in PreProd")
    public void i_click_on_all_sections_menu_link_from_home_page() {
        cnaWeb_allSectionPage.clickAllSectionsMenuLink();
    }

    @And("I validate if All sections Page is displayed in PreProd")
    public void iValidateIfAllSectionsPageIsDisplayed() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateAllSectionsLandingPage());
    }

    @Then("I validate All sections Page menu section in PreProd")
    public void iValidateAllSectionsPageMenuSection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateMenuSection());
    }

    @And("I validate Edition Switch Section in PreProd")
    public void iValidateEditionSwitchSingaporeAsia() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateEditionSection());
    }

    @Then("I validate Search block in All sections Page in PreProd")
    public void iValidateSearchBlockInAllSectionsPage() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateSearchTextBox());
    }

    @And("I validate Trending Topics section in PreProd")
    public void iValidateTrendingTopicsSection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateTrendingTopics());
    }

    @And("I validate Follow CNA Section in PreProd")
    public void iValidateFollowCNASection() {
        Assert.assertTrue(cnaWeb_allSectionPage.validateFollowCNASection());
    }

    @Then("I enter search text in Search Text box {string} in PreProd")
    public void iEnterSearchTextInSearchTextBox(String searchText) throws AWTException {
        cnaWeb_allSectionPage.enterSearchText(searchText);
    }

    @Then("I click on close button in All Sections Page in PreProd")
    public void iClickOnCloseButtonInAllSectionsPage() {
        cnaWeb_allSectionPage.clickOnCloseButton();
    }
}
