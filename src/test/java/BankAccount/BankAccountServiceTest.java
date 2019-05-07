package BankAccount;

import Users.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountServiceTest {

    private static final boolean TEST_VALUE = true;

    @Mock  BankAccountRepository BankAccountRepoMock;



    @InjectMocks private BankAccountService bankAccountService;

    @Test
    public void test_credit(){


        when(BankAccountRepoMock.saveCredit(any(BankAccountCredit.class))
        ).thenReturn(TEST_VALUE);


        LocalDate birthDate1 = LocalDate.of(Integer.parseInt("1997"), Integer.parseInt("03"), Integer.parseInt("05"));

        BankAccount BA1 = new BankAccount(1, new User("Pauline", "Rouvel", 0, birthDate1), 10);

        //case1
        BankAccountCredit bankAccountCreditTemoin = new BankAccountCredit(BA1 , 50);
        double saveAmount =  BA1.getAmount();
        BankAccountCredit res = bankAccountService.credit(BA1, 50);
        Assert.assertEquals(res.getAmount(), bankAccountCreditTemoin.getAmount(), 0.0);
        Assert.assertEquals(res.getBankAccount().getAmount(), saveAmount + 50, 0.0);

        //case2
        BankAccount BA2 = new BankAccount(2, new User("CHAMPAUD", "Alexandre", 2, birthDate1), 1000);
        BankAccountCredit bankAccountCreditTemoin2 = new BankAccountCredit(BA2 , 0);

        BankAccountCredit res2 = bankAccountService.credit(BA2, 50);
        Assert.assertEquals(res2.getAmount(), bankAccountCreditTemoin2.getAmount(), 0.0);
        Assert.assertEquals(res2.getBankAccount().getAmount(), bankAccountCreditTemoin2.getBankAccount().getAmount(), 0.0);




    }




}
