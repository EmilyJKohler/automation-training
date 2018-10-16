$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "Basic navigation",
  "description": "",
  "id": "basic-navigation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navifation to Gov UK",
  "description": "",
  "id": "basic-navigation;navifation-to-gov-uk",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "A user navigates to Gov UK",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "They will be on the correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.scala:8"
});
formatter.result({
  "duration": 153945867,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.scala:13"
});
formatter.result({
  "duration": 45849,
  "status": "passed"
});
});