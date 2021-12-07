package TD3;

public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    private Double prix;
    private boolean prixFix = false;

    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre(String titre, String auteur, Double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.prixFix = true;
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

    public Double getPrix() {
        return prix;
    }

    public boolean isPrixFix() {
        return prixFix;
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

    public boolean compare2(Livre livre) {
        return this.nbPages == livre.getNbPages();
    }

    public void setPrix(Double prix) {
        if (!prixFix) {
            this.prix = prix;
            prixFix = true;
        } else
            System.out.println("prix deja fixee.");
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix='" + ((null == prix) ? "Prix pas encore donne" : prix) + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }

    public void afficheToi() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("Auteur 1", "Livre 1");
        Livre l2 = new Livre("Auteur 2", "Livre 2");

        l1.setNbPages(10);
        l2.setNbPages(12);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("NbPages total: " + (l1.getNbPages() + l2.getNbPages()));

        l1.afficheToi();
    }
}
