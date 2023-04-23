package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void roemischeZahl_1() {
        //GIVEN
        int a = 1;
        String b = "I";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_5() {
        //GIVEN
        int a = 5;
        String b = "V";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_10() {
        //GIVEN
        int a = 10;
        String b = "X";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_50() {
        //GIVEN
        int a = 50;
        String b = "L";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_100() {
        //GIVEN
        int a = 100;
        String b = "C";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_3() {
        //GIVEN
        int a = 3;
        String b = "III";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_4() {
        //GIVEN
        int a = 4;
        String b = "IV";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_14() {
        //GIVEN
        int a = 14;
        String b = "XIV";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

    @Test
    void roemischeZahl_24() {
        //GIVEN
        int a = 24;
        String b = "XXIV";
        //WHEN
        String actual = Main.roemischeZahl(a);
        //THEN
        assertEquals(b, actual);
    }

}