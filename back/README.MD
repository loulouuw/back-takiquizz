# Lancer le Backend

Suivez les étapes ci-dessous pour configurer et démarrer le backend de l'application.

## 1. Démarrer les services Docker

Ouvrez un terminal à la racine du projet et lancez la commande suivante pour démarrer tous les services définis dans le fichier `docker-compose.yml` :


docker compose up

---

## 2. Configurer la base de données PostgreSQL

Une fois les services lancés, ouvrez l'onglet **Database**

- Sélectionnez **PostgreSQL** comme moteur de base de données.
- Utilisez les identifiants suivants pour vous connecter :
    - **Utilisateur** : `TakiAdmin`
    - **Mot de passe** : `Takidata`
    - **Base de données** : `TakiBase`

---

## 3. Exécuter les scripts SQL


- **Exécutez le fichier** `1_TABLES.sql` pour créer la structure de la base de données.
- **Exécutez le fichier** `2_DEFAULT_ENTRIES.sql` pour insérer les entrées par défaut dans la base.


---

## 4. Lancer le Backend

Enfin, vous pouvez démarrer l'application backend en exécutant  `BackSkeletonApplication` 

---


