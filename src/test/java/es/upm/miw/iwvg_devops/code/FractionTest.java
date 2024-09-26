package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void Should_GetNumerator_Return1() {
        Fraction fraction = new Fraction(1, 1);
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void Should_SetNumerator_ChangeNumerator_From1_To2() {
        Fraction fraction = new Fraction(1, 1);
        fraction.setNumerator(2);
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void Should_GetDenominator_Return1() {
        Fraction fraction = new Fraction(1, 1);
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void Should_SetDenominator_ChangeDenominator_From1_To2() {
        Fraction fraction = new Fraction(1, 1);
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void Should_Decimal_Return2Dot5_When_NumeratorIs5_And_DenominatorIs2() {
        Fraction fraction = new Fraction(5, 2);
        assertEquals(2.5, fraction.decimal());
    }

    @Test
    void Should_ToString_ReturnString_AsJSON() {
        int numerator = 5;
        int denominator = 2;
        Fraction fraction = new Fraction(numerator, denominator);
        assertEquals("Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}', fraction.toString());
    }
}