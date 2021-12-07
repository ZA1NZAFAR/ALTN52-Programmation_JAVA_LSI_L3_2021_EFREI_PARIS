package TP2;

import static TP2.Constants.MARQUES;

public class Voiture {

    private String couleur, marque, modele, categorie;
    private Pneu pneu;

    public Voiture(String couleur, String marque, String modele, String categorie, Pneu pneu) {
        if (MARQUES.contains(marque))
            this.marque = marque;
        else
            throw new IllegalArgumentException("Marque inconnue.");
        this.couleur = couleur;
        this.modele = modele;
        if (Constants.CATEGORIES.contains(categorie))
            this.categorie = categorie;
        else
            throw new IllegalArgumentException("Categorie inconnue.");

        if (marque.equals(Constants.Marque.RENAULT.toString())) {
            if (pneu.getMarque().equals(Constants.Pneu.CONTINENTAL.toString()))
                this.pneu = pneu;
            else
                throw new IllegalArgumentException("Pas la bonne marque de pneus.");
        } else {
            if (pneu.getMarque().equals(Constants.Pneu.MICHELIN.toString()))
                this.pneu = pneu;
            else
                throw new IllegalArgumentException("Pas la bonne marque de pneus.");
        }
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", categorie='" + categorie + '\'' +
                ", pneu=" + pneu +
                '}';
    }
}
