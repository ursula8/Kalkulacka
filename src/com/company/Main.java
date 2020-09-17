package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n---------------------------------------\n" +
                "Vitaj v programe jednoduchá kalkulačka!" +
                "\n---------------------------------------\n" +
                "- Zadaj čísla,ktoré si želáš vynásobiť -\n");

        Nastavenie();
    }

        static void Nastavenie() {

            System.out.println("Želáte si použiť algoritmus:\nBigInteger - 1\nStringMultiplication - 2");

            Scanner citacka = new Scanner(System.in);

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
                        break;
                    case 2:

                        System.out.println("Vybrali ste si možnosť StringMultiplication");
                        StringMultiplication vyslednecislo=new StringMultiplication();

                        System.out.print("Prvé čislo:");
                        String prve=citacka.nextLine();

                        System.out.print("Druhé čislo:");
                        String druhe=citacka.nextLine();

                        String vysledok2=vyslednecislo.Nastavhodnoty(prve,druhe);
                        System.out.println("Výsledok je: "+vysledok2);
                        break;
                    default:
                        System.out.println("Zadali ste neplatnú možnosť");
                }
            }
            catch (Exception e) {
                System.out.println("Zadali ste nesprávne číslo!\n" + e);
                Nastavenie();
            }
        }
}
