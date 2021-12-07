package TP3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);
        try {
            a = clavier.nextInt();
            b = clavier.nextInt();

            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("oop ! un problème dans la division ");
            System.out.println("le message officiel est " + e.getMessage());
        } finally {
            System.out.println("le bloc finally sera toujours exécuté");
            System.out.println("et c'est là que l'on fermera par exemple les fichiers");
        }
        System.out.println("Fin du programme");
    }
}

//Q1
//Si nous essayons de diviser par zéro, le programme ne fonctionne pas correctement. Il ne se termine pas correctement et n'affiche pas le message "Fin du programme"

//Q2
// Le message "Fin du programme" n'est pas apparu.

//Q3
//ArithmeticException

//Q4
//Oui, il catch l'exception et imprime un message.

//Q5
//Oui, le message "Fin du programme" s'affiche, ce qui indique que le programme s'est terminé correctement.

//Q6
//Le message d'erreur officiel Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at TP3.EssaiException.main(EssaiException.java:11)

//Q7
//le bloc est exécuté peu importe s'il y a une exception ou non

//Q8
//le bloc est exécuté

//Q9
//L'exception a ete traite ainsi que le bloc finally

//Q10
//Nous avons une exception de type InputMismatchException car le programme attend un nombre mais nous avons tapé un caractère

//Q11
//InputMismatchException

//Q12
//les lignes du scanner ont été ajoutées dans le bloc try et l'exception InputMismatchException a été ajoutée dans le catch pour traiter cette exception
//on peut aussi utiliser une autre implementation plus simple en utilisant plusieurs bloc de catch



