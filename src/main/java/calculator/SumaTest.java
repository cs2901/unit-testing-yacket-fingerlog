package calculator;

import org.junit.Assert;
import org.junit.Test;


public class SumaTest {

    @Test
    public void operar() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(2), new Float(2));
        if (result > 4 || result < 4) {
            Assert.fail();
        }
    }

    @Test
    public void operarWPoint1() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(0.25), new Float(0.25));
        if (result > 0.5 || result <0.5) {
            Assert.fail();
        }
    }
    @Test
    public void operarWPoint2() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(1.35), new Float(1.35));
        if (result > 2.70 || result < 2.70) {
            Assert.fail();
        }
    }


}
