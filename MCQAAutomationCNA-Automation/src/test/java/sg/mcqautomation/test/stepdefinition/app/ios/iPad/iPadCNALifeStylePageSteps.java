package sg.mcqautomation.test.stepdefinition.app.ios.iPad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPad.iPadCNALifeStylePage;

public class iPadCNALifeStylePageSteps {

    iPadCNALifeStylePage cnaLifeStylePage = new iPadCNALifeStylePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I click on article on life style page in iPad")
    @Then("I click on article on luxury page in iPad")
    public void iValidateTheHomePageHeader() throws InterruptedException {
        cnaLifeStylePage.clickOnArticle();
    }

    @Then("I validate the list of elements under the life style sec in iPad")
    public void iValidateTheListOfElementsUnderTheLifeStyleSec() {
        Assert.assertTrue(cnaLifeStylePage.verifyListOfSectionsUnderTheLifeStyleMenuPage());
    }

    @And("I validate the {string} sec life style menu page in iPad")
    public void iValidateTheSecLifeStyleMenuPage(String text) {
        if(text.equalsIgnoreCase("Women")){
            Assert.assertTrue(cnaLifeStylePage.validateWomenCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Entertainment")){
            Assert.assertTrue(cnaLifeStylePage.validateEntertainmentCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Wellness")){
            Assert.assertTrue(cnaLifeStylePage.validateWellnessCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Living")){
            Assert.assertTrue(cnaLifeStylePage.validateLivingCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Style & Beauty")){
            Assert.assertTrue(cnaLifeStylePage.validateStyleAndBeautyCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Dining")){
            Assert.assertTrue(cnaLifeStylePage.validateDiningCategory().equalsIgnoreCase(text));
        }
        if(text.equalsIgnoreCase("Travel")){
            Assert.assertTrue(cnaLifeStylePage.validateTravelCategory().equalsIgnoreCase(text));
        }

    }

    @Then("I click on celebrity field under the entertainment in iPad")
    public void iClickOnCelebrityFieldUnderTheEntertainment() {
        cnaLifeStylePage.clickOnCelebrityField();
    }

    @And("I click on filter and options in iPad")
    public void iClickOnFilterAndOptions() {
        cnaLifeStylePage.clickOnFilterAndOptions();
    }

    @Then("I select video label in iPad")
    public void iSelectVideoLabel() {
        cnaLifeStylePage.selectVideoLabel();
        cnaLifeStylePage.selectApplyButtonOnSortAndOptions();
    }

    @And("I click on first displayed video in iPad")
    public void iClickOnFirstDisplayedVideo() {
        cnaLifeStylePage.clickOnFirstVideo();
    }

    @And("I click on entertainment field in iPad")
    public void iClickOnEntertainmentField() {
        cnaLifeStylePage.clickOnEntertainmentField();
    }

    @And("I validate the {string} ON CNA luxury in iPad")
    public void iValidateTheONCNALuxury(String text) {
        Assert.assertTrue(cnaLifeStylePage.verifyRelatedStoriesOnLuxury(text));
    }

    @Then("I validate the list of elements under the luxury sec in iPad")
    public void iValidateTheListOfElementsUnderTheLuxurySec() {
        Assert.assertTrue(cnaLifeStylePage.validateListOfTopicsOnLuxurySec());
    }

    @And("I validate the {string} sec on luxury menu page in iPad")
    public void iValidateTheSecLuxuryMenuPage(String text) {
        if(text.equalsIgnoreCase("Experiences"))
            Assert.assertTrue(cnaLifeStylePage.validateExperiencesTopicsOnLuxurySec().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Obsessions"))
            Assert.assertTrue(cnaLifeStylePage.validateObsessionsTopicsOnLuxurySec().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("People"))
            Assert.assertTrue(cnaLifeStylePage.validatePeopleTopicsOnLuxurySec().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Remarkable Living"))
            Assert.assertTrue(cnaLifeStylePage.validateRemarkableLivingTopicsOnLuxurySec().equalsIgnoreCase(text));
        if(text.equalsIgnoreCase("Celebrations"))
            Assert.assertTrue(cnaLifeStylePage.validateCelebrationsTopicsOnLuxurySec().equalsIgnoreCase(text));
    }

    @And("I click on Celebrations field in iPad")
    public void iClickOnCelebrationsField() {
        cnaLifeStylePage.clickONCelebrationFieldUnderLuxury();
    }

    @Then("I validate the header title of the topic as {string} in iPad")
    public void iValidateTheHeaderTitleOfTheTopicAs(String text) {
        Assert.assertTrue(cnaLifeStylePage.validateCelebrationsTopicsOnLuxurySec().equalsIgnoreCase(text));
    }

    @And("I click on one related topic on luxury article in iPad")
    public void iClickOnOneRelatedTopicOnLuxuryArticle() {
        cnaLifeStylePage.clickOnLuxuryTopicOnArticlePage();

    }

    @Then("I validate the author name on life style article page in iPad")
    public void iValidateTheAuthorNameOnLifeStyleArticlePage() {
        Assert.assertTrue(cnaLifeStylePage.verifyAuthorNameOnLifeStyle());
    }

    @And("I click on author link on life style in iPad")
    public void iClickOnAuthorLinkOnLifeStyle() {
        cnaLifeStylePage.clickOnAuthorName();
    }
}