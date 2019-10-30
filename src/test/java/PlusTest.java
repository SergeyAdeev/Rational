import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {
    @Test
    public void plus_minus1_2_and_minus3_9() {
        Rational plusResult = new Rational(-1,2);
        assertEquals("Plus returns wrong result", new Rational(-5,6), plusResult.plus(new Rational(-3, 9)));
    }

}
