package TP2;


import java.util.ArrayList;
import java.util.List;

import static TP2.Constants.MARQUES;

public class Concessionnaire {

    private String nom, marque, adresse, codePostal, ville;
    private List<Voiture> catalogue;

    public Concessionnaire(String nom, String marque, String adresse, String codePostal, String ville) throws Exception {
        this.nom = nom;
        if (!MARQUES.contains(marque))
            throw new Exception("Marque inconnue.");
        this.marque = marque;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        catalogue = new ArrayList<>();
    }

    public void addVoiture(Voiture v) {
        if (!marque.equals(v.getMarque()))
            System.out.println("Impossible d'ajouter une voiture de " + v.getMarque() + " chez " + marque);
        else
            catalogue.add(v);
    }

    @Override
    public String toString() {
        return "Concessionnaire{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", catalogue=" + catalogue +
                '}';
    }
}
