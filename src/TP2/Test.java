package TP2;

public class Test {
    public static void main(String[] args) {
        try {
            Concessionnaire citroen = new Concessionnaire("Cons1", "Citroen", "adresse 1", "112233", "Ville 1");
            Concessionnaire peugeot = new Concessionnaire("Cons2", "Peugeot", "adresse 1", "221133", "Ville 2");
            Concessionnaire renault = new Concessionnaire("Cons3", "Renault", "adresse 1", "332211", "Ville 3");

            Pneu pneusMich = new Pneu("Michelin", 105);
            Pneu pneusCont = new Pneu("Continental", 110);

            Voiture citroen_c1 = new Voiture("Rouge", "Citroen", "C1", "Citadine", pneusMich);
            Voiture citroen_c2 = new Voiture("blanche", "Citroen", "c2", "Citadine", pneusMich);
            Voiture citroen_c4 = new Voiture("Bleue", "Citroen", "C4", "Routiere", pneusMich);
            Voiture peugeot_208 = new Voiture("Rouge", "Peugeot", "208", "Citadine", pneusMich);
            Voiture peugeot_208_gti = new Voiture("Blanche", "Peugeot", "208_gti", "Sportive", pneusMich);
            Voiture peugeot_508 = new Voiture("Bleue", "Peugeot", "508", "Routiere", pneusMich);
            Voiture renault_twingo = new Voiture("Rouge", "Renault", "Twingo", "Citadine", pneusCont);
            Voiture renault_clio = new Voiture("Blanche", "Renault", "Clio", "Citadine", pneusCont);
            Voiture renault_laguna = new Voiture("Bleue", "Renault", "Laguna", "Routiere", pneusCont);

            citroen.addVoiture(citroen_c1);
            citroen.addVoiture(citroen_c2);
            citroen.addVoiture(citroen_c4);
            peugeot.addVoiture(peugeot_208);
            peugeot.addVoiture(peugeot_208_gti);
            peugeot.addVoiture(peugeot_508);
            renault.addVoiture(renault_twingo);
            renault.addVoiture(renault_clio);
            renault.addVoiture(renault_laguna);

            renault.addVoiture(peugeot_208); //Le message d'erreur et la voiture n'est pas ajoutee.

            System.out.println(citroen);
            System.out.println(peugeot);
            System.out.println(renault);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}