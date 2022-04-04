$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/operations/Divide.feature");
formatter.feature({
  "name": "Devide",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Devide by zero",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The Calculator page is loaded successfully",
  "keyword": "Given "
});
formatter.step({
  "name": "I devide \u003cfirstOperand\u003e by \u003csecondOperand\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I get the result \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstOperand",
        "secondOperand",
        "result"
      ]
    },
    {
      "cells": [
        "27",
        "20",
        "1.35"
      ]
    },
    {
      "cells": [
        "785",
        "25",
        "31.4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Devide by zero",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The Calculator page is loaded successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "Common.load_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I devide 27 by 20",
  "keyword": "When "
});
formatter.match({
  "location": "Devide.devide_by_zero(long,long)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the result 1.35",
  "keyword": "Then "
});
formatter.match({
  "location": "Common.check_result(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Devide by zero",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The Calculator page is loaded successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "Common.load_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I devide 785 by 25",
  "keyword": "When "
});
formatter.match({
  "location": "Devide.devide_by_zero(long,long)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the result 31.4",
  "keyword": "Then "
});
formatter.match({
  "location": "Common.check_result(String)"
});
formatter.result({
  "status": "passed"
});
});