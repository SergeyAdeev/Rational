import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {
    @Test
    public void minus_1_2_and_minus3_9() {
        Rational minusResult = new Rational(1,2);
        assertEquals("Plus returns wrong result", new Rational(5,6), minusResult.minus(new Rational(-3, 9)));
    }
}
