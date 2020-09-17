package com.company;

public class StringMultiplication {

    String cislo1;
    String cislo2;
    int kurzor1;
    int kurzor2 = 0;
    int nasobok = 0;
    int zvysok = 0;
    int nasobitel1;
    int nasobitel2;
    String vysledok = "";

    public String Nastavhodnoty(String icislo1,String icislo2) {

        cislo1 = icislo1;
        cislo2 = icislo2;

        if ((cislo1.charAt(0)=='-' || cislo2.charAt(0)=='-') && (cislo1.charAt(0)!='-' || cislo2.charAt(0)!='-')){
            vysledok="-";
            }
        if (cislo1.charAt(0)=='-'){
            cislo1=cislo1.substring(1);

        }
        if (cislo2.charAt(0)=='-'){
            cislo2=cislo2.substring(1);
        }

        int lengt1 = cislo1.length();
        int lengt2 = cislo2.length();

        int medzivysledok[] = new int[lengt1 + lengt2];         //kazdy vypocitany medzivysledok sa uklada na inú poziciu v poli



            for (int i = lengt1 - 1; i >= 0; i--) {                   //prechadza prve cislo z pravej strany az po prvu cislicu

                if(Character.isDigit(cislo1.charAt(i)) && (cislo1.charAt(0)!='0')){
                    nasobitel1 = cislo1.charAt(i) - '0';             // i-nasobitel prveho cisla
                   // System.out.println("Nasobitel1" + nasobitel1);
                    kurzor1 = 0;
                    zvysok=0;
                }
                else {
                     return "Zle zadané číslo" ;
                }

                for (int j = lengt2 - 1; j >= 0; j--) {               //prechadze druhe cislo

                    if(Character.isDigit(cislo2.charAt(j))) {
                        nasobitel2 = cislo2.charAt(j) - '0';         // j-nasobitel druheho cisla
                       // System.out.println("Nasobitel2" + nasobitel2);
                    }
                    else{
                        return "Zle zadané číslo" ;
                    }

                    nasobok = nasobitel1 * nasobitel2               // vynasobenie nasobitela i s nasobitelom j
                            + zvysok                                // + zvysok prenašaný z predosleho súčinu
                            + medzivysledok[kurzor1 + kurzor2];    //+ medzivysledok z predosleho súčinu, ktory je na rovnakej pozícii

                    zvysok = nasobok / 10;                              //po súčine ukladá prenášanu desiatku
                    medzivysledok[kurzor1 + kurzor2] = nasobok % 10;    //po súčine ukladá jednotku výsledku na novej pozicii/prepíše starší výsledok
                    kurzor1++;                                           //zvacsi sa j-krat (kazdym novym cyklom i zacina od nuly)
                }

                if (zvysok != 0) {              //ak po nasobení zostala desiatka navyše, pripočíta ju na nasledovnu pozíciu
                    medzivysledok[kurzor1 + kurzor2] = zvysok + medzivysledok[kurzor1 + kurzor2]; //ak je na nasledovnej pozicii už čislo, tak ich spočíta

                }
                kurzor2++;                                 //zvačší sa i-krát (posunutie vysledkov kazdeho cyklu i o jednu poziciu dalej od pozicie jednotky-princip nasobilky)
            }

        int i=medzivysledok.length-1;
        while (i>=0 && medzivysledok[i]==0){            //odignoruje všetky nuly, ktoré sa mohli ocitnúť pred realnym číslom výsledku
            i--;
            if (i==-1){
                return "Násobenie 0";                             //v prípade,že výsledok bol nula
            }
        }
        while (i>=0){
            vysledok=vysledok+medzivysledok[i];   // čislo očistené od nadbytočných núl uloži správnym smerom (otočenie)
            i--;
        }

        return vysledok;
        }
    }

