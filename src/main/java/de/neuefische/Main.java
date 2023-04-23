package de.neuefische;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;






public class Main {
    public static void main(String[] args) {
      System.out.println(roemischeZahl(99));

    }

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    public static String rueckwaerts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib ein Wort ein");
        String worte = sc.nextLine();
        StringBuilder x = new StringBuilder();
        char[] arrayWorte = worte.toCharArray();
        for (int a = arrayWorte.length - 1; a >= 0; a--) {
            x.append(arrayWorte[a]);
        }
        return x.toString();
    }

    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    public static void sortierung() {
        int[] zahlen = {6, 2, 8, 3, 9, 6};
        Arrays.sort(zahlen);
        System.out.printf(Arrays.toString(zahlen));
    }

    //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.

    public static void stringToArray(String a) {
        String[] arrayWorte = a.split("");
        System.out.printf(Arrays.toString(arrayWorte));
    }

    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.

    public static int quersumme(int a) {
        String strZahl = Integer.toString(a);
        int summe = 0;

        for (int i = 0; i < strZahl.length(); i++) {
            char b = strZahl.charAt(i);
            int einzelneZahl = Character.getNumericValue(b);
            summe += einzelneZahl;
        }
        return summe;
    }
    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
    public static String vier (int zahl1){
        if (Integer.toString(zahl1).contains("4")) {
            return "IV";
        }
        return "";
    }


    public static String roemischeZahl(int zahl) {

        String[] ar = new String[zahl];


        int i = 1;
        while (i < ar.length) {
            String blub = Integer.toString(i);
            ar[i] = blub;
            i++;
        }
        String a = "I";
        String b = "V";
        String c = "X";
        String d = "L";
        String e = "C";
        if (ar.length>= 100) {
            return e + vier(zahl);
        }else if (ar.length>= 50) {
            return d + vier(zahl);
        } else if (ar.length >= 10) {
            int [] ar1 = new int [zahl];
            int laenge = ar1.length;
            int ersteZiffer = Integer.parseInt(Integer.toString(laenge).substring(0, 1));
            String result = "";
                for (int y = 1; y <=ersteZiffer; ++y){
                    result += c;
                }
            return result + vier(zahl);
        } else if (ar.length>= 5) {
            return b+ vier(zahl);
        } else if (zahl == 4) {
            return "IV";
        }
        String result = "";
            for (int x = 0; x < ar.length; x++) {
            result += a ;
        }
        return result;

    }
}



 /*int i = 0;
        while (i < ar.length) {
            System.out.println("Gib ein Wort ein");
            String wort = sc.nextLine();
            arrayWorte[i] = wort;
            i++;

            if (wort.equals("exit")) {
                sc.close();
                break;
            }
            for (int a = 0; a < i; a++) {
                System.out.println(arrayWorte[a]);


        }*/






//    public static String ausgabeZahl (int a){
//        if (a % 3 == 0 && a % 5 == 0){
//            return "#$"+a;
//        } else if (a % 3 == 0){
//            return "#"+a;
//        }else if (a % 5 == 0) {
//            return "$"+a;
//        }else {
//            return String.valueOf(a);
//        }
