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
                        BigInt vyslednecisloI=new BigInt();

                        System.out.print("Prvé čislo:");
                        BigInteger prveCislo = citacka.nextBigInteger();

                        System.out.print("Druhé čislo:");
                        BigInteger druheCislo = citacka.nextBigInteger();

                        String vysledok1=vyslednecisloI.Vypocet(prveCislo,druheCislo);
                        System.out.println("Výsledok je: "+vysledok1);
                        citacka.nextLine();

                        break;
                    case 2:

                        System.out.println("Vybrali ste si možnosť StringMultiplication");
                        StringMultiplication vyslednecisloS=new StringMultiplication();

                        System.out.print("Prvé čislo:");
                        String prve=citacka.nextLine();

                        System.out.print("Druhé čislo:");
                        String druhe=citacka.nextLine();

                        String vysledok2=vyslednecisloS.Nastavhodnoty(prve,druhe);
                        System.out.println("Výsledok je: "+vysledok2);
                        break;
                    default:
                        System.out.println("Zadali ste neplatnú možnosť");
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("Zadali ste nesprávne číslo!\n" + e);
                Nastavenie();
            }

            System.out.println("Želáte si pokračovať?- Y/N -");

            String odpoved=citacka.nextLine().toUpperCase();

            if(odpoved.equals("Y")){
                Nastavenie();
            }
            else {
                System.out.println("Dovidenia!");
            }

        }




        }

