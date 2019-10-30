import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class DivideTest {

    private void assertDivide(Rational expectedRational, Rational dividend, Rational divider) {
        assertEquals("Divide returns wrong result " + dividend + " divide " + divider, expectedRational,
                dividend.divide(divider));
    }

    @Test
    public void dividePositive() {
        Rational expectedRational = new Rational(3, 4);
        Rational dividend = new Rational(1, 2);
        Rational divider = new Rational(2, 3);
        assertDivide(expectedRational, dividend, divider);
    }

    @Test
    public void divideNegative() {
        Rational expectedRational = new Rational(35, 8);
        Rational dividend = new Rational(-7, 4);
        Rational divider = new Rational(-2, 5);
        assertDivide(expectedRational, dividend, divider);
    }


    @Test
    public void dividePositiveAndNegative() {
        Rational expectedRational = new Rational(-5, 48);
        Rational dividend = new Rational(-5, 6);
        Rational divider = new Rational(8, 1);
        assertDivide(expectedRational, dividend, divider);
    }

    @Test
    public void nullDividend() {
        Rational expectedRational = new Rational(0, 1);
        Rational dividend = new Rational();
        Rational divider = new Rational(4, 5);
        assertDivide(expectedRational, dividend, divider);
    }

    @Test
    public void nullDivider() {
        Rational dividend = new Rational(2, 7);
        Rational divider = new Rational();
        try {
            dividend.divide(divider);
            Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException thrown) {
            Assert.assertEquals("division by zero !", thrown.getMessage());
        }
    }

}
