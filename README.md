![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a2edbdbe-3e1a-4a8c-98cf-6be9dee23538)![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/25d544d2-9ed0-4478-b0f2-4b01d7a584aa)


                              Notre application vise à explorer les deux principes fondamentaux d'inversion de contrôle et d'injection de dépendances en Java.
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


1) Voici l'architecture de la partie 1 de TP1 qui consiste à faire l'injection des dépendances de manière classique, autrement dit sans utiliser le Framework Spring. Tel que nous avons essayé de le faire de deux façons :
La première est statique, c'est-à-dire à l'aide de l'instanciation des objets DaoImpl et MetierImpl dans la classe prés (à l'aide de l'opérateur new).

La deuxième est dynamique, à l'aide de l'instanciation dynamique tout en utilisant un fichier texte de configuration où l'on fait la localisation des classes DAO
qui implémentent IDao (qui est une interface) et Metier (qui implémente aussi l'interface IMetier).
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/e4b9d89b-6751-4e09-8501-0e3dcbfa7fb8)

2) Commencant par l'injection des dépendances en utilisant la manière statique :
   
        2.1) Voici l'interface IDao :
             ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/f0724fbb-ffec-4e64-ac74-300675ec2fba)
   
       2.2) Voici la classe DaoImpl qui est considérée comme une version de la base de données :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/8485a884-e20c-4896-9fbc-dcd07d7dfed4)

   
       2.3) Voici la classe DaoImpl qui est considérée comme une version de la base de données :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/08f35775-e193-49a4-977d-99efb14c44dd)

       2.4) Voici l'interface IMetier :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/efa5b390-06e6-4de5-b335-e660e259864e)
   
       2.5) Voici l'interface MetierImpl où nous allons effectuer les traitements (le code métier) :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/43dd138d-8795-4a3a-8766-13d7417c41fb)
   
       pour  la partir presentation on a faire 2 calsse pres  qui va contenier la methode main 

      2.5) Voici la classe Pres :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/b2849dee-0598-4ac0-bfff-5585c2faf340)
   
           # output :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/06cc7ed3-10ae-4d3d-a54c-3ebf10bad3c9)


   
   
3) Maintenant en va faire l'injection des dependances en utlilisant la manier dynamique :******************************************************************************************************

       3.1)l'interface IDao, c'est la même aussi la daoImpl et  doaImplV2.
   
       3.2) l'interface IMetier, c'est la même que la première.

       3.3) Voici l'interface MetierImpl où nous allons effectuer les traitements (le code métier) :
   
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/43dd138d-8795-4a3a-8766-13d7417c41fb)
   
      Pour la partie présentation, nous avons créé une deuxième classe Pres2 qui va contenir la méthode main
      et qui est différente de la première. Dans cette dernière, nous allons effectuer l'instanciation dynamique des objets DAO et aussi Metier, mais à l'aide d'un fichier config.txt qui va contenir la localisation des classes DAO et Metier:

      3.5) Voici la classe Pres2 :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a66672b3-3b59-4fc0-82bc-ca98a9a9fc91)
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a6f2efdf-fa40-4475-8a14-f998fed1da7c)
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/29079eaa-ca86-4499-a0f1-36d45bfe95c9)

         # output :
      ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/3b362a1f-a677-4d42-a4bc-9061d02ca021)
   
      3.6) Voici le fichier de configuration config.txt :
            ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/eb4206e7-b9b4-4f34-a366-6056b0900b62)


4) Maintenant, nous allons faire l'injection des dépendances en utilisant Spring :
    Remarque :
              Pour intégrer Spring dans votre projet, nous choisissons de créer dès le début un projet Maven qui contient un fichier de configuration (pom.xml)
              où nous allons spécifier les configurations nécessaires pour que Spring fonctionne avec nous dans ce projet (je parle des dépendances).
              Voici notre fichier de configuration :
                 ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/80c7d199-f38f-4e95-80be-114b6b23fe96)
                 ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/1cde3012-0376-42d9-8fe0-eb5aed6abddb)

   Pour faire cela, il y a deux façons :
   
4.1) La première est à l'aide d'un fichier XML où nous allons indiquer à Spring de faire l'injection des dépendances à l'aide du langage XML, qui est un langage de balisage
     extensible utilisé pour structurer les données (nous allons utiliser un fichier appelé config.xml qui existe dans le dossier ressources).
     
      4.1.1) Nous laisserons toutes les classes sans changement comme dans la partie précédente, seulement la partie présentation va être modifiée comme suit :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/25d69e53-7828-4ed0-b14c-5dc4ba2cb7c7)
            
         # output :
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/a583de94-2b79-47ba-bc40-e6feabab0b3f)
            
      4.1.2) Voici le fichier de configuration config.xml:
   ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/7531e149-d77e-4c72-9d4f-a8f8e69877ae)

4.2) La deuxième méthode est à l'aide de la méthode d'annotation, où nous allons ajouter des annotations dans les classes que nous voulons injecter entre elles (dans notre cas, les classes DAO et Metier) de la manière suivante :

      4.2.1) Pour les classes DAO, à la fois DaoImpl et DaoImplV2 :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/885a2cbb-2df6-42d9-9834-cfabfc40e440)
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/f2141a2a-b58a-47e7-b48e-61980e14f4da)
            
      4.2.2) Pour la classe MetierImpl :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/db2f250b-3185-46f7-b179-413a8d711cfb)
            
      4.2.3) Pour la classe Pres :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/0636baff-694b-42a7-887f-00f20b03aa66)
            
         # output :
  ![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/abff7bb5-425e-42d9-a59e-2feb5d563444)

Les points à retenir : 

   1) L'injection de dépendances est une pratique clé dans le développement d'applications Spring, offrant deux approches principales : 
   l'injection par constructeur et l'utilisation de l'annotation @Autowired. 
   L'injection par constructeur consiste à fournir les dépendances via le constructeur de la classe, 
   rendant les dépendances explicites dès la création de l'objet. Cette méthode favorise l'immuabilité des objets 
   et facilite les tests unitaires en permettant l'injection d'instances mock. D'autre part, l'annotation @Autowired 
   permet à Spring d'injecter automatiquement les dépendances dans les champs, les méthodes setter ou les constructeurs marqués avec cette annotation, 
   simplifiant ainsi le code en évitant la nécessité de déclarer explicitement les constructeurs pour les dépendances.
   Le choix entre ces deux approches dépend des préférences personnelles, de la structure de l'application et des conventions de codage de l'équipe de développement.


   2) Grâce au couplage faible, nous parvenons à faire l'injection des dépendances dans Spring, 
   ce qui nous permet de rendre notre application fermée à n'importe quelle modification et ouverte à n'importe quelle extension. 
   Si nous essayons de le faire avec un couplage fort (dépendance de classe), notre application pourrait fonctionner, mais elle serait difficile à maintenir. 
   Pour une entreprise, cela signifie que votre application ne sera pas performante, 
   ce qui peut conduire à son abandon, c'est-à-dire à son retrait du marché =====>(On le met à la poubelle).
   
![image](https://github.com/ayoubbenlahcen/principe-d-inversion-de-contr-le-et-injection-des-d-pendances-/assets/152870306/29617c67-f33c-467a-8a2b-5ca3dbcc9518)


