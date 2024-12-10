# UCE Génie Logiciel Avancé : Techniques de tests

# Nom du Projet

**Nom :** Samy SEGHIR

**Groupe :** Alternant

**Badge CircleCI :**
[![CircleCI](https://dl.circleci.com/status-badge/img/gh/SEGHIRSamy/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/SEGHIRSamy/ceri-m1-techniques-de-test/tree/master)

**Badge Codecov :**
[![codecov](https://codecov.io/github/SEGHIRSamy/ceri-m1-techniques-de-test/graph/badge.svg?token=DMDH1H58MR)](https://codecov.io/github/SEGHIRSamy/ceri-m1-techniques-de-test)


**Badge Checkstyle :**
![Checkstyle](https://img.shields.io/badge/checkstyle-passing-brightgreen)


## Revue de code pour la Team Rocket 

**Erreurs relevées**
- Le code n'est pas commenté 
- Il reste un TODO
- Pas de gestions des excepetions
- Il n'y a pas de limite sur les statistiques


**Modificationn nécessaire de la classe de test :**
- Les tests originaux ont fonctionnés à moitié sur la nouvelle implémentation, 2/4 sont passés.
- Les tests existants ont été modifiés pour s'adapter à l'implémentation de la Team Rocket, qui ne gère pas les exceptions comme l'implémentation originale. 
- Les tests originaux incluaient la gestion des exceptions, ce qui n'était pas compatible avec l'implémentation de la Team Rocket. Ces parties ont été supprimées pour assurer la compatibilité.


## Introduction

Vous allez à travers ces projet mettre en application une partie des aspects évoqués en cours vis à vis des techniques de tests.  
Pour cela nous allons réaliser un projet logiciel de petite taille, en suivant la roadmap suivante : 
- Setup du projet
- Mise en place des outils d’intégration continue
- Écriture des tests unitaires
- Écriture des mocks, et validation des tests
- Développement dirigé par les tests
- Documentation et conventions de style
- Test d'une implémentation donnée

Durant cette série de TPs, le gestionnaire de version Git sera utilisé à foison, à travers la plateforme GitHub. Si vous n’êtes pas à l’aise avec cet outil[^1], [voici](http://rogerdudler.github.io/git-guide/) un petit guide à garder sous la main.

## Sujets

L'ensemble des sujets de TPs peut être trouvé dans le dossier `TPs`.

Le dossier `src` contient la définition de l'ensemble des interfaces qui seront l'objet de vos travaux.

## Rendus

Le rendu des TPs se fait au rythme suivant :

- TP1 : 2ème séance
- TP2 : 2ème séance
- TP3 : 3ème séance
- TP4 : 5ème séance
- TP5 : dernière séance
- TP6 : dernière séance

Pour chaque rendu vous devez créer un tag à partir du commit qui correspond à la complétion du TP.  
Si vous ne spécifiez pas de tag, le dernier commit à la date-heure de la fin de séance sera celui considéré.

[^1]: Si vous n’êtes vraiment pas à l’aise avec cet outil nous vous conseillons quand même vivement de vous y mettre.
