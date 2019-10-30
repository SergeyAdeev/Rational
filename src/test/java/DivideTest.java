import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class DivideTest {
    @Test
    public void divide_5_6_and_1_2(){
        Rational divideResult = new Rational(5,6);
        assertEquals("Divide returns wrong result", new Rational(5,3), divideResult.divide(new Rational(1,2)));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void divide_4_7_and_0_3(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        new Rational(4,7).divide(new Rational(0,3));
        thrown = ExpectedException.none();
    }

    @Test
    public void divide_0_4_and_1_3(){
        Rational divideResult = new Rational(0,4);
        assertEquals("Divide returns wrong result", new Rational(0,4),
                divideResult.divide(new Rational(1,3)));
    }
}
