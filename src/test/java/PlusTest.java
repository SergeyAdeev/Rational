import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {

    private void assertPlus(Rational expectedRational, Rational firstAddendum, Rational secondAddendum) {
        assertEquals("Plus returns wrong result " + firstAddendum + " plus " + secondAddendum, expectedRational, firstAddendum.plus(secondAddendum));
    }

    @Test
    public void plusNegative() {
        Rational expectedRational = new Rational(-5, 6);
        Rational firstAddendum = new Rational(-1, 2);
        Rational secondAddendum = new Rational(-3, 9);
        assertPlus(expectedRational, firstAddendum, secondAddendum);
    }

    @Test
    public void plusPositive() {
        Rational expectedRational = new Rational(43, 20);
        Rational firstAddendum = new Rational(3, 4);
        Rational secondAddendum = new Rational(7, 5);
        assertPlus(expectedRational, firstAddendum, secondAddendum);
    }

    @Test
    public void plusNegativeAndPositive() {
        Rational expectedRational = new Rational(-2, 9);
        Rational firstAddendum = new Rational(-2, 3);
        Rational secondAddendum = new Rational(4, 9);
        assertPlus(expectedRational, firstAddendum, secondAddendum);
    }

    @Test
    public void plusNullAndNull() {
        Rational expectedRational = new Rational(0, 1);
        Rational firstAddendum = new Rational(0, 3);
        Rational secondAddendum = new Rational(0, 2);
        assertPlus(expectedRational, firstAddendum, secondAddendum);
    }
}
