$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/dojo/US005_AttaquerVillage.feature");
formatter.feature({
  "name": "US005_AttaquerVillage",
  "description": "\tEn tant que Chef de Village\n\tJe veux pouvoir attaquer des villages\n\tAfin de les conqu�rir",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Attaquer un village ennemi",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "le village Oto",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je l attaque",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il apparait dans les villages conquis",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il n apparait pas dans les villages ennemis",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Attaquer un village non ennemi",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "le village Suna",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "j attaque Suna",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il n apparait pas dans les villages conquis",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Attaquer un village",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "un village \"\u003cvillage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "je l attaque",
  "keyword": "When "
});
formatter.step({
  "name": "il apparait dans les villages conquis [\u003clisteVillagesConquis\u003e]",
  "keyword": "Then "
});
formatter.step({
  "name": "il n apparait pas dans les villages ennemis [\u003clisteVillagesEnnemis\u003e]",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "village",
        "listeVillagesconquis",
        "listeVillagesEnnemis"
      ]
    },
    {
      "cells": [
        "oto",
        "[oto]",
        "[]"
      ]
    },
    {
      "cells": [
        "suna",
        "[]",
        "[]"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Attaquer un village",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "un village \"oto\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je l attaque",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il apparait dans les villages conquis [\u003clisteVillagesConquis\u003e]",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il n apparait pas dans les villages ennemis [[]]",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Attaquer un village",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "un village \"suna\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "je l attaque",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il apparait dans les villages conquis [\u003clisteVillagesConquis\u003e]",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "il n apparait pas dans les villages ennemis [[]]",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});