Feature:  Register Users on our website

  @web @regression  @register
  Scenario Outline:  Register user
    Given The user browses "<url>"
    When  The user clicks register link
    And   The user captures contact information "<firstName>", "<lastName>", "<phone>", and "<email>"
    And   The user captures Mailing information "<address>", "<city>", "<province>", "<postalCode>", and  "<country>"
    And   The user captures user information "<username>", "<password>", and "<confirmPassword>"
    Then  clicks register button

    Examples:
      | url                                    | firstName | lastName | phone      | email           | address         | city     | province | postalCode | country      | username   | password   | confirmPassword |
      | https://demo.guru99.com/test/newtours/ | Tebogo    | Letlalo  | 0650003456 | tebogo@metP.com | 123 bree street | Pretoria | GAUTENG  | 0002       | SOUTH AFRICA | tutorial05 | tutorial05 | tutorial05      |
