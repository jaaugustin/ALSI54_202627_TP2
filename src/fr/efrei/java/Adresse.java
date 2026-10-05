package fr.efrei.java;

public class Adresse {

    private String rue ;
    private String codePostal ;
    private String ville ;
    private String pays;

    public Adresse(
            String rue,
            String codePostal,
            String ville,
            String pays) {

        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public void afficher() {
        System.out.println(rue);
        System.out.println(codePostal + " " + ville);
        System.out.println(pays);
    }


}
