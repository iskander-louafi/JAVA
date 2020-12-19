
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

public class Abonnement {

    private Abonne abonne;
    private Forfait forfait;

    //Constructeur avec paramètres
    public Abonnement(Abonne abonne, Forfait forfait){

        this.abonne = abonne;
        this.forfait = forfait;

    }

    //Abonné
    public void setAbonne(Abonne abonne){

        this.abonne = abonne;

    }

    public Abonne getAbonne(){

        return abonne;
    }

    //Forfait
    public void setForfait(Forfait forfait){

        this.forfait = forfait;

    }

    public Forfait getForfait(){

        return forfait;
    }
} // Abonnement
