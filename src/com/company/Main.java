package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n---------------------------------------\n" +
                "Vitaj v programe jednoduchá kalkulačka!" +
                "\n---------------------------------------\n" +
                "- Zadaj čísla,ktoré si želáš vynásobiť -\n");

        Scanner citacka = new Scanner(System.in);

        System.out.print("Prvé čislo:");
        BigInteger prveCislo = citacka.nextBigInteger();

        System.out.print("Druhé čislo:");
        BigInteger druheCislo = citacka.nextBigInteger();

        BigInteger vysledok = prveCislo.multiply(druheCislo);
        System.out.println("Výsledok je: " + vysledok);

    }
}
