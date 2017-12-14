$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sprint_a1/NOPCommerce_001_Register Test.feature");
formatter.feature({
  "line": 2,
  "name": "Test for account register functionality",
  "description": "As a customer\nI want to register\nSo that I can create an account",
  "id": "test-for-account-register-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_001"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Testing account registration functionality with user details",
  "description": "",
  "id": "test-for-account-register-functionality;testing-account-registration-functionality-with-user-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I register with the following personal details: \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cdayOfBirth\u003e\", \"\u003cmonthOfBirth\u003e\", \"\u003cyearOfBirth\u003e\",\"\u003cemail\u003e\", \"\u003ccompanyName\u003e\", \"\u003cpassword\u003e\", \u0026 \"\u003cconfirmPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the \"\u003cmessage\u003e\" displayed in the register page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "Registration test data:",
  "description": "",
  "id": "test-for-account-register-functionality;testing-account-registration-functionality-with-user-details;registration-test-data:",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "dayOfBirth",
        "monthOfBirth",
        "yearOfBirth",
        "email",
        "companyName",
        "password",
        "confirmPassword",
        "message"
      ],
      "line": 12,
      "id": "test-for-account-register-functionality;testing-account-registration-functionality-with-user-details;registration-test-data:;1"
    },
    {
      "cells": [
        "John",
        "Smith",
        "10",
        "April",
        "1990",
        "automation.test@yahoo.com",
        "Automation Ltd",
        "test123",
        "test123",
        "Your Registration Completed"
      ],
      "line": 13,
      "id": "test-for-account-register-functionality;testing-account-registration-functionality-with-user-details;registration-test-data:;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8706782402,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Testing account registration functionality with user details",
  "description": "",
  "id": "test-for-account-register-functionality;testing-account-registration-functionality-with-user-details;registration-test-data:;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_001"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I register with the following personal details: \"John\", \"Smith\", \"10\", \"April\", \"1990\",\"automation.test@yahoo.com\", \"Automation Ltd\", \"test123\", \u0026 \"test123\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the \"Your Registration Completed\" displayed in the register page",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NopLoginTestSteps.iAmOnTheHomePageOfTheApplication()"
});
formatter.result({
  "duration": 4161158098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 49
    },
    {
      "val": "Smith",
      "offset": 57
    },
    {
      "val": "10",
      "offset": 66
    },
    {
      "val": "April",
      "offset": 72
    },
    {
      "val": "1990",
      "offset": 81
    },
    {
      "val": "automation.test@yahoo.com",
      "offset": 88
    },
    {
      "val": "Automation Ltd",
      "offset": 117
    },
    {
      "val": "test123",
      "offset": 135
    },
    {
      "val": "test123",
      "offset": 148
    }
  ],
  "location": "NopRegisterTestSteps.iRegisterWithTheFollowingPersonalDetails(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 11435001547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Registration Completed",
      "offset": 18
    }
  ],
  "location": "NopRegisterTestSteps.i_should_see_the_displayed_in_the_register_page(String)"
});
formatter.result({
  "duration": 100334114,
  "error_message": "java.lang.AssertionError: The page does not contain Your Registration Completed\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat com.nopcommerce.demo.step_definitions.NopRegisterTestSteps.i_should_see_the_displayed_in_the_register_page(NopRegisterTestSteps.java:37)\n\tat ✽.Then I should see the \"Your Registration Completed\" displayed in the register page(sprint_a1/NOPCommerce_001_Register Test.feature:10)\n",
  "status": "failed"
});
formatter.write("The Scenario name is Testing account registration functionality with user details and the status is failed");
formatter.write("Current Page URL is: http://demo.nopcommerce.com/register");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1564001981,
  "status": "passed"
});
formatter.uri("sprint_a1/NOPCommerce_002_Login Test.feature");
formatter.feature({
  "line": 2,
  "name": "Testing login functionality",
  "description": "As a customer\nI want to login to application\nSo I can check my account",
  "id": "testing-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_002"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Testing login functionality using valid credentials",
  "description": "",
  "id": "testing-login-functionality;testing-login-functionality-using-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I logon with valid username \"\u003cusername\u003e\" and valid password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my email address \"\u003cmessage\u003e\" displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "Login test data",
  "description": "",
  "id": "testing-login-functionality;testing-login-functionality-using-valid-credentials;login-test-data",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ],
      "line": 12,
      "id": "testing-login-functionality;testing-login-functionality-using-valid-credentials;login-test-data;1"
    },
    {
      "cells": [
        "automation.test@yahoo.com",
        "test123",
        "My account"
      ],
      "line": 13,
      "id": "testing-login-functionality;testing-login-functionality-using-valid-credentials;login-test-data;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 149191162,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Testing login functionality using valid credentials",
  "description": "",
  "id": "testing-login-functionality;testing-login-functionality-using-valid-credentials;login-test-data;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_002"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I logon with valid username \"automation.test@yahoo.com\" and valid password \"test123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my email address \"My account\" displayed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NopLoginTestSteps.iAmOnTheHomePageOfTheApplication()"
});
formatter.result({
  "duration": 1321281088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.test@yahoo.com",
      "offset": 29
    },
    {
      "val": "test123",
      "offset": 76
    }
  ],
  "location": "NopLoginTestSteps.iLogonWithValidUsernameAndValidPassword(String,String)"
});
formatter.result({
  "duration": 4815723113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 31
    }
  ],
  "location": "NopLoginTestSteps.iShouldSeeMyEmailAddressDisplayed(String)"
});
formatter.result({
  "duration": 77805473,
  "status": "passed"
});
formatter.write("The Scenario name is Testing login functionality using valid credentials and the status is passed");
formatter.after({
  "duration": 1462296,
  "status": "passed"
});
formatter.uri("sprint_a1/NOPCommerce_003_Search For Item.feature");
formatter.feature({
  "line": 2,
  "name": "Test to Search for product functionality",
  "description": "As a customer\nI want to search for item\nSo I can add them to shopping cart",
  "id": "test-to-search-for-product-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_003"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Searching for an item functionality",
  "description": "",
  "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for an \"\u003citem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the following: \"\u003citemDescription\u003e\" \u0026 \"\u003citemPrice\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "Test data",
  "description": "",
  "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data",
  "rows": [
    {
      "cells": [
        "item",
        "itemDescription",
        "itemPrice"
      ],
      "line": 12,
      "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;1"
    },
    {
      "cells": [
        "Apple MacBook",
        "Apple MacBook Pro 13-inch",
        "$1,800.00"
      ],
      "line": 13,
      "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;2"
    },
    {
      "cells": [
        "Nokia",
        "Nokia Lumia 1020",
        "$349.00"
      ],
      "line": 14,
      "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;3"
    },
    {
      "cells": [
        "Wireless Speaker",
        "Beats Pill 2.0 Wireless Speaker",
        "$15.00"
      ],
      "line": 15,
      "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 67505876,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Searching for an item functionality",
  "description": "",
  "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_003"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for an \"Apple MacBook\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the following: \"Apple MacBook Pro 13-inch\" \u0026 \"$1,800.00\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NopLoginTestSteps.iAmOnTheHomePageOfTheApplication()"
});
formatter.result({
  "duration": 1790253424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook",
      "offset": 17
    }
  ],
  "location": "NopSearchItemTestSteps.iSearchForAn(String)"
});
formatter.result({
  "duration": 2953798825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 29
    },
    {
      "val": "$1,800.00",
      "offset": 59
    }
  ],
  "location": "NopSearchItemTestSteps.iShouldSeeTheFollowing(String,String)"
});
formatter.result({
  "duration": 116279949,
  "status": "passed"
});
formatter.write("The Scenario name is Searching for an item functionality and the status is passed");
formatter.after({
  "duration": 9063692,
  "status": "passed"
});
formatter.before({
  "duration": 103619667,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Searching for an item functionality",
  "description": "",
  "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_003"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for an \"Nokia\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the following: \"Nokia Lumia 1020\" \u0026 \"$349.00\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NopLoginTestSteps.iAmOnTheHomePageOfTheApplication()"
});
formatter.result({
  "duration": 1258410151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia",
      "offset": 17
    }
  ],
  "location": "NopSearchItemTestSteps.iSearchForAn(String)"
});
formatter.result({
  "duration": 1748907202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 29
    },
    {
      "val": "$349.00",
      "offset": 50
    }
  ],
  "location": "NopSearchItemTestSteps.iShouldSeeTheFollowing(String,String)"
});
formatter.result({
  "duration": 157423360,
  "status": "passed"
});
formatter.write("The Scenario name is Searching for an item functionality and the status is passed");
formatter.after({
  "duration": 737590,
  "status": "passed"
});
formatter.before({
  "duration": 35556562,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Searching for an item functionality",
  "description": "",
  "id": "test-to-search-for-product-functionality;searching-for-an-item-functionality;test-data;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_003"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for an \"Wireless Speaker\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the following: \"Beats Pill 2.0 Wireless Speaker\" \u0026 \"$15.00\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NopLoginTestSteps.iAmOnTheHomePageOfTheApplication()"
});
formatter.result({
  "duration": 1017911874,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wireless Speaker",
      "offset": 17
    }
  ],
  "location": "NopSearchItemTestSteps.iSearchForAn(String)"
});
formatter.result({
  "duration": 2407973213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beats Pill 2.0 Wireless Speaker",
      "offset": 29
    },
    {
      "val": "$15.00",
      "offset": 65
    }
  ],
  "location": "NopSearchItemTestSteps.iShouldSeeTheFollowing(String,String)"
});
formatter.result({
  "duration": 117324840,
  "error_message": "java.lang.AssertionError: There is no such item: $15.00\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat com.nopcommerce.demo.step_definitions.NopSearchItemTestSteps.iShouldSeeTheFollowing(NopSearchItemTestSteps.java:35)\n\tat ✽.Then I should see the following: \"Beats Pill 2.0 Wireless Speaker\" \u0026 \"$15.00\"(sprint_a1/NOPCommerce_003_Search For Item.feature:10)\n",
  "status": "failed"
});
formatter.write("The Scenario name is Searching for an item functionality and the status is failed");
formatter.write("Current Page URL is: http://demo.nopcommerce.com/search?q\u003dWireless+Speaker");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1686361693,
  "status": "passed"
});
formatter.uri("sprint_a1/NOPCommerce_004_Add Item To Basket.feature");
formatter.feature({
  "line": 2,
  "name": "Adding Items to shopping basket functionality",
  "description": "As an online customer\nI want to add Items that I have searched to the shopping basket\nSo I can pay for them",
  "id": "adding-items-to-shopping-basket-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature_004"
    }
  ]
});
formatter.before({
  "duration": 43178771,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test for adding searched items to the shopping basket",
  "description": "",
  "id": "adding-items-to-shopping-basket-functionality;test-for-adding-searched-items-to-the-shopping-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I have searched for an item:",
  "rows": [
    {
      "cells": [
        "searchedItem",
        "itemPrice"
      ],
      "line": 10
    },
    {
      "cells": [
        "Apple MacBook Pro 13-inch",
        "$1,800.00"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I add an \"Apple MacBook Pro 13-inch\" item to the shopping basket",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see \"Apple MacBook Pro 13-inch\" message displays",
  "keyword": "Then "
});
formatter.match({
  "location": "NopAddItemToBasketTestSteps.iHaveSearchedForAnItem(DataTable)"
});
formatter.result({
  "duration": 3917848256,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (710, 993)\n  (Session info: chrome\u003d62.0.3202.94)\n  (Driver info: chromedriver\u003d2.24.417424 (c5c5ea873213ee72e3d0929b47482681555340c3),platform\u003dLinux 4.4.0-103-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 246 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027inettech-VirtualBox\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-103-generic\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417424 (c5c5ea873213ee72e3d0929b47482681555340c3), userDataDir\u003d/tmp/.org.chromium.Chromium.SV9QeF}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d62.0.3202.94, platform\u003dLINUX, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 0e81d03d19c6eddbead616d8d6720206\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat com.nopcommerce.demo.pages.SearchedItemPage.goToFullItemPage(SearchedItemPage.java:27)\n\tat com.nopcommerce.demo.step_definitions.NopAddItemToBasketTestSteps.iHaveSearchedForAnItem(NopAddItemToBasketTestSteps.java:43)\n\tat ✽.Given I have searched for an item:(sprint_a1/NOPCommerce_004_Add Item To Basket.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 10
    }
  ],
  "location": "NopAddItemToBasketTestSteps.iAddAnItemToTheShoppingBasket(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 14
    }
  ],
  "location": "NopAddItemToBasketTestSteps.iShouldSeeMessageDisplays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The Scenario name is Test for adding searched items to the shopping basket and the status is failed");
formatter.write("Current Page URL is: http://demo.nopcommerce.com/search?q\u003dApple+MacBook+Pro+13-inch");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1054854602,
  "status": "passed"
});
});