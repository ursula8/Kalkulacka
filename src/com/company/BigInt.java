package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {



    public String Vypocet(BigInteger icislo1,BigInteger icislo2){

        BigInteger prveCislo=icislo1;
        BigInteger druheCislo=icislo2;
        BigInteger vysledok = prveCislo.multiply(druheCislo);

        return vysledok+"";
    }
}
