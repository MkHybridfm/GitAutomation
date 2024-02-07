package sg.mcqautomation.test.stepdefinition.web.preProd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.web.preProd.CNAWeb_PreProd_TopicPage;

public class CNAWeb_PreProd_TopicSteps {
        CNAWeb_PreProd_TopicPage CNAWeb_TopicPage = new CNAWeb_PreProd_TopicPage(DriverFactory.getDriver(),
        DriverFactory.getGlobalConfig());

        public SoftAssertions softAssert =new SoftAssertions();

        @And("I click on article from top stories in World category in PreProd")
        public void iClickOnArticleFromTopStoriesInWorldCategory() {
                CNAWeb_TopicPage.clickOnArticlefromTopStory();
        }

        @Then("I validate if Related Topics section is present in PreProd")
        public void iValidateIfRelatedTopicsSectionIsPresent() {
                Assert.assertTrue(CNAWeb_TopicPage.validateRelatedTopicsSection());
        }

        @And("I click on a topic from Related topics section in PreProd")
        public void iClickOnATopicFromRelatedTopicsSection() {
                CNAWeb_TopicPage.clickOnARelatedArticle();
        }

        @Then("I validate if user is navigated to Topic Listing screen in PreProd")
        public void iValidateIfUserIsNavigatedToTopicListingScreen() {
                Assert.assertTrue(CNAWeb_TopicPage.validateTopicListingPage());
        }

        @And("I validate Topic Name,Follow button,Title sections in PreProd")
        public void iValidateTopicNameFollowButtonTitleSections() {
                CNAWeb_TopicPage.validateTopListingPageSections();
        }

        @And("I validate article list in topic listing screen in PreProd")
        public void iValidateArticleListInTopicListingScreen() {
                Assert.assertTrue(CNAWeb_TopicPage.articleListInTopicListing());
        }

        @And("I validate Published date, Sort Option, Filter and Pagination option in PreProd")
        public void iValidatePublishedDateSortOptionFilterAndPaginationOption() {
                Assert.assertTrue(CNAWeb_TopicPage.validateSortPaginationOptions());
        }

        @Then("I click on Follow button for Anonymous user in PreProd")
        public void iClickOnFollowButtonForAnonymousUser() {
                CNAWeb_TopicPage.clickOnFollowButtonAnonymousUser();
        }


        @Then("I click on Follow button for LoggedIn user in PreProd")
        public void iClickOnFollowButtonForLoggedInUser() {
                CNAWeb_TopicPage.clickOnFollowButtonLoggedInUser();
        }

        @And("I validate button name is changed to {string} in PreProd")
        public void iValidateButtonNameIsChangedTo(String text) throws InterruptedException {
                Assert.assertTrue(CNAWeb_TopicPage.verifyFollowButtonAfterClick().contains(text));
        }

        @Then("I validate article list in Following tab from My Feed Page in PreProd")
        public void iValidateArticleListInFollowingTabFromMyFeedPage() {
                Assert.assertTrue(CNAWeb_TopicPage.articleListInFeedFollowingPage());
        }

        @And("I click on Following button and Unfollow the Topic in PreProd")
        public void iClickOnFollowingButtonAndUnfollowTheTopic() {
                CNAWeb_TopicPage.clickOnFollowingAndUnFollowTopic();
        }

        @And("I click on topic name from My Feed Following Page in PreProd")
        public void iClickOnTopicNameFromMyFeedFollowingPage() {
                CNAWeb_TopicPage.clickOnTopicName();
        }

        @And("I validate if suggested Topics section is displayed in My feed Following Page in PreProd")
        public void iValidateIfSuggestedTopicsSectionIsDisplayedInMyFeedFollowingPage() {
                CNAWeb_TopicPage.validateSuggestedTopicsSection();
        }

        @And("I validate if {string} is displayed in PreProd")
        public void iValidateIfIsDisplayed(String NoFollowedTopicMessage) {
                Assert.assertTrue(CNAWeb_TopicPage.noFollowingTopicsMsgValidation().contains(NoFollowedTopicMessage));

        }
}
