Feature: As a user, I want to search for a product and verify the product details


  @ValidCase @SomeTags
  Scenario: Search for product and proceed to checkout
    Given Load Trace Parts website
    When I enter Photoelectric Sensor in the textbox and click the Search icon
    Then I select the first product that is displayed
    Then I verify that the Product Title has LD46
    And I verify that the Product Description has LD46-UL-715
    Then I Right click on the 3D Model Product Image that is displayed in the 3D Viewer
    And In the Views option that is displayed I Click on Left and verify that the 3D Viewer displays the left side of the image
