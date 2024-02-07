@CNALifestyleWeb_HeaderMenuScenarios
Feature: Lifestyle Header Menu Validation scenarios

  @CNA_Mobile_Web_Android_88 @Sanity_Mobile_Web_Android @Sanity_Mobile_Web_AndroidLifestyle @Regression_Web
  @Web_CNAB-1133
  Scenario: Lifestyle Header Menu Brand Swtich validation in Android Mobile Web
    Given I launch the CNA Lifestyle web application and check HomePage in Android Mobile Web
    When I click on Go to Luxury link from Header Menu in Android Mobile Web
    Then I validate if Lifestyle Luxury Page header is displayed in Android Mobile Web
