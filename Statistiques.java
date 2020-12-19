import java.io.*;
/**
 *
 * Université du Québec à Montréal (UQAM)
 * INF1120 - Groupe 20 - Été 2019
 *
 * Classe Statistiques contient toutes les informations de statistiques d'abonnement.
 * Lecture du fichier "StatistiquesAbonnes.txt" pour charger le tableau de statistiques dès le
 * démarrage du programme et écriture dans le fichier "StatistiquesAbonnes.txt" à la sortie du
 * programme. Lors de l'écriture,le contenu existant doit être écrasé.
 *
 * Michael Plasse-Laflamme et Iskander Louafi
 * 16 juillet 2019
 *
 */
public class Statistiques {

    private static final String NOM_FICHIER ="StatistiquesAbonnes.txt";
    private static int tableauStatistiques [] = new int [5];

    public static void lire() {
        FileReader fluxConnecteur;
        BufferedReader fluxTampon;
        try{
            fluxConnecteur = new FileReader(NOM_FICHIER);
            fluxTampon = new BufferedReader(fluxConnecteur);

            fluxTampon.readLine();
            String ligne15 [] = fluxTampon.readLine().split("\\|");
            String ligne20 [] = fluxTampon.readLine().split("\\|");
            String ligne30 [] = fluxTampon.readLine().split("\\|");
            String ligne60 [] = fluxTampon.readLine().split("\\|");
            String ligne120 [] = fluxTampon.readLine().split("\\|");

            tableauStatistiques [0] = Integer.parseInt(ligne15 [1]);
            tableauStatistiques [1] = Integer.parseInt(ligne20 [1]);
            tableauStatistiques [2] = Integer.parseInt(ligne30 [1]);
            tableauStatistiques [3] = Integer.parseInt(ligne60 [1]);
            tableauStatistiques [4] = Integer.parseInt(ligne120 [1]);

            fluxConnecteur.close();
            fluxTampon.close();

        }
        catch(FileNotFoundException e1){

            System.out.println("Fichier introuvable.");

        }
        catch(IOException e2){

            System.out.println("Erreur d'entré/sortie.");

        }
    }

    public static void ecrire() {
        PrintWriter fluxPrintWriter;

        try{
            fluxPrintWriter = new PrintWriter(NOM_FICHIER);

            fluxPrintWriter.println("IdentifiantForfait|NombreAbonnés");
            fluxPrintWriter.println("15|" + tableauStatistiques [0]);
            fluxPrintWriter.println("20|" + tableauStatistiques [1]);
            fluxPrintWriter.println("30|" + tableauStatistiques [2]);
            fluxPrintWriter.println("60|" + tableauStatistiques [3]);
            fluxPrintWriter.println("120|" + tableauStatistiques [4]);

            fluxPrintWriter.close();
        }
        catch(IOException e){

            System.out.println("Erreur d'entré/sortie.");

        }

    }

    public static void incrementerNbAbonnes(int identifiant) {
        switch(identifiant){
            case 15:
            tableauStatistiques [0] = tableauStatistiques [0] + 1;
            break;

            case 20:
            tableauStatistiques [1] = tableauStatistiques [1] + 1;
            break;

            case 30:
            tableauStatistiques [2] = tableauStatistiques [2] + 1;
            break;

            case 60:
            tableauStatistiques [3] = tableauStatistiques [3] + 1;
            break;

            case 120:
            tableauStatistiques [4] = tableauStatistiques [4] + 1;
            break;

        }
    }

    //Affichage du nombre d'abonnées par forfait
    public static void afficher(String nomEntreprise, String adresseEntreprise, String telephoneEntreprise, String dateHeure, String description15, String description20, String description30, String description60, String description120){
        System.out.println("                                      " + nomEntreprise);
        System.out.println("");
        System.out.println(adresseEntreprise + "                 " + telephoneEntreprise + "              " + "Date et Heure : " + dateHeure);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Description des forfaits                                                         Nombre d'abonnées");
        System.out.println(description15 + "           " + tableauStatistiques [0]);
        System.out.println(description20 + "           " + tableauStatistiques [1]);
        System.out.println(description30 + "           " + tableauStatistiques [2]);
        System.out.println(description60 + "           " + tableauStatistiques [3]);
        System.out.println(description120 + "         " + tableauStatistiques [4]);

    }
    
    //Nombre total d'abonnements
    public static int nbTotalAbonnes(){
        int total;
        
        total = tableauStatistiques[0] + tableauStatistiques[1] + tableauStatistiques[2] + tableauStatistiques[3] + tableauStatistiques[4];
    
        return total;
    }
    
}
