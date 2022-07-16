# projetEncheres
ProjetEni




Dans eclipse : bandeau de droite, dossier serveur, ouvrir l'arborescence du serveur dans lequel sera déployé le projet
Ouvrir server.xml :

Rechercher 8080 et LES remplacer par 80.
Ca permettra de faire disparaitre le ":8080" de l'url.
Ensuite recherchez : "path=" vous tomberez sur du XML disant ceci :
<Context docBase="Referentiel" path="/XXXXXXX" ...
XXXXXXX etant le nom du projet, supprimez le nom du projet pour ne laisser que le slash dans les guillemets de path :
<Context docBase="Referentiel" path="/" ...
Sauvegardez. Fermez.
