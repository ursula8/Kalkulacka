package com.company;

public class StringMultiplication {

    String cislo1;
    String cislo2;

    void Nastavhodnoty(String icislo1,String icislo2){

        cislo1=icislo1;
        cislo2=icislo2;
        int lengt1=cislo1.length();
        int lengt2=cislo2.length();
        int nasobok=0;
        int kurzor=0;
        int medzivysledok[]=new int[lengt1+lengt2];  //kazdy vypocitany medzivysledok sa uklada na inú poziciu v poli

        for(int i=lengt1-1;i>=0;i--){                   //prechadza prve cislo z pravej strany az po prvu cislicu
           int nasobitel1=cislo1.charAt(i)-'0';         // i-nasobitel prveho cisla
           System.out.println("Nasobitel1"+nasobitel1);

            for(int j=lengt2-1;j>=0;j--){               //prechadze druhe cislo
                int nasobitel2=cislo2.charAt(i)-'0';         // i-nasobitel druheho cisla
                System.out.println("Nasobitel2"+nasobitel2);
                nasobok=nasobitel1*nasobitel2;          //vynasobenie nasobitela i s nasobitelom j
                int zvysok=nasobok/10;                  //po súčine ukladá prenášanu desiatku
                medzivysledok[kurzor]=nasobok%10;       //po súčine ukladá jednotku výsledku na novej
            }
        }

        System.out.println("Zaznamenali sme čísla: "+nasobok);
    }
}
