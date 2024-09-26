package es.upm.miw.iwvg_devops.code;

import java.util.Collection;
import java.util.stream.Stream;

public class Searches {
    private UsersDatabase usersDatabase;

    public Searches() {
        usersDatabase = new UsersDatabase();
    }

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return usersDatabase.findAll().filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper)).map(user -> user.getFamilyName().charAt(0) + ".");
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return usersDatabase.findAll().filter(user -> user.getFractions().stream().allMatch(Fraction::isProper)).map(User::getId);
    }

    public Fraction findHighestFraction() {
        return usersDatabase.findAll()
                .map(User::getFractions)
                .flatMap(Collection::stream)
                .filter(fraction -> fraction.getDenominator() > 0)
                .distinct()
                .max(Fraction::compareTo).orElse(null);
    }

    public Stream<String> findUserNameBySomeImproperFraction() {
        return usersDatabase.findAll().filter(user -> user.getFractions().stream().anyMatch(Fraction::isImproper)).map(User::getName);
    }

}
