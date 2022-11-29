$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SearchAndSelectProduct.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to search for a product and verify the product details",
  "description": "",
  "id": "as-a-user,-i-want-to-search-for-a-product-and-verify-the-product-details",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5776215650,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for product and proceed to checkout",
  "description": "",
  "id": "as-a-user,-i-want-to-search-for-a-product-and-verify-the-product-details;search-for-product-and-proceed-to-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ValidCase"
    },
    {
      "line": 4,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Load Trace Parts website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter Photoelectric Sensor in the textbox and click the Search icon",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select the first product that is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify that the Product Title has LD46",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify that the Product Description has LD46-UL-715",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Right click on the 3D Model Product Image that is displayed in the 3D Viewer",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "In the Views option that is displayed I Click on Left and verify that the 3D Viewer displays the left side of the image",
  "keyword": "And "
});
formatter.match({
  "location": "TracePartsStepDefs.loginToAmazonWebsite()"
});
formatter.result({
  "duration": 179916299,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.enterTextandSearch()"
});
formatter.result({
  "duration": 1020991435,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.selectFirstProductThatIsDisplayed()"
});
formatter.result({
  "duration": 898427360,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.verifyProductTitle()"
});
formatter.result({
  "duration": 28132438,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.verifyProductDescription()"
});
formatter.result({
  "duration": 33746069,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.rightClickOn3DModelProductImage()"
});
formatter.result({
  "duration": 4178580862,
  "status": "passed"
});
formatter.match({
  "location": "TracePartsStepDefs.clickOnLeftViewAndVerifyImage()"
});
formatter.result({
  "duration": 5322989559,
  "status": "passed"
});
formatter.after({
  "duration": 1253601771,
  "status": "passed"
});
});