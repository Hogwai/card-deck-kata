# Card deck kata

## Parties

### Partie 1

Réalisation d’une application console permettant de créer une structure de données dynamique représentant les cartes d’un jeu de carte (52 cartes, 4 couleurs, 13 cartes par couleur – de as à Roi). Le programme doit afficher dans la console les 52 cartes après initialisation.
L’utilisation de Maven, log4j2 est appréciée.

### Partie 2

Utiliser le modèle de données de la partie 1 pour produire un code de gestion en Base de Données des instances créées à partir de ce modèle. Utiliser la fonctionnalité d’insertion pour insérer toutes les cartes dans la base de données.
L’utilisation de Spring, Hibernate, et Junit est appréciée.

### Partie 3

Réalisation d’une application Web mettant en oeuvre les parties 1 et 2 pour afficher les cartes présentes en base de données dans la page Web.


## Installation
### Prérequis
- Node.js
- npm
- Angular 11
- PostgreSQL 12
- Java 12
- Maven

### Étapes
Cloner le projet sur son poste

#### Partie 1
Se rendre le dossier et installer les dépendances java:
```
$ cd card-deck-console
$ mvn clean install
```
Lancer le programme:
```
$ mvn spring-boot:run
```

#### Partie 2
Créer une base de données nommée 'card-deck-kata' dans PostgreSQL
```
CREATE DATABASE test
WITH
OWNER = postgres
ENCODING = 'UTF8'
CONNECTION LIMIT = -1;
```
Se rendre le dossier et installer les dépendances java:
```
$ cd card-deck-persistence
$ mvn clean install
```

Lancer le programme:
```
$ mvn spring-boot:run
```

Lancer les tests:
```
$ mvn test
```
#### Partie 3
Créer un schéma nommé 'card-deck-kata' dans PostgreSQL s'il n'existe pas déjà

Se rendre le dossier et installer les dépendances java:
```
$ cd card-deck-webapp
$ mvn clean install
```

Lancer le programme:
```
$ mvn spring-boot:run
```

Se rendre dans le dossier frontend (src/main/frontend) et lancer Angular:
```
$ cd src/main/frontend
$ ng serve
```

Ouvrir son navigateur et se rendre à l'adresse suivante:
```
http://localhost:4200/
```

