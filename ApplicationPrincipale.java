import java.util.Date;
import java.text.SimpleDateFormat;
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
public class ApplicationPrincipale {
    //Déclaration des constantes
    static final String MSG_BIENVENUE = "Bienvenue chez IPT. Avec ce service, vous serez en mesure d'effectuer la facturation d'un abonnement, de visualiser votre facture ainsi que le nombre d'abonnés de tous les forfaits à tout moment.";
    static final String CHOIX1 = "0. Quitter";
    static final String CHOIX2 = "1. Facturation d'un abonnement";
    static final String CHOIX3 = "2. Nombre d'abonnés de tous les forfaits";
    static final String DES15 = "Internet Fibre hybride 15 - Téléchargement = 15Mb/s et téléversement = 10Mb/s";
    static final String DES20 = "Internet Fibre hybride 20 - Téléchargement = 20Mb/s et téléversement = 10Mb/s";
    static final String DES30 = "Internet Fibre hybride 30 - Téléchargement = 30Mb/s et téléversement = 10Mb/s";
    static final String DES60 = "Internet Fibre hybride 60 - Téléchargement = 60Mb/s et téléversement = 10Mb/s";
    static final String DES120 = "Internet Fibre hybride 120 - Téléchargement = 120Mb/s et téléversement = 20Mb/s";
    static final double PRIX15 = 25.05;
    static final double PRIX20 = 35.80;
    static final double PRIX30 = 41.95;
    static final double PRIX60 = 46.75;
    static final double PRIX120 = 65.20;
    static final int NUM1 = 15;
    static final int NUM2 = 20;
    static final int NUM3 = 30;
    static final int NUM4 = 60;
    static final int NUM5 = 120;
    static final double TPS = 0.05;
    static final double TVQ = 0.09975;
    static final String NOM_ENTREPRISE = "Internet Pour Tous (IPT)";
    static final String ADRESSE_ENTREPRISE = "1500 Bellevue, Beloeil, QC";
    static final String TELEPHONE_ENTREPRISE = "514-447-0555";
    static final String MSG_MERCI = "Merci et à la prochaine!";
    static final String CHOISI_ENTREPRISE = "Merci d'avoir choisi IPT!";

    //Déclaration des variables
    static int noFacture;
    static int compteur15 = 0;
    static int compteur20 = 0;
    static int compteur30 = 0;
    static int compteur60 = 0;
    static int compteur120 = 0;

    //Affichage du message de bienvenue
    public static void affichageMessageBienvenue(){

        System.out.println(MSG_BIENVENUE);

    }

    //Affichage du menu
    public static void affichageMenu(){
        System.out.println("Veuillez choisir l'une des trois options suivantes.");

        System.out.println(CHOIX1);
        System.out.println(CHOIX2);
        System.out.println(CHOIX3);

    }

    //Saisie et validation du choix de forfait
    public static int saisieValidationChoix(){
        int reponse = 10;
        boolean isCorrect;
        do{
            isCorrect = true;
            try{
                reponse = Clavier.lireInt();

                while(!(reponse == 0 || reponse == 1 || reponse == 2)){
                    System.out.println("Choix du menu invalide!");
                    reponse = Clavier.lireInt();

                }
            }
            catch(NumberFormatException e){

                System.out.println("Le format de votre choix est invalide.");
                isCorrect = false;
            }
        }while(isCorrect == false);
        return reponse;
    }

    //Saisie et validation du nom de l'abonné
    public static String saisieValidationNom(){
        String reponse;
        String nom;
        boolean isCorrect;
        
        System.out.println("Veuillez entrer votre nom.");
        reponse = Clavier.lireString();
        nom = reponse.trim();

        do{
            isCorrect = true;
            if(nom.length() < 2 || nom.length() > 30){

                isCorrect = false;

            }
            for (int r = 0; r <= nom.length() - 1; r++){

                if(nom.charAt(r) != '-'){
                    if(nom.charAt(r) > 'Z' || nom.charAt(r) < 'A'){

                        if(nom.charAt(r) > 'z' || nom.charAt(r) < 'a'){

                            isCorrect = false;

                        }

                    }
                }
            }

            if(isCorrect == false){
                System.out.println("Nom d'abonné invalide!");
                reponse = Clavier.lireString();
                nom = reponse.trim();

            }
        }while(isCorrect == false);
        return nom;
    }

    //Saisie et validation du prénom de l'abonné
    public static String saisieValidationPrenom(){
        String reponse;
        String prenom;
        boolean isCorrect;
        
        System.out.println("Veuillez entrer votre prénom.");
        reponse = Clavier.lireString();
        prenom = reponse.trim();

        do{
            isCorrect = true;
            if(prenom.length() < 2 || prenom.length() > 30){

                isCorrect = false;

            }
            for (int r = 0; r <= prenom.length() - 1; r++){
                if(prenom.charAt(r) != '-'){

                    if(prenom.charAt(r) > 'Z' || prenom.charAt(r) < 'A'){

                        if(prenom.charAt(r) > 'z' || prenom.charAt(r) < 'a'){

                            isCorrect = false;

                        }

                    }

                }
            }
            if(isCorrect == false){
                System.out.println("Nom d'abonné invalide!");
                reponse = Clavier.lireString();
                prenom = reponse.trim();

            }
        }while(isCorrect == false);
        return prenom;
    }

    //Saisie et validation du numéro de téléphone de l'abonné
    public static String saisieValidationTelephone(){
        String reponse;
        String telephone;
        boolean isCorrect;
        
        System.out.println("Veuillez entrer votre numéro de téléphone.(###-###-####)");
        reponse = Clavier.lireString();
        telephone = reponse.trim();

        do{
            isCorrect = true;
            if(telephone.length() != 12){

                isCorrect = false;

            }
            for(int i = 0; i <= telephone.length() - 1; i++){

                if(i == 3 || i == 7){

                    if(telephone.charAt(i) != '-'){

                        isCorrect = false;

                    }

                }
                else {

                    if(telephone.charAt(i) < '0' || telephone.charAt(i) > '9'){

                        isCorrect = false;

                    }

                }
            }

            if(isCorrect == false){

                System.out.println("Numéro de téléphone de l'abonné invalide!");
                reponse = Clavier.lireString();
                telephone = reponse.trim();

            }

        }while(isCorrect == false);

        return telephone;
    }

    //Saisie et validation du courriel de l'abonné
    public static String saisieValidationCourriel(){
        String reponse;
        String courriel;
        boolean isCorrect;
        int compteur1 = 0;
        int compteur2 = 0;
        int emplacement1 = 0;
        int emplacement2 = 0;
        
        System.out.println("Veuillez entrer votre adresse courriel.");
        reponse = Clavier.lireString();
        courriel = reponse.trim();

        do{
            //Vérification @
            isCorrect = true;
            for(int i = 0; i <= courriel.length() - 1; i++){

                if(courriel.charAt(i) == '@'){
                    emplacement1 = i;
                    compteur1 = compteur1 + 1;
                    

                }

            }
            if(compteur1 != 1){

                isCorrect = false;

            }

            //Vérification nomUtilisateur
            for (int k = 0; k < emplacement1; k++){

                if(!(courriel.charAt(k) == '.' || courriel.charAt(k) == '_' || courriel.charAt(k) == '-')){

                    if(courriel.charAt(k) > '9' || courriel.charAt(k) < '0'){

                        if(courriel.charAt(k) > 'Z' || courriel.charAt(k) < 'A'){

                            if(courriel.charAt(k) > 'z' || courriel.charAt(k) < 'a'){

                                isCorrect = false;

                            }

                        }
                    }

                }

            }

            //Vérification premier caractère
            if(courriel.charAt(0) > '9' || courriel.charAt(0) < '0'){

                if(courriel.charAt(0) > 'Z' || courriel.charAt(0) < 'A'){

                    if(courriel.charAt(0) > 'z' || courriel.charAt(0) < 'a'){

                        isCorrect = false;

                    }

                }
            }

            //Vérification point
            for(int i = 0; i <= courriel.length() - 1; i++){

                if(courriel.charAt(i) == '.'){

                    compteur2 = compteur2 + 1;

                }

            }
            if(compteur2 == 0){

                isCorrect = false;

            }

            //Emplacement du dernier point
            if(compteur2 != 0){

                for(int j = courriel.length() - 1; courriel.charAt(j) != '.'; j--){
                    emplacement2 = j - 1;

                }
            }

            //Vérification emplacement 1 < emplacement 2
            if(emplacement1 > emplacement2){

                isCorrect = false;

            }

            //Vérification nomDomaine
            for (int p = emplacement1 + 1; p < emplacement2; p++){

                if(!(courriel.charAt(p) == '.' || courriel.charAt(p) == '-')){

                    if(courriel.charAt(p) > '9' || courriel.charAt(p) < '0'){

                        if(courriel.charAt(p) > 'Z' || courriel.charAt(p) < 'A'){

                            if(courriel.charAt(p) > 'z' || courriel.charAt(p) < 'a'){

                                isCorrect = false;

                            }

                        }
                    }

                }

            }

            //Vérification nomExtension
            for (int f = emplacement2 + 1; f <= courriel.length() - 1; f++){

                if(courriel.charAt(f) > 'Z' || courriel.charAt(f) < 'A'){
                    if(courriel.charAt(f) > 'z' || courriel.charAt(f) < 'a'){
                        isCorrect = false;
                    }
                }
            }
            if(isCorrect == false){
                System.out.println("Adresse courriel de l'abonné invalide!");
                reponse = Clavier.lireString();
                courriel = reponse.trim();

            }

        }while(isCorrect == false);

        return courriel;
    }

    //Saisie et validation de l'adresse de l'abonné
    public static String saisieValidationAdresse(){
        String reponse;
        String adresse;
        boolean isCorrect;
        
        System.out.println("Veuillez entrer votre adresse.");
        reponse = Clavier.lireString();
        adresse = reponse.trim();

        do{
            isCorrect = true;
            if(adresse.length() < 10 || adresse.length() > 80){

                isCorrect = false;

            }

            for (int k = 0; k <= adresse.length() - 1; k++){

                if(!(adresse.charAt(k) == ' ' || adresse.charAt(k) == '-' || adresse.charAt(k) == 39 || adresse.charAt(k) == ',')){

                    if(adresse.charAt(k) > '9' || adresse.charAt(k) < '0'){

                        if(adresse.charAt(k) > 'Z' || adresse.charAt(k) < 'A'){

                            if(adresse.charAt(k) > 'z' || adresse.charAt(k) < 'a'){

                                isCorrect = false;

                            }

                        }
                    }

                }

            }

            if(isCorrect == false){

                System.out.println("Adresse de l'abonné invalide!");
                reponse = Clavier.lireString();
                adresse = reponse.trim();

            }

        }while(isCorrect == false);

        return adresse;
    }

    //Saisie et validation du forfait d'Internet
    public static int saisieValidationForfait(){
        int forfait = -5;
        boolean isCorrect;
        
        System.out.println("Veuillez choisir un forfait (15,20,30,60,120).");
        do{
            try{
                forfait = Clavier.lireInt();
                isCorrect = true;
                while(!(forfait == 15 || forfait == 20 || forfait == 30 || forfait == 60 || forfait == 120)){

                    System.out.println("Identifiant d'Internet invalide!");
                    forfait = Clavier.lireInt();

                }
            }
            catch(NumberFormatException e){

                System.out.println("Le format de votre choix est invalide.");
                isCorrect = false;
            }
        }while(isCorrect == false);
        return forfait;
    }
    
    //Incrémentation du numéro de la facture
    public static int numeroFacture(){

        noFacture = noFacture + 1;

        return noFacture;
    }
    
    //Date et heure du système
    public static String dateHeure(){
        String dateEtHeure;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-MM-yyyy HH:mm:ss");
        dateEtHeure = simpleDateFormat.format(new Date());

        return dateEtHeure;
    }
    
    //Prix du forfait sélectionné
    public static double prixForfait(int identifiant){
        double prix = 0;

        switch (identifiant) {
            case (NUM1):
            prix = PRIX15;
            break;

            case (NUM2):
            prix = PRIX20;
            break;

            case (NUM3):
            prix = PRIX30;
            break;

            case (NUM4):
            prix = PRIX60;
            break;

            case (NUM5):
            prix = PRIX120;
            break;

        }

        return prix;
    }

    //Description du forfait sélectionné
    public static String descriptionForfait(int identifiant){
        String des = "";

        switch (identifiant) {
            case (NUM1):
            des = DES15;
            break;

            case (NUM2):
            des = DES20;
            break;

            case (NUM3):
            des = DES30;
            break;

            case (NUM4):
            des = DES60;
            break;

            case (NUM5):
            des = DES120;
            break;

        }
        return des;
    }

    public static void main(String[] args) {
        // Déclaration des variables locales
        boolean sortie;
        int choixMenu;

        // informations de l'abonné
        String nom;
        String prenom;
        String numeroTelephone;
        String adresseCourriel;
        String adresse;

        // informations du forfait
        int identifiant;
        String description;
        double prix;

        // Initialisation des variables
        sortie = false;
        choixMenu = 0;
        double montantTPS;
        double montantTVQ;
        double montantTotal;

        /***************************************************
         *                Début du programme
         **************************************************/

        // Lire les statistiques
        Statistiques.lire();
        
        noFacture = Statistiques.nbTotalAbonnes();

        affichageMessageBienvenue();
        

        do {
            
            System.out.println("");
            
            affichageMenu();

            choixMenu = saisieValidationChoix();

            switch (choixMenu) {

                case 0 :
                // Écrire les statistiques
                Statistiques.ecrire();

                System.out.println(MSG_MERCI);

                sortie = true;
                break;
                
                case 1 :
                nom = saisieValidationNom();
                prenom = saisieValidationPrenom();
                numeroTelephone = saisieValidationTelephone();
                adresseCourriel = saisieValidationCourriel();
                adresse = saisieValidationAdresse();

                //Création d'un abonné
                Abonne abonne = new Abonne(nom, prenom, numeroTelephone, adresseCourriel, adresse);

                //Saisie et validation de l'identifiant
                identifiant = saisieValidationForfait();

                //Determination du prix et de la description du forfait
                prix = prixForfait(identifiant);
                description = descriptionForfait(identifiant);

                //Création d'un forfait
                Forfait forfait = new Forfait(identifiant, description, prix);

                //Création d'un abonnement
                Abonnement abonnement = new Abonnement(abonne, forfait);

                //Création de la facture
                Facture facture = new Facture(abonnement);
                
                //Calcul de la TPS, TVQ et montant total
                montantTPS = facture.montantTPS(prix, TPS);
                montantTVQ = facture.montantTVQ(prix, TVQ);
                montantTotal = facture.montantTotal(prix, montantTPS, montantTVQ);
                
                //Affichage de la facture
                facture.affichageFacture(NOM_ENTREPRISE, ADRESSE_ENTREPRISE, TELEPHONE_ENTREPRISE, dateHeure(), numeroFacture(), nom, prenom, numeroTelephone, adresseCourriel, adresse, description, prix, montantTPS, montantTVQ, montantTotal, CHOISI_ENTREPRISE);

                //Incrémentation du nombre d'abonnés
                Statistiques.incrementerNbAbonnes(identifiant);
                break;
                
                case 2 :
                // Affichage le nombre d'abonnés de tous les forfaits
                Statistiques.afficher(NOM_ENTREPRISE, ADRESSE_ENTREPRISE, TELEPHONE_ENTREPRISE, dateHeure(),DES15, DES20, DES30, DES60, DES120);
                break;

            }

        } while (!sortie);
    }
}
