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
    void Should_IsProper_ReturnTrue_When_NumeratorIsLessThanDenominator() {
        Fraction fraction = new Fraction(1, 2);
        assertTrue(fraction.isProper());
    }

    @Test
    void Should_IsImproper_ReturnTrue_When_NumeratorIsGreaterThanDenominator() {
        Fraction fraction = new Fraction(2, 1);
        assertTrue(fraction.isImproper());
    }

    @Test
    void Should_IsEquivalent_ReturnTrue() {
        Fraction fractionOne = new Fraction(2, 3);
        Fraction fractionTwo = new Fraction(4, 6);
        assertTrue(fractionOne.isEquivalent(fractionTwo));
    }

    @Test
    void Should_Add_Sum_TwoFractions() {
        Fraction fractionOne = new Fraction(3, 5);
        Fraction fractionTwo = new Fraction(4, 7);
        assertTrue(fractionOne.add((fractionTwo)).equals(new Fraction(41, 35)));
    }

    @Test
    void Should_Multiply_Return_ANewFraction() {
        Fraction fractionOne = new Fraction(3, 5);
        Fraction fractionTwo = new Fraction(4, 7);
        assertTrue(fractionOne.multiply(fractionTwo).equals(new Fraction(12, 35)));
    }

    @Test
    void Should_Divide_Return_ANewFraction() {
        Fraction fractionOne = new Fraction(3, 5);
        Fraction fractionTwo = new Fraction(4, 7);
        assertTrue(fractionOne.divide(fractionTwo).equals(new Fraction(21, 20)));
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