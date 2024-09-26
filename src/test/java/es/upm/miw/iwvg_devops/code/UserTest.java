package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    @Test
    void Should_GetId_ReturnNull_With_Empty_Constructor() {
        User user = new User();
        assertNull(user.getId());
    }

    @Test
    void Should_GetId_Return1_With_NonEmpty_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertEquals("1", user.getId());
    }

    @Test
    void Should_GetName_ReturnNull_With_Empty_Constructor() {
        User user = new User();
        assertNull(user.getName());
    }

    @Test
    void Should_GetName_ReturnMiguel_With_NonEmpty_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertEquals("Miguel", user.getName());
    }

    @Test
    void Should_SetName_ChangeName_FromMiguel_ToLuis() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        user.setName("Luis");
        assertEquals("Luis", user.getName());
    }

    @Test
    void Should_FamilyName_ReturnNull_With_Empty_Constructor() {
        User user = new User();
        assertNull(user.getFamilyName());
    }

    @Test
    void Should_GetFamilyName_ReturnDelfre_With_NonEmpty_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertEquals("Delfre", user.getFamilyName());
    }

    @Test
    void Should_SetFamilyName_ChangeName_FromDelfre_ToRodri() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        user.setFamilyName("Rodri");
        assertEquals("Rodri", user.getFamilyName());
    }

    @Test
    void Should_GetFractions_ReturnEmpty_With_Empty_Constructor() {
        User user = new User();
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void Should_GetFractions_ReturnNonEmpty_With_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction());
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertFalse(user.getFractions().isEmpty());
    }

    @Test
    void Should_SetFractions_AddOneFraction() {
        User user = new User();
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction());
        user.setFractions(fractions);
        assertEquals(1, user.getFractions().size());
    }

    @Test
    void Should_AddFractions_AddOneFraction() {
        User user = new User();
        user.addFraction(new Fraction());
        assertEquals(1, user.getFractions().size());
    }

    @Test
    void Should_FullName_ReturnFullName_With_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertEquals("Miguel Delfre", user.fullName());
    }

    @Test
    void Should_Initials_ReturnInitialsFromMiguel_With_Constructor() {
        List<Fraction> fractions = new ArrayList<>();
        User user = new User("1", "Miguel", "Delfre", fractions);
        assertEquals("M.", user.initials());
    }

    @Test
    void Should_ToString_ReturnString_AsJSON() {
        List<Fraction> fractions = new ArrayList<>();
        String id = "1";
        String name = "Miguel";
        String familyName = "Delfre";
        User user = new User(id, name, familyName, fractions);

        assertEquals("User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", fractions=" + fractions +
                '}', user.toString());
    }
}