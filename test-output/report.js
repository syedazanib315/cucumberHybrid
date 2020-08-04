$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/contactPage.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want add customer",
  "description": "",
  "id": "as-a-user-i-want-add-customer",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#    Scenario : Valid users should be able to login"
    },
    {
      "line": 3,
      "value": "#\tGiven I am on techFios site"
    },
    {
      "line": 4,
      "value": "#\tWhen  I enter username and password"
    },
    {
      "line": 5,
      "value": "#\tAnd   I click on sign in button"
    },
    {
      "line": 6,
      "value": "#\tThen Dashboard page should display"
    }
  ],
  "line": 7,
  "name": "User should be able to Add Contact",
  "description": "",
  "id": "as-a-user-i-want-add-customer;user-should-be-able-to-add-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "A user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User goes to CRM Add Contact Page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Contact Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User fill in the Add Contact \"\u003cfullName\u003e\" \"\u003ccompany\u003e\" \"\u003cemail\u003e\" \"\u003cphoneNum\u003e\" \"\u003caddress\u003e\" \"\u003ccity\u003e\" \"\u003cstate\u003e\"\"\u003czip\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Created contact will be dispalyed",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-add-customer;user-should-be-able-to-add-contact;",
  "rows": [
    {
      "cells": [
        "fullName",
        "company",
        "email",
        "phoneNum",
        "address",
        "city",
        "state",
        "zip"
      ],
      "line": 14,
      "id": "as-a-user-i-want-add-customer;user-should-be-able-to-add-contact;;1"
    },
    {
      "cells": [
        "Syeda Zanib",
        "Techfios",
        "sz@techfios.com",
        "2013334456",
        "33 Williams Ave",
        "Jersey City",
        "NJ",
        "07307"
      ],
      "line": 15,
      "id": "as-a-user-i-want-add-customer;user-should-be-able-to-add-contact;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7852775700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should be able to Add Contact",
  "description": "",
  "id": "as-a-user-i-want-add-customer;user-should-be-able-to-add-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "A user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User goes to CRM Add Contact Page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Contact Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User fill in the Add Contact \"Syeda Zanib\" \"Techfios\" \"sz@techfios.com\" \"2013334456\" \"33 Williams Ave\" \"Jersey City\" \"NJ\"\"07307\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Created contact will be dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddContactSteps.a_user_logged_in()"
});
formatter.result({
  "duration": 2094812100,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.user_goes_to_CRM_Add_Contact_Page()"
});
formatter.result({
  "duration": 1741685100,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.contact_Page_should_display()"
});
formatter.result({
  "duration": 13908000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Syeda Zanib",
      "offset": 30
    },
    {
      "val": "Techfios",
      "offset": 44
    },
    {
      "val": "sz@techfios.com",
      "offset": 55
    },
    {
      "val": "2013334456",
      "offset": 73
    },
    {
      "val": "33 Williams Ave",
      "offset": 86
    },
    {
      "val": "Jersey City",
      "offset": 104
    },
    {
      "val": "NJ",
      "offset": 118
    },
    {
      "val": "07307",
      "offset": 122
    }
  ],
  "location": "AddContactSteps.user_fill_in_the_Add_Contact(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2108854400,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.created_contact_will_be_dispalyed()"
});
formatter.result({
  "duration": 1242614500,
  "status": "passed"
});
});