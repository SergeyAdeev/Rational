import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void multiply_4_5_and_3_8(){
        Rational multiplyResult = new Rational(4,5);
        assertEquals("Multiply returns wrong result", new Rational(3,10), multiplyResult.multiply(new Rational(3,8)));
    }
}
