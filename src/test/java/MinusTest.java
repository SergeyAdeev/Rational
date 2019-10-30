import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {

    private void assertMinus(Rational expectedRational, Rational minuend, Rational subtrahend) {
        assertEquals("Minus returns wrong result " + minuend + " minus " + subtrahend, expectedRational, minuend.minus(subtrahend));
    }

    @Test
    public void minusNegativeSubtrahend() {
        Rational expectedRational = new Rational(1, 9);
        Rational minuend = new Rational(-1, 3);
        Rational subtrahend = new Rational(-4, 9);
        assertMinus(expectedRational, minuend, subtrahend);
    }

    @Test
    public void minusPositiveSubtrahend() {
        Rational expectedRational = new Rational(11, 6);
        Rational minuend = new Rational(7, 3);
        Rational subtrahend = new Rational(1, 2);
        assertMinus(expectedRational, minuend, subtrahend);
    }

    @Test
    public void minusNullSubtrahend() {
        Rational expectedRational = new Rational(5, 4);
        Rational minuend = new Rational(5, 4);
        Rational subtrahend = new Rational(0, 2);
        assertMinus(expectedRational, minuend, subtrahend);
    }
}
