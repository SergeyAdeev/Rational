import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorTest {

    private void assertRational(int expectedNumerator, int expectedDenominator, Rational rational) {
        assertEquals("Constructor returns wrong numerator", expectedNumerator, rational.getNumerator());
        assertEquals("Constructor returns wrong denominator", expectedDenominator, rational.getDenominator());
    }

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertRational(0, 1, standard);
    }

    @Test
    public void reducePositive() {
        Rational constructor = new Rational(4, 10);
        assertRational(2, 5, constructor);
    }

    @Test
    public void simplifyNegative() {
        Rational constructor = new Rational(-5, -2);
        assertRational(5, 2, constructor);
    }

    @Test
    public void reduceSimplifyPositiveAndNegative() {
        Rational constructor = new Rational(2, -2);
        assertRational(-1, 1, constructor);
    }

    @Test
    public void nullNumeratorSimplify() {
        Rational constructor = new Rational(0, -7);
        assertRational(0, 1, constructor);
    }

    @Test
    public void nullDenominator() throws ArithmeticException {
        try {
            new Rational(1, 0);
            Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException thrown) {
            Assert.assertEquals("division by zero !", thrown.getMessage());
        }
    }

    @Test
    public void setConstructor() {
        int numerator = 1;
        int denominator = 2;
        Rational constructor = new Rational();
        constructor.setNumerator(numerator);
        constructor.setDenominator(denominator);
        assertRational(1, 2, constructor);
    }
}