package fr.efrei.java;

import java.util.Scanner;

public class HelloEfrei {

    public static void main(String[] args) {

        Adresse adresseAlice =
                new Adresse(
                        "12 rue des Lilas",
                        "75000",
                        "Paris",
                        "France");

        Programmeur alice =
                new Programmeur(
                        "Alice",
                        "Martin",
                        "Java",
                        42000,
                        adresseAlice);

        Adresse adresseAlex =
                new Adresse(
                        "12 rue des apprentis",
                        "94800",
                        "Villejuif",
                        "France");

        Programmeur alex =
                new Programmeur(
                        "Alex",
                        "Dupond",
                        "Java",
                        42000,
                        adresseAlex);

        Adresse adresseChloe =
                new Adresse(
                        "12 rue des apprentis",
                        "94800",
                        "Villejuif",
                        "France");

        Testeur chloe =
                new Testeur(
                        "Chloé",
                        "Parker",
                        39500,
                        adresseChloe);

//        alice.augmenterSalaire(5);

        Collaborateur collaborateur_1 = alice;
        collaborateur_1.travailler();
//        Même si la variable est déclarée comme `Collaborateur`, l’objet référencé est un `Programmeur`.
//        C’est donc l’implémentation de `Programmeur.travailler()` qui est exécutée.

        Collaborateur collaborateur_2 = chloe;
        collaborateur_2.travailler();
//        C’est l’implémentation de `Testeur` qui est appelée.
//        Le choix de la méthode redéfinie est effectué à l’exécution en fonction du type réel de l’objet
//        C’est un exemple de **polymorphisme**.


        Collaborateur[] collaborateurs = {
                alice,
                alex,
                chloe
        };

        for (Collaborateur collaborateur : collaborateurs) {
            collaborateur.travailler();
        }

        Formateur formateur = alice;
        formateur.former();
//        Ici :
//        - le type déclaré de la variable est `Formateur` ;
//        - le type réel de l’objet est `Programmeur`.
//        Une interface permet donc elle aussi d’utiliser le polymorphisme.

/*
        Scanner scanner = new Scanner(System.in);

        int choix = -1;
        while (choix != 0) {
            afficherMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Veuillez saisir un nombre.");
                scanner.nextLine();
                continue;
            }

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> alice.afficherFiche(); // 1 seule instruction => pas { }
                case 2 -> alex.afficherFiche();
                case 3 -> {
                    Programmeur programmeur = saisirProgrammeur(scanner);
                    programmeur.afficherFiche();
                }
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println();
        System.out.println("==============================");
        System.out.println(" Gestion des programmeurs");
        System.out.println("==============================");
        System.out.println("1 - Afficher Alice");
        System.out.println("2 - Afficher Alex");
        System.out.println("3 - Ajouter un programmeur");
        System.out.println("0 - Quitter");
        System.out.print("Votre choix : ");
    }

    public static Programmeur saisirProgrammeur(Scanner scanner) {
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Langage préféré : ");
        String langage = scanner.nextLine();

        double salaire;
        while (true) {
            System.out.print("Salaire : ");
            if (scanner.hasNextDouble()) {
                salaire = scanner.nextDouble();
                scanner.nextLine();

                if (salaire >= 0) {
                    break;
                }

                System.out.println("Le salaire ne peut pas être négatif.");
            } else {
                System.out.println("Veuillez saisir un nombre.");
                scanner.nextLine();
            }
        }

        return new Programmeur(prenom, nom, langage, salaire);
        */
    }

}
