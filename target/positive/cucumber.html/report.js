$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Search car page",
  "description": "",
  "id": "validate-search-car-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchCar"
    }
  ]
});
formatter.before({
  "duration": 12060135500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "validate-search-car-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "we are on the home page\"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I move to Buy+Sell Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 8
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 9
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 10
    },
    {
      "cells": [
        "news"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select car make as \"BMW\" from Any Make dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select car model as \"1 Series\" from Any Model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select car location as \"ACT - All\" from Any Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select car price as \"$10,000\" from Any Price (max) dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Find My Next Car button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the page title is \"Bmw 1 Series Under 10000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 24
    }
  ],
  "location": "SearchCarSteps.weAreOnTheHomePage(String)"
});
formatter.result({
  "duration": 3575597600,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.iMoveToBuySellMenu(String\u003e)"
});
formatter.result({
  "duration": 6494193700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarSteps.clickOnLink(String)"
});
formatter.result({
  "duration": 5697501700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCarSteps.selectCarMakeAsFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 688451400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 21
    }
  ],
  "location": "SearchCarSteps.selectCarModelAsFromAnyModelDropdown(String)"
});
formatter.result({
  "duration": 509811600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 24
    }
  ],
  "location": "SearchCarSteps.selectCarMakeAsFromAnyLocationDropdown(String)"
});
formatter.result({
  "duration": 386739000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10,000",
      "offset": 21
    }
  ],
  "location": "SearchCarSteps.selectCarPriceAsFromAnyPriceMaxDropdown(String)"
});
formatter.result({
  "duration": 349931700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.clickOnFindMyNextCarButton()"
});
formatter.result({
  "duration": 2499599500,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.iSeeListOfSearchedCars()"
});
formatter.result({
  "duration": 46200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 10000 for Sale ACT | carsguide",
      "offset": 19
    }
  ],
  "location": "SearchCarSteps.thePageTitleIs(String)"
});
formatter.result({
  "duration": 3110300,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.SearchCarSteps.thePageTitleIs(SearchCarSteps.java:75)\r\n\tat ✽.And the page title is \"Bmw 1 Series Under 10000 for Sale ACT | carsguide\"(SearchCars.feature:19)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 3055407700,
  "status": "passed"
});
});