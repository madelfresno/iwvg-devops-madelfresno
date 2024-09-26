package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Search {
    private UsersDatabase usersDatabase;

    public Search() {
        usersDatabase = new UsersDatabase();
    }

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return usersDatabase.findAll().filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper)).map(user -> user.getFamilyName().charAt(0) + ".");
    }
}
