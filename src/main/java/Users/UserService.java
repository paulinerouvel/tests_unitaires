package Users;

import java.time.LocalDate;
import java.time.ZoneId;

public class UserService {



    public boolean isValid(User user) {
        if (user.getNom().isEmpty() || user.getPrenom().isEmpty()) {
            return false;
        }


        ZoneId zoneId = ZoneId.systemDefault(); // or: ZoneId.of("Europe/Oslo");
        long secondDateNaissance = user.getDateNaissance().atStartOfDay(zoneId).toEpochSecond();

        long secondNow = LocalDate.now().atStartOfDay(zoneId).toEpochSecond();

        if (secondDateNaissance + 567648000 > secondNow) {
            return false;
        }

        return true;
    }



}
