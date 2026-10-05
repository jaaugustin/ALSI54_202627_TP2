package fr.efrei.java;

//Classe fille de Collaborateur
public class Testeur extends Collaborateur{

    public Testeur(
            String prenom,
            String nom,
            double salaire,
            Adresse adresse) {

        super(prenom, nom, salaire, adresse); // Nous appelons le constructeur de la classe mère (Collaborateur)
    }

    @Override
    public void travailler() {
        System.out.println(
                getPrenom() + " exécute une campagne de tests.");
    }
}
