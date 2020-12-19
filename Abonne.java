
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

public class Abonne {

    private String nom;
    private String prenom;
    private String telephone;
    private String courriel;
    private String adresse;

    //Constructeur avec paramètres
    public Abonne(String nom, String prenom, String telephone, String courriel, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.courriel = courriel;
        this.adresse = adresse;

    }

    //Nom
    public void setNom(String nom){
        this.nom = nom;

    }

    public String getNom(){

        return nom;

    }

    //Prenom
    public void setPrenom(String prenom){
        this.prenom = prenom;

    }

    public String getPrenom(){

        return prenom;

    }

    //Telephone
    public void setTelephone(String telephone){
        this.telephone = telephone;

    }

    public String getTelephone(){

        return telephone;

    }
    
    //Courriel
    public void setCourriel(String courriel){
        this.courriel = courriel;

    }

    public String getCourriel(){

        return courriel;

    }
    
    //Adresse
    public void setAdresse(String adresse){
        this.adresse = adresse;

    }

    public String getAdresse(){

        return adresse;

    }
} // Abonne