package fr.efrei.java;

public class Programmeur
        extends Collaborateur
        implements Formateur {
    private String langagePrefere;

    public Programmeur(
            String prenom,
            String nom,
            String langagePrefere,
            double salaire,
            Adresse adresse) {

        super(prenom, nom, salaire, adresse);
        this.langagePrefere = langagePrefere;
    }

    public String getLangagePrefere() {
        return langagePrefere;
    }

    @Override
    public void travailler() {
        System.out.println(
                getPrenom() + " développe une fonctionnalité.");
    }

    @Override
    public void former() {
        System.out.println(
                getPrenom() + " anime une formation interne.");
    }
}
