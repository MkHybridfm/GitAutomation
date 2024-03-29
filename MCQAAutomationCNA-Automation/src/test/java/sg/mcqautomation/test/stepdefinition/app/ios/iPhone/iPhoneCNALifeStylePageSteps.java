package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNALifeStylePage;


public class iPhoneCNALifeStylePageSteps {

    iPhoneCNALifeStylePage cnaLifeStylePage = new iPhoneCNALifeStylePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I click on article on life style page in iPhone")
    @Then("I click on article on luxury page in iPhone")
    public void iValidateTheHomePageHeader() throws InterruptedException {
        cnaLifeStylePage.clickOnArticle();
    }

    @Then("I Verify List of article on life style page in iPhone")
    @Then("I Verify List of article on luxury page in iPhone")
    public void verifylistofarticle() throws InterruptedException{
        Assert.assertTrue(cnaLifeStylePage.verifyarticle());
    }

    @Then("I validate the list of elements under the life style sec in iPhone")
    public void iValidateTheListOfElementsUnderTheLifeStyleSec() {
        Assert.assertTrue(cnaLifeStylePage.verifyListOfSectionsUnderTheLifeStyleMenuPage());
    }

    @And("I validate the {string} sec life style menu page in iPhone")
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

    @Then("I click on celebrity field under the entertainment in iPhone")
    public void iClickOnCelebrityFieldUnderTheEntertainment() {
        cnaLifeStylePage.clickOnCelebrityField();
    }

    @And("I click on filter and options in iPhone")
    public void iClickOnFilterAndOptions() {
        cnaLifeStylePage.clickOnFilterAndOptions();
    }

    @Then("I select video label in iPhone")
    public void iSelectVideoLabel() {
        cnaLifeStylePage.selectVideoLabel();
        cnaLifeStylePage.selectApplyButtonOnSortAndOptions();
    }

    @And("I click on first displayed video in iPhone")
    public void iClickOnFirstDisplayedVideo() {
        cnaLifeStylePage.clickOnFirstVideo();
    }

    @And("I click on entertainment field in iPhone")
    public void iClickOnEntertainmentField() {
        cnaLifeStylePage.clickOnEntertainmentField();
    }

    @And("I validate the {string} ON CNA luxury in iPhone")
    public void iValidateTheONCNALuxury(String text) {
        Assert.assertTrue(cnaLifeStylePage.verifyRelatedStoriesOnLuxury(text));
    }

    @Then("I validate the list of elements under the luxury sec in iPhone")
    public void iValidateTheListOfElementsUnderTheLuxurySec() {
        Assert.assertTrue(cnaLifeStylePage.validateListOfTopicsOnLuxurySec());
    }

    @And("I validate the {string} sec on luxury menu page in iPhone")
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

    @And("I click on Celebrations field in iPhone")
    public void iClickOnCelebrationsField() {
        cnaLifeStylePage.clickONCelebrationFieldUnderLuxury();
    }

    @Then("I validate the header title of the topic as {string} in iPhone")
    public void iValidateTheHeaderTitleOfTheTopicAs(String text) {
        Assert.assertTrue(cnaLifeStylePage.validateCelebrationsTopicsOnLuxurySec().equalsIgnoreCase(text));
    }

    @Then("I validate the author name on life style article page in iPhone")
    public void iValidateTheAuthorNameOnLifeStyleArticlePage() {
        Assert.assertTrue(cnaLifeStylePage.verifyAuthorNameOnLifeStyle());
    }

    @And("I click on author link on life style in iPhone")
    public void iClickOnAuthorLinkOnLifeStyle() {
        cnaLifeStylePage.clickOnAuthorName();
    }


    @Then("I click on article on Home page in iPhone")
    public void clickarticle() throws InterruptedException {
        cnaLifeStylePage.clickOnArticleHome();
    }

}