//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Démarrage du programme \n");



        //MENU ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        boolean menu1 = true;


        while (menu1 == true){
            System.out.println("Bienvenue dans le menu !\n" +"Déclinez votre identitée :");
            System.out.println("1. Collectivité (Mairie, Agglomération)");
            System.out.println("2. Entreprise de collecte");
            System.out.println("0. Quitter le programme");
            System.out.print("Votre choix : ");

            int choixUtilisateur = scanner.nextInt();
            System.out.println();

            switch (choixUtilisateur) {
                case 1:
                    //afficherMenuCollectivite(scanner);
                    break;
                case 2:
                    //afficherMenuEntreprise(scanner);
                    break;
                case 0:
                    System.out.println("Fermeture du programme.");
                    menu1 = false;
                    break;
                default:
                    System.out.println("Choix invalide, réessayer.\n");
            }
        }
        scanner.close();
    }



    
    // sous menu collectivité
    
    private static void afficherMenuCollectivite(Scanner scanner) {
        boolean retour = false;
        while (!retour) {
            System.out.println("ESPACE COLLECTIVITÉ ");
            System.out.println("1. Soumettre un plan / Charger un graphe");
            System.out.println("2. Signaler des travaux (modifier le graphe)");
            System.out.println("3. Consulter les statistiques de collecte");
            System.out.println("0. Retour au menu principal");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("");
                    // Appeler méthode de création de graphe ici
                    break;
                case 2:
                    System.out.println("");
                    // Appeler méthode de mise à jour du graphe
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 0:
                    retour = true;
                    System.out.println();
                    break;
                default:
                    System.out.println("Choix est invalide.\n");
            }
        }
    }


    
    // SOUS-MENU ENTREPRISE

    
    private static void afficherMenuEntreprise(Scanner scanner) {
        boolean retour = false;
        while (!retour) {
            System.out.println("--- ESPACE ENTREPRISE DE COLLECTE ---");
            System.out.println("1. Calculer une tournée optimale (Voyageur de commerce / MST)");
            System.out.println("2. Planifier les jours de collecte (Coloration)");
            System.out.println("3. Gérer la flotte de camions");
            System.out.println("0. Retour au menu principal");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(">> Lancement de l'algorithme MST / Shortcutting...\n");
                    // Appeler votre classe Kruskal ou Prim ici
                    break;
                case 2:
                    System.out.println(">> Lancement de l'algorithme de Coloration (Welsh & Powell)...\n");
                    //  Appeler votre algorithme de coloration ici
                    break;
                case 3:
                    System.out.println(">> Gestion des capacités des camions...\n");
                    break;
                case 0:
                    retour = true;
                    System.out.println();
                    break;
                default:
                    System.out.println("Choix est invalide.\n");
            }
        }
    }
}

