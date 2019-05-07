package Users;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void test_isValid(){
        User user = new User("", "", 0, LocalDate.now());
        LocalDate birthDate1 = LocalDate.of(Integer.parseInt("1997"), Integer.parseInt("03"), Integer.parseInt("05"));
        User user2 = new User("Pauline", "Rouvel", 0, birthDate1);
        User user3 = new User("", "Rouvel", 0, birthDate1);

        UserService userService = new UserService();
        boolean res = userService.isValid(user);
        boolean res2 = userService.isValid(user2);
        boolean res3 = userService.isValid(user3);

        assertEquals(false, res);
        assertEquals(true, res2);
        assertEquals(false, res3);
    }
}
