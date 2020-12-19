
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

public class Forfait {

    private int identifiant;
    private String description;
    private double prix;

    //Constructeur avec paramètres
    public Forfait(int identifiant, String description, double prix){

        this.identifiant = identifiant;
        this.description = description;
        this.prix = prix;

    }

    //Identifiant
    public void setIdentifiant(int identifiant){

        this.identifiant = identifiant;

    }

    public int getIdentifiant(){

        return identifiant;
    }

    //Description
    public void setDescription(String description){

        this.description = description;

    }

    public String getDescription(){

        return description;
    }

    //Prix
    public void setPrix(double prix){

        this.prix = prix;

    }

    public double getPrix(){

        return prix;
    }
} // Forfait
