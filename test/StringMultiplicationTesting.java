import com.company.StringMultiplication;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class StringMultiplicationTesting {
    @Test
    public void NastavHodnoty(){
        StringMultiplication c=new StringMultiplication();

        String cisloS1="-5";
        String cisloS2="10";

        Assertions.assertEquals("-50",c.Nastavhodnoty(cisloS1,cisloS2));
    }
}