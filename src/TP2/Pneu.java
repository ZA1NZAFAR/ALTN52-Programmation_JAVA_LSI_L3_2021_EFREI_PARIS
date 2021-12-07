package TP2;

public class Pneu {
    private String marque, numSerie;
    private int largeur;

    public Pneu(String marque, int largeur) {
        if (Constants.PNEUS.contains(marque))
        this.marque = marque;
        else
            throw new IllegalArgumentException("Marque inconnue.");
        this.largeur = largeur;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "marque='" + marque + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", largeur=" + largeur +
                '}';
    }
}
