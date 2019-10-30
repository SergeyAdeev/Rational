import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {

    private void assertMultiply(Rational expectedRational, Rational firstMultiplier, Rational secondMultiplier) {
        assertEquals("Multiply returns wrong result " + firstMultiplier + " multiply " + secondMultiplier,
                expectedRational, firstMultiplier.multiply(secondMultiplier));
    }

    @Test
    public void multiplyPositive() {
        Rational expectedRational = new Rational(2, 10);
        Rational firstMultiplier = new Rational(1, 2);
        Rational secondMultiplier = new Rational(2, 5);
        assertMultiply(expectedRational, firstMultiplier, secondMultiplier);
    }

    @Test
    public void multiplyNegative() {
        Rational expectedRational = new Rational(-6, 25);
        Rational firstMultiplier = new Rational(-3, 5);
        Rational secondMultiplier = new Rational(2, 5);
        assertMultiply(expectedRational, firstMultiplier, secondMultiplier);
    }

    @Test
    public void multiplyPositiveAndNegative() {
        Rational expectedRational = new Rational(-1, 14);
        Rational firstMultiplier = new Rational(1, 4);
        Rational secondMultiplier = new Rational(-2, 7);
        assertMultiply(expectedRational, firstMultiplier, secondMultiplier);
    }

    @Test
    public void multiplyNullAndNegative() {
        Rational expectedRational = new Rational(0, 1);
        Rational firstMultiplier = new Rational(0, 4);
        Rational secondMultiplier = new Rational(-2, 3);
        assertMultiply(expectedRational, firstMultiplier, secondMultiplier);
    }

    @Test
    public void multiplyPositiveAndNull() {
        Rational expectedRational = new Rational(0, 1);
        Rational firstMultiplier = new Rational(4, 5);
        Rational secondMultiplier = new Rational(0, 1);
        assertMultiply(expectedRational, firstMultiplier, secondMultiplier);
    }
}
