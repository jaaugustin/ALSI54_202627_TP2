package fr.efrei.java;

//Cette classe abstraite est un "patron de classe(s)"
//On ne peut pas l'instancier => Pas de "new Collaborateur()"
public abstract class Collaborateur {
    private String prenom;
    private String nom;
    private double salaire;
    private Adresse adresse;

    public Collaborateur(
            String prenom,
            String nom,
            double salaire,
            Adresse adresse) {

        this.prenom = prenom;
        this.nom = nom;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void augmenterSalaire(double pourcentage) {
        if (pourcentage > 0) {
            salaire = salaire * (1 + pourcentage / 100);
        }
    }

    public void afficherFiche() {
        System.out.println(prenom + " " + nom);
        System.out.println("Salaire : " + salaire + " €");
    }

    public abstract void travailler(); // Méthode abstraite --> On n'est pas obligé d'en déclarer une dans notre classe abstraite


}
