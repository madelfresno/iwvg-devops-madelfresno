package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    private Searches searches;

    @BeforeEach
    void setUp() {
        searches = new Searches();
    }

    @Test
    void findUserFamilyNameInitialBySomeProperFraction() {
        List<String> familyNameInitials = searches.findUserFamilyNameInitialBySomeProperFraction().toList();

        List<String> expectedInitials = List.of("F.", "B.", "L.", "B.");
        // 1 -> F.
        // 2 -> B.
        // 3 -> L.
        // 5 -> B.

        assertEquals(expectedInitials, familyNameInitials);
    }

    @Test
    void findUserIdByAllProperFraction() {
        List<String> ids = searches.findUserIdByAllProperFraction().toList();
        assertTrue(ids.isEmpty());
    }
}