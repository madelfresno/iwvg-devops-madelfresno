package es.upm.miw.iwvg_devops.code;

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

}
