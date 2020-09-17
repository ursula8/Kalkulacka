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
        int kurzor1;
        int kurzor2=0;
        int zvysok=0;
        int medzivysledok[]=new int[lengt1+lengt2];  //kazdy vypocitany medzivysledok sa uklada na inú poziciu v poli

        for(int i=lengt1-1;i>=0;i--){                   //prechadza prve cislo z pravej strany az po prvu cislicu
           int nasobitel1=cislo1.charAt(i)-'0';         // i-nasobitel prveho cisla
           System.out.println("Nasobitel1"+nasobitel1);
            kurzor1=0;
            for(int j=lengt2-1;j>=0;j--){               //prechadze druhe cislo
                int nasobitel2=cislo2.charAt(j)-'0';         // j-nasobitel druheho cisla
                System.out.println("Nasobitel2"+nasobitel2);

                nasobok=nasobitel1*nasobitel2+zvysok+medzivysledok[kurzor1+kurzor2];             /* vynasobenie nasobitela i s nasobitelom j
                                                                     + zvysok prenašaný z predosleho súčinu
                                                                     a medzivysledok z predosleho súčinu, ktory je na rovnakej pozícii */

                zvysok=nasobok/10;                      //po súčine ukladá prenášanu desiatku
                medzivysledok[kurzor1+kurzor2]=nasobok%10;      //po súčine ukladá jednotku výsledku na novej pozicii/prepíše starší výsledok
                kurzor1++;                                 //zvacsi sa j-krat (kazdym novym cyklom i zacina od nuly)
            }
            if(zvysok!=0) {              //ak po nasobení zostala desiatka navyše, pripočíta ju na nasledovnu pozíciu
                medzivysledok[kurzor1 + kurzor2] = zvysok + medzivysledok[kurzor1 + kurzor2]; //ak je na nasledovnej pozicii už čislo, tak ich spočíta
            }
            kurzor2++;                                 //zvačší sa i-krát (posunutie vysledkov kazdeho cyklu i o jednu poziciu dalej od pozicie jednotky-princip nasobilky)
        }
        for (int i=medzivysledok.length-1;i>=0;i--) {
            System.out.println("Zaznamenali sme čísla: " + medzivysledok[i]);
        }
    }
}
