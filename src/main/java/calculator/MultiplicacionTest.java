package calculator;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacionTest {

    @org.junit.jupiter.api.Test
    public void operar()  throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float  result = multiplicacion.operar(new Float(0.2), new Float(0.31));
        if (result > 0.062 || result < 0.062) {
            Assert.fail();
        }
    }

    @org.junit.jupiter.api.Test
    public void operar2()  throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float  result = multiplicacion.operar(new Float(3), new Float(2));
        if (result > 6 || result < 6) {
            Assert.fail();
        }
    }

    @org.junit.jupiter.api.Test
    public void operar3()  throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float  result = multiplicacion.operar(new Float(-2), new Float(100));
        if (result > -200 || result < -200) {
            Assert.fail();
        }
    }
}