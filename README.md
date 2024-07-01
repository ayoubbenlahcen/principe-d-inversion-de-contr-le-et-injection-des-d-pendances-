
                              Notre application vise à explorer les deux principes fondamentaux d'inversion de contrôle et d'injection de dépendances en Java.
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


1) Voici l'architecture de la partie 1 de TP1, qui consiste à réaliser l'injection des dépendances de manière classique, c'est-à-dire sans utiliser le Framework Spring. Nous avons tenté de le faire de deux manières :

Méthode statique : Par instanciation des objets DaoImpl et MetierImpl dans la classe principale à l'aide de l'opérateur new.
Méthode dynamique : Par instanciation dynamique en utilisant un fichier texte de configuration. Ce fichier permet la localisation des classes DAO qui implémentent IDao (une interface) et Metier (qui implémente également l'interface IMetier).
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/e4b9d89b-6751-4e09-8501-0e3dcbfa7fb8)

2) Commençons par l'injection des dépendances en utilisant la méthode statique :
   
  2.1) Voici l'interface IDao :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/f0724fbb-ffec-4e64-ac74-300675ec2fba)
   
       2.2) Voici la classe DaoImpl, qui est considérée comme une version de service web  :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/8485a884-e20c-4896-9fbc-dcd07d7dfed4)

   
       2.3) Voici la classe DaoImpl, qui est considérée comme une version de la base de données :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/08f35775-e193-49a4-977d-99efb14c44dd)

       2.4) Voici l'interface IMetier :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/efa5b390-06e6-4de5-b335-e660e259864e)
   
       2.5) Voici la classe MetierImpl où nous allons effectuer les traitements (le code métier):
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/43dd138d-8795-4a3a-8766-13d7417c41fb)
   
       Pour la partie présentation, nous avons créé deux classes principales , mais maintenant on va utliser une seul qui s'appel  Pres qui contient  la méthode main 

      2.5) Voici la classe Pres :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/b2849dee-0598-4ac0-bfff-5585c2faf340)
   
           # output :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/06cc7ed3-10ae-4d3d-a54c-3ebf10bad3c9)


   
   
3) Maintenant, nous allons réaliser l'injection des dépendances en utilisant la méthode dynamique: ******************************************************************************************************

       3.1) L'interface IDao est la même que celle utilisée pour DaoImpl et DaoImplV2.
       3.2) L'interface IMetier est la même que la précédente.
       3.3) Voici l'interface MetierImpl où nous allons effectuer les traitements (le code     métier):
   
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/43dd138d-8795-4a3a-8766-13d7417c41fb)
   
        3.4) Voici la classe Pres2 pour la partie présentation, où nous effectuons l'instanciation
dynamique des objets DAO et Metier à l'aide du fichier config.txt qui contient lalocalisation des classes DAO et Metier :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a66672b3-3b59-4fc0-82bc-ca98a9a9fc91)
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a6f2efdf-fa40-4475-8a14-f998fed1da7c)
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/29079eaa-ca86-4499-a0f1-36d45bfe95c9)

         # output :
      ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/3b362a1f-a677-4d42-a4bc-9061d02ca021)
   
      3.6) Voici le fichier de configuration config.txt :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/eb4206e7-b9b4-4f34-a366-6056b0900b62)


Maintenant, nous allons réaliser l'injection des dépendances en utilisant Spring :
### Remarque :
Pour intégrer Spring dans notre projet, nous avons choisi de créer un projet Maven dès le début, incluant un fichier de configuration pom.xml. Ce fichier spécifie les dépendances nécessaires pour que Spring fonctionne avec notre projet. 
Voici notre fichier de configuration :
                 ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/80c7d199-f38f-4e95-80be-114b6b23fe96)
                 ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/1cde3012-0376-42d9-8fe0-eb5aed6abddb)

   Pour faire cà, il y a deux façons :
   
4.1) La première méthode consiste à utiliser un fichier XML où nous indiquons à Spring d'effectuer l'injection des dépendances à l'aide du langage XML, un langage de balisage extensible utilisé pour structurer les données (nous utiliserons un fichier appelé config.xml situé dans le dossier des ressources).

4.1.1) Toutes les classes resteront inchangées par rapport à la partie précédente. Seule la partie présentation sera modifiée comme suit :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/25d69e53-7828-4ed0-b14c-5dc4ba2cb7c7)
            
         # output :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a583de94-2b79-47ba-bc40-e6feabab0b3f)
            
      4.1.2) Voici le fichier de configuration config.xml:
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/7531e149-d77e-4c72-9d4f-a8f8e69877ae)

4.2) La deuxième méthode consiste à utiliser les annotations pour l'injection des dépendances. Nous allons ajouter des annotations dans les classes que nous voulons injecter entre elles (dans notre cas, les classes DAO et Metier) de la manière suivante :

      4.2.1) Pour les classes DAO, à la fois DaoImpl et DaoImplV2, nous utiliserons des annotations pour l'injection des dépendances.
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/885a2cbb-2df6-42d9-9834-cfabfc40e440)
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/f2141a2a-b58a-47e7-b48e-61980e14f4da)
            
      4.2.2) Pour la classe MetierImpl :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/db2f250b-3185-46f7-b179-413a8d711cfb)
            
      4.2.3) Pour la classe Pres :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/0636baff-694b-42a7-887f-00f20b03aa66)
            
         # output :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/abff7bb5-425e-42d9-a59e-2feb5d563444)

Les points à retenir : 

   1) L'injection de dépendances est une pratique clé dans le développement d'applications Spring, offrant deux approches principales : l'injection par constructeur et l'utilisation de l'annotation @Autowired. L'injection par constructeur consiste à fournir les dépendances via le constructeur de la classe, rendant les dépendances explicites dès la création de l'objet. Cette méthode favorise l'immuabilité des objets et facilite les tests unitaires en permettant l'injection d'instances mock. D'autre part, l'annotation @Autowired permet à Spring d'injecter automatiquement les dépendances dans les champs, les méthodes setter ou les constructeurs marqués avec cette annotation, simplifiant ainsi le code en évitant la nécessité de déclarer explicitement les constructeurs pour les dépendances. Le choix entre ces deux approches dépend des préférences personnelles, de la structure de l'application et des conventions de codage de l'équipe de développement.


   2) Grâce au couplage faible permis par l'injection de dépendances dans Spring, notre application devient fermée à toute modification et ouverte à toute extension. En évitant un couplage fort (dépendance de classe), notre application devient plus maintenable et scalable.
   3) Pour une entreprise, cela signifie que son application pourrait ne pas être performante, ce qui pourrait conduire à son abandon ou à son retrait du marché.=====>(On le met à la poubelle).
   
![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/29617c67-f33c-467a-8a2b-5ca3dbcc9518)
