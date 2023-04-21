package de.neuefische;

import java.util.Scanner;

//Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
//Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
//Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
//Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
//Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
public class Main {
    public static void main(String[] args) {
       System.out.println(rueckwaerts());

    }

    public static String rueckwaerts() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Gib ein Wort ein");
        String worte = sc.nextLine();
        String x = "";
        char [] arrayWorte = worte.toCharArray();
        for (int a = arrayWorte.length-1; a >= 0; a--) {
            x+=arrayWorte[a];

        }
        return x;
    }
}