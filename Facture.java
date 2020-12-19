
/**
 * Université du Québec à Montréal (UQAM)
 * INF1120 - Groupe 20 - Été 2019
 * 
 * Classe ApplicationPrincipale contient les méthodes d’affichage de menus, 
 * de saisies et de validations. Également elle contient la méthode "main"
 *
 * Michael Plasse-Laflamme et Iskander Louafi
 * 16 juillet 2019
 *
 */

public class Facture {

    private Abonnement abonnement;
 

    //Constructeur avec paramètres
    public Facture(Abonnement abonnement){

        this.abonnement = abonnement;

    }

    //Abonnement
    public void setAbonnement(Abonnement abonnement){

        this.abonnement = abonnement;

    }

    public Abonnement getAbonnement(){

        return abonnement;
    }

    //Calcul du montant de la TPS
    public double montantTPS(double prix, double TAUX_TPS){
        double TPS;

        TPS = prix * TAUX_TPS;
        return TPS;
    }

    //Calcul du montant de la TVQ
    public double montantTVQ(double prix, double TAUX_TVQ){
        double TVQ;

        TVQ = prix * TAUX_TVQ;
        return TVQ;
    }

    //Calcul du montant total
    public double montantTotal(double prix, double montantTPS, double montantTVQ){

        double total;

        total = prix + montantTPS + montantTVQ;

        return total;

    }

    //Affichage de la facture
    public static void affichageFacture(String nomEntreprise, String adresseEntreprise, String telephoneEntreprise,String dateHeure, int numeroFacture, String nom, String prenom, String telephone, String courriel, String adresse, String description, double prix, double TPS, double TVQ, double total, String messageMerci)
    {

        System.out.println("                                           " + nomEntreprise);
        System.out.println(adresseEntreprise + "                                                           " + telephoneEntreprise);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Date et Heure : " + dateHeure + "                               Facture No : " + numeroFacture);
        System.out.println("");
        System.out.println("Nom et Prénom : " + nom + " " + prenom + "                 Courriel : " + courriel);
        System.out.println("Adresse : " + adresse + "                   Téléphone : " + telephone);
        System.out.println("");
        System.out.println("Description" + "                                                                              Prix");
        System.out.print(description + "          ");
        System.out.print("$");
        System.out.printf("%4.2f", prix);
        System.out.println("");
        System.out.println("");
        System.out.print("Montant TPS       ");
        System.out.print("$");
        System.out.printf("%4.2f", TPS);
        System.out.println("");  
        System.out.print("Montant TVQ       ");
        System.out.print("$");
        System.out.printf("%4.2f", TVQ);
        System.out.println("");            
        System.out.print("Montant total     ");
        System.out.print("$");
        System.out.printf("%4.2f", total);
        System.out.println("");
        System.out.println("");
        System.out.println(messageMerci);

    }
} // Facture
