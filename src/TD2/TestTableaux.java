package TD2;

public class TestTableaux {
    public boolean estVide(int[] tab) {
        return null != tab && tab.length != 0;
    }

    public void afficher(int[] tab) {
        if (estVide(tab))
            System.out.println("tableau vide");
        else {
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i] + " ");
            }
        }
    }

    public void generer(int[] tab) {
        if (estVide(tab))
            tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
        }
    }


    public int maximum(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    public int somme(int[] tab) {
        int somme = tab[0];
        for (int i = 1; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme;
    }

    public int moyenne(int[] tab) {
        return somme(tab) / tab.length;
    }

    public boolean tousEgaux(int[] tab) {
        int tmp = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tmp != tab[i])
                return false;
        }
        return true;
    }

    public boolean egaux(int[] tab1, int[] tab2) {
        for (int i = 1; i < tab1.length; i++) {
            if (tab1[i] != tab2[i])
                return false;
        }
        return true;
    }

    public boolean recherche(int[] tab, int var) {
        for (int j : tab) {
            if (j == var)
                return true;
        }
        return false;
    }

    public boolean estTrie(int[] tab) {
        boolean estCroissant = true, estDecroissant = true;
        //check ordre croissant
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                estCroissant = false;
                break;
            }
        }
        //check ordre decroissant (uniquement si le tableau n'es pas dans l'ordre croissant)
        if (!estCroissant) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] < tab[i + 1]) {
                    estDecroissant = false;
                    break;
                }
            }
        }
        return estCroissant || estDecroissant;
    }


    public static void main(String[] args) {
        int[] t1 = {1,2,3,4,5,6};
        int[] t2 = {6,5,4,3,2,1};
        int[] t3 = {1,2,4,5,6,3};
        System.out.println(new TestTableaux().estTrie(t1));
        System.out.println(new TestTableaux().estTrie(t2));
        System.out.println(new TestTableaux().estTrie(t3));
    }


}
