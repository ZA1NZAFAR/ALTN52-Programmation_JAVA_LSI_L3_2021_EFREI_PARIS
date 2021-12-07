package TD1;

public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;

    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    // Accesseur
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    // Modificateur
    public void setNbPages(int n) {
        if (n < 0)
            System.out.println("NbPage < 0 alors pas d'addition.");
        nbPages = n;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("Auteur 1", "Livre 1");
        Livre l2 = new Livre("Auteur 2", "Livre 2");

        l1.setNbPages(10);
        l2.setNbPages(12);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("NbPages total: " + (l1.getNbPages() + l2.getNbPages()));
    }
}
