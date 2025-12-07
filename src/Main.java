import java.util.Scanner;

public class Main {
    
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" \n /////   SYSTÈME DE GESTION DE POUBELLES  /////  ");
        boolean a = true;
        
        while (a) {
            System.out.println("\nQui êtes-vous ?:");
            System.out.println("1] Collectivite");
            System.out.println("2] Entreprise chargé de la collecte ");
            System.out.println("3] Se deconnecter");
            System.out.print("Quelle option choisissez-vous ? : ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    menu_collectivite.afficherMenu();
                    break;
                case 2:
                    menu_entreprise.afficherMenu();
                    break;
                case 3:
                    a = false;
                    break;
                default:
                    System.out.println("\n Erreur.\n");
            }
        }
        scanner.close();
    }

}
