package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    System.out.println("Vitaj v programe jednoduchá kalkulačka!\n");

    Nastavenie();

    static void Nastavenie() {

        Scanner citacka = new Scanner(System.in);
        System.out.println("Želáte si použiť algoritmus:\nBigInteger - 1\nStringMultiplication - 2");

        try {
            int volba=citacka.nextInt();
            citacka.nextLine();
            switch (volba){
                case 1:
                    System.out.println("Vybrali ste si možnosť BigInteger");
                    System.out.print("Prvé čislo:");
                    BigInteger prveCislo = citacka.nextBigInteger();

                    System.out.print("Druhé čislo:");
                    BigInteger druheCislo = citacka.nextBigInteger();

                    BigInteger vysledok = prveCislo.multiply(druheCislo);
                    System.out.println("Výsledok je: " + vysledok);
                    citacka.nextLine();
                    break;
                case 2:

                    System.out.println("Vybrali ste si možnosť StringMultiplication");
                    StringMultiplication vyslednecislo=new StringMultiplication();
                    System.out.print("Prvé čislo:");
                    String prve=citacka.nextLine();
                    System.out.print("Druhé čislo:");
                    String druhe=citacka.nextLine();

                    String vysledok2=vyslednecislo.Nastavhodnoty(prve,druhe);
                    System.out.println("Výsledok je: " + vysledok2);
                    break;
                default:
                    System.out.println("Zadali ste neplatnú možnosť");
            }

        } catch (Exception e) {
            System.out.println("Zadali ste nesprávne číslo!"+e);
            Nastavenie();
        }

        System.out.print("Želáte si pokračovať?- Y/N -");
        String odpoved=citacka.nextLine();
        if(odpoved.equals("Y")){
            Nastavenie();
        }
        else System.out.println("Dovidenia!");
    }

}
