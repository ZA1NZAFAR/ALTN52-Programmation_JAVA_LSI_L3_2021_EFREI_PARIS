package TP2;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final List<String> CATEGORIES = Arrays.asList(Categorie.CITADINE.toString(), Categorie.ROUTIERE.toString(), Categorie.SPORTIVE.toString());
    public static final List<String> MARQUES = Arrays.asList(Marque.RENAULT.toString(), Marque.CITROEN.toString(), Marque.PEUGEOT.toString());
    public static final List<String> PNEUS = Arrays.asList(Pneu.MICHELIN.toString(), Pneu.CONTINENTAL.toString());

    public enum Marque {
        CITROEN("Citroen"),
        RENAULT("Renault"),
        PEUGEOT("Peugeot");

        private final String marque;

        Marque(String marque) {
            this.marque = marque;
        }

        public String toString() {
            return marque;
        }
    }

    public enum Categorie {
        CITADINE("Citadine"),
        ROUTIERE("Routiere"),
        SPORTIVE("Sportive");

        private final String cat;

        Categorie(String cat) {
            this.cat = cat;
        }

        public String toString() {
            return cat;
        }
    }

    public enum Pneu {
        CONTINENTAL("Continental"),
        MICHELIN("Michelin");

        private final String typ;

        Pneu(String typ) {
            this.typ = typ;
        }

        public String toString() {
            return typ;
        }
    }
}
