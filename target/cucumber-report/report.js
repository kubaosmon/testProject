$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TestAPI.feature");
formatter.feature({
  "name": "Test GitHub API",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testAPI"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search repository by author name - Positive scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "ContentType and AcceptType is Json",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid \u003cauthorName\u003e and hits api",
  "keyword": "When "
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies the \u003crepository1\u003e exists and the \u003crepository2\u003e exists",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies the \u003cauthorName\u003e of repositories",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "authorName",
        "repository1",
        "repository2"
      ]
    },
    {
      "cells": [
        "chase",
        "vim-ansible-yaml",
        "focuspoint-vim"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search repository by author name - Positive scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testAPI"
    }
  ]
});
formatter.step({
  "name": "ContentType and AcceptType is Json",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsAPI.contenttype_and_AcceptType_is_Json()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid chase and hits api",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsAPI.user_enters_valid_and_hits_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsAPI.status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the vim-ansible-yaml exists and the focuspoint-vim exists",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsAPI.user_verifies_the_exists_and_the_exists(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the chase of repositories",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsAPI.user_verifies_the_of_repositories(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search repository by author name - Negative scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "ContentType and AcceptType is Json",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid \u003cauthorName\u003e and hits api",
  "keyword": "When "
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies that invalid \u003crepository1\u003e and invalid \u003crepository2\u003e do not exist",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "authorName",
        "repository1",
        "repository2"
      ]
    },
    {
      "cells": [
        "asakg",
        "A17g",
        "bghies"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search repository by author name - Negative scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testAPI"
    }
  ]
});
formatter.step({
  "name": "ContentType and AcceptType is Json",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsAPI.contenttype_and_AcceptType_is_Json()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid asakg and hits api",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsAPI.user_enters_valid_and_hits_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsAPI.status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that invalid A17g and invalid bghies do not exist",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsAPI.user_verifies_that_invalid_and_invalid_do_not_exist(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/TestUI.feature");
formatter.feature({
  "name": "UI test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testUI"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TestAmazonUI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "user goes to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches \"\u003citem\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "name": "user sorts results by \"Price: High to Low\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects top result",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies image is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "user go to \"Sell on Amazon\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "item"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "office table"
      ]
    },
    {
      "cells": [
        "pillow"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TestAmazonUI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testUI"
    },
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "user goes to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsUI.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"iphone\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsUI.user_searches_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sorts results by \"Price: High to Low\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_sorts_results_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects top result",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsUI.user_selects_top_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies image is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_verifies_image_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to \"Sell on Amazon\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_go_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TestAmazonUI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testUI"
    },
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "user goes to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsUI.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"office table\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsUI.user_searches_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sorts results by \"Price: High to Low\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_sorts_results_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects top result",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsUI.user_selects_top_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies image is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_verifies_image_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to \"Sell on Amazon\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_go_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TestAmazonUI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testUI"
    },
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "user goes to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsUI.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"pillow\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsUI.user_searches_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sorts results by \"Price: High to Low\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_sorts_results_by(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects top result",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsUI.user_selects_top_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies image is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_verifies_image_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to \"Sell on Amazon\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsUI.user_go_to(String)"
});
formatter.result({
  "status": "passed"
});
});