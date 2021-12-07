package TP3;

public class Exercice2 {
    public static void main(String[] args) {
        int[] tab = null;
        try {
            System.out.println(tab[2]);
        } catch (NullPointerException n) {
            System.out.println("La case souhaitée n'existe pas ou a pour valeur null");
        }
    }
}