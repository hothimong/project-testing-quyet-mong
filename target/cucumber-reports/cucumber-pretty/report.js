$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/register.feature");
formatter.feature({
  "line": 1,
  "name": "Register page",
  "description": "",
  "id": "register-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Register successfully",
  "description": "",
  "id": "register-page;register-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I input information are first name as \u003cfirstname\u003e, last name as \u003clastname\u003e, user name as \u003cusername\u003e, password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click submit register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify register successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify login successfully with username as \u003cfirstname\u003e password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I scroll to management tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click Login Account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I log out",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "register-page;register-successfully;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password"
      ],
      "line": 17,
      "id": "register-page;register-successfully;;1"
    },
    {
      "cells": [
        "Lam",
        "tran",
        "lamtran",
        "lam"
      ],
      "line": 18,
      "id": "register-page;register-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open website http://localhost:8080/demo/#!/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/demo/#!/login",
      "offset": 15
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 6992864700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Register successfully",
  "description": "",
  "id": "register-page;register-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I input information are first name as Lam, last name as tran, user name as lamtran, password as lam",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click submit register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify register successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify login successfully with username as Lam password as lam",
  "matchedColumns": [
    0,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I scroll to management tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click Login Account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I log out",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterTest.register()"
});
formatter.result({
  "duration": 2133259300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lam",
      "offset": 38
    },
    {
      "val": "tran",
      "offset": 56
    },
    {
      "val": "lamtran",
      "offset": 75
    },
    {
      "val": "lam",
      "offset": 96
    }
  ],
  "location": "RegisterTest.selectInformationUser(String,String,String,String)"
});
formatter.result({
  "duration": 2495225500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.registerButton()"
});
formatter.result({
  "duration": 2265109600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.verifyRegisterSuccess()"
});
formatter.result({
  "duration": 39978900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lam",
      "offset": 45
    },
    {
      "val": "lam",
      "offset": 61
    }
  ],
  "location": "CommonTest.loginSuccessfully(String,String)"
});
formatter.result({
  "duration": 8004922700,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.management()"
});
formatter.result({
  "duration": 3251263600,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.loginAccount()"
});
formatter.result({
  "duration": 2068576900,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.logOut()"
});
formatter.result({
  "duration": 2041680800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Register unsuccessfully with blank field lastname",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-blank-field-lastname",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I input information are first name as \u003cfirstname\u003e, last name as \u003clastname\u003e, user name as \u003cusername\u003e, password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I verify register unsuccessfully with invalid information",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-blank-field-lastname;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password"
      ],
      "line": 26,
      "id": "register-page;register-unsuccessfully-with-blank-field-lastname;;1"
    },
    {
      "cells": [
        "Lam",
        "null",
        "lamtran",
        "lam"
      ],
      "line": 27,
      "id": "register-page;register-unsuccessfully-with-blank-field-lastname;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open website http://localhost:8080/demo/#!/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/demo/#!/login",
      "offset": 15
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 4525174600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Register unsuccessfully with blank field lastname",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-blank-field-lastname;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I input information are first name as Lam, last name as null, user name as lamtran, password as lam",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I verify register unsuccessfully with invalid information",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterTest.register()"
});
formatter.result({
  "duration": 2033390500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lam",
      "offset": 38
    },
    {
      "val": "null",
      "offset": 56
    },
    {
      "val": "lamtran",
      "offset": 75
    },
    {
      "val": "lam",
      "offset": 96
    }
  ],
  "location": "RegisterTest.selectInformationUser(String,String,String,String)"
});
formatter.result({
  "duration": 2305183100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.verifyRegisterUnSuccess()"
});
formatter.result({
  "duration": 26294400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Register unsuccessfully with account already exit",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-account-already-exit",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I input information are first name as \u003cfirstname\u003e, last name as \u003clastname\u003e, user name as \u003cusername\u003e, password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I click submit register",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify account already exit",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-account-already-exit;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password"
      ],
      "line": 36,
      "id": "register-page;register-unsuccessfully-with-account-already-exit;;1"
    },
    {
      "cells": [
        "Lam",
        "tran",
        "lamtran",
        "lam"
      ],
      "line": 37,
      "id": "register-page;register-unsuccessfully-with-account-already-exit;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open website http://localhost:8080/demo/#!/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/demo/#!/login",
      "offset": 15
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 4530644900,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Register unsuccessfully with account already exit",
  "description": "",
  "id": "register-page;register-unsuccessfully-with-account-already-exit;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I click register button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I input information are first name as Lam, last name as tran, user name as lamtran, password as lam",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I click submit register",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify account already exit",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterTest.register()"
});
formatter.result({
  "duration": 2036667800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lam",
      "offset": 38
    },
    {
      "val": "tran",
      "offset": 56
    },
    {
      "val": "lamtran",
      "offset": 75
    },
    {
      "val": "lam",
      "offset": 96
    }
  ],
  "location": "RegisterTest.selectInformationUser(String,String,String,String)"
});
formatter.result({
  "duration": 2371245600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.registerButton()"
});
formatter.result({
  "duration": 2265485100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.verifyAccount()"
});
formatter.result({
  "duration": 18563600,
  "status": "passed"
});
});