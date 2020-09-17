import com.company.BigInt;
import com.company.StringMultiplication;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigInteger;

public class MainTesting {

        @Test
        public void Nastavenie(){
            StringMultiplication SM=new StringMultiplication();
            BigInt BI=new BigInt();
            String cisloS1="10000000000000000005052522744114728757852";
            String cisloS2="20000000000000000002572157158786962787282";
            BigInteger cisloI1=new BigInteger(cisloS1);
            BigInteger cisloI2=new BigInteger(cisloS2);

            Assertions.assertEquals(BI.Vypocet(cisloI1,cisloI2),SM.Nastavhodnoty(cisloS1,cisloS2));
        }

}
